/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controller.EstoqueController;
import entity.Estoque;
import java.util.List;
import javax.swing.JOptionPane;
import table.EstoqueTableModel;

/**
 *
 * @author douglas
 */
public class TelaEstoque extends javax.swing.JFrame {
    private List<Estoque> estoqueList;

    /**
     * Creates new form TelaEstoque
     */
    public TelaEstoque() {
        initComponents();
        setLocationRelativeTo(this);
        
        estoqueList = new EstoqueController().findEstoque();
            
        if(estoqueList != null){
            jTableEstoque.setModel(new EstoqueTableModel(estoqueList));
        }
    }
    
    public void refreshTable(){
            estoqueList = new EstoqueController().findEstoque();
            
            if(estoqueList != null){
                jTableEstoque.setModel(new EstoqueTableModel(estoqueList));
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAdicionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonFiltrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstoque = new javax.swing.JTable();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuInicio = new javax.swing.JMenu();
        jMenuOperacional = new javax.swing.JMenu();
        jMenuAgenda = new javax.swing.JMenuItem();
        jMenuCliente = new javax.swing.JMenuItem();
        jMenuEstoque = new javax.swing.JMenuItem();
        jMenuServico = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAdicionarMouseClicked(evt);
            }
        });

        jLabel1.setText("Filtrar Estoque");

        jLabel2.setText("Nome:");

        jButtonFiltrar.setText("Filtrar");
        jButtonFiltrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonFiltrarMouseClicked(evt);
            }
        });

        jTableEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableEstoque);

        jButtonEditar.setText("Editar");
        jButtonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEditarMouseClicked(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonExcluirMouseClicked(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAdicionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonFiltrar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAdicionar)
                            .addComponent(jButtonEditar)
                            .addComponent(jButtonExcluir))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuInicioMouseClicked
        TelaInicial telainicial = new TelaInicial();
        setVisible(false);
        telainicial.setVisible(true);
    }//GEN-LAST:event_jMenuInicioMouseClicked

    private void jMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClienteActionPerformed
        TelaCliente telacliente = new TelaCliente();
        setVisible(false);
        telacliente.setVisible(true);
    }//GEN-LAST:event_jMenuClienteActionPerformed

    private void jMenuAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAgendaActionPerformed
        TelaAgenda telaagenda = new TelaAgenda();
        setVisible(false);
        telaagenda.setVisible(true);
    }//GEN-LAST:event_jMenuAgendaActionPerformed

    private void jMenuEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEstoqueActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Você já está na tela de estoque!");
        refreshTable();
    }//GEN-LAST:event_jMenuEstoqueActionPerformed

    private void jButtonAdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAdicionarMouseClicked
        CadastroEstoque cadastroestoque = new CadastroEstoque(null);
        setVisible(false);
        cadastroestoque.setVisible(true);
    }//GEN-LAST:event_jButtonAdicionarMouseClicked

    private void jButtonEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditarMouseClicked
        int rowIndex = jTableEstoque.getSelectedRow();
        
        if(rowIndex == -1){
            JOptionPane.showMessageDialog(this, "Selecione o produto a ser editado!");
            return;
        }
        
        Estoque estoque = new EstoqueTableModel(estoqueList).get(rowIndex);
        Long idEstoque = estoque.getId();
        
        CadastroEstoque editar = new CadastroEstoque(idEstoque);
        editar.jTextFieldNomeEstoque.setText(estoque.getNome());
        editar.jTextFieldQuantidadeEstoque.setText(Integer.toString(estoque.getQuantidade()));
        
        setVisible(false);
        editar.setVisible(true);
    }//GEN-LAST:event_jButtonEditarMouseClicked

    private void jButtonExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExcluirMouseClicked
        int rowIndex = jTableEstoque.getSelectedRow();
        
        if(rowIndex == -1){
            JOptionPane.showMessageDialog(this, "Selecione o produto a ser removido!");
            return;
        }
        
        Estoque estoque = new EstoqueTableModel(estoqueList).get(rowIndex);
        int confirm = JOptionPane.showConfirmDialog(this, "Confirmar a exclusão?", "Excluir Produto", JOptionPane.YES_NO_OPTION);
        
        if(confirm != 0){
            return;
        }
        
        int result = new EstoqueController().excluirEstoque(estoque.getId());
        
        if(result == 0){
            JOptionPane.showMessageDialog(this, "Produto removido com sucesso!");
            refreshTable();
        }else{
            JOptionPane.showMessageDialog(this, "Tente novamente!");
        }
    }//GEN-LAST:event_jButtonExcluirMouseClicked

    private void jButtonFiltrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFiltrarMouseClicked
            
        estoqueList = new EstoqueController().filterEstoque(jTextFieldNome.getText());
            
            if(estoqueList != null){
                jTableEstoque.setModel(new EstoqueTableModel(estoqueList));
            }
        
    }//GEN-LAST:event_jButtonFiltrarMouseClicked

    private void jMenuAjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAjudaMouseClicked
        TelaAjuda telaajuda = new TelaAjuda();
        telaajuda.setVisible(true);
    }//GEN-LAST:event_jMenuAjudaMouseClicked

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
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFiltrar;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEstoque;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
