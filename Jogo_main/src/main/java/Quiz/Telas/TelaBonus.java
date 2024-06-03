package Quiz.Telas;

import Quiz.QuizManager;

public class TelaBonus extends javax.swing.JFrame{
    
    QuizManager q;
    
    public TelaBonus(QuizManager q) {
        this.q = q;
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoNao = new javax.swing.JButton();
        botaoSim = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 593));
        setMinimumSize(new java.awt.Dimension(1000, 593));
        setPreferredSize(new java.awt.Dimension(1000, 593));
        setResizable(false);
        getContentPane().setLayout(null);

        botaoNao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_botoes/botao_não.png"))); // NOI18N
        botaoNao.setContentAreaFilled(false);
        botaoNao.setMaximumSize(new java.awt.Dimension(220, 120));
        botaoNao.setMinimumSize(new java.awt.Dimension(220, 120));
        botaoNao.setPreferredSize(new java.awt.Dimension(220, 120));
        botaoNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNaoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoNao);
        botaoNao.setBounds(650, 440, 220, 120);

        botaoSim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_botoes/botao_sim.png"))); // NOI18N
        botaoSim.setContentAreaFilled(false);
        botaoSim.setMaximumSize(new java.awt.Dimension(220, 120));
        botaoSim.setMinimumSize(new java.awt.Dimension(220, 120));
        botaoSim.setPreferredSize(new java.awt.Dimension(220, 120));
        botaoSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSimActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSim);
        botaoSim.setBounds(90, 440, 220, 120);

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_telas/tela_bonus.png"))); // NOI18N
        getContentPane().add(backgroundLabel);
        backgroundLabel.setBounds(0, 0, 1000, 562);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNaoActionPerformed
        q.proximaFase();
        this.dispose();
    }//GEN-LAST:event_botaoNaoActionPerformed

    private void botaoSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSimActionPerformed
        q.getTelaQuiz().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoSimActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton botaoNao;
    private javax.swing.JButton botaoSim;
    // End of variables declaration//GEN-END:variables
}
