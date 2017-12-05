package visao;

import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JOptionPane;
import modeloConnection.ConexaoBD;

/**
 *
 * @author lu izk
 */

public class TelaPrincipal extends javax.swing.JFrame {

    ConexaoBD conecta = new ConexaoBD();
    
    public TelaPrincipal() {
        initComponents();
        conecta.conexao();
        JOptionPane.showMessageDialog(null, "SEJA BEM VINDO!");

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
        jButtonCadCli = new javax.swing.JButton();
        jButtonCadLoja = new javax.swing.JButton();
        jButtonCompra = new javax.swing.JButton();
        jButtonVendas = new javax.swing.JButton();
        jButtonSla = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadCid = new javax.swing.JMenuItem();
        jMenuItemCadCLi = new javax.swing.JMenuItem();
        jMenuItemCadLoja = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuBuscar = new javax.swing.JMenu();
        jMenuItemBusProd = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuOpcoes = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
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
        jButtonCadCid.setBounds(110, 110, 190, 160);

        jButtonConPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_box_196757.png"))); // NOI18N
        jButtonConPro.setToolTipText("Produtos");
        jButtonConPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConProActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConPro);
        jButtonConPro.setBounds(1030, 110, 190, 160);

        jButtonCadCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_icon-ios7-people_211793.png"))); // NOI18N
        jButtonCadCli.setToolTipText("Clientes");
        jButtonCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadCliActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadCli);
        jButtonCadCli.setBounds(710, 110, 190, 160);

        jButtonCadLoja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_thefreeforty_shop_1243706.png"))); // NOI18N
        jButtonCadLoja.setToolTipText("Lojas");
        jButtonCadLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadLojaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadLoja);
        jButtonCadLoja.setBounds(410, 110, 190, 160);

        jButtonCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_Cart_877015.png"))); // NOI18N
        jButtonCompra.setToolTipText("Compras");
        jButtonCompra.setName("Compras"); // NOI18N
        jButtonCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCompraActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCompra);
        jButtonCompra.setBounds(260, 370, 190, 160);

        jButtonVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_shopping-cart-trolley-purchase_2205208.png"))); // NOI18N
        jButtonVendas.setToolTipText("Vendas");
        jButtonVendas.setName("Compras"); // NOI18N
        jButtonVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVendasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVendas);
        jButtonVendas.setBounds(560, 370, 190, 160);

        jButtonSla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_shopping-cart-trolley-purchase_2205208.png"))); // NOI18N
        jButtonSla.setToolTipText("Produtos");
        jButtonSla.setName("Compras"); // NOI18N
        jButtonSla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSlaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSla);
        jButtonSla.setBounds(880, 370, 190, 160);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-40, -640, 3310, 2020);

        jMenuBar1.setBackground(new java.awt.Color(255, 51, 204));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jMenuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cad.png"))); // NOI18N
        jMenuCadastro.setText("Cadastros");
        jMenuCadastro.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        jMenuItemCadCid.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenuItemCadCid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cityicon2.png"))); // NOI18N
        jMenuItemCadCid.setText("Cidade");
        jMenuItemCadCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadCidActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadCid);

        jMenuItemCadCLi.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenuItemCadCLi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente.png"))); // NOI18N
        jMenuItemCadCLi.setText("Cliente");
        jMenuItemCadCLi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadCLiActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadCLi);

        jMenuItemCadLoja.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenuItemCadLoja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/loja.png"))); // NOI18N
        jMenuItemCadLoja.setText("Loja");
        jMenuItemCadLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadLojaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadLoja);

        jMenuItem6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/prodtuos.png"))); // NOI18N
        jMenuItem6.setText("Produtos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItem6);

        jMenuItem7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_Cart_877015 (1).png"))); // NOI18N
        jMenuItem7.setText("Compra");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItem7);

        jMenuItem10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_shopping-cart-trolley-purchase_2205208 (1).png"))); // NOI18N
        jMenuItem10.setText("Vendas");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItem10);

        jMenuBar1.add(jMenuCadastro);

        jMenuBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/buscar.png"))); // NOI18N
        jMenuBuscar.setText("Buscar");
        jMenuBuscar.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        jMenuItemBusProd.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenuItemBusProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/prodtuos.png"))); // NOI18N
        jMenuItemBusProd.setText("Produtos");
        jMenuItemBusProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBusProdActionPerformed(evt);
            }
        });
        jMenuBuscar.add(jMenuItemBusProd);

        jMenuItem3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente.png"))); // NOI18N
        jMenuItem3.setText("Cliente");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuBuscar.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/loja.png"))); // NOI18N
        jMenuItem4.setText("Loja");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenuBuscar.add(jMenuItem4);

        jMenuItem8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_Cart_877015 (1).png"))); // NOI18N
        jMenuItem8.setText("Compra");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenuBuscar.add(jMenuItem8);

        jMenuItem11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_shopping-cart-trolley-purchase_2205208 (1).png"))); // NOI18N
        jMenuItem11.setText("Vendas");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenuBuscar.add(jMenuItem11);

        jMenuBar1.add(jMenuBuscar);

        jMenuOpcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/opçoes2.png"))); // NOI18N
        jMenuOpcoes.setText("Opções");
        jMenuOpcoes.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        jMenuItem9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_basics-11_296822 (1).png"))); // NOI18N
        jMenuItem9.setText("Relatar Erros");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuItem9);

        jMenuBar1.add(jMenuOpcoes);

        jMenuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_basics-11_296822 (1).png"))); // NOI18N
        jMenuSobre.setText("Sobre");
        jMenuSobre.setFocusable(false);
        jMenuSobre.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_35-Gear_2674077.png"))); // NOI18N
        jMenuItem5.setText("Desenvolvedor");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenuSobre.add(jMenuItem5);

        jMenuBar1.add(jMenuSobre);

        jMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_simpline_43_2305619.png"))); // NOI18N
        jMenuSair.setText("Sair");
        jMenuSair.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });

        jMenuItemSair.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit2.png"))); // NOI18N
        jMenuItemSair.setText("Fechar Sistema");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuItem2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
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

    private void jMenuItemCadCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadCidActionPerformed
        CadCidade tela = new CadCidade();
        tela.setVisible(true);


    }//GEN-LAST:event_jMenuItemCadCidActionPerformed

    private void jButtonCadCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadCidActionPerformed
        CadCidade tela = new CadCidade();
        tela.setVisible(true);

    }//GEN-LAST:event_jButtonCadCidActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        byte resposta = 0;
        resposta = (byte) JOptionPane.showConfirmDialog(rootPane, "Desejea realmente Fazer logoff ?");
        if (resposta == JOptionPane.YES_OPTION) {
            TelaLogin tela = new TelaLogin();
            tela.setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void jButtonCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadCliActionPerformed
        TelaBuscaCadCliente tela = new TelaBuscaCadCliente();
        tela.setVisible(true);

    }//GEN-LAST:event_jButtonCadCliActionPerformed

    private void jMenuItemCadLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadLojaActionPerformed
        // TODO add your handling code here:
        TelaBuscaCadLoja tela = new TelaBuscaCadLoja();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadLojaActionPerformed

    private void jButtonCadLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadLojaActionPerformed
        // TODO add your handling code here:
        TelaBuscaCadLoja tela = new TelaBuscaCadLoja();
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonCadLojaActionPerformed

    private void jMenuItemCadCLiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadCLiActionPerformed
        // TODO add your handling code here:
        CadCliente tela =  new CadCliente();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadCLiActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        TelaBuscaLoja tela =  new TelaBuscaLoja();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        TelaBuscaCliente tela =  new TelaBuscaCliente();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        TelaDesenvolvedor tela = new TelaDesenvolvedor();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButtonConProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConProActionPerformed
        // TODO add your handling code here:
         TelaBuscaCadProduto tela = new TelaBuscaCadProduto();
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonConProActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        CadProduto tela =  new CadProduto();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItemBusProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBusProdActionPerformed
        // TODO add your handling code here:
        TelaBuscaProduto tela = new TelaBuscaProduto();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemBusProdActionPerformed

    private void jButtonCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCompraActionPerformed
        // TODO add your handling code here:
        TelaBuscaCadCompra tela = new TelaBuscaCadCompra();
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonCompraActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        TelaBuscaCompra tela =  new TelaBuscaCompra();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
       CadCompra tela =  new CadCompra();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        TelaRelatos tela = new TelaRelatos();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        CadProdCompra tela =  new CadProdCompra();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        TelaBuscaProdutoCompra tela =  new TelaBuscaProdutoCompra();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jButtonVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVendasActionPerformed
        // TODO add your handling code here:
        TelaBuscaCadCompraProduto tela =  new TelaBuscaCadCompraProduto();
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonVendasActionPerformed

    private void jButtonSlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSlaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSlaActionPerformed

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
    private javax.swing.JButton jButtonCompra;
    private javax.swing.JButton jButtonConPro;
    private javax.swing.JButton jButtonSla;
    private javax.swing.JButton jButtonVendas;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu jMenuBuscar;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemBusProd;
    private javax.swing.JMenuItem jMenuItemCadCLi;
    private javax.swing.JMenuItem jMenuItemCadCid;
    private javax.swing.JMenuItem jMenuItemCadLoja;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuOpcoes;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuSobre;
    // End of variables declaration//GEN-END:variables

}
