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
    private String endereco;
    private int telefone;
    private String nome;
    private int codigo;
    private int cod_cidade;
    private String Clientepesquisa;

    public ClienteBean(String pesquisa) {
        this.Clientepesquisa = pesquisa;
    }

    public void setClientePesquisa(String pesquisa) {
        this.Clientepesquisa = pesquisa;
    }

    public String getClientePesquisa() {
        return Clientepesquisa;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
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
