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
public class TelaBuscaProduto extends javax.swing.JFrame {

    ConexaoBD conex = new ConexaoBD();
    ProdutoBean mod = new ProdutoBean();
    DaoProduto control = new DaoProduto();

    /**
     * Creates new form TelaBuscaLoja
     */
    public TelaBuscaProduto() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableProduto = new br.com.cyber.componente.Ktable();
        jButton1 = new javax.swing.JButton();
        txtPesq = new br.com.cyber.componente.KTextField();
        jTextFieldPesquisa = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jtableProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtableProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtableProduto);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(390, 10, 520, 390);

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_ic_keyboard_return_48px_352473.png"))); // NOI18N
        jButton1.setText("VOLTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(20, 360, 170, 40);

        txtPesq.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPesq.setK_back_focus_gained(new java.awt.Color(255, 255, 255));
        txtPesq.setK_placeholder_text("Digite o nome do Produto");
        jPanel2.add(txtPesq);
        txtPesq.setBounds(20, 30, 350, 40);

        jTextFieldPesquisa.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextFieldPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/buscar.png"))); // NOI18N
        jTextFieldPesquisa.setText("PESQUISAR");
        jTextFieldPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldPesquisa);
        jTextFieldPesquisa.setBounds(90, 80, 220, 40);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Nome:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 190, 100, 30);

        lblNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(lblNome);
        lblNome.setBounds(110, 190, 260, 30);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Código:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 80, 100, 40);

        lblCodigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lblCodigo);
        lblCodigo.setBounds(130, 90, 70, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(10, 170, 370, 130);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(120, 50, 920, 410);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PESQUISA");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 10, 920, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-90, 0, 1100, 500);

        setSize(new java.awt.Dimension(982, 487));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here: 
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaActionPerformed
        mod.setPesquisa(txtPesq.getText());

        preencherTabela("SELECT * FROM produto WHERE nome LIKE '%" + mod.getPesquisa() + "%'");


    }//GEN-LAST:event_jTextFieldPesquisaActionPerformed
    public void setaTextFields() {
        int indice = jtableProduto.getSelectedRow();
        lblNome.setText(jtableProduto.getValueAt(indice, 0).toString());
        lblCodigo.setText(jtableProduto.getValueAt(indice, 1).toString());
       
    }
    private void jtableProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableProdutoMouseClicked
        // TODO add your handling code here:
        setaTextFields();
    }//GEN-LAST:event_jtableProdutoMouseClicked

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

        jtableProduto.setModel(modelo);
        jtableProduto.getColumnModel().getColumn(0).setPreferredWidth(400);
        jtableProduto.getColumnModel().getColumn(0).setResizable(false);
        jtableProduto.getColumnModel().getColumn(1).setPreferredWidth(110);
        jtableProduto.getColumnModel().getColumn(1).setResizable(false);

        jtableProduto.setAutoResizeMode(jtableProduto.AUTO_RESIZE_OFF);
        jtableProduto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(TelaBuscaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBuscaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jTextFieldPesquisa;
    private br.com.cyber.componente.Ktable jtableProduto;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private br.com.cyber.componente.KTextField txtPesq;
    // End of variables declaration//GEN-END:variables
}
