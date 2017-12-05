/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.CompraBean;
import modeloConnection.ConexaoBD;

/**
 *
 * @author luizk
 */
public class DaoCompra {

    ConexaoBD conex = new ConexaoBD();
    CompraBean cid = new CompraBean();

    public void Salvar(CompraBean cid) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO compra(total, data_,cod_cl,cod_formapag) VALUES(?,?,?,?)");
            
            pst.setInt(1, cid.getTotal());
            pst.setDate(2, Date.valueOf(cid.getData_()));
            pst.setInt(3, cid.getCod_cl());
            pst.setInt(4,cid.getCod_formapag());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Compra Inserido(a) com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados/n Erro: " + ex);
        }

        conex.desconecta();
    }

    public void Editar(CompraBean cid) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update compra set total=?,data_=?,cod_cl=?,cod_formapag=? where codigo=?");
             pst.setInt(1, cid.getTotal());
            pst.setDate(2, Date.valueOf(cid.getData_()));
            pst.setInt(3, cid.getCod_cl());
            pst.setInt(4,cid.getCod_formapag());
            pst.setInt(5, cid.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados\n Erro: " + ex);
        }
        conex.desconecta();
    }

    public void Apagar(CompraBean cid) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from compra where codigo=?");
            pst.setInt(1, cid.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Apagado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao apagar dados\n Erro: " + ex);
        }

        conex.desconecta();
    }

    public CompraBean buscaCompra(CompraBean mod) {
        conex.conexao();

        conex.executaSql("SELECT * FROM compra WHERE codigo LIKE '%" + mod.getPesquisa() + "%'");
        try {
            conex.rs.first();  
            mod.setTotal(conex.rs.getInt("total"));
            mod.setData_(conex.rs.getString("data_"));
            mod.setCodigo(conex.rs.getInt("codigo"));
            mod.setCod_cl(conex.rs.getInt("cod_cl"));
            mod.setCod_formapag(conex.rs.getInt("cod_formapag"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Compra não cadastrada!");
        }

        conex.desconecta();
        return mod;
    }
}
