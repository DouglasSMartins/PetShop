/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controller.EstoqueController;
import entity.Estoque;
import javax.swing.JOptionPane;

/**
 *
 * @author douglas
 */
public class CadastroEstoque extends javax.swing.JFrame {
    private Long idEstoque;

    /**
     * Creates new form CadastroEstoque
     */
    public CadastroEstoque(Long id) {
        initComponents();
        setLocationRelativeTo(this);
        idEstoque = id;
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
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNomeEstoque = new javax.swing.JTextField();
        jTextFieldQuantidadeEstoque = new javax.swing.JTextField();
        jButtonSalvarEstoque = new javax.swing.JButton();
        jButtonVoltarEstoque = new javax.swing.JButton();
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

        jLabel2.setText("Quantidade: (*)");

        jTextFieldQuantidadeEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeEstoqueActionPerformed(evt);
            }
        });

        jButtonSalvarEstoque.setText("Salvar");
        jButtonSalvarEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSalvarEstoqueMouseClicked(evt);
            }
        });

        jButtonVoltarEstoque.setText("Voltar");
        jButtonVoltarEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonVoltarEstoqueMouseClicked(evt);
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
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNomeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldQuantidadeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(324, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalvarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVoltarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNomeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldQuantidadeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarEstoque)
                    .addComponent(jButtonVoltarEstoque))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jMenuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuInicioMouseClicked
        TelaInicial telainicial = new TelaInicial();
        setVisible(false);
        telainicial.setVisible(true);
    }//GEN-LAST:event_jMenuInicioMouseClicked

    private void jMenuAjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAjudaMouseClicked
        TelaAjuda telaajuda = new TelaAjuda();
        telaajuda.setVisible(true);
    }//GEN-LAST:event_jMenuAjudaMouseClicked

    private void jTextFieldQuantidadeEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuantidadeEstoqueActionPerformed

    private void jButtonSalvarEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalvarEstoqueMouseClicked
        try {
            TelaEstoque telaestoque = new TelaEstoque();
            Estoque estoque = new Estoque();
            
            if(!jTextFieldNomeEstoque.getText().isEmpty()) {
                estoque.setNome(this.jTextFieldNomeEstoque.getText());
            }else{
                JOptionPane.showMessageDialog(this, "O campo Nome é obrigatório!");
                return;
            }
            
            if(!jTextFieldQuantidadeEstoque.getText().isEmpty()) {
                estoque.setQuantidade(Integer.parseInt(this.jTextFieldQuantidadeEstoque.getText()));
            }else{
                JOptionPane.showMessageDialog(this, "O campo Nome é obrigatório!");
                return;
            }
            
            int result = 0;
            
            if(idEstoque == null){
                result = new EstoqueController().addEstoque(estoque);
                JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!");
                setVisible(false);
                telaestoque.refreshTable();
                telaestoque.setVisible(true);
            }else{
                estoque.setId(idEstoque);
                result = new EstoqueController().editarEstoque(estoque);
                idEstoque = null;
                JOptionPane.showMessageDialog(this, "Produto editado com sucesso!");
                setVisible(false);
                telaestoque.refreshTable();
                telaestoque.setVisible(true);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jButtonSalvarEstoqueMouseClicked

    private void jButtonVoltarEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVoltarEstoqueMouseClicked
        TelaEstoque telaestoque = new TelaEstoque();
        setVisible(false);
        telaestoque.setVisible(true);
    }//GEN-LAST:event_jButtonVoltarEstoqueMouseClicked

    private void jMenuServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuServicoActionPerformed
        TelaServico telaservico = new TelaServico();
        setVisible(false);
        telaservico.setVisible(true);
    }//GEN-LAST:event_jMenuServicoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroEstoque(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvarEstoque;
    private javax.swing.JButton jButtonVoltarEstoque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuAgenda;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCliente;
    private javax.swing.JMenuItem jMenuEstoque;
    private javax.swing.JMenu jMenuInicio;
    private javax.swing.JMenu jMenuOperacional;
    private javax.swing.JMenuItem jMenuServico;
    public javax.swing.JTextField jTextFieldNomeEstoque;
    public javax.swing.JTextField jTextFieldQuantidadeEstoque;
    // End of variables declaration//GEN-END:variables
}
