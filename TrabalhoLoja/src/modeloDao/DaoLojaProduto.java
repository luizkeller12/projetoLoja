/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.LojaProdutoBean;
import modeloConnection.ConexaoBD;

/**
 *
 * @author luizk
 */
public class DaoLojaProduto {

    

        ConexaoBD conex = new ConexaoBD();
        LojaProdutoBean cid = new LojaProdutoBean();

        public void Salvar(LojaProdutoBean cid) {
            conex.conexao();
            try {
                PreparedStatement pst = conex.con.prepareStatement("INSERT INTO loja_produto(quant_estoque,cod_loja,cod_produto)VALUES(?,?,?)");
                pst.setInt(1, cid.getQuant_estoque());
                pst.setInt(2, cid.getCod_loja());
                pst.setInt(3, cid.getCod_produto());
                pst.execute();
                JOptionPane.showMessageDialog(null, "produto/Compra Inserido(a) com sucesso");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir dados/n Erro: " + ex);
            }

            conex.desconecta();
        }

        public void Editar(LojaProdutoBean cid) {
            conex.conexao();
            try {
                PreparedStatement pst = conex.con.prepareStatement("update loja_produto set quant_estoque=?,cod_loja=?, cod_produto=? where (cod_loja=? and cod_produto=?)");
                pst.setInt(1, cid.getQuant_estoque());
                pst.setInt(2, cid.getCod_loja());
                pst.setInt(3, cid.getCod_produto());
                pst.setInt(4, cid.getCod_loja());
                pst.setInt(5, cid.getCod_produto());
                pst.execute();
                pst.execute();
                JOptionPane.showMessageDialog(null, "Dados alterados com Sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao alterar dados\n Erro: " + ex);
            }
            conex.desconecta();
        }

        public void Apagar(LojaProdutoBean cid) {
            conex.conexao();
            try {
                PreparedStatement pst = conex.con.prepareStatement("delete from loja_produto where (cod_loja=? and cod_produto=?) ");
                pst.setInt(1, cid.getCod_loja());
                pst.setInt(2, cid.getCod_produto());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Apagado com Sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao apagar dados\n Erro: " + ex);
            }

            conex.desconecta();
        }

        public LojaProdutoBean buscaLojaProdutos(LojaProdutoBean mod) {
            conex.conexao();

            conex.executaSql("SELECT * FROM loja_produto WHERE quant_estoque LIKE '%" + mod.getPesquisa() + "%'");
            try {
                conex.rs.first();
                mod.setCod_loja(conex.rs.getInt("cod_loja"));
                mod.setCod_produto(conex.rs.getInt("cod_produto"));
                mod.setQuant_estoque(conex.rs.getInt("quant_estoque"));

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Compra/produto não cadastrada!");
            }

            conex.desconecta();
            return mod;
        }

    
}
