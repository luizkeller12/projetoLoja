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
public class LojaProdutoBean {
    private int cod_loja;
    private int cod_produto;
    private int quant_estoque;
    private String pesquisa;

    public int getQuant_estoque() {
        return quant_estoque;
    }

    public void setQuant_estoque(int quant_estoque) {
        this.quant_estoque = quant_estoque;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
    
    public LojaProdutoBean(){
    
    }
    public LojaProdutoBean(int codigo) {
        this.cod_produto = codigo;
        
    }

    public int getCod_loja() {
        return cod_loja;
    }

    public void setCod_loja(int cod_loja) {
        this.cod_loja = cod_loja;
    }

    public int getCod_produto() {
        return cod_produto;
    }

    public void setCod_produto(int cod_produto) {
        this.cod_produto = cod_produto;
    }
    
}
