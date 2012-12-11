package com.rochamarinho.ui;

import com.rochamarinho.controller.FilialController;
import com.rochamarinho.model.Filial;
import com.rochamarinho.utils.BackendException;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author marlosouza
 */
public class CadastrarFilial extends javax.swing.JPanel {

    FilialController filialController = new FilialController();

    /**
     * Creates new form CadastrarFilial
     */
    public CadastrarFilial() {
        initComponents();
        setFiliaisNoComboBox();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JTextField();
        lblNomeFilial = new javax.swing.JLabel();
        btnCadastrarFilial = new javax.swing.JButton();
        btnCancelarCadastro = new javax.swing.JButton();
        comboBoxFiliais = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtFilialAtualizada = new javax.swing.JTextField();
        btnAtualizarFilial = new javax.swing.JButton();
        btnDeletarFilial = new javax.swing.JButton();
        lblNovoNome = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeFocusLost(evt);
            }
        });

        lblNomeFilial.setText("Nome nova filial:");

        btnCadastrarFilial.setText("Cadastrar");
        btnCadastrarFilial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarFilialActionPerformed(evt);
            }
        });

        btnCancelarCadastro.setText("Cancelar");
        btnCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCadastroActionPerformed(evt);
            }
        });

        comboBoxFiliais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "default" }));

        jLabel1.setText("Selecione:");

        btnAtualizarFilial.setText("Atualizar");
        btnAtualizarFilial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarFilialActionPerformed(evt);
            }
        });

        btnDeletarFilial.setText("Deletar");
        btnDeletarFilial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarFilialActionPerformed(evt);
            }
        });

        lblNovoNome.setText("Novo nome:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarCadastro)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastrarFilial)
                            .addComponent(lblNomeFilial)
                            .addComponent(jLabel1)
                            .addComponent(lblNovoNome))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFilialAtualizada, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxFiliais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAtualizarFilial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDeletarFilial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeFilial)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCadastrarFilial)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboBoxFiliais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletarFilial))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFilialAtualizada, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNovoNome)
                    .addComponent(btnAtualizarFilial))
                .addGap(45, 45, 45)
                .addComponent(btnCancelarCadastro)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        txtNome.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCadastroActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarCadastroActionPerformed

    private void btnCadastrarFilialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarFilialActionPerformed
        String filNomeText = txtNome.getText();

        try {
            boolean naoCadastrada = filialController.cadastrarFilial(filNomeText);
            
            if (!naoCadastrada)
            {
                JOptionPane.showMessageDialog(null, "Filial já cadastrada!");
                return;
            }
            
        } catch (BackendException ex) {
            JOptionPane.showMessageDialog(null, "Filial não Cadastrada devido a um problema de conexão!");
        }
        JOptionPane.showMessageDialog(null, "Filial cadastrado com sucesso!");
        setFiliaisNoComboBox();
        txtNome.setText("");
    }//GEN-LAST:event_btnCadastrarFilialActionPerformed

    private void txtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusGained
        txtNome.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
    }//GEN-LAST:event_txtNomeFocusGained

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        txtNome.setBorder(BorderFactory.createLineBorder(Color.gray));
    }//GEN-LAST:event_txtNomeFocusLost

    private void btnAtualizarFilialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarFilialActionPerformed


        String novaFilial = txtFilialAtualizada.getText();

        if (novaFilial.equals("")) {
            JOptionPane.showMessageDialog(null, "Deve ser informado um nome nao vazio");
            return;
        }
        try {
            Filial f = filialController.porNome(novaFilial);
            if (f != null) {
                JOptionPane.showMessageDialog(null, "Filial já existe, escolha outro nome");
                return;
            }
        } catch (BackendException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao verificar nova filial, contacte o administrador");
            return;
        }


        String antigaFilial = (String) comboBoxFiliais.getSelectedItem();
        try {
            Filial antiga = filialController.porNome(antigaFilial);
            filialController.atualizarFilial(antiga, novaFilial);
            
        } catch (BackendException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao encontrar antiga filial, contacte o administrador");
            return;
        }

        JOptionPane.showMessageDialog(null, "Filial atualizada com sucesso");
        setFiliaisNoComboBox();
        txtFilialAtualizada.setText("");
            

    }//GEN-LAST:event_btnAtualizarFilialActionPerformed

    private void btnDeletarFilialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarFilialActionPerformed
        
        int escolha = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja desativar a filial " + comboBoxFiliais.getSelectedItem());
        
        if (escolha != 0)
        {
            return;
        }
        
        String filial = (String) comboBoxFiliais.getSelectedItem();
        try {
            Filial filialParaSerDeletada = filialController.porNome(filial);
            filialParaSerDeletada.setAtivo(false);
            filialController.getBackend().update(filialParaSerDeletada);
            
        } catch (BackendException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível deletar/encontrar filial!");
            Logger.getLogger(CadastrarFilial.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null, "Filial deletada com sucesso");
        setFiliaisNoComboBox();
        txtFilialAtualizada.setText("");
        
    }//GEN-LAST:event_btnDeletarFilialActionPerformed

    public void setFiliaisNoComboBox() {
        List<Filial> filiais = null;
        try {
            filiais = filialController.listarFiliais();
            Collections.sort(filiais);
        } catch (BackendException ex) {
            JOptionPane.showConfirmDialog(null, "Não foi possivel carregar a lista de filiais");
            filiais = new ArrayList<Filial>();
        }


        List<String> filiaisNomes = new ArrayList<String>();
        for (Filial f : filiais) {
            filiaisNomes.add(f.getNome());
        }
        comboBoxFiliais.setModel(new javax.swing.DefaultComboBoxModel(filiaisNomes.toArray()));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarFilial;
    private javax.swing.JButton btnCadastrarFilial;
    private javax.swing.JButton btnCancelarCadastro;
    private javax.swing.JButton btnDeletarFilial;
    private javax.swing.JComboBox comboBoxFiliais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblNomeFilial;
    private javax.swing.JLabel lblNovoNome;
    private javax.swing.JTextField txtFilialAtualizada;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
