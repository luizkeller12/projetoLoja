/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import Controle.ConexaoBD;



/**
 *
 * @author luizk
 */
public class TelaPrincipal extends javax.swing.JFrame {
    ConexaoBD conecta = new ConexaoBD();
    
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        conecta.conexao();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jInternalBV = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jButtonCadLoja = new javax.swing.JButton();
        jButtonConPro = new javax.swing.JButton();
        jButtonCadCli = new javax.swing.JButton();
        jButtonCadCid = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonFecharBV = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadCid = new javax.swing.JMenuItem();
        jMenuItemCadCLi = new javax.swing.JMenuItem();
        jMenuItemCadLoja = new javax.swing.JMenuItem();
        jMenuItemCadUsu = new javax.swing.JMenuItem();
        jMenuBuscar = new javax.swing.JMenu();
        jMenuItemBusProd = new javax.swing.JMenuItem();
        jMenuOpcoes = new javax.swing.JMenu();
        jMenuItemTelaBV = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(null);

        jInternalBV.setTitle("BEM VINDO");
        jInternalBV.setVisible(true);
        jInternalBV.getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jButtonCadLoja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_grocery-store_103257.png"))); // NOI18N
        jButtonCadLoja.setToolTipText("Lojas");
        jPanel1.add(jButtonCadLoja);
        jButtonCadLoja.setBounds(290, 50, 130, 120);

        jButtonConPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_box_196757.png"))); // NOI18N
        jButtonConPro.setToolTipText("Produtos");
        jPanel1.add(jButtonConPro);
        jButtonConPro.setBounds(10, 210, 130, 120);

        jButtonCadCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_icon-ios7-people_211793.png"))); // NOI18N
        jButtonCadCli.setToolTipText("Clientes");
        jPanel1.add(jButtonCadCli);
        jButtonCadCli.setBounds(150, 50, 130, 120);

        jButtonCadCid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_Citycons_building_1342941.png"))); // NOI18N
        jButtonCadCid.setToolTipText("Cidades");
        jButtonCadCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadCidActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCadCid);
        jButtonCadCid.setBounds(10, 50, 130, 120);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Cadastro:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 90, 140, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Consulta:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 180, 140, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Cadastro:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 20, 140, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/planofundointerno.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 860, 370);

        jInternalBV.getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 50, 860, 370);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Sistema de Gerenciamento de:");
        jInternalBV.getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 10, 330, 40);

        jButtonFecharBV.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButtonFecharBV.setForeground(new java.awt.Color(255, 51, 51));
        jButtonFecharBV.setText("FECHAR");
        jButtonFecharBV.setToolTipText("Fechar");
        jButtonFecharBV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharBVActionPerformed(evt);
            }
        });
        jInternalBV.getContentPane().add(jButtonFecharBV);
        jButtonFecharBV.setBounds(750, 0, 80, 30);

        getContentPane().add(jInternalBV);
        jInternalBV.setBounds(70, 40, 860, 430);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/planofundo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1010, 520);

        jMenuCadastro.setText("Cadastros");

        jMenuItemCadCid.setText("Cidade");
        jMenuItemCadCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadCidActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadCid);

        jMenuItemCadCLi.setText("Cliente");
        jMenuCadastro.add(jMenuItemCadCLi);

        jMenuItemCadLoja.setText("Loja");
        jMenuCadastro.add(jMenuItemCadLoja);

        jMenuItemCadUsu.setText("Usuários");
        jMenuCadastro.add(jMenuItemCadUsu);

        jMenuBar1.add(jMenuCadastro);

        jMenuBuscar.setText("Buscar");

        jMenuItemBusProd.setText("Produtos");
        jMenuBuscar.add(jMenuItemBusProd);

        jMenuBar1.add(jMenuBuscar);

        jMenuOpcoes.setText("Opções");

        jMenuItemTelaBV.setText("Tela- Bem Vindo");
        jMenuItemTelaBV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBVActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemTelaBV);

        jMenuBar1.add(jMenuOpcoes);

        jMenuSobre.setText("Sobre");
        jMenuBar1.add(jMenuSobre);

        jMenuSair.setText("Sair");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });

        jMenuItemSair.setText("Fechar Sistema");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1022, 580));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharBVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharBVActionPerformed
        
       jInternalBV.dispose();
    }//GEN-LAST:event_jButtonFecharBVActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuSairActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
       conecta.desconecta();
        System.exit(0);
       
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemTelaBVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBVActionPerformed
          TelaPrincipal tela = new TelaPrincipal();
          tela.setVisible(true);
          dispose();
    }//GEN-LAST:event_jMenuItemTelaBVActionPerformed

    private void jMenuItemCadCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadCidActionPerformed
        CadCidade tela = new CadCidade();
        tela.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jMenuItemCadCidActionPerformed

    private void jButtonCadCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadCidActionPerformed
        CadCidade tela = new CadCidade();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCadCidActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadCid;
    private javax.swing.JButton jButtonCadCli;
    private javax.swing.JButton jButtonCadLoja;
    private javax.swing.JButton jButtonConPro;
    private javax.swing.JButton jButtonFecharBV;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JInternalFrame jInternalBV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu jMenuBuscar;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemBusProd;
    private javax.swing.JMenuItem jMenuItemCadCLi;
    private javax.swing.JMenuItem jMenuItemCadCid;
    private javax.swing.JMenuItem jMenuItemCadLoja;
    private javax.swing.JMenuItem jMenuItemCadUsu;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemTelaBV;
    private javax.swing.JMenu jMenuOpcoes;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
