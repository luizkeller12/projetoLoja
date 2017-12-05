/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.ProdCompraBean;
import modeloConnection.ConexaoBD;

/**
 *
 * @author luizk
 */
public class DaoProdCompra {
    ConexaoBD conex = new ConexaoBD();
    ProdCompraBean cid = new ProdCompraBean();
    
    public void Salvar(ProdCompraBean cid){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO prod_compra(quantidade,valor,cod_prod,cod_compra)VALUES(?,?,?,?)");
            pst.setInt(1,cid.getQuantidade());
            pst.setInt(2, cid.getValor());
            pst.setInt(3,cid.getCod_prod());
            pst.setInt(4,cid.getCod_compra());
            pst.execute();
            JOptionPane.showMessageDialog(null,"produto/Compra Inserido(a) com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados/n Erro: "+ex);
        }
        
        conex.desconecta();
    }
    public void Editar(ProdCompraBean cid ) {
        conex.conexao();    
        try {
            PreparedStatement pst = conex.con.prepareStatement("update cidade set quantidade=?,valor=?, cod_prod=?,cod_compra=? where (cod_prod=? and cod_compra=?)");
            pst.setInt(1,cid.getQuantidade());
            pst.setInt(2, cid.getValor());
            pst.setInt(3,cid.getCod_prod());
            pst.setInt(4,cid.getCod_compra());
            pst.setInt(5,cid.getCod_prod());
            pst.setInt(6,cid.getCod_compra());
            pst.execute();
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados alterados com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar dados\n Erro: "+ ex);
        }   
       conex.desconecta(); 
    }
    public void Apagar(ProdCompraBean cid){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from prod_compra where (cod_prod=? and cod_compra=?) ");
            pst.setInt(1, cid.getCod_prod());
            pst.setInt(2, cid.getCod_compra());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Apagado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao apagar dados\n Erro: "+ ex);
        }
        
        conex.desconecta();
    }
    public ProdCompraBean buscaProdCompra(ProdCompraBean mod){    
        conex.conexao();
        
        conex.executaSql("SELECT * FROM prod_compra WHERE nome LIKE '%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();            
            mod.setQuantidade(conex.rs.getInt("quantidade"));
            mod.setValor(conex.rs.getInt("valor"));
            mod.setCod_prod(conex.rs.getInt("cod_prod"));
            mod.setCod_compra(conex.rs.getInt("cod_compra"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Compra/produto não cadastrada!");            
        }
        
        conex.desconecta();
        return mod;
    }
    
    
    
}
