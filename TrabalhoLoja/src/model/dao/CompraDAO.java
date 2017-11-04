/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.CompraBean;

/**
 *
 * @author luizk
 */
public class CompraDAO {
    
    public void create(CompraBean c){
        Connection con = ConnectionFactory.getConnection();      
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO compra(forma_pag,total,data,codigo,cod_cl)VALUES(?,?,?,?,?)");           
            stmt.setString(1,c.getForma_pag());
            stmt.setInt(2,c.getTotal());
            stmt.setInt(3,c.getData());
            stmt.setInt(4,c.getCodigo());
            stmt.setInt(5,c.getCod_cl());
            
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Sucesso ao Salvar Dados");
        
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Salvar Dados"+ex);
        }finally{
            ConnectionFactory.fechaConexao();
        }
    }
}
