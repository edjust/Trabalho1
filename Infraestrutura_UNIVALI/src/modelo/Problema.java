/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import armazenamento.Meio_Armazenamento;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Edgar
 */
public class Problema {
    private String descricao, situacao;
    private Date data;
    private int codigo;
    private ArrayList<Problema> listaSituacoes;
    
    public Problema(){
        this.listaSituacoes = new ArrayList();
    }
    
    public static Problema obterPeloNumero(int codigo){
        for(Problema objDaVez : Problema.obterLista() ){
            if( objDaVez.getCodigo() == codigo ){
                return objDaVez;
            }
        }
        return null;
    }
    
    public static ArrayList<Problema> obterLista(){
        return Meio_Armazenamento.MEIO_ARMAZENAMENTO_PROBLEMAS;
    }
    
    public void salvar(){
        Meio_Armazenamento.MEIO_ARMAZENAMENTO_PROBLEMAS.add(this);
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
