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
public class CompraBean {
    private String forma_pag;
    private int total;
    private int data;
    private int codigo;
    private int cod_cl;
    
    public CompraBean(){
    
    }
    public CompraBean(int codigo) {
        this.codigo = codigo;
        
    }

    public String getForma_pag() {
        return forma_pag;
    }

    public void setForma_pag(String forma_pag) {
        this.forma_pag = forma_pag;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCod_cl() {
        return cod_cl;
    }

    public void setCod_cl(int cod_cl) {
        this.cod_cl = cod_cl;
    }
    
    
    
}
