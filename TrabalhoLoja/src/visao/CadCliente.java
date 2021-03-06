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
import modeloBeans.ClienteBean;
import modeloBeans.ModeloTabela;
import modeloConnection.ConexaoBD;
import modeloDao.DaoCliente;

/**
 *
 * @author luizk
 */
public class CadCliente extends javax.swing.JFrame {

    ConexaoBD conex = new ConexaoBD();
    DaoCliente control = new DaoCliente();
    ClienteBean mod = new ClienteBean();

    int flag = 0;

    /**
     * Creates new form CadCliente
     */
    public CadCliente() {
        initComponents();
        preencherTabelaCliente("select * from cliente order by nome");
        preencherTabelaCidade("select * from cidade order by nome");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCod = new br.com.cyber.componente.KTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPesq = new br.com.cyber.componente.KTextField();
        txtEnd = new br.com.cyber.componente.KTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ktableCliente = new br.com.cyber.componente.Ktable();
        txtNome = new br.com.cyber.componente.KTextField();
        jLabel7 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        txtCpf = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ktableCidade = new br.com.cyber.componente.Ktable();
        txtCidade = new br.com.cyber.componente.KTextField();
        btnBuscarCid = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCodCid = new br.com.cyber.componente.KTextField();
        txtTel = new br.com.cyber.componente.KTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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
        jButtonVoltar.setBounds(850, 490, 152, 34);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cod_cid:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(360, 100, 80, 40);

        txtCod.setEnabled(false);
        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });
        jPanel2.add(txtCod);
        txtCod.setBounds(440, 50, 50, 40);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cpf:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 50, 70, 40);

        txtPesq.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPesq.setK_back_error(null);
        txtPesq.setK_bord_error(new java.awt.Color(255, 255, 255));
        txtPesq.setK_obrigatory(true);
        txtPesq.setK_placeholder_text("Nome do Cliente ex: \"Luiz\"");
        txtPesq.setK_placeholder_text_color(new java.awt.Color(102, 102, 102));
        jPanel2.add(txtPesq);
        txtPesq.setBounds(550, 50, 230, 40);

        txtEnd.setEnabled(false);
        txtEnd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEnd.setK_back_error(null);
        txtEnd.setK_placeholder_text("Digite seu endereço");
        txtEnd.setK_placeholder_text_color(new java.awt.Color(102, 102, 102));
        jPanel2.add(txtEnd);
        txtEnd.setBounds(100, 100, 250, 40);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Endereço:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 100, 100, 40);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Telefone:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 150, 100, 40);

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/buscar.png"))); // NOI18N
        btnBuscar.setText("PESQUISAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar);
        btnBuscar.setBounds(790, 50, 210, 40);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nome:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(30, 200, 70, 40);

        ktableCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ktableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        ktableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ktableClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ktableCliente);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(550, 100, 452, 340);

        txtNome.setEnabled(false);
        txtNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNome.setK_back_error(null);
        txtNome.setK_placeholder_text("Nome do Cliente ex: \"Luiz\"");
        txtNome.setK_placeholder_text_color(new java.awt.Color(102, 102, 102));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel2.add(txtNome);
        txtNome.setBounds(100, 200, 250, 40);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cidade:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(30, 270, 70, 40);

        btnNovo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cad.png"))); // NOI18N
        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNovo);
        btnNovo.setBounds(20, 470, 150, 40);

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
        btnSalvar.setBounds(180, 470, 150, 40);

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
        btnCancelar.setBounds(340, 470, 160, 40);

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
        btnApagar.setBounds(670, 470, 150, 40);

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
        btnEditar.setBounds(510, 470, 150, 40);

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setEnabled(false);
        jPanel2.add(txtCpf);
        txtCpf.setBounds(100, 50, 250, 40);

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
        jScrollPane2.setBounds(30, 320, 370, 120);

        txtCidade.setEnabled(false);
        txtCidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCidade.setK_back_error(null);
        txtCidade.setK_placeholder_text("Nome da cidade ex: \"Ibirubá\"");
        txtCidade.setK_placeholder_text_color(new java.awt.Color(102, 102, 102));
        jPanel2.add(txtCidade);
        txtCidade.setBounds(100, 270, 200, 40);

        btnBuscarCid.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBuscarCid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/buscar.png"))); // NOI18N
        btnBuscarCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCidActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscarCid);
        btnBuscarCid.setBounds(300, 270, 100, 40);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Código:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(360, 50, 70, 40);

        txtCodCid.setEnabled(false);
        txtCodCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodCidActionPerformed(evt);
            }
        });
        jPanel2.add(txtCodCid);
        txtCodCid.setBounds(440, 100, 50, 40);

        txtTel.setEnabled(false);
        txtTel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTel.setK_back_error(null);
        txtTel.setK_placeholder_text("Digite seu telefone ex: 55997287451");
        txtTel.setK_placeholder_text_color(new java.awt.Color(102, 102, 102));
        jPanel2.add(txtTel);
        txtTel.setBounds(100, 150, 250, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 50, 1010, 530);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Clientes");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 10, 1010, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, -10, 1070, 610);

        setSize(new java.awt.Dimension(1048, 589));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        byte resposta = 0;
        resposta  = (byte) JOptionPane.showConfirmDialog(rootPane, "Deseja voltar? Seus dados não salvos serão perdidos!");
        if(resposta ==  JOptionPane.YES_OPTION){
        dispose();
        }
        
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        mod.setPesquisa(txtPesq.getText());
        preencherTabelaCliente("SELECT * FROM cliente WHERE nome LIKE '%" + mod.getPesquisa() + "%'");

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        flag = 1;
        btnNovo.setEnabled(false);
        txtCpf.setEnabled(true);
        txtEnd.setEnabled(true);
        txtNome.setEnabled(true);
        txtTel.setEnabled(true);
        txtCidade.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        txtCidade.setText("");
        txtCodCid.setText("");
        txtCod.setText("");
        txtCpf.setText("");
        txtEnd.setText("");
        txtTel.setText("");
        txtNome.setText("");

        btnEditar.setEnabled(false);
        btnApagar.setEnabled(false);
        btnBuscar.setEnabled(false);
        txtPesq.setEnabled(false);
        ktableCidade.setEnabled(true);
        ktableCliente.setEnabled(false);

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        if (txtCodCid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para continuar!");
            txtCidade.requestFocus();
        } else if (txtCpf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para continuar!");
            txtCpf.requestFocus();

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
                mod.setCpf(Long.parseLong(txtCpf.getText()));
                mod.setEndereço(txtEnd.getText());
                mod.setTelefone(Long.parseLong(txtTel.getText()));
                mod.setNome(txtNome.getText());
                mod.setCod_cidade(Integer.parseInt(txtCodCid.getText()));
                control.Salvar(mod);
                txtCidade.setText("");
                txtCodCid.setText("");
                txtCod.setText("");
                txtCpf.setText("");
                txtEnd.setText("");
                txtTel.setText("");
                txtNome.setText("");
                btnBuscar.setEnabled(true);
                txtPesq.setEnabled(true);
                txtCidade.setEnabled(false);
                txtCod.setEnabled(false);
                txtCodCid.setEnabled(false);
                txtCpf.setEnabled(false);
                txtEnd.setEnabled(false);
                txtNome.setEnabled(false);
                txtTel.setEnabled(false);
                btnSalvar.setEnabled(false);
                btnCancelar.setEnabled(false);
                btnNovo.setEnabled(true);
                ktableCliente.setEnabled(true);
                ktableCidade.setEnabled(true);
                preencherTabelaCidade("select * from cidade order by nome");
                preencherTabelaCliente("select * from cliente order by nome");
            } else {
                mod.setCpf(Long.parseLong(txtCpf.getText()));
                mod.setEndereço(txtEnd.getText());
                mod.setTelefone(Long.parseLong(txtTel.getText()));
                mod.setNome(txtNome.getText());
                mod.setCod_cidade(Integer.parseInt(txtCodCid.getText()));
                mod.setCodigo(Integer.parseInt(txtCod.getText()));
                control.Editar(mod);
                txtCidade.setText("");
                txtCodCid.setText("");
                txtCod.setText("");
                txtCpf.setText("");
                txtEnd.setText("");
                txtTel.setText("");
                txtNome.setText("");
                btnBuscar.setEnabled(true);
                txtPesq.setEnabled(true);
                txtCidade.setEnabled(false);
                txtCod.setEnabled(false);
                txtCodCid.setEnabled(false);
                txtCpf.setEnabled(false);
                txtEnd.setEnabled(false);
                txtNome.setEnabled(false);
                txtTel.setEnabled(false);
                btnSalvar.setEnabled(false);
                btnCancelar.setEnabled(false);
                ktableCliente.setEnabled(true);
                ktableCidade.setEnabled(true);
                btnNovo.setEnabled(true);
                preencherTabelaCidade("select * from cidade order by nome");
                preencherTabelaCliente("select * from cliente order by nome");

            }
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        flag = 0;
        txtCidade.setEnabled(!true);
        txtCod.setEnabled(!true);
        txtCodCid.setEnabled(!true);
        txtCpf.setEnabled(!true);
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
        txtCodCid.setText("");
        txtCod.setText("");
        txtCpf.setText("");
        txtEnd.setText("");
        txtTel.setText("");
        ktableCidade.setEnabled(true);
        ktableCliente.setEnabled(true);

    }//GEN-LAST:event_btnCancelarActionPerformed

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
            txtCpf.setEnabled(false);
            txtEnd.setEnabled(false);
            txtTel.setEnabled(false);
            txtNome.setEnabled(false);
            txtCidade.setEnabled(false);
            txtCod.setEnabled(false);
            txtCodCid.setEnabled(false);
            txtCidade.setText("");
            txtCodCid.setText("");
            txtCod.setText("");
            txtCpf.setText("");
            txtEnd.setText("");
            txtTel.setText("");
            preencherTabelaCliente("select * from cliente order by nome");
            btnNovo.setEnabled(true);
            btnBuscar.setEnabled(true);
            txtPesq.setEnabled(true);

        }

    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        flag = 2;
        txtCidade.setEnabled(true);
        txtCpf.setEnabled(true);
        txtEnd.setEnabled(true);
        txtNome.setEnabled(true);
        txtTel.setEnabled(true);

        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnNovo.setEnabled(false);
        btnApagar.setEnabled(false);

        ktableCidade.setEnabled(true);
        ktableCliente.setEnabled(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBuscarCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCidActionPerformed
        // TODO add your handling code here:
        mod.setPesquisa(txtCidade.getText());

        preencherTabelaCidade("SELECT * FROM cidade WHERE nome LIKE '%" + mod.getPesquisa() + "%'");
    }//GEN-LAST:event_btnBuscarCidActionPerformed

    private void txtCodCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodCidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodCidActionPerformed

    private void ktableCidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ktableCidadeMouseClicked
        // TODO add your handling code here:
        int indice = ktableCidade.getSelectedRow();

        txtCodCid.setText(ktableCidade.getValueAt(indice, 1).toString());

    }//GEN-LAST:event_ktableCidadeMouseClicked

    private void ktableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ktableClienteMouseClicked
        // TODO add your handling code here:public void setaTextFields() {
        int indice = ktableCliente.getSelectedRow();
        txtCpf.setText(ktableCliente.getValueAt(indice, 0).toString());
        txtEnd.setText(ktableCliente.getValueAt(indice, 1).toString());
        txtTel.setText(ktableCliente.getValueAt(indice, 2).toString());
        txtNome.setText(ktableCliente.getValueAt(indice, 3).toString());
        txtCod.setText(ktableCliente.getValueAt(indice, 4).toString());
        txtCodCid.setText(ktableCliente.getValueAt(indice, 5).toString());
        btnEditar.setEnabled(true);
        btnApagar.setEnabled(true);
        btnNovo.setEnabled(false);

    }//GEN-LAST:event_ktableClienteMouseClicked
    public void preencherTabelaCliente(String Sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"cpf", "endereço", "telefone", "nome", "codigo", "cod_cidade"};
        conex.conexao();
        conex.executaSql(Sql);

        try {
            conex.rs.first();
            do {
                dados.add(new Object[]{
                    conex.rs.getLong("cpf"),
                    conex.rs.getString("endereço"),
                    conex.rs.getLong("telefone"),
                    conex.rs.getString("nome"),
                    conex.rs.getInt("codigo"),
                    conex.rs.getInt("cod_cidade")
                });
            } while (conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Busque outro cliente na tabela" + ex);

        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);

        ktableCliente.setModel(modelo);
        ktableCliente.getColumnModel().getColumn(0).setPreferredWidth(120);
        ktableCliente.getColumnModel().getColumn(0).setResizable(false);
        ktableCliente.getColumnModel().getColumn(1).setPreferredWidth(120);
        ktableCliente.getColumnModel().getColumn(1).setResizable(false);
        ktableCliente.getColumnModel().getColumn(2).setPreferredWidth(120);
        ktableCliente.getColumnModel().getColumn(2).setResizable(false);
        ktableCliente.getColumnModel().getColumn(3).setPreferredWidth(120);
        ktableCliente.getColumnModel().getColumn(3).setResizable(false);
        ktableCliente.getColumnModel().getColumn(4).setPreferredWidth(80);
        ktableCliente.getColumnModel().getColumn(4).setResizable(false);
        ktableCliente.getColumnModel().getColumn(5).setPreferredWidth(80);
        ktableCliente.getColumnModel().getColumn(5).setResizable(false);

        ktableCliente.getTableHeader().setReorderingAllowed(false);

        ktableCliente.setAutoResizeMode(ktableCliente.AUTO_RESIZE_OFF);
        ktableCliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconecta();
    }

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
        ktableCidade.getColumnModel().getColumn(0).setPreferredWidth(230);
        ktableCidade.getColumnModel().getColumn(0).setResizable(false);
        ktableCidade.getColumnModel().getColumn(1).setPreferredWidth(120);
        ktableCidade.getColumnModel().getColumn(1).setResizable(false);

        ktableCidade.setAutoResizeMode(ktableCidade.AUTO_RESIZE_OFF);
        ktableCidade.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
    private br.com.cyber.componente.Ktable ktableCliente;
    private br.com.cyber.componente.KTextField txtCidade;
    private br.com.cyber.componente.KTextField txtCod;
    private br.com.cyber.componente.KTextField txtCodCid;
    private javax.swing.JFormattedTextField txtCpf;
    private br.com.cyber.componente.KTextField txtEnd;
    private br.com.cyber.componente.KTextField txtNome;
    private br.com.cyber.componente.KTextField txtPesq;
    private br.com.cyber.componente.KTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
