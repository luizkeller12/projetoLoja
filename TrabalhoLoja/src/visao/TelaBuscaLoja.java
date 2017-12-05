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
import modeloBeans.LojaBean;
import modeloBeans.ModeloTabela;
import modeloConnection.ConexaoBD;
import modeloDao.DaoLoja;

/**
 *
 * @author luizk
 */
public class TelaBuscaLoja extends javax.swing.JFrame {

    ConexaoBD conex = new ConexaoBD();
    DaoLoja control = new DaoLoja();

    LojaBean mod = new LojaBean();

    /**
     * Creates new form TelaBuscaLoja
     */
    public TelaBuscaLoja() {
        initComponents();
        preencherTabelaLoja("select * from loja order by nome");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        ktableLoja = new br.com.cyber.componente.Ktable();
        jButton1 = new javax.swing.JButton();
        txtPesq = new br.com.cyber.componente.KTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblEnd = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCnpj = new javax.swing.JLabel();
        lblCod = new javax.swing.JLabel();
        lblCodCid = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        ktableLoja.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ktableLoja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        ktableLoja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ktableLojaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ktableLoja);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(330, 30, 580, 400);

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_ic_keyboard_return_48px_352473.png"))); // NOI18N
        jButton1.setText("VOLTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(20, 430, 170, 40);

        txtPesq.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPesq.setK_back_focus_gained(new java.awt.Color(255, 255, 255));
        txtPesq.setK_bord_focus_gained(new java.awt.Color(51, 204, 255));
        txtPesq.setK_placeholder_text("Digite o nome da Loja");
        txtPesq.setK_placeholder_text_color(new java.awt.Color(102, 102, 102));
        jPanel2.add(txtPesq);
        txtPesq.setBounds(20, 30, 290, 40);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("CNPJ:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 280, 140, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Telefone:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 200, 140, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nome:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 240, 140, 20);

        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/buscar.png"))); // NOI18N
        jButton2.setText("PESQUISAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(80, 80, 170, 40);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Endereço:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 160, 140, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Código:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 320, 140, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Código Cidade:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 360, 140, 20);

        lblEnd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(lblEnd);
        lblEnd.setBounds(170, 160, 150, 20);

        lblTel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(lblTel);
        lblTel.setBounds(170, 200, 150, 20);

        lblNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(lblNome);
        lblNome.setBounds(170, 240, 150, 20);

        lblCnpj.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(lblCnpj);
        lblCnpj.setBounds(170, 280, 150, 20);

        lblCod.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(lblCod);
        lblCod.setBounds(170, 320, 150, 20);

        lblCodCid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel2.add(lblCodCid);
        lblCodCid.setBounds(170, 360, 150, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(120, 50, 920, 480);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PESQUISA");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 10, 920, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-90, 0, 1100, 550);

        setSize(new java.awt.Dimension(982, 544));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here: 
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ktableLojaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ktableLojaMouseClicked
        // TODO add your handling code here:
        int indice = ktableLoja.getSelectedRow();
        lblEnd.setText(ktableLoja.getValueAt(indice, 0).toString());
        lblTel.setText(ktableLoja.getValueAt(indice, 1).toString());
        lblNome.setText(ktableLoja.getValueAt(indice, 2).toString());
        lblCnpj.setText(ktableLoja.getValueAt(indice, 3).toString());
        lblCod.setText(ktableLoja.getValueAt(indice, 4).toString());
        lblCodCid.setText(ktableLoja.getValueAt(indice, 5).toString());
    }//GEN-LAST:event_ktableLojaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        mod.setPesquisa(txtPesq.getText());
        preencherTabelaLoja("SELECT * FROM loja WHERE nome LIKE '%" + mod.getPesquisa() + "%'");
    }//GEN-LAST:event_jButton2ActionPerformed
    public void preencherTabelaLoja(String Sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"endereço", "telefone", "nome", "cnpj", "codigo", "cod_cidade"};
        conex.conexao();
        conex.executaSql(Sql);

        try {
            conex.rs.first();
            do {
                dados.add(new Object[]{
                    conex.rs.getString("endereço"),
                    conex.rs.getLong("telefone"),
                    conex.rs.getString("nome"),
                    conex.rs.getLong("cnpj"),
                    conex.rs.getInt("codigo"),
                    conex.rs.getInt("cod_cidade")
                });
            } while (conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Busque outra loja na tabela" + ex);

        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);

        ktableLoja.setModel(modelo);
        ktableLoja.getColumnModel().getColumn(0).setPreferredWidth(120);
        ktableLoja.getColumnModel().getColumn(0).setResizable(false);
        ktableLoja.getColumnModel().getColumn(1).setPreferredWidth(120);
        ktableLoja.getColumnModel().getColumn(1).setResizable(false);
        ktableLoja.getColumnModel().getColumn(2).setPreferredWidth(120);
        ktableLoja.getColumnModel().getColumn(2).setResizable(false);
        ktableLoja.getColumnModel().getColumn(3).setPreferredWidth(120);
        ktableLoja.getColumnModel().getColumn(3).setResizable(false);
        ktableLoja.getColumnModel().getColumn(4).setPreferredWidth(80);
        ktableLoja.getColumnModel().getColumn(4).setResizable(false);
        ktableLoja.getColumnModel().getColumn(5).setPreferredWidth(80);
        ktableLoja.getColumnModel().getColumn(5).setResizable(false);

        ktableLoja.getTableHeader().setReorderingAllowed(false);

        ktableLoja.setAutoResizeMode(ktableLoja.AUTO_RESIZE_OFF);
        ktableLoja.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(TelaBuscaLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* CrlblEnd display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBuscaLoja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private br.com.cyber.componente.Ktable ktableLoja;
    private javax.swing.JLabel lblCnpj;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblCodCid;
    private javax.swing.JLabel lblEnd;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTel;
    private br.com.cyber.componente.KTextField txtPesq;
    // End of variables declaration//GEN-END:variables
}
