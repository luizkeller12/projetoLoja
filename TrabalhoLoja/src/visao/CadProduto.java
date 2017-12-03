/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.ModeloTabela;
import modeloBeans.ProdutoBean;
import modeloConnection.ConexaoBD;
import modeloDao.DaoProduto;

/**
 *
 * @author luizk
 */
public class CadProduto extends javax.swing.JFrame {

    ConexaoBD conex = new ConexaoBD();
    ProdutoBean mod = new ProdutoBean();
    DaoProduto control = new DaoProduto();
    int flag = 0;

    /**
     * Creates new form CadCliente
     */
    public CadProduto() {
        initComponents();
        preencherTabela("select * from produto order by nome");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonVoltar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new br.com.cyber.componente.KTextField();
        btnSalvar = new javax.swing.JButton();
        jButtonApagar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ktableProduto = new br.com.cyber.componente.Ktable();
        txtCod = new br.com.cyber.componente.KTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPesq = new br.com.cyber.componente.KTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jButtonVoltar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_ic_keyboard_return_48px_352473.png"))); // NOI18N
        jButtonVoltar.setText("VOLTAR");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonVoltar);
        jButtonVoltar.setBounds(830, 410, 152, 40);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Código:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(60, 110, 70, 40);

        txtNome.setEnabled(false);
        txtNome.setK_back_focus_gained(new java.awt.Color(255, 108, 108));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel2.add(txtNome);
        txtNome.setBounds(130, 50, 370, 40);

        btnSalvar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_save_1608823 (1).png"))); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalvar);
        btnSalvar.setBounds(280, 190, 210, 50);

        jButtonApagar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_Streamline-70_185090.png"))); // NOI18N
        jButtonApagar.setText("APAGAR");
        jButtonApagar.setEnabled(false);
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonApagar);
        jButtonApagar.setBounds(280, 250, 210, 50);

        jButtonNovo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cad.png"))); // NOI18N
        jButtonNovo.setText("NOVO");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonNovo);
        jButtonNovo.setBounds(60, 190, 210, 50);

        jButtonCancelar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_cancel-2_309095.png"))); // NOI18N
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCancelar);
        jButtonCancelar.setBounds(10, 390, 220, 60);

        jButtonEditar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_edit_2561427.png"))); // NOI18N
        jButtonEditar.setText("EDITAR");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonEditar);
        jButtonEditar.setBounds(60, 250, 210, 50);

        ktableProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ktableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        ktableProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ktableProdutoMouseClicked(evt);
            }
        });
        ktableProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ktableProdutoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ktableProdutoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ktableProdutoKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(ktableProduto);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(530, 92, 450, 310);

        txtCod.setEnabled(false);
        txtCod.setK_back_focus_gained(new java.awt.Color(102, 102, 255));
        jPanel2.add(txtCod);
        txtCod.setBounds(130, 110, 100, 40);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nome:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(60, 50, 70, 40);
        jPanel2.add(txtPesq);
        txtPesq.setBounds(530, 50, 240, 40);

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/buscar.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar);
        btnBuscar.setBounds(780, 50, 200, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 50, 1010, 460);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Produtos");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 10, 1010, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, -10, 1070, 540);

        setSize(new java.awt.Dimension(1044, 516));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para continuar!");
            txtNome.requestFocus();
        } else {
            if (flag == 1) {
                mod.setNome(txtNome.getText());
                control.Salvar(mod);
                txtNome.setText("");
                txtCod.setText("");
                btnSalvar.setEnabled(false);
                preencherTabela("select * from produto order by nome");
            } else if (flag == 2) {
                mod.setNome(txtNome.getText());

                mod.setCodigo(Integer.parseInt(txtCod.getText()));
                control.Editar(mod);
                txtCod.setEnabled(false);
                txtNome.setEnabled(false);

                txtCod.setText("");
                txtNome.setText("");
                btnBuscar.setEnabled(true);
                txtPesq.setEnabled(true);

                btnSalvar.setEnabled(false);
                ktableProduto.setEnabled(true);
                preencherTabela("select * from produto order by nome");
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
        // TODO add your handling code here:
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Realmente deseja Apagar?");
        if (resposta == JOptionPane.YES_OPTION) {
            mod.setCodigo(Integer.parseInt(txtCod.getText()));
            control.Apagar(mod);
            jButtonEditar.setEnabled(false);
            jButtonApagar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            txtNome.setEnabled(false);

            txtNome.setText("");
            txtCod.setText("");

            preencherTabela("select * from produto order by nome");
            jButtonNovo.setEnabled(true);
            btnBuscar.setEnabled(true);
            txtPesq.setEnabled(true);
            

        }

    }//GEN-LAST:event_jButtonApagarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here

        flag = 1;
        txtNome.setEnabled(true);

        btnSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        txtNome.setText("");
        txtCod.setText("");
        jButtonEditar.setEnabled(false);
        jButtonApagar.setEnabled(false);
        btnBuscar.setEnabled(false);
        txtPesq.setEnabled(false);
        ktableProduto.setEnabled(false);


    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        flag = 0;
        txtNome.setEnabled(!true);

        btnSalvar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonApagar.setEnabled(false);
        txtPesq.setEnabled(true);
        btnBuscar.setEnabled(true);
        txtCod.setText("");
        txtNome.setText("");
        txtPesq.setText("");
        ktableProduto.setEnabled(true);


    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        flag = 2;
        txtCod.setEnabled(false);
        txtNome.setEnabled(true);
        btnSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonApagar.setEnabled(false);
        ktableProduto.setEnabled(false);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed
    public void setaTextFields() {
        int indice = ktableProduto.getSelectedRow();
        txtNome.setText(ktableProduto.getValueAt(indice, 0).toString());
        txtCod.setText(ktableProduto.getValueAt(indice, 1).toString());
        jButtonEditar.setEnabled(true);
        jButtonApagar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonCancelar.setEnabled(true);
    }


    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        mod.setPesquisa(txtPesq.getText());
        
        preencherTabela("SELECT * FROM produto WHERE nome LIKE '%"+mod.getPesquisa()+"%'");
        


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void ktableProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ktableProdutoMouseClicked
        // TODO add your handling code here:
        setaTextFields();
    }//GEN-LAST:event_ktableProdutoMouseClicked

    private void ktableProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ktableProdutoKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ktableProdutoKeyReleased

    private void ktableProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ktableProdutoKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ktableProdutoKeyTyped

    private void ktableProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ktableProdutoKeyPressed
        // TODO add your handling code here:
        setaTextFields();
    }//GEN-LAST:event_ktableProdutoKeyPressed

    public void preencherTabela(String Sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"nome", "codigo"};
        conex.conexao();
        conex.executaSql(Sql);

        try {
            conex.rs.first();
            do {
                dados.add(new Object[]{conex.rs.getString("nome"), conex.rs.getInt("codigo")});
            } while (conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Busque outro produto na tabela");
            
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);

        ktableProduto.setModel(modelo);
        ktableProduto.getColumnModel().getColumn(0).setPreferredWidth(260);
        ktableProduto.getColumnModel().getColumn(0).setResizable(false);
        ktableProduto.getColumnModel().getColumn(1).setPreferredWidth(170);
        ktableProduto.getColumnModel().getColumn(1).setResizable(false);

        ktableProduto.setAutoResizeMode(ktableProduto.AUTO_RESIZE_OFF);
        ktableProduto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconecta();
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private br.com.cyber.componente.Ktable ktableProduto;
    private br.com.cyber.componente.KTextField txtCod;
    private br.com.cyber.componente.KTextField txtNome;
    private br.com.cyber.componente.KTextField txtPesq;
    // End of variables declaration//GEN-END:variables
}
