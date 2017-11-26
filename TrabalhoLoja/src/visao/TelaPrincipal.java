package visao;
import static java.awt.Frame.MAXIMIZED_BOTH;
import modeloConnection.ConexaoBD;
/**
 *
 * @author lu
 * izk
 */
    
public class TelaPrincipal extends javax.swing.JFrame {
    ConexaoBD conecta = new ConexaoBD();   
    public TelaPrincipal() {
        initComponents();
        conecta.conexao();
        
        
        
        
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jButtonCadCid = new javax.swing.JButton();
        jButtonConPro = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonCadCli = new javax.swing.JButton();
        jButtonCadLoja = new javax.swing.JButton();
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
        jMenuItem2 = new javax.swing.JMenuItem();

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
        setExtendedState(6);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jButtonCadCid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_Citycons_building_1342941.png"))); // NOI18N
        jButtonCadCid.setToolTipText("Cidades");
        jButtonCadCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadCidActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadCid);
        jButtonCadCid.setBounds(50, 110, 190, 160);

        jButtonConPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_box_196757.png"))); // NOI18N
        jButtonConPro.setToolTipText("Produtos");
        getContentPane().add(jButtonConPro);
        jButtonConPro.setBounds(40, 370, 190, 160);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Consulta:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 340, 140, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cadastro:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 70, 140, 20);

        jButtonCadCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_icon-ios7-people_211793.png"))); // NOI18N
        jButtonCadCli.setToolTipText("Clientes");
        jButtonCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadCliActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadCli);
        jButtonCadCli.setBounds(510, 110, 190, 160);

        jButtonCadLoja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_grocery-store_103257.png"))); // NOI18N
        jButtonCadLoja.setToolTipText("Lojas");
        getContentPane().add(jButtonCadLoja);
        jButtonCadLoja.setBounds(280, 110, 190, 160);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-40, -640, 3310, 2020);

        jMenuBar1.setBackground(new java.awt.Color(255, 51, 204));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jMenuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cad.png"))); // NOI18N
        jMenuCadastro.setText("Cadastros");
        jMenuCadastro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jMenuItemCadCid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItemCadCid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cityicon2.png"))); // NOI18N
        jMenuItemCadCid.setText("Cidade");
        jMenuItemCadCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadCidActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadCid);

        jMenuItemCadCLi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItemCadCLi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente.png"))); // NOI18N
        jMenuItemCadCLi.setText("Cliente");
        jMenuCadastro.add(jMenuItemCadCLi);

        jMenuItemCadLoja.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItemCadLoja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/loja.png"))); // NOI18N
        jMenuItemCadLoja.setText("Loja");
        jMenuCadastro.add(jMenuItemCadLoja);

        jMenuItemCadUsu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItemCadUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuario.png"))); // NOI18N
        jMenuItemCadUsu.setText("Usuários");
        jMenuItemCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadUsuActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadUsu);

        jMenuBar1.add(jMenuCadastro);

        jMenuBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/buscar.png"))); // NOI18N
        jMenuBuscar.setText("Buscar");
        jMenuBuscar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jMenuItemBusProd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItemBusProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/prodtuos.png"))); // NOI18N
        jMenuItemBusProd.setText("Produtos");
        jMenuBuscar.add(jMenuItemBusProd);

        jMenuBar1.add(jMenuBuscar);

        jMenuOpcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/opçoes2.png"))); // NOI18N
        jMenuOpcoes.setText("Opções");
        jMenuOpcoes.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jMenuItemTelaBV.setText("Tela- Bem Vindo");
        jMenuItemTelaBV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBVActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItemTelaBV);

        jMenuBar1.add(jMenuOpcoes);

        jMenuSobre.setText("Sobre");
        jMenuSobre.setFocusable(false);
        jMenuSobre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jMenuBar1.add(jMenuSobre);

        jMenuSair.setText("Sair");
        jMenuSair.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });

        jMenuItemSair.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit2.png"))); // NOI18N
        jMenuItemSair.setText("Fechar Sistema");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuItem2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItem2);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1316, 634));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        
        
    }//GEN-LAST:event_jMenuItemCadCidActionPerformed

    private void jButtonCadCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadCidActionPerformed
        CadCidade tela = new CadCidade();
        tela.setVisible(true);
        
    }//GEN-LAST:event_jButtonCadCidActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItemCadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadUsuActionPerformed
        // TODO add your handling code here:
        CadUsuario tela = new CadUsuario();
        tela.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemCadUsuActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void jButtonCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadCliActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jButtonCadCliActionPerformed

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
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JMenuItem jMenuItem2;
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
    // End of variables declaration//GEN-END:variables

    




}
