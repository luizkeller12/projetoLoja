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
import modeloConnection.ConexaoBD;
import modeloDao.DaoCidade;
import modeloBeans.BeansCidade;
import modeloBeans.ModeloTabela;

/**
 *
 * @author luizk
 */
public class CadCidade extends javax.swing.JFrame {

    BeansCidade mod = new BeansCidade();
    DaoCidade control = new DaoCidade();
    ConexaoBD conex = new ConexaoBD();

    int flag = 0;

    /**
     * Creates new form CadCidade
     */
    public CadCidade() {
        initComponents();
        preencherTabela("select * from cidade order by nome");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jFrame1 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonApagar = new javax.swing.JButton();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonPesquisa = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCep = new javax.swing.JFormattedTextField();
        jTextFieldNome = new br.com.cyber.componente.KTextField();
        jButtonVoltar = new javax.swing.JButton();
        kComboBoXUf = new br.com.cyber.componente.KComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCidade = new br.com.cyber.componente.Ktable();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(12, 23, 78, 18);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("UF:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(12, 201, 78, 22);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("CEP:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(12, 113, 78, 20);

        jButtonNovo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_new10_216291.png"))); // NOI18N
        jButtonNovo.setText("NOVO");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNovo);
        jButtonNovo.setBounds(10, 410, 115, 40);

        jButtonSalvar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_save_1608823 (1).png"))); // NOI18N
        jButtonSalvar.setText("SALVAR");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalvar);
        jButtonSalvar.setBounds(140, 410, 131, 40);

        jButtonCancelar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_cancel-2_309095.png"))); // NOI18N
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancelar);
        jButtonCancelar.setBounds(280, 410, 157, 40);

        jButtonEditar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_edit_2561427.png"))); // NOI18N
        jButtonEditar.setText("EDITAR");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditar);
        jButtonEditar.setBounds(440, 410, 123, 40);

        jButtonApagar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_Streamline-70_185090.png"))); // NOI18N
        jButtonApagar.setText("APAGAR");
        jButtonApagar.setEnabled(false);
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonApagar);
        jButtonApagar.setBounds(570, 410, 135, 40);
        jPanel1.add(jTextFieldPesquisa);
        jTextFieldPesquisa.setBounds(440, 50, 219, 33);

        jButtonPesquisa.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_search_126577.png"))); // NOI18N
        jButtonPesquisa.setText("PESQUISAR");
        jButtonPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPesquisa);
        jButtonPesquisa.setBounds(660, 50, 163, 35);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Código:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(12, 298, 78, 23);

        jTextFieldCodigo.setEnabled(false);
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCodigo);
        jTextFieldCodigo.setBounds(12, 327, 97, 34);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel6.setText("Ex: \"Ibirubá\"");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(450, 84, 58, 14);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel8.setText("Ex: \"98200000\"");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(12, 181, 82, 14);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel9.setText("Ex: \"Ibirubá\"");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(12, 93, 58, 14);

        try {
            jTextFieldCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldCep.setEnabled(false);
        jTextFieldCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCepActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCep);
        jTextFieldCep.setBounds(12, 139, 182, 35);

        jTextFieldNome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldNome.setEnabled(false);
        jPanel1.add(jTextFieldNome);
        jTextFieldNome.setBounds(12, 47, 285, 35);

        jButtonVoltar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_ic_keyboard_return_48px_352473.png"))); // NOI18N
        jButtonVoltar.setText("VOLTAR");
        jButtonVoltar.setToolTipText("Voltar a tela principal");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVoltar);
        jButtonVoltar.setBounds(850, 410, 131, 40);

        kComboBoXUf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE", "RS", "PR", "SC" }));
        kComboBoXUf.setEnabled(false);
        kComboBoXUf.setName(""); // NOI18N
        jPanel1.add(kComboBoXUf);
        kComboBoXUf.setBounds(12, 234, 142, 34);

        jTableCidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableCidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCidadeMouseClicked(evt);
            }
        });
        jTableCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableCidadeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableCidadeKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCidade);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(440, 110, 540, 260);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(30, 90, 1010, 460);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro Cidade:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(42, 11, 960, 104);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(-10, -30, 1080, 580);

        setSize(new java.awt.Dimension(1039, 534));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        byte resposta = 0;
        resposta  = (byte) JOptionPane.showConfirmDialog(rootPane, "Deseja voltar? Seus dados não salvos serão perdidos!");
        if(resposta ==  JOptionPane.YES_OPTION){
        dispose();
        }
    }//GEN-LAST:event_jButtonVoltarActionPerformed
    public void setaTextFields() {
        int indice = jTableCidade.getSelectedRow();
        jTextFieldNome.setText(jTableCidade.getValueAt(indice, 0).toString());
        jTextFieldCep.setText(jTableCidade.getValueAt(indice, 1).toString());
        kComboBoXUf.setSelectedItem(jTableCidade.getValueAt(indice, 2).toString());
        jTextFieldCodigo.setText(jTableCidade.getValueAt(indice, 3).toString());
        jButtonEditar.setEnabled(true);
        jButtonApagar.setEnabled(true);
        jButtonNovo.setEnabled(false);
    }
    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
        // TODO add your handling code here:
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Realmente deseja Apagar?");
        if (resposta == JOptionPane.YES_OPTION) {
            mod.setCodigo(Integer.parseInt(jTextFieldCodigo.getText()));
            control.Apagar(mod);
            jButtonEditar.setEnabled(false);
            jButtonApagar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jTextFieldCep.setEnabled(false);
            jTextFieldNome.setEnabled(false);
            kComboBoXUf.setEnabled(false);
            jTextFieldCep.setText("");
            jTextFieldNome.setText("");
            
            jTextFieldCodigo.setText("");
            preencherTabela("select * from cidade order by nome");
            jButtonNovo.setEnabled(true);
            jButtonPesquisa.setEnabled(true);
            jTextFieldPesquisa.setEnabled(true);
            
            
        }
    }//GEN-LAST:event_jButtonApagarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;
        jTextFieldCep.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        kComboBoXUf.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonApagar.setEnabled(false);
        jTableCidade.setEnabled(false);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        flag = 0;
        jTextFieldCep.setEnabled(!true);
        jTextFieldNome.setEnabled(!true);
        kComboBoXUf.setEnabled(!true);
        jButtonSalvar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonApagar.setEnabled(false);
        jTextFieldPesquisa.setEnabled(true);
        jButtonPesquisa.setEnabled(true);
        jTextFieldCep.setText("");
        jTextFieldNome.setText("");
        jTextFieldCodigo.setText("");
        jTableCidade.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(jTextFieldNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para continuar!");
            jTextFieldNome.requestFocus();
        }else if(jTextFieldCep.getText().isEmpty()|| (jTextFieldCep.getText ().trim().length () != 8)){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para continuar!");
            jTextFieldCep.requestFocus();
        
        }else{

            if (flag == 1) {
                mod.setNome(jTextFieldNome.getText());
                mod.setCep(Integer.parseInt(jTextFieldCep.getText()));
                mod.setUf(kComboBoXUf.getSelectedItem().toString());
                control.Salvar(mod);
                jTextFieldCep.setText("");
                jTextFieldNome.setText("");
                jButtonPesquisa.setEnabled(true);
                jTextFieldPesquisa.setEnabled(true);
                jTextFieldCep.setEnabled(false);
                jTextFieldNome.setEnabled(false);
                kComboBoXUf.setEnabled(false);
                jButtonSalvar.setEnabled(false);
                jButtonCancelar.setEnabled(false);
                jTableCidade.setEnabled(true);
                preencherTabela("select * from cidade order by nome");
            } else {
                mod.setNome(jTextFieldNome.getText());
                mod.setCep(Integer.parseInt(jTextFieldCep.getText()));
                mod.setUf(kComboBoXUf.getSelectedItem().toString());
                mod.setCodigo(Integer.parseInt(jTextFieldCodigo.getText()));
                control.Editar(mod);
                jTextFieldCep.setEnabled(false);
                jTextFieldNome.setEnabled(false);
                kComboBoXUf.setEnabled(false);
                jTextFieldCep.setText("");
                jTextFieldNome.setText("");
             jButtonPesquisa.setEnabled(true);
             jTextFieldPesquisa.setEnabled(true);
                jTextFieldCodigo.setText("");
                jButtonSalvar.setEnabled(false);
                jTableCidade.setEnabled(true);
                preencherTabela("select * from cidade order by nome");
            }
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:
        flag = 1;
        jTextFieldCep.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        kComboBoXUf.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jTextFieldCep.setText("");
        jTextFieldNome.setText("");
        
        jTextFieldCodigo.setText("");
        jButtonEditar.setEnabled(false);
        jButtonApagar.setEnabled(false);
        jButtonPesquisa.setEnabled(false);
        jTextFieldPesquisa.setEnabled(false);
        jTableCidade.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jTextFieldCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCepActionPerformed

    private void jButtonPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaActionPerformed
        mod.setPesquisa(jTextFieldPesquisa.getText());
        
        preencherTabela("SELECT * FROM cidade WHERE nome LIKE '%"+mod.getPesquisa()+"%'");

    }//GEN-LAST:event_jButtonPesquisaActionPerformed

    private void jTableCidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCidadeMouseClicked
        // TODO add your handling code here:
        setaTextFields();
    }//GEN-LAST:event_jTableCidadeMouseClicked

    private void jTableCidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableCidadeKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTableCidadeKeyPressed

    private void jTableCidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableCidadeKeyReleased
        // TODO add your handling code here:
        setaTextFields();
    }//GEN-LAST:event_jTableCidadeKeyReleased

    public void preencherTabela(String Sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"nome", "cep", "uf", "codigo"};
        conex.conexao();
        conex.executaSql(Sql);

        try {
            conex.rs.first();
            do {
                dados.add(new Object[]{conex.rs.getString("nome"), conex.rs.getInt("cep"), conex.rs.getString("uf"), conex.rs.getInt("codigo")});
            } while (conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Busque outra cidade na tabela");
            
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);

        jTableCidade.setModel(modelo);
        jTableCidade.getColumnModel().getColumn(0).setPreferredWidth(215);
        jTableCidade.getColumnModel().getColumn(0).setResizable(false);
        jTableCidade.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTableCidade.getColumnModel().getColumn(1).setResizable(false);
        jTableCidade.getColumnModel().getColumn(2).setPreferredWidth(80);
        jTableCidade.getColumnModel().getColumn(2).setResizable(false);
        jTableCidade.getColumnModel().getColumn(3).setPreferredWidth(80);
        jTableCidade.getColumnModel().getColumn(3).setResizable(false);
        jTableCidade.getTableHeader().setReorderingAllowed(false);

        jTableCidade.setAutoResizeMode(jTableCidade.AUTO_RESIZE_OFF);
        jTableCidade.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconecta();
    }

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
            java.util.logging.Logger.getLogger(CadCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadCidade().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisa;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private br.com.cyber.componente.Ktable jTableCidade;
    private javax.swing.JFormattedTextField jTextFieldCep;
    private javax.swing.JTextField jTextFieldCodigo;
    private br.com.cyber.componente.KTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisa;
    private br.com.cyber.componente.KComboBox kComboBoXUf;
    // End of variables declaration//GEN-END:variables
}
