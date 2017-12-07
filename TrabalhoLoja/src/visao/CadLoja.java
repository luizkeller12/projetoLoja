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
public class CadLoja extends javax.swing.JFrame {
    
    ConexaoBD conex = new ConexaoBD();
    DaoLoja control = new DaoLoja();
    
    LojaBean mod = new LojaBean();
    
    int flag = 0;

    /**
     * Creates new form CadLoja
     */
    public CadLoja() {
        initComponents();
        preencherTabelaCidade("select * from cidade order by nome");
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
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEnd = new br.com.cyber.componente.KTextField();
        txtCodcid = new br.com.cyber.componente.KTextField();
        txtNome = new br.com.cyber.componente.KTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ktableLoja = new br.com.cyber.componente.Ktable();
        txtCod = new br.com.cyber.componente.KTextField();
        btnBuscar = new javax.swing.JButton();
        txtPesq = new br.com.cyber.componente.KTextField();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ktableCidade = new br.com.cyber.componente.Ktable();
        txtCidade = new br.com.cyber.componente.KTextField();
        jLabel8 = new javax.swing.JLabel();
        btnBuscarCid = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        txtTel = new javax.swing.JFormattedTextField();
        txtCnpj = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Cód-Cid:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(360, 100, 80, 40);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Código:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(360, 50, 80, 40);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("CNPJ:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 200, 80, 40);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nome:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 150, 70, 40);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Telefone:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 100, 80, 40);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Endereço:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 50, 90, 40);

        txtEnd.setEnabled(false);
        txtEnd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEnd.setK_placeholder_text("Digite seu endereço");
        txtEnd.setK_placeholder_text_color(new java.awt.Color(102, 102, 102));
        jPanel2.add(txtEnd);
        txtEnd.setBounds(110, 50, 250, 40);

        txtCodcid.setEnabled(false);
        jPanel2.add(txtCodcid);
        txtCodcid.setBounds(450, 100, 70, 40);

        txtNome.setEnabled(false);
        txtNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNome.setK_placeholder_text("Digite Nome da Loja");
        txtNome.setK_placeholder_text_color(new java.awt.Color(102, 102, 102));
        jPanel2.add(txtNome);
        txtNome.setBounds(110, 150, 250, 40);

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
        jScrollPane1.setBounds(570, 100, 452, 320);

        txtCod.setEnabled(false);
        jPanel2.add(txtCod);
        txtCod.setBounds(450, 50, 70, 40);

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/buscar.png"))); // NOI18N
        btnBuscar.setText("PESQUISAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar);
        btnBuscar.setBounds(810, 50, 210, 40);

        txtPesq.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPesq.setK_placeholder_text("Digite o nome da Loja");
        txtPesq.setK_placeholder_text_color(new java.awt.Color(102, 102, 102));
        jPanel2.add(txtPesq);
        txtPesq.setBounds(570, 50, 230, 40);

        btnNovo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cad.png"))); // NOI18N
        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNovo);
        btnNovo.setBounds(30, 450, 150, 40);

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
        btnSalvar.setBounds(190, 450, 150, 40);

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_cancel-2_309095.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar);
        btnCancelar.setBounds(350, 450, 160, 40);

        btnEditar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_edit_2561427.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditar);
        btnEditar.setBounds(520, 450, 150, 40);

        btnApagar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_Streamline-70_185090.png"))); // NOI18N
        btnApagar.setText("APAGAR");
        btnApagar.setEnabled(false);
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });
        jPanel2.add(btnApagar);
        btnApagar.setBounds(680, 450, 150, 40);

        ktableCidade.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ktableCidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        ktableCidade.setEnabled(false);
        ktableCidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ktableCidadeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ktableCidade);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(40, 320, 320, 120);

        txtCidade.setEnabled(false);
        txtCidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCidade.setK_placeholder_text("Nome da cidade");
        txtCidade.setK_placeholder_text_color(new java.awt.Color(102, 102, 102));
        jPanel2.add(txtCidade);
        txtCidade.setBounds(110, 270, 140, 40);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cidade:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(30, 270, 80, 40);

        btnBuscarCid.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBuscarCid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/buscar.png"))); // NOI18N
        btnBuscarCid.setEnabled(false);
        btnBuscarCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCidActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscarCid);
        btnBuscarCid.setBounds(250, 270, 110, 40);

        jButtonVoltar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_ic_keyboard_return_48px_352473.png"))); // NOI18N
        jButtonVoltar.setText("VOLTAR");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonVoltar);
        jButtonVoltar.setBounds(892, 464, 150, 40);

        try {
            txtTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTel.setEnabled(false);
        jPanel2.add(txtTel);
        txtTel.setBounds(110, 100, 250, 40);

        try {
            txtCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCnpj.setEnabled(false);
        jPanel2.add(txtCnpj);
        txtCnpj.setBounds(110, 200, 250, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(40, 70, 1050, 510);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Lojas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 20, 960, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, -10, 1120, 600);

        setSize(new java.awt.Dimension(1098, 584));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        mod.setPesquisa(txtPesq.getText());
        preencherTabelaLoja("SELECT * FROM loja WHERE nome LIKE '%" + mod.getPesquisa() + "%'");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        flag = 1;
        btnNovo.setEnabled(false);
        txtCnpj.setEnabled(true);
        txtEnd.setEnabled(true);
        txtNome.setEnabled(true);
        txtTel.setEnabled(true);
        txtCidade.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        txtCidade.setText("");
        txtCodcid.setText("");
        txtCod.setText("");
        txtCnpj.setText("");
        txtEnd.setText("");
        txtTel.setText("");
        txtNome.setText("");
        btnBuscarCid.setEnabled(true);
        btnEditar.setEnabled(false);
        btnApagar.setEnabled(false);
        btnBuscar.setEnabled(false);
        txtPesq.setEnabled(false);
        ktableCidade.setEnabled(true);
        ktableLoja.setEnabled(false);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        if (txtCodcid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para continuar!");
            txtCidade.requestFocus();
        } else if (txtCnpj.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para continuar!");
            txtCnpj.requestFocus();
            
        } else if (txtEnd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para continuar!");
            txtEnd.requestFocus();
        } else if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para continuar!");
            txtNome.requestFocus();
        } else if (txtTel.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para continuar!");
            txtTel.requestFocus();
        } else {
            
            if (flag == 1) {
                
                mod.setEndereço(txtEnd.getText());
                mod.setTelefone(Long.parseLong(txtTel.getText()));
                mod.setNome(txtNome.getText());
                mod.setCnpj(Long.parseLong(txtCnpj.getText()));
                mod.setCod_cidade(Integer.parseInt(txtCodcid.getText()));
                control.Salvar(mod);
                txtCidade.setText("");
                txtCodcid.setText("");
                txtCod.setText("");
                txtCnpj.setText("");
                txtEnd.setText("");
                txtTel.setText("");
                txtNome.setText("");
                btnBuscar.setEnabled(true);
                txtPesq.setEnabled(true);
                txtCidade.setEnabled(false);
                txtCod.setEnabled(false);
                txtCodcid.setEnabled(false);
                txtCnpj.setEnabled(false);
                txtEnd.setEnabled(false);
                txtNome.setEnabled(false);
                txtTel.setEnabled(false);
                btnSalvar.setEnabled(false);
                btnCancelar.setEnabled(false);
                btnNovo.setEnabled(true);
                ktableLoja.setEnabled(true);
                ktableCidade.setEnabled(true);
                preencherTabelaCidade("select * from cidade order by nome");
                preencherTabelaLoja("select * from loja order by nome");
            } else {
                
                mod.setEndereço(txtEnd.getText());
                mod.setTelefone(Long.parseLong(txtTel.getText()));
                mod.setNome(txtNome.getText());
                mod.setCnpj(Long.parseLong(txtCnpj.getText()));                
                mod.setCodigo(Integer.parseInt(txtCod.getText()));
                mod.setCod_cidade(Integer.parseInt(txtCodcid.getText()));
                control.Editar(mod);
                txtCidade.setText("");
                txtCodcid.setText("");
                txtCod.setText("");
                txtCnpj.setText("");
                txtEnd.setText("");
                txtTel.setText("");
                txtNome.setText("");
                btnBuscar.setEnabled(true);
                txtPesq.setEnabled(true);
                txtCidade.setEnabled(false);
                txtCod.setEnabled(false);
                txtCodcid.setEnabled(false);
                txtCnpj.setEnabled(false);
                txtEnd.setEnabled(false);
                txtNome.setEnabled(false);
                txtTel.setEnabled(false);
                btnSalvar.setEnabled(false);
                btnCancelar.setEnabled(false);
                ktableLoja.setEnabled(true);
                ktableCidade.setEnabled(true);
                btnNovo.setEnabled(true);
                preencherTabelaCidade("select * from cidade order by nome");
                preencherTabelaLoja("select * from loja order by nome");
                
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        flag = 0;
        txtCidade.setEnabled(!true);
        txtCod.setEnabled(!true);
        txtCodcid.setEnabled(!true);
        txtCnpj.setEnabled(!true);
        txtEnd.setEnabled(!true);
        txtTel.setEnabled(!true);
        txtNome.setEnabled(!true);
        
        btnSalvar.setEnabled(!true);
        btnCancelar.setEnabled(!true);
        btnNovo.setEnabled(true);
        btnEditar.setEnabled(false);
        btnApagar.setEnabled(false);
        txtPesq.setEnabled(true);
        btnBuscar.setEnabled(true);
        txtCidade.setText("");
        txtCodcid.setText("");
        txtCod.setText("");
        txtCnpj.setText("");
        txtEnd.setText("");
        txtTel.setText("");
        ktableCidade.setEnabled(true);
        ktableLoja.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        flag = 2;
        txtCidade.setEnabled(true);
        txtCnpj.setEnabled(true);
        txtEnd.setEnabled(true);
        txtNome.setEnabled(true);
        txtTel.setEnabled(true);
        
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnNovo.setEnabled(false);
        btnApagar.setEnabled(false);
        
        ktableCidade.setEnabled(true);
        ktableLoja.setEnabled(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        // TODO add your handling code here:
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Realmente deseja Apagar?");
        if (resposta == JOptionPane.YES_OPTION) {
            mod.setCodigo(Integer.parseInt(txtCod.getText()));
            control.Apagar(mod);
            btnEditar.setEnabled(false);
            btnApagar.setEnabled(false);
            btnCancelar.setEnabled(false);
            txtCnpj.setEnabled(false);
            txtEnd.setEnabled(false);
            txtTel.setEnabled(false);
            txtNome.setEnabled(false);
            txtCidade.setEnabled(false);
            txtCod.setEnabled(false);
            txtCodcid.setEnabled(false);
            txtNome.setText("");
            txtCidade.setText("");
            txtCodcid.setText("");
            txtCod.setText("");
            txtCnpj.setText("");
            txtEnd.setText("");
            txtTel.setText("");           
            btnNovo.setEnabled(true);
            btnBuscar.setEnabled(true);
            txtPesq.setEnabled(true);
            preencherTabelaLoja("select * from loja order by nome");
        }
    }//GEN-LAST:event_btnApagarActionPerformed

    private void ktableCidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ktableCidadeMouseClicked
        // TODO add your handling code here:
        int indice = ktableCidade.getSelectedRow();
        
        txtCodcid.setText(ktableCidade.getValueAt(indice, 1).toString());

    }//GEN-LAST:event_ktableCidadeMouseClicked

    private void btnBuscarCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCidActionPerformed
        // TODO add your handling code here:
        mod.setPesquisa(txtCidade.getText());
        
        preencherTabelaCidade("SELECT * FROM cidade WHERE nome LIKE '%" + mod.getPesquisa() + "%'");
    }//GEN-LAST:event_btnBuscarCidActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        byte resposta = 0;
        resposta  = (byte) JOptionPane.showConfirmDialog(rootPane, "Deseja voltar? Seus dados não salvos serão perdidos!");
        if(resposta ==  JOptionPane.YES_OPTION){
        dispose();
        }
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void ktableLojaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ktableLojaMouseClicked
        // TODO add your handling code here:
        int indice = ktableLoja.getSelectedRow();
        txtCnpj.setText(ktableLoja.getValueAt(indice, 3).toString());
        txtEnd.setText(ktableLoja.getValueAt(indice, 0).toString());
        txtTel.setText(ktableLoja.getValueAt(indice, 1).toString());
        txtNome.setText(ktableLoja.getValueAt(indice, 2).toString());
        txtCodcid.setText(ktableLoja.getValueAt(indice, 5).toString());
        txtCod.setText(ktableLoja.getValueAt(indice, 4).toString());
        btnEditar.setEnabled(true);
        btnApagar.setEnabled(true);
        btnNovo.setEnabled(false);
    }//GEN-LAST:event_ktableLojaMouseClicked
    public void preencherTabelaCidade(String Sql) {
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
            JOptionPane.showMessageDialog(rootPane, "Busque outra cidade na tabela");
            
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        
        ktableCidade.setModel(modelo);
        ktableCidade.getColumnModel().getColumn(0).setPreferredWidth(180);
        ktableCidade.getColumnModel().getColumn(0).setResizable(false);
        ktableCidade.getColumnModel().getColumn(1).setPreferredWidth(120);
        ktableCidade.getColumnModel().getColumn(1).setResizable(false);
        
        ktableCidade.setAutoResizeMode(ktableCidade.AUTO_RESIZE_OFF);
        ktableCidade.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconecta();
    }
    
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
            java.util.logging.Logger.getLogger(CadLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadLoja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarCid;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private br.com.cyber.componente.Ktable ktableCidade;
    private br.com.cyber.componente.Ktable ktableLoja;
    private br.com.cyber.componente.KTextField txtCidade;
    private javax.swing.JFormattedTextField txtCnpj;
    private br.com.cyber.componente.KTextField txtCod;
    private br.com.cyber.componente.KTextField txtCodcid;
    private br.com.cyber.componente.KTextField txtEnd;
    private br.com.cyber.componente.KTextField txtNome;
    private br.com.cyber.componente.KTextField txtPesq;
    private javax.swing.JFormattedTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
