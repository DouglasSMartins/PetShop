/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controller.ServicoController;
import entity.Servico;
import javax.swing.JOptionPane;

/**
 *
 * @author douglas
 */
public class CadastroServico extends javax.swing.JFrame {
    private Long idServico;

    /**
     * Creates new form CadastroServico
     */
    public CadastroServico(Long id) {
        initComponents();
        setLocationRelativeTo(this);
        idServico = id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldNomeServico = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuInicio = new javax.swing.JMenu();
        jMenuOperacional = new javax.swing.JMenu();
        jMenuAgenda = new javax.swing.JMenuItem();
        jMenuCliente = new javax.swing.JMenuItem();
        jMenuEstoque = new javax.swing.JMenuItem();
        jMenuServico = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome: (*)");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSalvarMouseClicked(evt);
            }
        });

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonVoltarMouseClicked(evt);
            }
        });

        jMenuInicio.setText("Inicio");
        jMenuInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuInicioMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuInicio);

        jMenuOperacional.setText("Operacional");

        jMenuAgenda.setText("Agenda");
        jMenuAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAgendaActionPerformed(evt);
            }
        });
        jMenuOperacional.add(jMenuAgenda);

        jMenuCliente.setText("Cliente");
        jMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuClienteActionPerformed(evt);
            }
        });
        jMenuOperacional.add(jMenuCliente);

        jMenuEstoque.setText("Estoque");
        jMenuEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEstoqueActionPerformed(evt);
            }
        });
        jMenuOperacional.add(jMenuEstoque);

        jMenuServico.setText("Serviço");
        jMenuServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuServicoActionPerformed(evt);
            }
        });
        jMenuOperacional.add(jMenuServico);

        jMenuBar1.add(jMenuOperacional);

        jMenuAjuda.setText("Ajuda");
        jMenuAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAjudaMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNomeServico, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(377, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVoltar)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNomeServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 310, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonVoltar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuInicioMouseClicked
        TelaInicial telainicial = new TelaInicial();
        setVisible(false);
        telainicial.setVisible(true);
    }//GEN-LAST:event_jMenuInicioMouseClicked

    private void jMenuAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAgendaActionPerformed
        TelaAgenda telaagenda = new TelaAgenda();
        setVisible(false);
        telaagenda.setVisible(true);
    }//GEN-LAST:event_jMenuAgendaActionPerformed

    private void jMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClienteActionPerformed
        TelaCliente telacliente = new TelaCliente();
        setVisible(false);
        telacliente.setVisible(true);
    }//GEN-LAST:event_jMenuClienteActionPerformed

    private void jMenuEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEstoqueActionPerformed
        TelaEstoque telaestoque = new TelaEstoque();
        setVisible(false);
        telaestoque.setVisible(true);
    }//GEN-LAST:event_jMenuEstoqueActionPerformed

    private void jMenuServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuServicoActionPerformed
        TelaServico telaservico = new TelaServico();
        setVisible(false);
        telaservico.setVisible(true);
    }//GEN-LAST:event_jMenuServicoActionPerformed

    private void jMenuAjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAjudaMouseClicked
        TelaAjuda telaajuda = new TelaAjuda();
        telaajuda.setVisible(true);
    }//GEN-LAST:event_jMenuAjudaMouseClicked

    private void jButtonSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalvarMouseClicked
        try {
            TelaServico telaservico = new TelaServico();
            Servico servico = new Servico();
            
            if(!jTextFieldNomeServico.getText().isEmpty()) {
                servico.setNome(this.jTextFieldNomeServico.getText());
            }else{
                JOptionPane.showMessageDialog(this, "O campo Nome é obrigatório!");
                return;
            }
            
            int result = 0;
            
            if(idServico == null){
                result = new ServicoController().addServico(servico);
                JOptionPane.showMessageDialog(this, "Serviço cadastrado com sucesso!");
                setVisible(false);
                telaservico.refreshTable();
                telaservico.setVisible(true);
            }else{
                servico.setId(idServico);
                result = new ServicoController().editarServico(servico);
                idServico = null;
                JOptionPane.showMessageDialog(this, "Serviço editado com sucesso!");
                setVisible(false);
                telaservico.refreshTable();
                telaservico.setVisible(true);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jButtonSalvarMouseClicked

    private void jButtonVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVoltarMouseClicked
        TelaServico telaservico = new TelaServico();
        setVisible(false);
        telaservico.setVisible(true);
    }//GEN-LAST:event_jButtonVoltarMouseClicked

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
            java.util.logging.Logger.getLogger(CadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroServico(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuAgenda;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCliente;
    private javax.swing.JMenuItem jMenuEstoque;
    private javax.swing.JMenu jMenuInicio;
    private javax.swing.JMenu jMenuOperacional;
    private javax.swing.JMenuItem jMenuServico;
    public javax.swing.JTextField jTextFieldNomeServico;
    // End of variables declaration//GEN-END:variables
}
