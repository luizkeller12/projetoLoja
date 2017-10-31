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
import model.bean.ClienteBean;

/**
 *
 * @author luizk
 */
public class ClienteDAO {
    
    public void create(ClienteBean c){
        Connection con = ConnectionFactory.getConnection();      
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO cliente(cpf,endereco,telefone,nome,codigo,cod_cidade)VALUES(?,?,?,?,?,?)");           
            stmt.setInt(1,c.getCpf());
            stmt.setString(2,c.getEndereco());
            stmt.setInt(3,c.getTelefone());
            stmt.setString(4,c.getNome());
            stmt.setInt(5,c.getCodigo());
            stmt.setInt(6,c.getCod_cidade());
            
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Sucesso ao Salvar Dados");
        
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Salvar Dados"+ex);
        }finally{
            ConnectionFactory.fechaConexao();
        }
    }
    
}
