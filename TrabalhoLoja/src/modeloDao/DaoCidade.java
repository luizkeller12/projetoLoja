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
import modeloBeans.BeansCidade;

/**
 *
 * @author luizk
 */
public class DaoCidade {
    ConexaoBD conex = new ConexaoBD();
    BeansCidade cid = new BeansCidade();
    
    public void Salvar(BeansCidade cid){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO cidade(nome,cep,uf)VALUES(?,?,?)");
            pst.setString(1,cid.getNome());
            pst.setInt(2, cid.getCep());
            pst.setString(3,cid.getUf());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Cidade "+cid.getNome()+" Inserido(a) com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados/n Erro: "+ex);
        }
        
        conex.desconecta();
    }
    public void Editar(BeansCidade cid ) {
        conex.conexao();    
        try {
            PreparedStatement pst = conex.con.prepareStatement("update cidade set nome=?,cep=?,uf=? where codigo=?");
            pst.setString(1, cid.getNome());
            pst.setInt(2, cid.getCep());
            pst.setString(3, cid.getUf());
            pst.setInt(4, cid.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados alterados com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar dados\n Erro: "+ ex);
        }   
       conex.desconecta(); 
    }
    public void Apagar(BeansCidade cid){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from cidade where codigo=?");
            pst.setInt(1, cid.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Apagado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao apagar dados\n Erro: "+ ex);
        }
        
        conex.desconecta();
    }
    public BeansCidade buscaCidade(BeansCidade mod){    
        conex.conexao();
        
        conex.executaSql("SELECT * FROM cidade WHERE nome LIKE '%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();            
            mod.setNome(conex.rs.getString("nome"));
            mod.setCep(conex.rs.getInt("cep"));
            mod.setUf(conex.rs.getString("uf"));
            mod.setCodigo(conex.rs.getInt("codigo"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cidade não cadastrada!");            
        }
        
        conex.desconecta();
        return mod;
    }
}
