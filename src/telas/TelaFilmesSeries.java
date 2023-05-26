package telas;

public class TelaFilmesSeries extends javax.swing.JFrame {


    public TelaFilmesSeries() {
        initComponents();
        personBarraMenu();
        esconderMenu();
        personTelaFilmes();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_menu = new javax.swing.JPanel();
        btn_TelaInicial = new javax.swing.JButton();
        btn_ListaAlta = new javax.swing.JButton();
        btn_ListaCategorias = new javax.swing.JButton();
        btn_ListaFavoritos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_usuario = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_pesquisa = new javax.swing.JTextField();
        btn_pesquisa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_voltarMenu = new javax.swing.JButton();
        btn_menu = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_avaliar = new javax.swing.JButton();
        btn_favorito = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_menu.setBackground(new java.awt.Color(0, 0, 0));
        Panel_menu.setPreferredSize(new java.awt.Dimension(270, 768));
        Panel_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_TelaInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens pagina inicial/Group 10_1.png"))); // NOI18N
        btn_TelaInicial.setBorder(null);
        btn_TelaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TelaInicialActionPerformed(evt);
            }
        });
        Panel_menu.add(btn_TelaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 147, -1, -1));

        btn_ListaAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens pagina inicial/Group 13_1.png"))); // NOI18N
        btn_ListaAlta.setBorder(null);
        Panel_menu.add(btn_ListaAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 402, -1, -1));

        btn_ListaCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens pagina inicial/Group 12_1.png"))); // NOI18N
        btn_ListaCategorias.setBorder(null);
        btn_ListaCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListaCategoriasActionPerformed(evt);
            }
        });
        Panel_menu.add(btn_ListaCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 286, -1, -1));

        btn_ListaFavoritos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens pagina inicial/Group 11_1.png"))); // NOI18N
        btn_ListaFavoritos.setBorder(null);
        Panel_menu.add(btn_ListaFavoritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 218, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens pagina inicial/Line 3.png"))); // NOI18N
        Panel_menu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 371, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens pagina inicial/Line 3.png"))); // NOI18N
        Panel_menu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 118, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens pagina inicial/1486395884-account_80606 1.png"))); // NOI18N
        Panel_menu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 31, -1, -1));

        btn_usuario.setBackground(new java.awt.Color(0, 0, 0));
        btn_usuario.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        btn_usuario.setForeground(new java.awt.Color(255, 255, 255));
        btn_usuario.setText("Usuário");
        btn_usuario.setBorder(null);
        Panel_menu.add(btn_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 36, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens pagina inicial/Rectangle 8_1.png"))); // NOI18N
        Panel_menu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Panel_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_pesquisa.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txt_pesquisa.setText("Pesquisar filmes e séries ");
        txt_pesquisa.setBorder(null);
        txt_pesquisa.setPreferredSize(new java.awt.Dimension(680, 30));
        jPanel1.add(txt_pesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 30, -1, -1));

        btn_pesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens pagina inicial/57477 1.png"))); // NOI18N
        btn_pesquisa.setBorder(null);
        jPanel1.add(btn_pesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1064, 27, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens pagina inicial/Group 9.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 19, -1, -1));

        btn_voltarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens pagina inicial/dsBuffer 1.png"))); // NOI18N
        btn_voltarMenu.setBorder(null);
        btn_voltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btn_voltarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 29, -1, -1));

        btn_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens pagina inicial/dsBuffer 1.png"))); // NOI18N
        btn_menu.setBorder(null);
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });
        jPanel1.add(btn_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 26, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/Group 12.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 450, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/Group 13.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 594, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/Line 3.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 139, -1, -1));

        btn_avaliar.setBackground(new java.awt.Color(0, 0, 0));
        btn_avaliar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/Group 15.png"))); // NOI18N
        btn_avaliar.setBorder(null);
        jPanel1.add(btn_avaliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 138, -1, -1));

        btn_favorito.setBackground(new java.awt.Color(0, 0, 0));
        btn_favorito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/Group 14.png"))); // NOI18N
        btn_favorito.setBorder(null);
        jPanel1.add(btn_favorito, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 138, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/Star 11.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 138, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("0,0/10");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 140, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/Rectangle 8.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 233, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/Rectangle 10.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 233, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ListaCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListaCategoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ListaCategoriasActionPerformed

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
       aparecerMenu();
       btn_menu.setVisible(false);
    }//GEN-LAST:event_btn_menuActionPerformed

    private void btn_voltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarMenuActionPerformed
       esconderMenu();
       btn_menu.setVisible(true);
    }//GEN-LAST:event_btn_voltarMenuActionPerformed

    private void btn_TelaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TelaInicialActionPerformed
        new PaginaInicial().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_TelaInicialActionPerformed


    public static void main(String args[]) {
        

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaFilmesSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFilmesSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFilmesSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFilmesSeries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFilmesSeries().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_menu;
    private javax.swing.JButton btn_ListaAlta;
    private javax.swing.JButton btn_ListaCategorias;
    private javax.swing.JButton btn_ListaFavoritos;
    private javax.swing.JButton btn_TelaInicial;
    private javax.swing.JButton btn_avaliar;
    private javax.swing.JButton btn_favorito;
    private javax.swing.JButton btn_menu;
    private javax.swing.JButton btn_pesquisa;
    private javax.swing.JButton btn_usuario;
    private javax.swing.JButton btn_voltarMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_pesquisa;
    // End of variables declaration//GEN-END:variables

    private void personTelaFilmes(){
        btn_menu.setBackground(new java.awt.Color(0,0,0,0));
        txt_pesquisa.setBackground(new java.awt.Color(0,0,0,0));
        btn_pesquisa.setBackground(new java.awt.Color(0,0,0,0));
        btn_favorito.setBackground(new java.awt.Color(0,0,0,0));
        btn_avaliar.setBackground(new java.awt.Color(0,0,0,0));
    }
    
    private void personBarraMenu(){
        btn_ListaAlta.setBackground(new java.awt.Color(0,0,0,0));
        btn_ListaCategorias.setBackground(new java.awt.Color(0,0,0,0));
        btn_ListaFavoritos.setBackground(new java.awt.Color(0,0,0,0));
        btn_TelaInicial.setBackground(new java.awt.Color(0,0,0,0));
        btn_usuario.setBackground(new java.awt.Color(0,0,0,0));
        btn_voltarMenu.setBackground(new java.awt.Color(0,0,0,0));
    }
    
    private void esconderMenu(){
        btn_voltarMenu.setVisible(false);
        Panel_menu.setVisible(false);
    }
    
    private void aparecerMenu(){
       Panel_menu.setVisible(true);
       btn_voltarMenu.setVisible(true);
    }
}
