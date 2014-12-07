/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictac;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Tic extends javax.swing.JFrame {

    /**
     * Creates new form Tic
     */
    ImageIcon cross;
    ImageIcon ovel;
    ImageIcon box;
    Players player;
    String player1Name;
    String player2Name;
    public Tic() {
        
       
    }
    public Tic(String player1Name, String Player2Name){
        initComponents();
        setLocationRelativeTo(null);
        cross=new ImageIcon("Cross.png");
        ovel=new ImageIcon("oo.png");
        box=new ImageIcon("tinker.gif");
        player=new Players();
       this.player1Name=player1Name;
       this.player2Name=Player2Name;
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
        but3 = new javax.swing.JButton();
        but2 = new javax.swing.JButton();
        but1 = new javax.swing.JButton();
        but6 = new javax.swing.JButton();
        but9 = new javax.swing.JButton();
        but5 = new javax.swing.JButton();
        but4 = new javax.swing.JButton();
        but8 = new javax.swing.JButton();
        but7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        but3.setBackground(new java.awt.Color(204, 204, 204));
        but3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        but3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but3ActionPerformed(evt);
            }
        });

        but2.setBackground(new java.awt.Color(204, 204, 204));
        but2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        but2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but2ActionPerformed(evt);
            }
        });

        but1.setBackground(new java.awt.Color(204, 204, 204));
        but1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        but1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but1ActionPerformed(evt);
            }
        });

        but6.setBackground(new java.awt.Color(204, 204, 204));
        but6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        but6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but6ActionPerformed(evt);
            }
        });

        but9.setBackground(new java.awt.Color(204, 204, 204));
        but9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        but9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but9ActionPerformed(evt);
            }
        });

        but5.setBackground(new java.awt.Color(204, 204, 204));
        but5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        but5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but5ActionPerformed(evt);
            }
        });

        but4.setBackground(new java.awt.Color(204, 204, 204));
        but4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        but4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but4ActionPerformed(evt);
            }
        });

        but8.setBackground(new java.awt.Color(204, 204, 204));
        but8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        but8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but8ActionPerformed(evt);
            }
        });

        but7.setBackground(new java.awt.Color(204, 204, 204));
        but7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        but7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but7ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Papyrus", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 177, 230));
        jLabel1.setText("Tic Tac Toe");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(but7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(but4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(but1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(but3, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(but2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(but6, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(but5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(but7, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(but8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(but9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int count=0;
    ImageIcon icon1;
    
    private void but1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but1ActionPerformed
        // TODO add your handling code here:
        
        if(count%2==0 && but1.getIcon()==null){
        but1.setIcon(ovel);
        }
        else if(but1.getIcon()!=null){
            count--;
        }
        
        else if(but1.getIcon()==null) {
            but1.setIcon(cross);
        }
        count++;
        select();
        
    }//GEN-LAST:event_but1ActionPerformed

    private void but2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but2ActionPerformed
        // TODO add your handling code here:
         if(count%2==0 && but2.getIcon()==null){
        but2.setIcon(ovel);
        }
        else if(but2.getIcon()!=null){
            count--;
        }
        else if(but2.getIcon()==null){
            but2.setIcon(cross);
        }
        count++;
        select();
    }//GEN-LAST:event_but2ActionPerformed

    private void but3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but3ActionPerformed
        // TODO add your handling code here:
         if(count%2==0 && but3.getIcon()==null){
        but3.setIcon(ovel);
        }
        else if(but3.getIcon()!=null){
            count--;
        }
        else if(but3.getIcon()==null){
            but3.setIcon(cross);
        }
        count++;
        select();
    }//GEN-LAST:event_but3ActionPerformed

    private void but4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but4ActionPerformed
        if(count%2==0 && but4.getIcon()==null){
        but4.setIcon(ovel);
        }
        else if(but4.getIcon()!=null){
            count--;
        }
        else if(but4.getIcon()==null){
            but4.setIcon(cross);
        }
        count++; 
        select();// TODO add your handling code here:
        
    }//GEN-LAST:event_but4ActionPerformed

    private void but5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but5ActionPerformed
        // TODO add your handling code here:
        if(count%2==0 && but5.getIcon()==null){
        but5.setIcon(ovel);
        }
        else if(but5.getIcon()!=null){
            count--;
        }
        else if(but5.getIcon()==null){
            but5.setIcon(cross);
        }
        count++;
        select();
    }//GEN-LAST:event_but5ActionPerformed

    private void but6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but6ActionPerformed
        // TODO add your handling code here:
         if(count%2==0 && but6.getIcon()==null){
        but6.setIcon(ovel);
        }
        else if(but6.getIcon()!=null){
            count--;
        }
        else if(but6.getIcon()==null){
            but6.setIcon(cross);
        }
        count++;
        select();
    }//GEN-LAST:event_but6ActionPerformed

    private void but7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but7ActionPerformed
        // TODO add your handling code here:
         if(count%2==0 && but7.getIcon()==null){
        but7.setIcon(ovel);
        }
        else if(but7.getIcon()!=null){
            count--;
        }
        else if(but7.getIcon()==null){
            but7.setIcon(cross);
        }
        count++;
        select();
    }//GEN-LAST:event_but7ActionPerformed

    private void but8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but8ActionPerformed
        // TODO add your handling code here:
         if(count%2==0 && but8.getIcon()==null){
        but8.setIcon(ovel);
        }
        else if(but8.getIcon()!=null){
            count--;
        }
        else if(but8.getIcon()==null){
            but8.setIcon(cross);
        }
        count++;
        select();
    }//GEN-LAST:event_but8ActionPerformed

    private void but9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but9ActionPerformed
        // TODO add your handling code here:
         if(count%2==0 && but9.getIcon()==null){
        but9.setIcon(ovel);
        }
        else if(but9.getIcon()!=null){
            count--;
        }
        else if(but9.getIcon()==null){
            but9.setIcon(cross);
        }
        count++;
        select();
    }//GEN-LAST:event_but9ActionPerformed
        public void select(){
            System.out.println(""+count);
        Icon icon = but1.getIcon();
            if((but1.getIcon()==ovel && but2.getIcon()==ovel && but3.getIcon()==ovel)||(but4.getIcon()==ovel && but5.getIcon()==ovel && but6.getIcon()==ovel)||(but7.getIcon()==ovel && but8.getIcon()==ovel && but9.getIcon()==ovel)){
                System.out.println(player1Name+" won the game");
                JOptionPane.showMessageDialog(Tic.this, player1Name+" won the game","",JOptionPane.INFORMATION_MESSAGE,box);
                player.setVisible(rootPaneCheckingEnabled);
            }else if ((but1.getIcon()==ovel && but4.getIcon()==ovel && but7.getIcon()==ovel)||(but2.getIcon()==ovel && but5.getIcon()==ovel && but8.getIcon()==ovel)||(but3.getIcon()==ovel && but6.getIcon()==ovel && but9.getIcon()==ovel)){
                System.out.println(player1Name+" won the game");
                JOptionPane.showMessageDialog(Tic.this, player1Name+" won the game","",JOptionPane.INFORMATION_MESSAGE,box);
                player.setVisible(rootPaneCheckingEnabled);
            }else if((but1.getIcon()==ovel && but5.getIcon()==ovel && but9.getIcon()==ovel)||(but3.getIcon()==ovel && but5.getIcon()==ovel && but7.getIcon()==ovel)){
                System.out.println(player1Name+" won the game");
                JOptionPane.showMessageDialog(Tic.this, player1Name+" won the game","",JOptionPane.INFORMATION_MESSAGE,box);
                player.setVisible(rootPaneCheckingEnabled);
            }else if((but1.getIcon()==cross && but5.getIcon()==cross && but9.getIcon()==cross)||(but3.getIcon()==cross && but5.getIcon()==cross && but7.getIcon()==cross)){
                System.out.println(player2Name+" won the game");
                JOptionPane.showMessageDialog(Tic.this, player2Name+" won the game","",JOptionPane.INFORMATION_MESSAGE,box);
                player.setVisible(rootPaneCheckingEnabled);
            }else if ((but1.getIcon()==cross && but4.getIcon()==cross && but7.getIcon()==cross)||(but2.getIcon()==cross && but5.getIcon()==cross && but8.getIcon()==cross)||(but3.getIcon()==cross && but6.getIcon()==cross && but9.getIcon()==cross)){
                System.out.println(player2Name+" won the game");
                JOptionPane.showMessageDialog(Tic.this, player2Name+" won the game","",JOptionPane.INFORMATION_MESSAGE,box);
                player.setVisible(rootPaneCheckingEnabled);
            }else if((but1.getIcon()==cross && but2.getIcon()==cross && but3.getIcon()==cross)||(but4.getIcon()==cross && but5.getIcon()==cross && but6.getIcon()==cross)||(but7.getIcon()==cross && but8.getIcon()==cross && but9.getIcon()==cross)){
                System.out.println(player2Name+" won the game");
                JOptionPane.showMessageDialog(Tic.this, player2Name+" won the game","",JOptionPane.INFORMATION_MESSAGE,box);
                player.setVisible(rootPaneCheckingEnabled);
            }else if(count==9) {
                JOptionPane.showMessageDialog(Tic.this, "Game Tied","",JOptionPane.INFORMATION_MESSAGE,box);
                player.setVisible(rootPaneCheckingEnabled);
            }
        }
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
            java.util.logging.Logger.getLogger(Tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tic().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but1;
    private javax.swing.JButton but2;
    private javax.swing.JButton but3;
    private javax.swing.JButton but4;
    private javax.swing.JButton but5;
    private javax.swing.JButton but6;
    private javax.swing.JButton but7;
    private javax.swing.JButton but8;
    private javax.swing.JButton but9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}