/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author luizk
 */
public class ParcelaBean {
    private int codigo;
    private int n_parcelas;
    private int valor_parcela;
    private int data_pag;
    private int data_venc;
    private  int cod_comp;
    
    public ParcelaBean(){
    
    }
    public ParcelaBean(int codigo) {
        this.codigo = codigo;
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getN_parcelas() {
        return n_parcelas;
    }

    public void setN_parcelas(int n_parcelas) {
        this.n_parcelas = n_parcelas;
    }

    public int getValor_parcela() {
        return valor_parcela;
    }

    public void setValor_parcela(int valor_parcela) {
        this.valor_parcela = valor_parcela;
    }

    public int getData_pag() {
        return data_pag;
    }

    public void setData_pag(int data_pag) {
        this.data_pag = data_pag;
    }

    public int getData_venc() {
        return data_venc;
    }

    public void setData_venc(int data_venc) {
        this.data_venc = data_venc;
    }

    public int getCod_comp() {
        return cod_comp;
    }

    public void setCod_comp(int cod_comp) {
        this.cod_comp = cod_comp;
    }
    
    
}
