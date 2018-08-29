/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import projeto_gym.pro.Projeto_GYMPRO;
import projeto_gym.pro.Util;
import java.util.ArrayList;
import javax.swing.border.LineBorder;
import model.ControleFinanceiro;

/**
 *
 * @author Insinuante
 */
public class FinanceiroLancarFaturaJFrame extends javax.swing.JFrame {
    private ControleFinanceiro c;
    /**
     * Creates new form NewJFrameLogin
     */
    public FinanceiroLancarFaturaJFrame() {
        c = new ControleFinanceiro();
        initComponents();
        this.preencherComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogin = new javax.swing.JPanel();
        jPanelSair = new javax.swing.JPanel();
        jLabeSair = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        jButtonLancar = new javax.swing.JButton();
        jLabelLogin3 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jComboBoxHistorico = new javax.swing.JComboBox<>();
        jLabelData = new javax.swing.JLabel();
        jLabelData1 = new javax.swing.JLabel();
        jButtonFechar = new javax.swing.JButton();
        jLabelDados = new javax.swing.JLabel();
        jComboBoxFormaPag = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        dataPgjDateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lançamento");
        setUndecorated(true);

        jPanelLogin.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        jPanelSair.setBackground(new java.awt.Color(45, 118, 232));

        jLabeSair.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabeSair.setForeground(new java.awt.Color(255, 255, 255));
        jLabeSair.setText("  X");
        jLabeSair.setToolTipText("Sair");
        jLabeSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabeSairMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSairLayout = new javax.swing.GroupLayout(jPanelSair);
        jPanelSair.setLayout(jPanelSairLayout);
        jPanelSairLayout.setHorizontalGroup(
            jPanelSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabeSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );
        jPanelSairLayout.setVerticalGroup(
            jPanelSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSairLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabeSair))
        );

        jLabelTipo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelTipo.setForeground(new java.awt.Color(45, 118, 232));
        jLabelTipo.setText("Historico");

        jTextFieldDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescricaoActionPerformed(evt);
            }
        });

        jLabelDescricao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelDescricao.setForeground(new java.awt.Color(45, 118, 232));
        jLabelDescricao.setText("Descrição");

        jButtonLancar.setBackground(new java.awt.Color(45, 118, 232));
        jButtonLancar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonLancar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLancar.setText("Lançar");
        jButtonLancar.setToolTipText("Lançar pagamento");
        jButtonLancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLancarActionPerformed(evt);
            }
        });

        jLabelLogin3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelLogin3.setForeground(new java.awt.Color(45, 118, 232));
        jLabelLogin3.setText("Id");

        jTextFieldId.setEditable(false);
        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });

        jComboBoxHistorico.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComboBoxHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHistoricoActionPerformed(evt);
            }
        });

        jLabelData.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelData.setForeground(new java.awt.Color(45, 118, 232));
        jLabelData.setText("Data Pagamento");

        jLabelData1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelData1.setForeground(new java.awt.Color(45, 118, 232));
        jLabelData1.setText("Valor");

        jButtonFechar.setBackground(new java.awt.Color(45, 118, 232));
        jButtonFechar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonFechar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFechar.setText("Fechar");
        jButtonFechar.setToolTipText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        jLabelDados.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabelDados.setForeground(new java.awt.Color(45, 118, 232));
        jLabelDados.setText("Lançamento de conta");

        jComboBoxFormaPag.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComboBoxFormaPag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Cartão Crétido", "Cartão Débito", "Cheque" }));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(45, 118, 232));
        jLabel1.setText("Forma de Pagamento");

        dataPgjDateChooser.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addComponent(jLabelDados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLoginLayout.createSequentialGroup()
                                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelLogin3)
                                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTipo))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanelLoginLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBoxFormaPag, 0, 137, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelDescricao)
                                .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelData, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonLancar, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(dataPgjDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelData1)
                                    .addComponent(jButtonFechar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(jTextFieldValor))))
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addComponent(jComboBoxHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDados))
                .addGap(20, 20, 20)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLogin3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelData1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dataPgjDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLoginLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonLancar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelLoginLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(12, 12, 12)
                                .addComponent(jComboBoxFormaPag, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)))
                        .addGap(28, 28, 28))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelLogin.getAccessibleContext().setAccessibleName("");

        setSize(new java.awt.Dimension(554, 314));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabeSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeSairMousePressed
        this.dispose();
    }//GEN-LAST:event_jLabeSairMousePressed

    private void jTextFieldDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescricaoActionPerformed

    private void jButtonLancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLancarActionPerformed
        try {
            if(jTextFieldDescricao.getText().isEmpty()){
                jTextFieldDescricao.setBorder(new LineBorder(Color.RED));
            }else{
                get();
                if(c.getId()==0)
                    projeto_gym.pro.Projeto_GYMPRO.fachada.cadastrarControleFinanceiro(c);
                else
                    projeto_gym.pro.Projeto_GYMPRO.fachada.editarControleFinanceiro(c);
                dispose();
                return;
            } 
        } catch (NullPointerException e) {
            if(dataPgjDateChooser.getDate()==null){
               dataPgjDateChooser.setBorder(new LineBorder(Color.RED));
            }
        } catch (NumberFormatException e){
            jTextFieldValor.setBorder(new LineBorder(Color.RED));
        }
        Mensagem.exibirMensagem("Dados incorretos! Alguns campos não foram inseridos\n"
                + "ou inseridos de forma incorreta!");
        
    }//GEN-LAST:event_jButtonLancarActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jComboBoxHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHistoricoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxHistoricoActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dataPgjDateChooser;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonLancar;
    private javax.swing.JComboBox<String> jComboBoxFormaPag;
    private javax.swing.JComboBox<String> jComboBoxHistorico;
    private javax.swing.JLabel jLabeSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDados;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelData1;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelLogin3;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelSair;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
    
    private ControleFinanceiro get() throws NumberFormatException, NullPointerException{
        c.setConta(projeto_gym.pro.Projeto_GYMPRO.fachada.getByNomeConta(jComboBoxHistorico.getSelectedItem()+""));
        c.setData(Util.converterCalendarToDate2(dataPgjDateChooser.getCalendar()));
        c.setDescricao(jTextFieldDescricao.getText());
        c.setValor(Float.parseFloat(jTextFieldValor.getText()));
        if(!jTextFieldId.getText().isEmpty()){
            c.setId(Integer.parseInt(jTextFieldId.getText()));
        }
        return c;
    }
    
    public void set(ControleFinanceiro c){
        jComboBoxHistorico.setSelectedItem(c.getConta().getTipo());
        dataPgjDateChooser.setDate(c.getData());
        jTextFieldDescricao.setText(c.getDescricao());
        jTextFieldValor.setText(c.getValor()+"");
        jTextFieldId.setText(c.getId()+"");
    }
    
    private void preencherComboBox(){
        ArrayList<String> contas = projeto_gym.pro.Projeto_GYMPRO.fachada.getAllNomeContas();
        if(contas!=null){
            jComboBoxHistorico.removeAllItems();
            for(String c : contas){
                jComboBoxHistorico.addItem(c);
            }
        }
    }
}
