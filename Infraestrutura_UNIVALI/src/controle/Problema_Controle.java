/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import java.util.Date;
import modelo.Problema;

/**
 *
 * @author Edgar
 */
public class Problema_Controle {
    public static void receberDadosCadastroProblema(String descricao, Date data, String situacao, int codigo){
        Problema objetoProblema = new Problema();
        objetoProblema.setDescricao(descricao);
        objetoProblema.setData(data);
        objetoProblema.setSituacao(situacao);
        objetoProblema.setCodigo(codigo);
        objetoProblema.salvar();
    }
    
    public static ArrayList<Problema> obterListaProblema(){
        return Problema.obterLista();
    }
    
    public static Problema obterProblemaPeloCodigo(int codigo){
        return Problema.obterPeloNumero(codigo);
    }
}
