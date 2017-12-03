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
public class ClienteBean {

    private long cpf;
    private String endereço;
    private long telefone;
    private String nome;
    private int codigo;
    private int cod_cidade;
    private String pesquisa;

    public ClienteBean(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public ClienteBean() {

    }

    public ClienteBean(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCod_cidade() {
        return cod_cidade;
    }

    public void setCod_cidade(int cod_cidade) {
        this.cod_cidade = cod_cidade;
    }

}
