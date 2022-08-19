package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.IconAyarlari;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JFrame;


public class HesapEkrani extends javax.swing.JFrame implements IDuzenleyici,IBilgiController {

    public HesapEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public boolean bilgilerGecerlimi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hesapEkraniPanel = new javax.swing.JPanel();
        hosgeldinLabel = new javax.swing.JLabel();
        kullaniciAdSoyadLabel = new javax.swing.JLabel();
        bakiyeLabel = new javax.swing.JLabel();
        paraCekIcon = new javax.swing.JLabel();
        paraYatirIcon = new javax.swing.JLabel();
        havaleIcon = new javax.swing.JLabel();
        odemelerIcon = new javax.swing.JLabel();
        settingsIcon = new javax.swing.JLabel();
        logoutIcon = new javax.swing.JLabel();
        turkishLiraIcon = new javax.swing.JLabel();
        paraYatirButton = new javax.swing.JButton();
        havaleButton = new javax.swing.JButton();
        odemelerButton = new javax.swing.JButton();
        paraCekButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ramil's Bank Hesap Ekrani");

        hesapEkraniPanel.setBackground(new java.awt.Color(204, 204, 204));
        hesapEkraniPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hosgeldinLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hosgeldinLabel.setForeground(new java.awt.Color(51, 51, 255));
        hosgeldinLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hosgeldinLabel.setText("XOŞ GƏLDİNİZ");
        hesapEkraniPanel.add(hosgeldinLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 30, 200, 30));

        kullaniciAdSoyadLabel.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        kullaniciAdSoyadLabel.setForeground(new java.awt.Color(51, 51, 255));
        kullaniciAdSoyadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kullaniciAdSoyadLabel.setText("[Ad, Soyad]");
        hesapEkraniPanel.add(kullaniciAdSoyadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 78, 600, 40));

        bakiyeLabel.setFont(new java.awt.Font("Segoe UI", 1, 54)); // NOI18N
        bakiyeLabel.setText("[Bakiye]");
        hesapEkraniPanel.add(bakiyeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 400, -1));

        paraCekIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/withdrawIcon.png"))); // NOI18N
        hesapEkraniPanel.add(paraCekIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 374, -1, -1));

        paraYatirIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/depositIcon.png"))); // NOI18N
        hesapEkraniPanel.add(paraYatirIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 374, -1, -1));

        havaleIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/transferIcon.png"))); // NOI18N
        hesapEkraniPanel.add(havaleIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 374, -1, -1));

        odemelerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/paymentsIcon.png"))); // NOI18N
        hesapEkraniPanel.add(odemelerIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 374, -1, -1));

        settingsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/settingsIcon.png"))); // NOI18N
        settingsIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsIconMouseClicked(evt);
            }
        });
        hesapEkraniPanel.add(settingsIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 70, 70));

        logoutIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/logoutIcon.png"))); // NOI18N
        logoutIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutIconMouseClicked(evt);
            }
        });
        hesapEkraniPanel.add(logoutIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 70));

        turkishLiraIcon.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        turkishLiraIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/turkishLiraIcon2.png"))); // NOI18N
        hesapEkraniPanel.add(turkishLiraIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 120, 120));

        paraYatirButton.setBackground(new java.awt.Color(204, 255, 204));
        paraYatirButton.setText("Pul Əlavə Et");
        paraYatirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paraYatirButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paraYatirButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paraYatirButtonMouseExited(evt);
            }
        });
        paraYatirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraYatirButtonActionPerformed(evt);
            }
        });
        hesapEkraniPanel.add(paraYatirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, -1, 30));

        havaleButton.setBackground(new java.awt.Color(255, 255, 204));
        havaleButton.setText("Transfer");
        havaleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        havaleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                havaleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                havaleButtonMouseExited(evt);
            }
        });
        havaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                havaleButtonActionPerformed(evt);
            }
        });
        hesapEkraniPanel.add(havaleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, -1, 30));

        odemelerButton.setBackground(new java.awt.Color(204, 255, 255));
        odemelerButton.setText("Ödəmələr");
        odemelerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        odemelerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                odemelerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                odemelerButtonMouseExited(evt);
            }
        });
        odemelerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odemelerButtonActionPerformed(evt);
            }
        });
        hesapEkraniPanel.add(odemelerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, -1, 30));

        paraCekButton.setBackground(new java.awt.Color(255, 204, 204));
        paraCekButton.setText("Pul Çəkmək");
        paraCekButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paraCekButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paraCekButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paraCekButtonMouseExited(evt);
            }
        });
        paraCekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraCekButtonActionPerformed(evt);
            }
        });
        hesapEkraniPanel.add(paraCekButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hesapEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hesapEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    public void getEdits() {
       this.setLocationRelativeTo(null);
       this.setResizable(false);
       this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
       hesapEkraniPanel.setFocusable(true);
       this.kullaniciAdSoyadLabel.setText(getHesapBilgileri().getAdSoyad());
       this.bakiyeLabel.setText(String.valueOf(getHesapBilgileri().getBakiye()));
    }
    
    private void setBgFg(Component c){
        ButtonAyarlari.setBgFg((JButton) c, Color.black, Color.white);
    }
    
    private void paraCekButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraCekButtonMouseEntered
        this.setBgFg(evt.getComponent());
        //IconAyarlari.changeIcon(paraCekIcon, "withdrawIcon2");
    }//GEN-LAST:event_paraCekButtonMouseEntered

    private void paraCekButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraCekButtonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
        //IconAyarlari.setOriginalIcon(paraCekIcon);
    }//GEN-LAST:event_paraCekButtonMouseExited

    private void paraYatirButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraYatirButtonMouseEntered
        this.setBgFg(evt.getComponent());
        //IconAyarlari.changeIcon(paraYatirIcon,"depositIcon2");
    }//GEN-LAST:event_paraYatirButtonMouseEntered

    private void paraYatirButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraYatirButtonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
        //IconAyarlari.setOriginalIcon(paraYatirIcon);
    }//GEN-LAST:event_paraYatirButtonMouseExited

    private void havaleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_havaleButtonMouseEntered
        this.setBgFg(evt.getComponent());
        //IconAyarlari.changeIcon(havaleIcon,"transferIcon2");
    }//GEN-LAST:event_havaleButtonMouseEntered

    private void havaleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_havaleButtonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
        //IconAyarlari.setOriginalIcon(havaleIcon);
    }//GEN-LAST:event_havaleButtonMouseExited

    private void odemelerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_odemelerButtonMouseEntered
        this.setBgFg(evt.getComponent());
        //IconAyarlari.changeIcon(odemelerIcon,"paymentsIcon2");
    }//GEN-LAST:event_odemelerButtonMouseEntered

    private void odemelerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_odemelerButtonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
        //IconAyarlari.setOriginalIcon(odemelerIcon);
    }//GEN-LAST:event_odemelerButtonMouseExited

    private void paraCekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraCekButtonActionPerformed
        ActionAyarlari.setVisible(this,new ParaCekmeEkrani());
    }//GEN-LAST:event_paraCekButtonActionPerformed

    private void paraYatirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraYatirButtonActionPerformed
        ActionAyarlari.setVisible(this,new ParaYatirmaEkrani());
    }//GEN-LAST:event_paraYatirButtonActionPerformed

    private void havaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_havaleButtonActionPerformed
        ActionAyarlari.setVisible(this,new HavaleEkrani());
    }//GEN-LAST:event_havaleButtonActionPerformed

    private void odemelerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odemelerButtonActionPerformed
        ActionAyarlari.setVisible(this,new OdemelerEkrani());
    }//GEN-LAST:event_odemelerButtonActionPerformed

    private void logoutIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutIconMouseClicked
        String question = "Hesabınız sistemdən çıxacaq.\n"
                + "Təsdiq edirsiniz?";
        if(Dialogs.onayMesajiGoster(this, question)==1){
            this.cikisYap();
        }
    }//GEN-LAST:event_logoutIconMouseClicked

    private void cikisYap(){
        getHesapBilgileri().cikisYap();
        ActionAyarlari.setVisible(this, new GirisEkrani());
    }
    
    private void settingsIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsIconMouseClicked
        ActionAyarlari.setVisible(this, new AyarlarEkrani());
    }//GEN-LAST:event_settingsIconMouseClicked

    

    
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
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HesapEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bakiyeLabel;
    private javax.swing.JButton havaleButton;
    private javax.swing.JLabel havaleIcon;
    private javax.swing.JPanel hesapEkraniPanel;
    private javax.swing.JLabel hosgeldinLabel;
    private javax.swing.JLabel kullaniciAdSoyadLabel;
    private javax.swing.JLabel logoutIcon;
    private javax.swing.JButton odemelerButton;
    private javax.swing.JLabel odemelerIcon;
    private javax.swing.JButton paraCekButton;
    private javax.swing.JLabel paraCekIcon;
    private javax.swing.JButton paraYatirButton;
    private javax.swing.JLabel paraYatirIcon;
    private javax.swing.JLabel settingsIcon;
    private javax.swing.JLabel turkishLiraIcon;
    // End of variables declaration//GEN-END:variables

    private JFrame ParaYatirmaEkrani() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
