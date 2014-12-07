/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictac;

/**
 *
 * @author HP
 */
public class Front extends javax.swing.JFrame {

    /**
     * Creates new form Front
     */
    public Front() {
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

        jPanel1 = new javax.swing.JPanel();
        newGame = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        newGame.setBackground(new java.awt.Color(0, 0, 0));
        newGame.setFont(new java.awt.Font("Papyrus", 1, 24)); // NOI18N
        newGame.setForeground(new java.awt.Color(65, 177, 230));
        newGame.setText("Multiplayers");
        newGame.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        newGame.setBorderPainted(false);
        newGame.setDefaultCapable(false);
        newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameActionPerformed(evt);
            }
        });
        jPanel1.add(newGame);
        newGame.setBounds(60, 280, 210, 35);

        exitButton.setBackground(new java.awt.Color(0, 0, 0));
        exitButton.setFont(new java.awt.Font("Papyrus", 1, 24)); // NOI18N
        exitButton.setForeground(new java.awt.Color(65, 177, 230));
        exitButton.setText("Exit");
        exitButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitButton.setBorderPainted(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(exitButton);
        exitButton.setBounds(60, 380, 210, 31);

        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictac/tict.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 0, 280, 330);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Papyrus", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(65, 177, 230));
        jButton1.setText("Single Player");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(60, 330, 210, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void newGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameActionPerformed
        // TODO add your handling code here:
        Players players=new Players();
        players.setTitle("Tic Tac Toe");
        players.setSize(330,430);
        players.setVisible(rootPaneCheckingEnabled);
        this.setVisible(false);
    }//GEN-LAST:event_newGameActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SinglePlayerGame inter=new SinglePlayerGame("You", "Computer");
        inter.setVisible(rootPaneCheckingEnabled);
        inter.setTitle("Tic Tac Toe ");
        inter.setSize(320,430);
        inter.setMaximizedBounds(null);
        setVisible(false);
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
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Front().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton newGame;
    // End of variables declaration//GEN-END:variables
}
