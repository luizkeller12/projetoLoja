/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.UsuarioBean;
import modeloConnection.ConexaoBD;

/**
 *
 * @author luizk
 */
public class DaoUsuario {
    ConexaoBD conex = new ConexaoBD();
    UsuarioBean mod = new UsuarioBean();
    
    public void Salvar(UsuarioBean mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO usuario(usuario,senha)VALUES(?,?)");
            pst.setString(1,mod.getUsuario());
            pst.setString(2, mod.getSenha());
            
            pst.execute();
            JOptionPane.showMessageDialog(null,"Usuário "+mod.getUsuario()+" Inserido(a) com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir Usuario Erro: "+ex);
        }
        
        conex.desconecta();
    }
}
