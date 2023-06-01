package telas;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import model.Filme;

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
        btn_player = new javax.swing.JButton();
        jLabel_titulo = new javax.swing.JLabel();
        jLabel_onde_assistir_url = new javax.swing.JLabel();
        jLabel_onde_assistir = new javax.swing.JLabel();
        jLabel_sinopse = new javax.swing.JLabel();
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
        jLabel_avaliacao = new javax.swing.JLabel();
        jLabel_capa = new javax.swing.JLabel();
        jLabel_capa_trailer = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

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

        btn_player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/375 1.png"))); // NOI18N
        btn_player.setBorder(null);
        btn_player.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_playerActionPerformed(evt);
            }
        });
        jPanel1.add(btn_player, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 302, -1, -1));

        jLabel_titulo.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel_titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_titulo.setPreferredSize(new java.awt.Dimension(206, 23));
        jPanel1.add(jLabel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 142, -1, -1));

        jLabel_onde_assistir_url.setPreferredSize(new java.awt.Dimension(43, 39));
        jPanel1.add(jLabel_onde_assistir_url, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 649, -1, -1));

        jLabel_onde_assistir.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel_onde_assistir.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_onde_assistir.setPreferredSize(new java.awt.Dimension(125, 32));
        jPanel1.add(jLabel_onde_assistir, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 653, -1, -1));

        jLabel_sinopse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel_sinopse.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_sinopse.setPreferredSize(new java.awt.Dimension(650, 116));
        jPanel1.add(jLabel_sinopse, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 478, -1, -1));

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

        jLabel_avaliacao.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_avaliacao.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel_avaliacao.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_avaliacao.setText("0,0");
        jPanel1.add(jLabel_avaliacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 140, -1, -1));

        jLabel_capa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/Rectangle 8.png"))); // NOI18N
        jPanel1.add(jLabel_capa, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 233, 137, 203));

        jLabel_capa_trailer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/Rectangle 10.png"))); // NOI18N
        jPanel1.add(jLabel_capa_trailer, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 233, 362, 203));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/Rectangle 2.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 642, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("/10");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, -1, -1));

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

    private void btn_playerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_playerActionPerformed

    }//GEN-LAST:event_btn_playerActionPerformed

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
    private javax.swing.JButton btn_player;
    private javax.swing.JButton btn_usuario;
    private javax.swing.JButton btn_voltarMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_avaliacao;
    private javax.swing.JLabel jLabel_capa;
    private javax.swing.JLabel jLabel_capa_trailer;
    private javax.swing.JLabel jLabel_onde_assistir;
    private javax.swing.JLabel jLabel_onde_assistir_url;
    private javax.swing.JLabel jLabel_sinopse;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_pesquisa;
    // End of variables declaration//GEN-END:variables

    private void personTelaFilmes() {
        btn_menu.setBackground(new java.awt.Color(0, 0, 0, 0));
        txt_pesquisa.setBackground(new java.awt.Color(0, 0, 0, 0));
        btn_pesquisa.setBackground(new java.awt.Color(0, 0, 0, 0));
        btn_favorito.setBackground(new java.awt.Color(0, 0, 0, 0));
        btn_avaliar.setBackground(new java.awt.Color(0, 0, 0, 0));
        btn_player.setBackground(new java.awt.Color(0, 0, 0, 0));
    }

    private void personBarraMenu() {
        btn_ListaAlta.setBackground(new java.awt.Color(0, 0, 0, 0));
        btn_ListaCategorias.setBackground(new java.awt.Color(0, 0, 0, 0));
        btn_ListaFavoritos.setBackground(new java.awt.Color(0, 0, 0, 0));
        btn_TelaInicial.setBackground(new java.awt.Color(0, 0, 0, 0));
        btn_usuario.setBackground(new java.awt.Color(0, 0, 0, 0));
        btn_voltarMenu.setBackground(new java.awt.Color(0, 0, 0, 0));
    }

    private void esconderMenu() {
        btn_voltarMenu.setVisible(false);
        Panel_menu.setVisible(false);
    }

    private void aparecerMenu() {
        Panel_menu.setVisible(true);
        btn_voltarMenu.setVisible(true);
    }

    public void dadosFilme(List<Filme> filmes) throws MalformedURLException {

        for (Filme filme : filmes) {
            jLabel_onde_assistir.setText(filme.getOndeAssistir());
            jLabel_sinopse.setText("<html>" + filme.getSinopse() + "<html>");
            jLabel_titulo.setText(filme.getTitulo());
            jLabel_avaliacao.setText(String.valueOf(filme.getMediaAvaliacao()));

            String urlcapa = filme.getCapa();
            ImageIcon imagecapa = new ImageIcon(new URL(urlcapa));
            jLabel_capa.setIcon(imagecapa);

            String urlcapatrailer = filme.getCapaTrailer();
            ImageIcon imagetrailer = new ImageIcon(new URL(urlcapatrailer));
            jLabel_capa_trailer.setIcon(imagetrailer);

            String urlondeassistir = filme.getOndeAssistirUrl();
            ImageIcon imageondeasst = new ImageIcon(new URL(urlondeassistir));
            jLabel_onde_assistir_url.setIcon(imageondeasst);

            String urltrailer = filme.getUrlTrailer();
            btn_player.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        URI uri = new URI(urltrailer);
                        Desktop.getDesktop().browse(uri);
                    } catch (Exception ex) {
                        ex.printStackTrace();

                    }
                }
            });
        }
    }
}
