/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetoaps;

/**
 *
 * @author Guilherme
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public TelaCadastro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        campoLogin = new javax.swing.JLabel();
        usuarioLogin = new javax.swing.JTextField();
        campoUsuario = new javax.swing.JLabel();
        campoUsuario4 = new javax.swing.JLabel();
        campoUsuario1 = new javax.swing.JLabel();
        campoUsuario3 = new javax.swing.JLabel();
        campoUsuario6 = new javax.swing.JLabel();
        campoUsuario7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        usuarioLogin1 = new javax.swing.JTextField();
        usuarioLogin2 = new javax.swing.JTextField();
        usuarioLogin7 = new javax.swing.JTextField();
        usuarioLogin3 = new javax.swing.JTextField();
        usuarioLogin4 = new javax.swing.JTextField();
        usuarioLogin5 = new javax.swing.JTextField();
        usuarioLogin6 = new javax.swing.JTextField();
        campoUsuario2 = new javax.swing.JLabel();
        campoUsuario5 = new javax.swing.JLabel();
        painelMenu = new javax.swing.JLabel();
        fundoTelaLogin = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoLogin.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        campoLogin.setForeground(new java.awt.Color(255, 255, 255));
        campoLogin.setText("Cadastro");
        getContentPane().add(campoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        usuarioLogin.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        usuarioLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioLoginActionPerformed(evt);
            }
        });
        getContentPane().add(usuarioLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 440, 20));

        campoUsuario.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        campoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        campoUsuario.setText("RG:");
        getContentPane().add(campoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 40, 20));

        campoUsuario4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        campoUsuario4.setForeground(new java.awt.Color(255, 255, 255));
        campoUsuario4.setText("CPF:");
        getContentPane().add(campoUsuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 50, 20));

        campoUsuario1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        campoUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        campoUsuario1.setText("Telefone:");
        getContentPane().add(campoUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 90, 20));

        campoUsuario3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        campoUsuario3.setForeground(new java.awt.Color(255, 255, 255));
        campoUsuario3.setText("Email:");
        getContentPane().add(campoUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 60, 20));

        campoUsuario6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        campoUsuario6.setForeground(new java.awt.Color(255, 255, 255));
        campoUsuario6.setText("Cidade:");
        getContentPane().add(campoUsuario6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 110, 20));

        campoUsuario7.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        campoUsuario7.setForeground(new java.awt.Color(255, 255, 255));
        campoUsuario7.setText("Codigo:");
        getContentPane().add(campoUsuario7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, 130, 20));

        jButton1.setText("Cadastrar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 590, 110, 30));

        usuarioLogin1.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        usuarioLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioLogin1ActionPerformed(evt);
            }
        });
        getContentPane().add(usuarioLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 430, 20));

        usuarioLogin2.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        usuarioLogin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioLogin2ActionPerformed(evt);
            }
        });
        getContentPane().add(usuarioLogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 390, 20));

        usuarioLogin7.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        usuarioLogin7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioLogin7ActionPerformed(evt);
            }
        });
        getContentPane().add(usuarioLogin7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 400, 20));

        usuarioLogin3.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        usuarioLogin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioLogin3ActionPerformed(evt);
            }
        });
        getContentPane().add(usuarioLogin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 420, 20));

        usuarioLogin4.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        usuarioLogin4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioLogin4ActionPerformed(evt);
            }
        });
        getContentPane().add(usuarioLogin4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 400, 20));

        usuarioLogin5.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N
        usuarioLogin5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioLogin5ActionPerformed(evt);
            }
        });
        getContentPane().add(usuarioLogin5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 400, 20));

        usuarioLogin6.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        usuarioLogin6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioLogin6ActionPerformed(evt);
            }
        });
        getContentPane().add(usuarioLogin6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 320, 20));

        campoUsuario2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        campoUsuario2.setForeground(new java.awt.Color(255, 255, 255));
        campoUsuario2.setText("Estado:");
        getContentPane().add(campoUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 130, 20));

        campoUsuario5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        campoUsuario5.setForeground(new java.awt.Color(255, 255, 255));
        campoUsuario5.setText("Nome completo:");
        getContentPane().add(campoUsuario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 150, 20));

        painelMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Guilherme\\OneDrive\\Imagens\\painel-login.png")); // NOI18N
        getContentPane().add(painelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        fundoTelaLogin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Guilherme\\OneDrive\\Imagens\\Tela Login.jpg")); // NOI18N
        getContentPane().add(fundoTelaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioLoginActionPerformed

    private void usuarioLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioLogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioLogin1ActionPerformed

    private void usuarioLogin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioLogin2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioLogin2ActionPerformed

    private void usuarioLogin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioLogin3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioLogin3ActionPerformed

    private void usuarioLogin4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioLogin4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioLogin4ActionPerformed

    private void usuarioLogin5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioLogin5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioLogin5ActionPerformed

    private void usuarioLogin6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioLogin6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioLogin6ActionPerformed

    private void usuarioLogin7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioLogin7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioLogin7ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel campoLogin;
    private javax.swing.JLabel campoUsuario;
    private javax.swing.JLabel campoUsuario1;
    private javax.swing.JLabel campoUsuario2;
    private javax.swing.JLabel campoUsuario3;
    private javax.swing.JLabel campoUsuario4;
    private javax.swing.JLabel campoUsuario5;
    private javax.swing.JLabel campoUsuario6;
    private javax.swing.JLabel campoUsuario7;
    private javax.swing.JLabel fundoTelaLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel painelMenu;
    private javax.swing.JTextField usuarioLogin;
    private javax.swing.JTextField usuarioLogin1;
    private javax.swing.JTextField usuarioLogin2;
    private javax.swing.JTextField usuarioLogin3;
    private javax.swing.JTextField usuarioLogin4;
    private javax.swing.JTextField usuarioLogin5;
    private javax.swing.JTextField usuarioLogin6;
    private javax.swing.JTextField usuarioLogin7;
    // End of variables declaration//GEN-END:variables
}
