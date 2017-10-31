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
import model.bean.CidadeBean;

/**
 *
 * @author luizk
 */
public class CidadeDAO {
 
    public void create(CidadeBean c){
        Connection con = ConnectionFactory.getConnection();      
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO cidade(nome,cep,uf,codigo)VALUES(?,?,?,?)");           
            stmt.setString(1,c.getNome());
            stmt.setInt(2,c.getCep());
            stmt.setString(3,c.getUf());
            stmt.setInt(4,c.getCodigo());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Sucesso ao Salvar Dados");
        
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Salvar Dados"+ex);
        }finally{
            ConnectionFactory.fechaConexao();
        }
    }
}