/*
 * jogo simpre de adivinhar numero
 * clase principal da tela 
 */
package classes;

/**
 *
 * @author Michael Coitim
 */
public class TelaGame extends javax.swing.JFrame {

    /**
     * Creates new form TelaGame
     */
    public TelaGame() {
        initComponents();
        lblFrase.setText("<html>Vou pensar um numero entre 1 e 5. Tente advinhar <html/>");
        lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/geniopensando.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        controle = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        lblFrase = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Palpite");
        jButton1.setHideActionText(true);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 100, 40));

        lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/geniopensando.png"))); // NOI18N
        getContentPane().add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 224, 249));

        controle.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        getContentPane().add(controle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 49, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("VALOR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        lblFrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrase.setText("frase");
        lblFrase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblFrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 44, 230, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bal??o.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int c = Integer.parseInt(controle.getValue().toString());
        double n = 1 + Math.random() * (6-1); 
        int valor = (int) n;
        
        if (c==valor){
           lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/acertou.png")));
           lblFrase.setText( "<html> acertou parab??ns!</html>");
            
            } 
        else{
            
                lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/geniovcerrou.png")));
                lblFrase.setText("<html>Voce Errou pensei no numero <htmal/>"+(Integer.toHexString(valor)));
            
        }      
        
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
            java.util.logging.Logger.getLogger(TelaGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner controle;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lblFrase;
    // End of variables declaration//GEN-END:variables
}
