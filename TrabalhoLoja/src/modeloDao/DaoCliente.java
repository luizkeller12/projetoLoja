package modeloDao;

import modeloConnection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.ClienteBean;

/**
 *
 * @author luizk
 */
public class DaoCliente {
    ConexaoBD conex = new ConexaoBD();
   ClienteBean cli = new ClienteBean();
    
    public void Salvar(ClienteBean cli){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO cliente(cpf,endereco,telefone,nome,cod_cidade)VALUES(?,?,?,?,?)");
            pst.setInt(1, cli.getCpf());
            pst.setString(2,cli.getEndereco());
            pst.setInt(3, cli.getTelefone());
            pst.setString(4,cli.getNome());
            pst.setInt(5,cli.getCod_cidade());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Cliente "+cli.getNome()+" Inserido(a) com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados/n Erro: "+ex);
        }
        
        conex.desconecta();
    }
    public void Editar(BeansCidade cid ) {
        conex.conexao();    
        try {
            PreparedStatement pst = conex.con.prepareStatement("update cidade set nome=?,cep=?,uf=? where codigo=?");
            pst.setString(1, cid.getNome());
            pst.setInt(2, cid.getCep());
            pst.setString(3, cid.getUf());
            pst.setInt(4, cid.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados alterados com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar dados\n Erro: "+ ex);
        }   
       conex.desconecta(); 
    }
    public void Apagar(ClienteBean cli){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from cliente where codigo=?");
            pst.setInt(1, cli.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Apagado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao apagar dados\n Erro: "+ ex);
        }
        
        conex.desconecta();
    }
    public ClienteBean buscaCidade(ClienteBean mod){    
        conex.conexao();
        
        conex.executaSql("SELECT * FROM cidade WHERE nome LIKE '%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();            
            mod.setNome(conex.rs.getString("nome"));
            mod.setCep(conex.rs.getInt("cep"));
            mod.setUf(conex.rs.getString("uf"));
            mod.setCodigo(conex.rs.getInt("codigo"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar cidade/n Erro: "+ex);
        }
        
        conex.desconecta();
        return mod;
    }
}
