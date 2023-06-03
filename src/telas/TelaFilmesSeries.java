package telas;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;
import javax.swing.ImageIcon;
import model.Filme;

public class TelaFilmesSeries extends javax.swing.JFrame {

    public TelaFilmesSeries() {
        initComponents();
        esconderMenu();
        esconderpainelAvaliar();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_nota = new javax.swing.JLabel();
        lbl_estrela = new javax.swing.JLabel();
        jPanel_avaliacao = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        lbl_nfnota = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        Panel_menu = new javax.swing.JPanel();
        jLabel_usuario = new javax.swing.JLabel();
        btn_TelaInicial = new javax.swing.JButton();
        btn_ListaAlta = new javax.swing.JButton();
        btn_ListaCategorias = new javax.swing.JButton();
        btn_ListaFavoritos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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

        lbl_nota.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lbl_nota.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nota.setText("?");
        getContentPane().add(lbl_nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 215, 50, 30));

        lbl_estrela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/Star 14.png"))); // NOI18N
        getContentPane().add(lbl_estrela, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 167, -1, -1));

        jPanel_avaliacao.setBackground(new java.awt.Color(30, 30, 30));
        jPanel_avaliacao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/Group 16.png"))); // NOI18N
        jButton1.setBorder(null);
        jPanel_avaliacao.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 236, -1, -1));

        lbl_nfnota.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbl_nfnota.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nfnota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nfnota.setText("Nome do filme");
        lbl_nfnota.setPreferredSize(new java.awt.Dimension(114, 15));
        jPanel_avaliacao.add(lbl_nfnota, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 270, 30));

        jLabel13.setForeground(new java.awt.Color(236, 176, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("SUA AVALIÇÃO ");
        jLabel13.setPreferredSize(new java.awt.Dimension(143, 16));
        jPanel_avaliacao.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 58, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/Star 15.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel_avaliacao.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 140, 32, 32));
        jButton2.setBackground(new java.awt.Color(0, 0, 0, 0));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/Star 15.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel_avaliacao.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 140, 32, 32));
        jButton3.setBackground(new java.awt.Color(0, 0, 0, 0));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/Star 15.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel_avaliacao.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 140, 32, 32));
        jButton4.setBackground(new java.awt.Color(0, 0, 0, 0));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/Star 15.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel_avaliacao.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 140, 32, 32));
        jButton5.setBackground(new java.awt.Color(0, 0, 0, 0));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/Star 15.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel_avaliacao.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 32, 32));
        jButton6.setBackground(new java.awt.Color(0, 0, 0, 0));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/Star 15.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel_avaliacao.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 140, 32, 32));
        jButton7.setBackground(new java.awt.Color(0, 0, 0, 0));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/Star 15.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel_avaliacao.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 140, 32, 32));
        jButton8.setBackground(new java.awt.Color(0, 0, 0, 0));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/Star 15.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel_avaliacao.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 140, 32, 32));
        jButton9.setBackground(new java.awt.Color(0, 0, 0, 0));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/Star 15.png"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel_avaliacao.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 32, 32));
        jButton10.setBackground(new java.awt.Color(0, 0, 0, 0));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/Star 15.png"))); // NOI18N
        jButton11.setBorder(null);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel_avaliacao.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 140, 32, 32));
        jButton11.setBackground(new java.awt.Color(0, 0, 0, 0));

        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("X");
        jButton12.setBorder(null);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel_avaliacao.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 0, 25, 22));
        jButton12.setBackground(new java.awt.Color(0, 0, 0, 0));

        getContentPane().add(jPanel_avaliacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 232, 600, 297));

        Panel_menu.setBackground(new java.awt.Color(0, 0, 0));
        Panel_menu.setPreferredSize(new java.awt.Dimension(270, 768));
        Panel_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_usuario.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel_usuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_usuario.setText("Usuário");
        Panel_menu.add(jLabel_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 33, -1, -1));

        btn_TelaInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens pagina inicial/Group 10_1.png"))); // NOI18N
        btn_TelaInicial.setBorder(null);
        btn_TelaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TelaInicialActionPerformed(evt);
            }
        });
        Panel_menu.add(btn_TelaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 147, -1, -1));
        btn_TelaInicial.setBackground(new java.awt.Color(0, 0, 0, 0));

        btn_ListaAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens pagina inicial/Group 13_1.png"))); // NOI18N
        btn_ListaAlta.setBorder(null);
        Panel_menu.add(btn_ListaAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 402, -1, -1));
        btn_ListaAlta.setBackground(new java.awt.Color(0, 0, 0, 0));

        btn_ListaCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens pagina inicial/Group 12_1.png"))); // NOI18N
        btn_ListaCategorias.setBorder(null);
        btn_ListaCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListaCategoriasActionPerformed(evt);
            }
        });
        Panel_menu.add(btn_ListaCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 286, -1, -1));
        btn_ListaCategorias.setBackground(new java.awt.Color(0, 0, 0, 0));

        btn_ListaFavoritos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens pagina inicial/Group 11_1.png"))); // NOI18N
        btn_ListaFavoritos.setBorder(null);
        Panel_menu.add(btn_ListaFavoritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 218, -1, -1));
        btn_ListaFavoritos.setBackground(new java.awt.Color(0, 0, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens pagina inicial/Line 3.png"))); // NOI18N
        Panel_menu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 371, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens pagina inicial/Line 3.png"))); // NOI18N
        Panel_menu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 118, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens pagina inicial/1486395884-account_80606 1.png"))); // NOI18N
        Panel_menu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 31, -1, -1));

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
        txt_pesquisa.setBackground(new java.awt.Color(0, 0, 0, 0));

        btn_player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/375 1.png"))); // NOI18N
        btn_player.setBorder(null);
        btn_player.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_playerActionPerformed(evt);
            }
        });
        jPanel1.add(btn_player, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 302, -1, -1));
        btn_player.setBackground(new java.awt.Color(0, 0, 0, 0));

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
        btn_pesquisa.setBackground(new java.awt.Color(0, 0, 0, 0));

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
        btn_voltarMenu.setBackground(new java.awt.Color(0, 0, 0, 0));

        btn_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens pagina inicial/dsBuffer 1.png"))); // NOI18N
        btn_menu.setBorder(null);
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });
        jPanel1.add(btn_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 26, -1, -1));
        btn_menu.setBackground(new java.awt.Color(0, 0, 0, 0));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/Group 12.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 450, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/Group 13.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 594, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/Line 3.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 139, -1, -1));

        btn_avaliar.setBackground(new java.awt.Color(0, 0, 0));
        btn_avaliar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/Group 15.png"))); // NOI18N
        btn_avaliar.setBorder(null);
        btn_avaliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_avaliarActionPerformed(evt);
            }
        });
        btn_avaliar.setBackground(new java.awt.Color(0, 0, 0, 0));
        jPanel1.add(btn_avaliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 138, -1, -1));

        btn_favorito.setBackground(new java.awt.Color(0, 0, 0));
        btn_favorito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens tela filmes/Group 14.png"))); // NOI18N
        btn_favorito.setBorder(null);
        jPanel1.add(btn_favorito, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 138, -1, -1));
        btn_favorito.setBackground(new java.awt.Color(0, 0, 0, 0));

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

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        mostrarnota(10);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        mostrarnota(4);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mostrarnota(7);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_avaliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_avaliarActionPerformed
        aparecerpainelAvaliar();
    }//GEN-LAST:event_btn_avaliarActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        esconderpainelAvaliar();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        mostrarnota(1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        mostrarnota(2);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        mostrarnota(3);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        mostrarnota(5);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        mostrarnota(6);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        mostrarnota(8);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        mostrarnota(9);
    }//GEN-LAST:event_jButton7ActionPerformed

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
    private javax.swing.JButton btn_voltarMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel_avaliacao;
    private javax.swing.JLabel jLabel_capa;
    private javax.swing.JLabel jLabel_capa_trailer;
    private javax.swing.JLabel jLabel_onde_assistir;
    private javax.swing.JLabel jLabel_onde_assistir_url;
    private javax.swing.JLabel jLabel_sinopse;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JLabel jLabel_usuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_avaliacao;
    private javax.swing.JLabel lbl_estrela;
    private javax.swing.JLabel lbl_nfnota;
    private javax.swing.JLabel lbl_nota;
    private javax.swing.JTextField txt_pesquisa;
    // End of variables declaration//GEN-END:variables

    private void esconderMenu() {
        btn_voltarMenu.setVisible(false);
        Panel_menu.setVisible(false);
    }

    private void aparecerMenu() {
        Panel_menu.setVisible(true);
        btn_voltarMenu.setVisible(true);
    }

    private void esconderpainelAvaliar() {
        lbl_estrela.setVisible(false);
        lbl_nota.setVisible(false);
        jPanel_avaliacao.setVisible(false);
    }

    private void aparecerpainelAvaliar() {
        lbl_estrela.setVisible(true);
        lbl_nota.setVisible(true);
        jPanel_avaliacao.setVisible(true);
    }

    private void mostrarnota(int nota) {
        lbl_nota.setText(Integer.toString(nota));
    }

    public void dadosFilme(List<Filme> filmes) throws MalformedURLException {

        for (Filme filme : filmes) {
            jLabel_onde_assistir.setText(filme.getOndeAssistir());
            jLabel_sinopse.setText("<html>" + filme.getSinopse() + "<html>");
            jLabel_titulo.setText(filme.getTitulo());
            lbl_nfnota.setText(filme.getTitulo());
            jLabel_avaliacao.setText(Double.toString(filme.getMediaAvaliacao()));

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
