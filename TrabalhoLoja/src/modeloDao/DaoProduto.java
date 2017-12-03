/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansCidade;
import modeloBeans.ProdutoBean;
import modeloConnection.ConexaoBD;

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
    
    
}
