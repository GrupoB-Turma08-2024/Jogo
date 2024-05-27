/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CrudQuestoes;

/**
 *
 * @author felip
 */
public class MenuQuestions extends javax.swing.JFrame {

    /**
     * Creates new form MenuQuestions
     */
    public MenuQuestions() {
        initComponents();
        setLocationRelativeTo(null);
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
        BotCriar = new javax.swing.JButton();
        BotConsultar = new javax.swing.JButton();
        BotAlterar = new javax.swing.JButton();
        BotRemover = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Gerenciar Questoes");

        BotCriar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BotCriar.setText("Criar");
        BotCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotCriarActionPerformed(evt);
            }
        });

        BotConsultar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BotConsultar.setText("Consultar");
        BotConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotConsultarActionPerformed(evt);
            }
        });

        BotAlterar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BotAlterar.setText("Alterar");
        BotAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotAlterarActionPerformed(evt);
            }
        });

        BotRemover.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BotRemover.setText("Remover");
        BotRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotRemoverActionPerformed(evt);
            }
        });

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(BotCriar)
                .addGap(84, 84, 84)
                .addComponent(BotConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(BotAlterar)
                .addGap(104, 104, 104)
                .addComponent(BotRemover)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotAlterar)
                    .addComponent(BotConsultar)
                    .addComponent(BotCriar)
                    .addComponent(BotRemover))
                .addGap(63, 63, 63)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotCriarActionPerformed
        // TODO add your handling code here:
        TelaInserir inserir = new TelaInserir();
        inserir.setVisible(true);
    }//GEN-LAST:event_BotCriarActionPerformed

    private void BotConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotConsultarActionPerformed
        // TODO add your handling code here:
        TelaConsultar consultar = new TelaConsultar();
        consultar.setVisible(true);
    }//GEN-LAST:event_BotConsultarActionPerformed

    private void BotAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotAlterarActionPerformed
        // TODO add your handling code here:
        TelaAlterar alterar = new TelaAlterar();
        alterar.setVisible(true);
    }//GEN-LAST:event_BotAlterarActionPerformed

    private void BotRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotRemoverActionPerformed
        // TODO add your handling code here:
        TelaRemover remover = new TelaRemover();
        remover.setVisible(true);
    }//GEN-LAST:event_BotRemoverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuQuestions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotAlterar;
    private javax.swing.JButton BotConsultar;
    private javax.swing.JButton BotCriar;
    private javax.swing.JButton BotRemover;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}