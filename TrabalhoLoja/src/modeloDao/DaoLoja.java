/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.LojaBean;
import modeloConnection.ConexaoBD;

/**
 *
 * @author luizk
 */
public class DaoLoja {
    ConexaoBD conex = new ConexaoBD();
    LojaBean cid = new LojaBean();
    
    public void Salvar(LojaBean cid){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO loja(endereço,telefone,nome,cnpj,cod_cidade)VALUES(?,?,?,?,?)");
            pst.setString(1,cid.getEndereço());
            pst.setLong(2, cid.getTelefone());
            pst.setString(3,cid.getNome());
            pst.setLong(4, cid.getCnpj());
            pst.setInt(5, cid.getCod_cidade());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Loja "+cid.getNome()+" Inserido(a) com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados/n Erro: "+ex);
        }
        
        conex.desconecta();
    }
    public void Editar(LojaBean cid ) {
        conex.conexao();    
        try {
            PreparedStatement pst = conex.con.prepareStatement("update loja set endereço=?,telefone=?,nome=?,cnpj=?,cod_cidade=? where codigo=?");
            pst.setString(1,cid.getEndereço());
            pst.setLong(2, cid.getTelefone());
            pst.setString(3,cid.getNome());
            pst.setLong(4, cid.getCnpj());
            pst.setInt(5, cid.getCod_cidade());
            pst.setInt(6, cid.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados alterados com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar dados\n Erro: "+ ex);
        }   
       conex.desconecta(); 
    }
    public void Apagar(LojaBean cid){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from loja where codigo=?");
            pst.setInt(1, cid.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Apagado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao apagar dados\n Erro: "+ ex);
        }
        
        conex.desconecta();
    }
    public LojaBean buscaLoja(LojaBean mod){    
        conex.conexao();
        
        conex.executaSql("SELECT * FROM loja WHERE nome LIKE '%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();     
            mod.setEndereço(conex.rs.getString("endereço"));
            mod.setTelefone(conex.rs.getLong("telefone"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setCnpj(conex.rs.getLong("cnpj"));            
            mod.setCodigo(conex.rs.getInt("codigo"));
            mod.setCod_cidade(conex.rs.getInt("cod_cidade"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Loja não cadastrada!");            
        }
        
        conex.desconecta();
        return mod;
    }
}
