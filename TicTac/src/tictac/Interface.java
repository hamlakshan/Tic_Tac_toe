/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tictac;

import java.awt.Button;
import java.util.Random;
import javax.swing.JButton;

/**
 *
 * @author Manoj Lakshan
 */
public class Interface extends javax.swing.JFrame {

    public boolean []occupied= new boolean[9];
    public JButton []gameButton=new JButton[9];
    public int[] mymove=new int[5];
    public int[] playermove= new int[5];
    int count=0;
    
    
    int pause = 0;
    int all = 0;
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
    int e = 0;
    int f = 0;
    int g = 0;
    int h = 0;
    int i = 0;
    int ok = 0;
    int cf = 0;
    int choice=9;
    int aRandomNumber = 0;
    int comp = 0;
    int t = 0;
    int wn = 0;
    int ls = 0;
    int ts = 0;
    


    String temp="";
    
    public void logicOne() {
        if ((a==1)&&(b==1)&&(c==1)) all=1;
        if ((a==1)&&(d==1)&&(g==1)) all=1;
        if ((a==1)&&(e==1)&&(i==1)) all=1;
        if ((b==1)&&(e==1)&&(h==1)) all=1;
        if ((d==1)&&(e==1)&&(f==1)) all=1;
        if ((g==1)&&(h==1)&&(i==1)) all=1;
        if ((c==1)&&(f==1)&&(i==1)) all=1;
        if ((g==1)&&(e==1)&&(c==1)) all=1;
        if ((a==2)&&(b==2)&&(c==2)) all=2;
        if ((a==2)&&(d==2)&&(g==2)) all=2;
        if ((a==2)&&(e==2)&&(i==2)) all=2;
        if ((b==2)&&(e==2)&&(h==2)) all=2;
        if ((d==2)&&(e==2)&&(f==2)) all=2;
        if ((g==2)&&(h==2)&&(i==2)) all=2;
        if ((c==2)&&(f==2)&&(i==2)) all=2;
        if ((g==2)&&(e==2)&&(c==2)) all=2;
        if ((a != 0)&&(b != 0)&&(c != 0)&&(d != 0)&&(e != 0)&&(f != 0)&&(g != 0)&&(h != 0)&&(i != 0)&&(all == 0)) all = 3;
    }
    
    public void logicTwo() {
        if ((a==2)&&(b==2)&&(c== 0)&&(temp=="")) temp="C";
        if ((a==2)&&(b== 0)&&(c==2)&&(temp=="")) temp="B";
        if ((a== 0)&&(b==2)&&(c==2)&&(temp=="")) temp="A";
        if ((a==2)&&(d==2)&&(g== 0)&&(temp=="")) temp="G";
        if ((a==2)&&(d== 0)&&(g==2)&&(temp=="")) temp="D";
        if ((a== 0)&&(d==2)&&(g==2)&&(temp=="")) temp="A";
        if ((a==2)&&(e==2)&&(i== 0)&&(temp=="")) temp="I";
        if ((a==2)&&(e== 0)&&(i==2)&&(temp=="")) temp="E";
        if ((a== 0)&&(e==2)&&(i==2)&&(temp=="")) temp="A";
        if ((b==2)&&(e==2)&&(h== 0)&&(temp=="")) temp="H";
        if ((b==2)&&(e== 0)&&(h==2)&&(temp=="")) temp="E";
        if ((b== 0)&&(e==2)&&(h==2)&&(temp=="")) temp="B";
        if ((d==2)&&(e==2)&&(f== 0)&&(temp=="")) temp="F";
        if ((d==2)&&(e== 0)&&(f==2)&&(temp=="")) temp="E";
        if ((d== 0)&&(e==2)&&(f==2)&&(temp=="")) temp="D";
        if ((g==2)&&(h==2)&&(i== 0)&&(temp=="")) temp="I";
        if ((g==2)&&(h== 0)&&(i==2)&&(temp=="")) temp="H";
        if ((g== 0)&&(h==2)&&(i==2)&&(temp=="")) temp="G";
        if ((c==2)&&(f==2)&&(i== 0)&&(temp=="")) temp="I";
        if ((c==2)&&(f== 0)&&(i==2)&&(temp=="")) temp="F";
        if ((c== 0)&&(f==2)&&(i==2)&&(temp=="")) temp="C";
        if ((g==2)&&(e==2)&&(c== 0)&&(temp=="")) temp="C";
        if ((g==2)&&(e== 0)&&(c==2)&&(temp=="")) temp="E";
        if ((g== 0)&&(e==2)&&(c==2)&&(temp=="")) temp="G";
    }
    public void logicThree() {
        if ((a==1)&&(b==1)&&(c==0)&&(temp=="")) temp="C";
        if ((a==1)&&(b==0)&&(c==1)&&(temp=="")) temp="B";
        if ((a==0)&&(b==1)&&(c==1)&&(temp=="")) temp="A";
        if ((a==1)&&(d==1)&&(g==0)&&(temp=="")) temp="G";
        if ((a==1)&&(d==0)&&(g==1)&&(temp=="")) temp="D";
        if ((a==0)&&(d==1)&&(g==1)&&(temp=="")) temp="A";
        if ((a==1)&&(e==1)&&(i==0)&&(temp=="")) temp="I";
        if ((a==1)&&(e==0)&&(i==1)&&(temp=="")) temp="E";
        if ((a==0)&&(e==1)&&(i==1)&&(temp=="")) temp="A";
        if ((b==1)&&(e==1)&&(h==0)&&(temp=="")) temp="H";
        if ((b==1)&&(e==0)&&(h==1)&&(temp=="")) temp="E";
        if ((b==0)&&(e==1)&&(h==1)&&(temp=="")) temp="B";
        if ((d==1)&&(e==1)&&(f==0)&&(temp=="")) temp="F";
        if ((d==1)&&(e==0)&&(f==1)&&(temp=="")) temp="E";
        if ((d==0)&&(e==1)&&(f==1)&&(temp=="")) temp="D";
        if ((g==1)&&(h==1)&&(i==0)&&(temp=="")) temp="I";
        if ((g==1)&&(h==0)&&(i==1)&&(temp=="")) temp="H";
        if ((g==0)&&(h==1)&&(i==1)&&(temp=="")) temp="G";
        if ((c==1)&&(f==1)&&(i==0)&&(temp=="")) temp="I";
        if ((c==1)&&(f==0)&&(i==1)&&(temp=="")) temp="F";
        if ((c==0)&&(f==1)&&(i==1)&&(temp=="")) temp="C";
        if ((g==1)&&(e==1)&&(c==0)&&(temp=="")) temp="C";
        if ((g==1)&&(e==0)&&(c==1)&&(temp=="")) temp="E";
        if ((g==0)&&(e==1)&&(c==1)&&(temp=="")) temp="G";
    }
    public void clearOut() {
        document.game.you.value="0";
        document.game.computer.value="0";
        document.game.ties.value="0";
    }
    public void checkSpace() {
        if ((temp=="A")&&(a==0)) {
            ok=1;
            if (cf==0) a=1;
            if (cf==1) a=2;
        }
        if ((temp=="B")&&(b==0)) {
            ok=1;
            if (cf==0) b=1;
            if (cf==1) b=2;
        }
        if ((temp=="C")&&(c==0)) {
            ok=1;
            if (cf==0) c=1;
            if (cf==1) c=2;
        }
        if ((temp=="D")&&(d==0)) {
            ok=1;
            if (cf==0) d=1;
            if (cf==1) d=2;
        }
        if ((temp=="E")&&(e==0)) {
            ok=1;
            if (cf==0) e=1;
            if (cf==1) e=2;
        }
        if ((temp=="F")&&(f==0)) {
            ok=1
            if (cf==0) f=1;
            if (cf==1) f=2;
        }
        if ((temp=="G")&&(g==0)) {
            ok=1
            if (cf==0) g=1;
            if (cf==1) g=2;
        }
        if ((temp=="H")&&(h==0)) {
            ok=1;
            if (cf==0) h=1;
            if (cf==1) h=2;
        }
        if ((temp=="I")&&(i==0)) {
            ok=1;
            if (cf==0) i=1;
            if (cf==1) i=2;
        }
    }
    public void yourChoice(chName) {
        pause = 0;
        if (all!=0) ended();
        if (all==0) {
        cf = 0;
        ok = 0;
        temp=chName;
        checkSpace();
        if (ok==1) {
            document.images[chName].src = x;
        }
        if (ok==0)taken();
        process();
        if ((all==0)&&(pause==0)) myChoice();
           }
        }
function taken() {
alert("That square is already occupied.  Please select another square.")
pause=1;
}
function myChoice() {
temp="";
ok = 0;
cf=1;
logicTwo();
logicThree();
checkSpace();
while(ok==0) {
aRandomNumber=Math.random()
comp=Math.round((choice-1)*aRandomNumber)+1;
if (comp==1) temp="A";
if (comp==2) temp="B";
if (comp==3) temp="C";
if (comp==4) temp="D";
if (comp==5) temp="E";
if (comp==6) temp="F";
if (comp==7) temp="G";
if (comp==8) temp="H";
if (comp==9) temp="I";
checkSpace();
}
document.images[temp].src= o;
process();
}
function ended() {
alert("The game has already ended. To play a new game click the Play Again button.")
}
function process() {
logicOne();
if (all==1){ alert("You won, congratulations!"); wn++; }
if (all==2){ alert("Gotcha!  I win!"); ls++; }
if (all==3){ alert("We tied."); ts++; }
if (all!=0) {
document.game.you.value = wn;
document.game.computer.value = ls;
document.game.ties.value = ts;
   }
}
function playAgain() {
if (all==0) {
if(confirm("This will restart the game and clear all the current scores. OK?")) reset();
}
if (all>0) reset();
}
function reset() {
all = 0;
a = 0;
b = 0;
c = 0;
d = 0;
e = 0;
f = 0;
g = 0;
h = 0;
i = 0;
temp="";
ok = 0;
cf = 0;
choice=9;
aRandomNumber = 0;
comp = 0;
document.images.A.src= blank;
document.images.B.src= blank;
document.images.C.src= blank;
document.images.D.src= blank;
document.images.E.src= blank;
document.images.F.src= blank;
document.images.G.src= blank;
document.images.H.src= blank;
document.images.I.src= blank;
if (t==0) { t=2; myChoice(); }
t--;
}
    


    public Interface() {
        initComponents();
        innitialize();
        for(int i=0;i<9;i++){
            occupied[i]=false;
        }
    }
    
    public void innitialize(){
        gameButton[0]=gameButton1;
        gameButton[1]=gameButton2;
        gameButton[2]=gameButton3;
        gameButton[3]=gameButton4;
        gameButton[4]=gameButton5;
        gameButton[5]=gameButton6;
        gameButton[6]=gameButton7;
        gameButton[7]=gameButton8;
        gameButton[8]=gameButton9;
        
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Gamepannel = new javax.swing.JPanel();
        gameButton1 = new javax.swing.JButton();
        gameButton2 = new javax.swing.JButton();
        gameButton3 = new javax.swing.JButton();
        gameButton4 = new javax.swing.JButton();
        gameButton5 = new javax.swing.JButton();
        gameButton6 = new javax.swing.JButton();
        gameButton7 = new javax.swing.JButton();
        gameButton8 = new javax.swing.JButton();
        gameButton9 = new javax.swing.JButton();
        beginButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gameButton1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        gameButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameButton1ActionPerformed(evt);
            }
        });

        gameButton2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        gameButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameButton2ActionPerformed(evt);
            }
        });

        gameButton3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        gameButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameButton3ActionPerformed(evt);
            }
        });

        gameButton4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        gameButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameButton4ActionPerformed(evt);
            }
        });

        gameButton5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        gameButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameButton5ActionPerformed(evt);
            }
        });

        gameButton6.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        gameButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameButton6ActionPerformed(evt);
            }
        });

        gameButton7.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        gameButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameButton7ActionPerformed(evt);
            }
        });

        gameButton8.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        gameButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameButton8ActionPerformed(evt);
            }
        });

        gameButton9.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        gameButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GamepannelLayout = new javax.swing.GroupLayout(Gamepannel);
        Gamepannel.setLayout(GamepannelLayout);
        GamepannelLayout.setHorizontalGroup(
            GamepannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GamepannelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(GamepannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gameButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gameButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gameButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addGroup(GamepannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GamepannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(gameButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addComponent(gameButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(gameButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(GamepannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gameButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gameButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gameButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        GamepannelLayout.setVerticalGroup(
            GamepannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GamepannelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(GamepannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gameButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gameButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gameButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(GamepannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gameButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gameButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gameButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(GamepannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gameButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gameButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gameButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        beginButton.setText("Begin");
        beginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(Gamepannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(beginButton)
                        .addGap(70, 70, 70)
                        .addComponent(exitButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beginButton)
                    .addComponent(exitButton))
                .addGap(4, 4, 4)
                .addComponent(Gamepannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
   
    private void gameButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameButton1ActionPerformed
        // TODO add your handling code here:
        gameButton1.setText("O");
        count++;
        occupied[0]=true;
        System.out.println("button 1 pressed");
        com_move();
    }//GEN-LAST:event_gameButton1ActionPerformed

    private void beginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginButtonActionPerformed
        // TODO add your handling code here:
        com_move();
    }//GEN-LAST:event_beginButtonActionPerformed

    private void gameButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameButton2ActionPerformed
        // TODO add your handling code here:
        gameButton2.setText("O");
        count++;
        occupied[1]=true;
        System.out.println("button 2 pressed");
        com_move();
    }//GEN-LAST:event_gameButton2ActionPerformed

    private void gameButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameButton3ActionPerformed
        // TODO add your handling code here:
        gameButton3.setText("O");
        count++;
        occupied[2]=true;
        System.out.println("button 3 pressed");
        com_move();
    }//GEN-LAST:event_gameButton3ActionPerformed

    private void gameButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameButton4ActionPerformed
        // TODO add your handling code here:
        gameButton4.setText("O");
        count++;
        occupied[3]=true;
        System.out.println("button 4 pressed");
        com_move();
    }//GEN-LAST:event_gameButton4ActionPerformed

    private void gameButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameButton5ActionPerformed
        // TODO add your handling code here:
        gameButton5.setText("O");
        count++;
        occupied[4]=true;
        System.out.println("button 5 pressed");
        com_move();
    }//GEN-LAST:event_gameButton5ActionPerformed

    private void gameButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameButton6ActionPerformed
        // TODO add your handling code here:
        gameButton6.setText("O");
        count++;
        occupied[5]=true;
        System.out.println("button 6 pressed");
        com_move();
    }//GEN-LAST:event_gameButton6ActionPerformed

    private void gameButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameButton7ActionPerformed
        // TODO add your handling code here:
        gameButton7.setText("O");
        count++;
        occupied[6]=true;
        System.out.println("button 7 pressed");
        com_move();
    }//GEN-LAST:event_gameButton7ActionPerformed

    private void gameButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameButton8ActionPerformed
        // TODO add your handling code here:
        gameButton8.setText("O");
        count++;
        occupied[7]=true;
        System.out.println("button 8 pressed");
        com_move();
    }//GEN-LAST:event_gameButton8ActionPerformed

    private void gameButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameButton9ActionPerformed
        // TODO add your handling code here:
        gameButton9.setText("O");
        count++;
        occupied[8]=true;
        System.out.println("button 9 pressed");
        com_move();
    }//GEN-LAST:event_gameButton9ActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
        
    }
    public void com_move(){
        if(count==0){
            first_move();
        }
        if(count==2){
            second_move();
        }
        if(count==4){
            third_move();
        }
        if(count==6){
            fourth_move();
        }
        if(count==8){
            fifth_move();
        }
        count++;
        
    }
    public void user_move(){
        
        
    }
    
    public void play_first(){
        
    }
    
    
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Gamepannel;
    private javax.swing.JButton beginButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton gameButton1;
    private javax.swing.JButton gameButton2;
    private javax.swing.JButton gameButton3;
    private javax.swing.JButton gameButton4;
    private javax.swing.JButton gameButton5;
    private javax.swing.JButton gameButton6;
    private javax.swing.JButton gameButton7;
    private javax.swing.JButton gameButton8;
    private javax.swing.JButton gameButton9;
    // End of variables declaration//GEN-END:variables

    private void first_move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void second_move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void third_move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void fourth_move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void fifth_move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
