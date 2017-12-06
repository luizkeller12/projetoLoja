/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.spi.DirStateFactory;
import javax.swing.JOptionPane;
import modeloBeans.ProdutoBean;
import modeloConnection.ConexaoBD;
import static sun.util.calendar.CalendarUtils.mod;

/**
 *
 * @author luizk
 */
public class DaoProduto {
    ConexaoBD conex = new ConexaoBD();
    ProdutoBean cid = new ProdutoBean();
    
    public void Salvar(ProdutoBean cid){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO produto(nome)VALUES(?)");
            pst.setString(1,cid.getNome());           
            pst.execute();
            JOptionPane.showMessageDialog(null,"Produto "+cid.getNome()+" Inserido(a) com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados/n Erro: "+ex);
        }
        
        conex.desconecta();
    }
    
    public void Editar(ProdutoBean cid ) {
        conex.conexao();    
        try {
            PreparedStatement pst = conex.con.prepareStatement("update produto set nome=? where codigo=?");
            pst.setString(1, cid.getNome());
            pst.setInt(2, cid.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados alterados com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar dados\n Erro: "+ ex);
        }   
       conex.desconecta(); 
    }
    
    public void Apagar(ProdutoBean cid){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from produto where codigo=?");
            pst.setInt(1, cid.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Produto apagado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao apagar produto\n Erro: "+ ex);
        }
        
        conex.desconecta();
    }
    
     public ProdutoBean buscaProduto(int codigo){    
        conex.conexao();
        ProdutoBean mod = new ProdutoBean();
        try {
            PreparedStatement pst = conex.con.prepareStatement("SELECT * FROM produto WHERE codigo=?");
            pst.setInt(1, cid.getCodigo());
            ResultSet rs = pst.executeQuery();
            rs.first();            
            mod.setNome(rs.getString("nome"));
            mod.setCodigo(rs.getInt("codigo"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Produto não cadastrado!");            
        }
        
        conex.desconecta();
        return mod;
    }
    
    public ProdutoBean buscaProduto(ProdutoBean mod){    
        conex.conexao();
        
        conex.executaSql("SELECT * FROM produto WHERE nome LIKE '%"+mod.getPesquisa()+"%'");
        try {
             PreparedStatement pst = conex.con.prepareStatement("SELECT * FROM produto WHERE codigo=?");
            pst.setInt(1, cid.getCodigo());
             conex.rs.first();            
            
            mod.setNome(conex.rs.getString("nome"));
            mod.setCodigo(conex.rs.getInt("codigo"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Produto não cadastrado!");            
        }
        
        conex.desconecta();
        return mod;
    }
    
    
}
