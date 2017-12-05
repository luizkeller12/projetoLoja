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
public class CompraBean {
    private int cod_formapag;
    private int total;
    private String data_;
    private int codigo;
    private int cod_cl;
    private String pesquisa;

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
    
    public CompraBean(){
    
    }
    public CompraBean(int codigo) {
        this.codigo = codigo;
        
    }

    public int getCod_formapag() {
        return cod_formapag;
    }

    public void setCod_formapag(int cod_formapag) {
        this.cod_formapag = cod_formapag;
    }

    public String getData_() {
        return data_;
    }

    public void setData_(String data_) {
        this.data_ = data_;
    }

    

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
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
