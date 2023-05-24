




public class Login extends javax.swing.JFrame {

  
    public Login() {
        initComponents();
        personalizacao();
        personalizacaoPanel2();
        jPanel_registro.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_registro = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_regis_email = new javax.swing.JTextField();
        txt_regis_usuario = new javax.swing.JTextField();
        txt_regis_senha = new javax.swing.JTextField();
        btn_cadastrar = new javax.swing.JButton();
        btn_voltar_entrar = new javax.swing.JButton();
        btn_registro = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel_login = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_senha = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        btn_entrar = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_registro.setOpaque(false);
        jPanel_registro.setPreferredSize(new java.awt.Dimension(549, 631));
        jPanel_registro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Usuário");
        jPanel_registro.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 153, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("E-mail");
        jPanel_registro.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 265, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Senha");
        jPanel_registro.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 372, -1, -1));

        txt_regis_email.setForeground(new java.awt.Color(255, 255, 255));
        txt_regis_email.setBorder(null);
        txt_regis_email.setPreferredSize(new java.awt.Dimension(439, 46));
        jPanel_registro.add(txt_regis_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 311, -1, -1));

        txt_regis_usuario.setForeground(new java.awt.Color(255, 255, 255));
        txt_regis_usuario.setBorder(null);
        txt_regis_usuario.setPreferredSize(new java.awt.Dimension(439, 46));
        jPanel_registro.add(txt_regis_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 198, -1, -1));

        txt_regis_senha.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        txt_regis_senha.setForeground(new java.awt.Color(255, 255, 255));
        txt_regis_senha.setBorder(null);
        txt_regis_senha.setPreferredSize(new java.awt.Dimension(439, 46));
        jPanel_registro.add(txt_regis_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 411, -1, -1));

        btn_cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Group 4.png"))); // NOI18N
        btn_cadastrar.setBorder(null);
        jPanel_registro.add(btn_cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 501, -1, -1));

        btn_voltar_entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Group 5.png"))); // NOI18N
        btn_voltar_entrar.setBorder(null);
        btn_voltar_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltar_entrarActionPerformed(evt);
            }
        });
        jPanel_registro.add(btn_voltar_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 12, -1, -1));

        btn_registro.setForeground(new java.awt.Color(255, 255, 255));
        btn_registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Group 3.png"))); // NOI18N
        btn_registro.setBorder(null);
        jPanel_registro.add(btn_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 12, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Rectangle 1.png"))); // NOI18N
        jPanel_registro.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 73, -1, -1));

        jPanel_login.setOpaque(false);
        jPanel_login.setPreferredSize(new java.awt.Dimension(549, 631));
        jPanel_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuário");
        jPanel_login.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 148, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha");
        jPanel_login.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 272, -1, -1));

        txt_usuario.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(255, 255, 255));
        txt_usuario.setBorder(null);
        txt_usuario.setPreferredSize(new java.awt.Dimension(439, 46));
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        jPanel_login.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 198, -1, -1));

        txt_senha.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        txt_senha.setForeground(new java.awt.Color(255, 255, 255));
        txt_senha.setBorder(null);
        txt_senha.setPreferredSize(new java.awt.Dimension(439, 46));
        jPanel_login.add(txt_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        btn_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Registrar.png"))); // NOI18N
        btn_registrar.setBorder(null);
        btn_registrar.setPreferredSize(new java.awt.Dimension(198, 62));
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        jPanel_login.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 12, -1, -1));

        btn_entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Group 2.png"))); // NOI18N
        btn_entrar.setBorder(null);
        jPanel_login.add(btn_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 12, -1, -1));

        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Group 1.png"))); // NOI18N
        btn_login.setBorder(null);
        jPanel_login.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 425, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Rectangle 1.png"))); // NOI18N
        jPanel_login.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 73, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Filmes-series-saude 1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
      jPanel_registro.setVisible(true);
      jPanel_login.setVisible(false);
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_voltar_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltar_entrarActionPerformed
        jPanel_login.setVisible(true);
        jPanel_registro.setVisible(false);     
    }//GEN-LAST:event_btn_voltar_entrarActionPerformed

 
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
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_entrar;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_registro;
    private javax.swing.JButton btn_voltar_entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel_login;
    private javax.swing.JPanel jPanel_registro;
    private javax.swing.JTextField txt_regis_email;
    private javax.swing.JTextField txt_regis_senha;
    private javax.swing.JTextField txt_regis_usuario;
    private javax.swing.JTextField txt_senha;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
private void personalizacao(){
        txt_usuario.setBackground(new java.awt.Color(217,217,217,70));
        txt_senha.setBackground(new java.awt.Color(217,217,217,70));
        btn_login.setBackground(new java.awt.Color(0,0,0,0));
        btn_entrar.setBackground(new java.awt.Color(0,0,0,0));
        btn_registrar.setBackground(new java.awt.Color(0,0,0,0));
}
private void personalizacaoPanel2(){
        txt_regis_email.setBackground(new java.awt.Color(217,217,217,70));
        txt_regis_senha.setBackground(new java.awt.Color(217,217,217,70));
        txt_regis_usuario.setBackground(new java.awt.Color(217,217,217,70));
        btn_cadastrar.setBackground(new java.awt.Color(0,0,0,0));
        btn_voltar_entrar.setBackground(new java.awt.Color(0,0,0,0));
        btn_registro.setBackground(new java.awt.Color(0,0,0,0));
}
}


