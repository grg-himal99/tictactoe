/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttt;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author ggmu
 */
public class TTTFrame extends javax.swing.JFrame {

    /**
     * Creates new form TTTFrame
     */
    private String whoseturn = "X";
    private String player1 = "player one";
    private String player2 = "player two";
    private int playeronecount = 0;
    private int playertwocount = 0;
    private String playersTurn = "";

    public TTTFrame() {
        initComponents();
        setSize(600, 600);
        getPlayersName();
        setPlayerName();
        setScore();
        setLocationRelativeTo(null);
    }

    private void getPlayersName() {
        player1 = JOptionPane.showInputDialog(this, "Enter Player1 Name ", "Player Name", JOptionPane.INFORMATION_MESSAGE);
        player2 = JOptionPane.showInputDialog(this, "Enter Player2 Name ", "Player Name", JOptionPane.INFORMATION_MESSAGE);
        if (player1.equals(" ")) {
            player1 = "player one";
        }
        if (player2.equals(" ")) {
            player2 = "player Two";
        }
    }

    private void determineWhoseTurn() {
        if (whoseturn.equalsIgnoreCase("X")) {
            whoseturn = "o";
        } else {
            whoseturn = "X";
        }
    }

    private void setScore() {
        jLabel_score.setText(player1 + ":-" + String.valueOf(playeronecount) + "\t     " + playersTurn +"'s Move     " + player2 + ":-" + String.valueOf(playertwocount));

    }

    private void setPlayerName() {
        if (whoseturn.equals("X")) {
            playersTurn = player1;
        } else {
            playersTurn = player2;
        }
        jLabel_score.setText(player1 + ":-" + String.valueOf(playeronecount) + "\t     "  + playersTurn +"'s Move   " + player2 + ":-" + String.valueOf(playertwocount));

    }

    private void tieGame() {
        String one = jButton1.getText();
        String two = jButton2.getText();
        String three = jButton3.getText();
        String four = jButton6.getText();
        String five = jButton5.getText();
        String six = jButton4.getText();
        String seven = jButton7.getText();
        String eight = jButton8.getText();
        String nine = jButton9.getText();
        if (one != "" && two != "" && three != "" && four != "" && five != "" && six != "" && seven != "" && eight != "" && nine != "") {
            JOptionPane.showMessageDialog(this, "The game is Tie", "Tie Game", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }
    }

    private void resetGame() {
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        setScore();
    }

    private void xwins() {
        JOptionPane.showMessageDialog(this, player1 + " wins", "winner", JOptionPane.INFORMATION_MESSAGE);
        playeronecount++;
        resetGame();
    }

    private void owins() {
        JOptionPane.showMessageDialog(this, player2 + " wins", "winner", JOptionPane.INFORMATION_MESSAGE);
        playertwocount++;
        resetGame();
    }

    private void determineIfWins() {
        String one = jButton1.getText();
        String two = jButton2.getText();
        String three = jButton3.getText();
        String four = jButton6.getText();
        String five = jButton5.getText();
        String six = jButton4.getText();
        String seven = jButton7.getText();
        String eight = jButton8.getText();
        String nine = jButton9.getText();
        if (one == "X" && two == "X" && three == "X") {
            xwins();
        }
        if (four == "X" && five == "X" && six == "X") {
            xwins();
        }
        if (seven == "X" && eight == "X" && nine == "X") {
            xwins();
        }
        if (one == "X" && five == "X" && nine == "X") {
            xwins();
        }
        if (three == "X" && five == "X" && seven == "X") {
            xwins();
        }
        if (one == "X" && four == "X" && seven == "X") {
            xwins();
        }
        if (two == "X" && five == "X" && eight == "X") {
            xwins();
        }
        if (three == "X" && six == "X" && nine == "X") {
            xwins();
        }
        if (one == "o" && two == "o" && three == "o") {
            xwins();
        }
        if (four == "o" && five == "o" && six == "o") {
            owins();
        }
        if (seven == "o" && eight == "o" && nine == "o") {
            owins();
        }
        if (one == "o" && five == "o" && nine == "o") {
            owins();
        }
        if (three == "o" && five == "o" && seven == "o") {
            owins();
        }
        if (one == "o" && four == "o" && seven == "o") {
            owins();
        }
        if (two == "o" && five == "o" && eight == "o") {
            owins();
        }
        if (three == "o" && six == "o" && nine == "o") {
            owins();
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

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_score = new javax.swing.JLabel();
        jPanel_GridHolder = new javax.swing.JPanel();
        Panel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Panel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        Panel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        Panel4 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        Panel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        Panel6 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        Panel7 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        Panel8 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        Panel9 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel_score.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_score.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_score.setText("Press holder for scores");
        jPanel1.add(jLabel_score, java.awt.BorderLayout.PAGE_END);

        jPanel_GridHolder.setBackground(new java.awt.Color(204, 204, 204));
        jPanel_GridHolder.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        Panel1.setBackground(new java.awt.Color(255, 255, 255));
        Panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel1.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Panel1.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(Panel1);

        Panel2.setBackground(new java.awt.Color(255, 255, 255));
        Panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel2.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Panel2.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(Panel2);

        Panel3.setBackground(new java.awt.Color(255, 255, 255));
        Panel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel3.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Panel3.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(Panel3);

        Panel4.setBackground(new java.awt.Color(255, 255, 255));
        Panel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel4.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Panel4.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(Panel4);

        Panel5.setBackground(new java.awt.Color(255, 255, 255));
        Panel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel5.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Panel5.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(Panel5);

        Panel6.setBackground(new java.awt.Color(255, 255, 255));
        Panel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel6.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Panel6.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(Panel6);

        Panel7.setBackground(new java.awt.Color(255, 255, 255));
        Panel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel7.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Panel7.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(Panel7);

        Panel8.setBackground(new java.awt.Color(255, 255, 255));
        Panel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel8.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Panel8.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(Panel8);

        Panel9.setBackground(new java.awt.Color(255, 255, 255));
        Panel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel9.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        Panel9.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(Panel9);

        jPanel1.add(jPanel_GridHolder, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jButton1.setText(whoseturn);
        if (whoseturn.equalsIgnoreCase("X")) {
            jButton1.setForeground(Color.red);
        } else {
            jButton1.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWins();
        setPlayerName();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton2.setText(whoseturn);
        if (whoseturn.equalsIgnoreCase("X")) {
            jButton2.setForeground(Color.red);
        } else {
            jButton2.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWins();
        tieGame();
        setPlayerName();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton3.setText(whoseturn);
        if (whoseturn.equalsIgnoreCase("X")) {
            jButton3.setForeground(Color.red);
        } else {
            jButton3.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWins();
        tieGame();
        setPlayerName();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jButton6.setText(whoseturn);
        if (whoseturn.equalsIgnoreCase("X")) {
            jButton6.setForeground(Color.red);
        } else {
            jButton6.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWins();
        tieGame();
        setPlayerName();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jButton5.setText(whoseturn);
        if (whoseturn.equalsIgnoreCase("X")) {
            jButton5.setForeground(Color.red);
        } else {
            jButton5.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWins();
        tieGame();
        setPlayerName();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jButton4.setText(whoseturn);
        if (whoseturn.equalsIgnoreCase("X")) {
            jButton4.setForeground(Color.red);
        } else {
            jButton4.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWins();
        tieGame();
        setPlayerName();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jButton7.setText(whoseturn);
        if (whoseturn.equalsIgnoreCase("X")) {
            jButton7.setForeground(Color.red);
        } else {
            jButton7.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWins();
        tieGame();
        setPlayerName();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jButton8.setText(whoseturn);
        if (whoseturn.equalsIgnoreCase("X")) {
            jButton8.setForeground(Color.red);
        } else {
            jButton8.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWins();
        tieGame();
        setPlayerName();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jButton9.setText(whoseturn);
        if (whoseturn.equalsIgnoreCase("X")) {
            jButton9.setForeground(Color.red);
        } else {
            jButton9.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWins();
        tieGame();
        setPlayerName();
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(TTTFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TTTFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TTTFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TTTFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TTTFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel4;
    private javax.swing.JPanel Panel5;
    private javax.swing.JPanel Panel6;
    private javax.swing.JPanel Panel7;
    private javax.swing.JPanel Panel8;
    private javax.swing.JPanel Panel9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_score;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_GridHolder;
    // End of variables declaration//GEN-END:variables
}