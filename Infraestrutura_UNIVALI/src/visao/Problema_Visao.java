/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.Problema_Controle;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import modelo.Problema;

/**
 *
 * @author Edgar
 */
public class Problema_Visao {
    public static void exibirCadastroProblema(){
        
        Scanner entrada = new Scanner(System.in);
        
        String descricao, situacao;
        Date data;
        
        System.out.println("-----> REPORTE DE NOVOS PROBLEMAS <----");
        
        System.out.println("Digite a descrição do problema: ");
        descricao = entrada.nextLine();
        
        System.out.println("Digite a data que o problema foi reportado: ");
        SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");
        formatadorData.setLenient(false);
        do{
            try{
                data = formatadorData.parse(entrada.nextLine());
                System.out.println("Data lida: "+data);
                break;
                
            }catch(Exception e){
                System.out.println("Data Invalida, digite novamente.");
            }
            
        }while(true);
        
        situacao = "Aberto";
        
        

        int codigo = Problema.obterLista().size();
        codigo++;
        
        Problema_Controle.receberDadosCadastroProblema(descricao, data, situacao, codigo);
        Menu.exibirMenu();
    }
    
    public static void exibirListagemProblemasReportados(){
        System.out.println("----> LISTAGEM DE PROBLEMAS REPORTADOS <----");
        System.out.println("Codigo \t Descrição \t Situação \t Data");
        
        for(Problema obj : Problema_Controle.obterListaProblema()){
            System.out.println(obj.getCodigo()+" \t "+obj.getDescricao()+"      \t "+obj.getSituacao()+" \t "+obj.getData());
        }
        
        System.out.println("Digite M para retornar ao menu.");
        System.out.println("Digite o codigo do problema para mudar a situaçåo para resolvido.");
        System.out.println("Digite sua opção: ");
        
        Scanner entrada = new Scanner(System.in);
        String op = entrada.nextLine();
        
        if( op.equals("M") || op.equals("m") ){
            Menu.exibirMenu();
        
        }else{
            int i = Integer.parseInt(op);    
            Problema encontrado = Problema_Controle.obterProblemaPeloCodigo(i);
            if( encontrado == null ){
                System.out.println("ERRO: Não encontrado");
                Menu.exibirMenu();
            
            }else{
                encontrado.setSituacao("Resolvido");
                Menu.exibirMenu();
            } 
        }
        
    }
}
