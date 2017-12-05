/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

/**
 *
 * @author luizk
 */
public class ProdCompraBean {
    private int cod_prod;
    private int cod_compra;
    private int valor;
    private int quantidade;
    private String pesquisa;

    public ProdCompraBean(int cod_prod, int cod_compra, int valor, int quantidade, String pesquisa) {
        this.cod_prod = cod_prod;
        this.cod_compra = cod_compra;
        this.valor = valor;
        this.quantidade = quantidade;
        this.pesquisa = pesquisa;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
    
    
    public ProdCompraBean(){
    
    }
    public ProdCompraBean(int codigo) {
        this.cod_prod = codigo;
        ;
    }

    public int getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    public int getCod_compra() {
        return cod_compra;
    }

    public void setCod_compra(int cod_compra) {
        this.cod_compra = cod_compra;
    }
    
}
