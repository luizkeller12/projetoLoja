/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.CidadeBean;

/**
 *
 * @author luizk
 */
public class ControleCidade {
    ConexaoBD conex = new ConexaoBD();
    CidadeBean cid = new CidadeBean();
    
    public void Salvar(CidadeBean cid){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO cidade(nome,cep,uf)VALUES(?,?,?)");
            pst.setString(1,cid.getNome());
            pst.setInt(2, cid.getCep());
            pst.setString(3,cid.getUf());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Cidade"+cid.getNome()+" Inserido(a) com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados/n Erro: "+ex);
        }
        
        conex.desconecta();
    }
}
