/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Menu {
    public static void exibirMenu(){
        char op = ' ';
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n-----> MENU PRINCIPAL <-----");
        System.out.println("Digite V para visualizar os problemas reportados.");
        System.out.println("Digite R para reportar um novo problema.");
        System.out.println("Digite S para sair.");
        System.out.println("Digite sua opção: ");
        
        while( op != 'V' || op != 'v' || op != 'R' || op != 'r' ){
            op = entrada.next().charAt(0);
        
            if( op == 'V' || op == 'v' ){
                Problema_Visao.exibirListagemProblemasReportados();

            }else if( op == 'R' || op == 'r' ){
                Problema_Visao.exibirCadastroProblema();

            }else if( op == 'S' || op == 's' ) System.exit(0);
        }
    }
}
