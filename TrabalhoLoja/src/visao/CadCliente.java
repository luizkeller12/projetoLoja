/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

/**
 *
 * @author luizk
 */
public class CadCliente extends javax.swing.JFrame {

    /**
     * Creates new form CadCliente
     */
    public CadCliente() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        kTextField2 = new br.com.cyber.componente.KTextField();
        jLabel3 = new javax.swing.JLabel();
        kTextField3 = new br.com.cyber.componente.KTextField();
        kTextField4 = new br.com.cyber.componente.KTextField();
        jLabel4 = new javax.swing.JLabel();
        kTextField5 = new br.com.cyber.componente.KTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jButtonVoltar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonVoltar.setText("VOLTAR");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonVoltar);
        jButtonVoltar.setBounds(846, 413, 152, 34);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nome:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 240, 70, 40);

        kTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(kTextField2);
        kTextField2.setBounds(120, 240, 230, 40);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nome:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(50, 90, 70, 40);
        jPanel2.add(kTextField3);
        kTextField3.setBounds(120, 90, 230, 40);
        jPanel2.add(kTextField4);
        kTextField4.setBounds(120, 140, 230, 40);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nome:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(50, 140, 70, 40);

        kTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kTextField5ActionPerformed(evt);
            }
        });
        jPanel2.add(kTextField5);
        kTextField5.setBounds(120, 190, 230, 40);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nome:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(50, 190, 70, 40);

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("SALVAR");
        jPanel2.add(jButton1);
        jButton1.setBounds(50, 383, 110, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 50, 1010, 460);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Clientes");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 10, 1010, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, -10, 1070, 530);

        setSize(new java.awt.Dimension(1054, 545));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void kTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kTextField2ActionPerformed

    private void kTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kTextField5ActionPerformed

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
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private br.com.cyber.componente.KTextField kTextField2;
    private br.com.cyber.componente.KTextField kTextField3;
    private br.com.cyber.componente.KTextField kTextField4;
    private br.com.cyber.componente.KTextField kTextField5;
    // End of variables declaration//GEN-END:variables
}
