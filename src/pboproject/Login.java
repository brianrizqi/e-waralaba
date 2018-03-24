/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboproject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Brian R
 */
public class Login extends javax.swing.JFrame {

    private String userToko = "admintoko";
    private String passToko = "admintoko";
    private String userGudang = "admingudang";
    private String passGudang = "admingudang";
    private String user, pass;

    public Login() {
        initComponents();
        btnLogin.setBackground(new Color(0, 0, 0, 0));
        this.setLocationRelativeTo(null);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                user = username.getText();
                pass = password.getText();
                if (user.equalsIgnoreCase(userToko) && pass.equals(passToko)) {
                    dispose();
                    v_Toko toko = new v_Toko();
                    toko.setVisible(true);
                } else if (user.equalsIgnoreCase(userGudang) && pass.equals(passGudang)) {
                    dispose();
                    v_Gudang gudang = new v_Gudang();
                    gudang.setVisible(true);
                } else {
                    loginError(ae);
                }
            }
        });
        showPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                showPass();
            }
        });

    }

    private void loginError(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "Username / Password anda salah !1!1");
    }

    private void showPass() {
        if (showPassword.isSelected()) {
            password.setEchoChar((char) 0);
        } else {
            password.setEchoChar('*');
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        showPassword = new javax.swing.JCheckBox();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("E-Waralaba");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 280, 40));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 280, 40));

        showPassword.setText("Show Password");
        getContentPane().add(showPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnLogin.png"))); // NOI18N
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 419, 120, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgLogin.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
