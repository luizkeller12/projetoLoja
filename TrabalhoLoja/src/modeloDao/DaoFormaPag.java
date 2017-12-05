/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.Forma_pagBean;
import modeloConnection.ConexaoBD;

/**
 *
 * @author luizk
 */
public class DaoFormaPag {
    ConexaoBD conex = new ConexaoBD();
    Forma_pagBean cid = new Forma_pagBean();
    
    public Forma_pagBean buscaForma(Forma_pagBean mod) {
        conex.conexao();

        conex.executaSql("SELECT * FROM forma_pagamento WHERE codigo LIKE '%" + mod.getPesquisa() + "%'");
        try {
            conex.rs.first();
            
            mod.setDescricao(conex.rs.getString("descricao"));
            mod.setCodigo(conex.rs.getInt("codigo"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Forma de pagamento não cadastrada!");
        }

        conex.desconecta();
        return mod;
    }
}
