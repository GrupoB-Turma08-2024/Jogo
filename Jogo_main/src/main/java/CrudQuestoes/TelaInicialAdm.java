
package CrudQuestoes;

import CrudQuestoes.MenuQuestions;
import Usuario.CrudUsuarios;
import javax.swing.JOptionPane;
import telaInicial.EfeitoSonoro;
import telaInicial.TelaLogin;
import telaInicial.TelaLogin;
import telaInicial.TelaPrincipal;
import telaInicial.TelaPrincipal;

public class TelaInicialAdm extends javax.swing.JFrame {

    public TelaInicialAdm() {
        initComponents();
         setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        botaoEditarQuestoes = new javax.swing.JButton();
        botaoControlarUsuarios = new javax.swing.JButton();
        BotaoJogar = new javax.swing.JButton();
        saircontaBotao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(1000, 562));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 562));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, 130, 10));

        botaoEditarQuestoes.setBackground(new java.awt.Color(51, 0, 0));
        botaoEditarQuestoes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botaoEditarQuestoes.setForeground(new java.awt.Color(255, 255, 255));
        botaoEditarQuestoes.setText("Editar Questões");
        botaoEditarQuestoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        botaoEditarQuestoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoEditarQuestoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarQuestoesActionPerformed(evt);
            }
        });
        getContentPane().add(botaoEditarQuestoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 200, 40));

        botaoControlarUsuarios.setBackground(new java.awt.Color(51, 0, 0));
        botaoControlarUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botaoControlarUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        botaoControlarUsuarios.setText("Controlar Usuarios");
        botaoControlarUsuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        botaoControlarUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoControlarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoControlarUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(botaoControlarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 200, 40));

        BotaoJogar.setBackground(new java.awt.Color(51, 0, 0));
        BotaoJogar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotaoJogar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoJogar.setText("Jogar");
        BotaoJogar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        BotaoJogar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoJogarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoJogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 200, 40));

        saircontaBotao.setForeground(new java.awt.Color(255, 255, 255));
        saircontaBotao.setText("Deseja sair da sua conta?");
        saircontaBotao.setBorder(null);
        saircontaBotao.setContentAreaFilled(false);
        saircontaBotao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saircontaBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saircontaBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(saircontaBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 500, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_telas/adm1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -5, 1000, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEditarQuestoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarQuestoesActionPerformed
        // TODO add your handling code here:
        EfeitoSonoro.Play("click.wav");
        MenuQuestions inserir = new MenuQuestions();
        inserir.setVisible(true);
    }//GEN-LAST:event_botaoEditarQuestoesActionPerformed

    private void botaoControlarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoControlarUsuariosActionPerformed
        // TODO add your handling code here:
        EfeitoSonoro.Play("click.wav");
        CrudUsuarios inserir = new CrudUsuarios();
        inserir.setVisible(true);
    }//GEN-LAST:event_botaoControlarUsuariosActionPerformed

    private void BotaoJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoJogarActionPerformed
        EfeitoSonoro.Play("click.wav");
        TelaPrincipal inserir = new TelaPrincipal();
        inserir.setVisible(true);
        
    }//GEN-LAST:event_BotaoJogarActionPerformed

    private void saircontaBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saircontaBotaoActionPerformed
                int i = JOptionPane.showConfirmDialog(
        null, 
        "Tem certeza?\nO Brolli sentirá sua falta... ☹ ",
        "Adeus Fofete!",
        JOptionPane.OK_CANCEL_OPTION
        );
        if(i == JOptionPane.OK_OPTION) {
        System.out.println("Clicou em ok");
        TelaLogin tl = new TelaLogin();
        tl.setVisible(true);
        this.dispose();
        }
        else if (i == JOptionPane.CANCEL_OPTION) {
        System.out.println("Clicou em cancelar");
        }
    }//GEN-LAST:event_saircontaBotaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicialAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicialAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicialAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicialAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicialAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoJogar;
    private javax.swing.JButton botaoControlarUsuarios;
    private javax.swing.JButton botaoEditarQuestoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton saircontaBotao;
    // End of variables declaration//GEN-END:variables
}
