/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import modeloConnection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.ClienteBean;

/**
 *
 * @author luizk
 */
public class DaoCliente {
    ConexaoBD conex = new ConexaoBD();
    ClienteBean cid = new ClienteBean();
    
    public void Salvar(ClienteBean cid){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO cliente(cpf,endereco,telefone,nome,cod_cidade)VALUES(?,?,?)");
            pst.setLong(1,cid.getCpf());
            pst.setString(2, cid.getEndereco());
            pst.setInt(3,cid.getTelefone());
            pst.setString(4, cid.getNome());
            pst.setInt(5, cid.getCod_cidade());
            
            pst.execute();
            JOptionPane.showMessageDialog(null,"Cliente "+cid.getNome()+" Inserido(a) com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados/n Erro: "+ex);
        }
        
        conex.desconecta();
    }
    public void Editar(ClienteBean cid ) {
        conex.conexao();    
        try {
            PreparedStatement pst = conex.con.prepareStatement("update cliente set cpf=?,endereco=?,telefone=?, nome=?,cod_cidade=? where codigo=?");
            pst.setLong(1,cid.getCpf());
            pst.setString(2, cid.getEndereco());
            pst.setInt(3,cid.getTelefone());
            pst.setString(4, cid.getNome());
            pst.setInt(5, cid.getCod_cidade());
            pst.setInt(6, cid.getCodigo());
            
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados alterados com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar dados\n Erro: "+ ex);
        }   
       conex.desconecta(); 
    }
    public void Apagar(ClienteBean cid){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from cliente where codigo=?");
            pst.setInt(1, cid.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Apagado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao apagar dados\n Erro: "+ ex);
        }
        
        conex.desconecta();
    }
    public ClienteBean buscaCliente(ClienteBean mod){    
        conex.conexao();
        
        conex.executaSql("SELECT * FROM cliente WHERE nome LIKE '%"+mod.getClientePesquisa()+"%'");
        try {
            conex.rs.first();    
            
            mod.setCpf(conex.rs.getLong("cpf"));
            mod.setEndereco(conex.rs.getString("endereco"));
            mod.setTelefone(conex.rs.getInt("telefone"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setCodigo(conex.rs.getInt("codigo"));
            mod.setCod_cidade(conex.rs.getInt("cod_cidade"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cliente não cadastrada!");            
        }
        
        conex.desconecta();
        return mod;
    }
}
