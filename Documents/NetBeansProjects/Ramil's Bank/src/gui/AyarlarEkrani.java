package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.TelNoYenileme;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.IconAyarlari;
import gui.ayarlar.TextAyarlari;
import javax.swing.JOptionPane;


public class AyarlarEkrani extends javax.swing.JFrame implements IDuzenleyici,IBilgiController {
    private TelNoYenileme telNoYenilemeObject=null;
    private String eskiTelNo=null;
    public AyarlarEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        ayarlarEkraniPanel.setFocusable(true); 
        TextAyarlari.setOnlyNumber(telNoText);
        TextAyarlari.setMaxLimit(telNoText, 11);
        this.telNoText.setText(getHesapBilgileri().getTelNo());
        this.eskiTelNo=telNoText.getText();
        this.kullaniciAdiSoyadiLabel.setText("Hörmətli "+getHesapBilgileri().getAdSoyad());
    }

    @Override
    public boolean bilgilerGecerlimi() {
        return !(this.telNoText.getText().equals(""));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public TelNoYenileme getTelNoYenilemeObject() {
        if(this.telNoYenilemeObject==null){
            telNoYenilemeObject=new TelNoYenileme();
        }
        return telNoYenilemeObject;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ayarlarEkraniPanel = new javax.swing.JPanel();
        geriIcon = new javax.swing.JLabel();
        kullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        mesajTelNoLabel = new javax.swing.JLabel();
        telNoText = new javax.swing.JTextField();
        telNoDegistirIcon = new javax.swing.JLabel();
        mesajSifreLabel = new javax.swing.JLabel();
        sifreText = new javax.swing.JTextField();
        sifreDegistirIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ramil's Bank Ayarlar Ekrani");

        ayarlarEkraniPanel.setBackground(new java.awt.Color(255, 255, 204));

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });

        kullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kullaniciAdiSoyadiLabel.setForeground(new java.awt.Color(255, 51, 51));
        kullaniciAdiSoyadiLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kullaniciAdiSoyadiLabel.setText("Hörmətli [AD SOYAD]");

        mesajTelNoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajTelNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajTelNoLabel.setText("Telefon Nömrəniz :");

        telNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        telNoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telNoTextActionPerformed(evt);
            }
        });

        telNoDegistirIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/updateTelIcon.png"))); // NOI18N
        telNoDegistirIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        telNoDegistirIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telNoDegistirIconMouseClicked(evt);
            }
        });

        mesajSifreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajSifreLabel.setText("Şifrəniz :");

        sifreText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sifreText.setText("***********");
        sifreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreTextActionPerformed(evt);
            }
        });

        sifreDegistirIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/updateTelIcon.png"))); // NOI18N
        sifreDegistirIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifreDegistirIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sifreDegistirIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ayarlarEkraniPanelLayout = new javax.swing.GroupLayout(ayarlarEkraniPanel);
        ayarlarEkraniPanel.setLayout(ayarlarEkraniPanelLayout);
        ayarlarEkraniPanelLayout.setHorizontalGroup(
            ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                .addGroup(ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geriIcon)
                        .addGap(18, 18, 18)
                        .addComponent(kullaniciAdiSoyadiLabel))
                    .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                                .addComponent(mesajSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sifreText)
                                .addGap(18, 18, 18)
                                .addComponent(sifreDegistirIcon))
                            .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                                .addComponent(mesajTelNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(telNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(telNoDegistirIcon)))))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        ayarlarEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {mesajTelNoLabel, telNoText});

        ayarlarEkraniPanelLayout.setVerticalGroup(
            ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                .addGroup(ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geriIcon))
                    .addGroup(ayarlarEkraniPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(kullaniciAdiSoyadiLabel)))
                .addGap(80, 80, 80)
                .addGroup(ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(telNoDegistirIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(telNoText)
                    .addComponent(mesajTelNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(ayarlarEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sifreDegistirIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sifreText)
                    .addComponent(mesajSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ayarlarEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ayarlarEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void telNoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telNoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telNoTextActionPerformed

    private void sifreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sifreTextActionPerformed

    private int clickCounter=0;
    private void telNoDegistirIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telNoDegistirIconMouseClicked
        if(this.clickCounter==0){
            telNoText.setEnabled(true);
            //IconAyarlari.changeIcon(telNoDegistirIcon, "updateTelIcon2");
            clickCounter++;
        }else{
            telNoText.setEnabled(false);
            this.telNoYenile();
            
            clickCounter = 0;
        }
    }//GEN-LAST:event_telNoDegistirIconMouseClicked

    private void telNoYenile(){
        if(this.bilgilerGecerlimi()){
            String yeniTelNo=this.telNoText.getText().trim();
            getTelNoYenilemeObject().setTelNo(yeniTelNo);
            if(getTelNoYenilemeObject().telNoYenilendiMi()) {
                Dialogs.ozelMesajGoster(this, "Telefon nömrəsi "+yeniTelNo+ " olaraq güncəllənmişdir.");
            }else{
                Dialogs.ozelMesajGoster(this, "Uğursuz. Məlumatları yenidən yoxlayın! ");
                this.telNoText.setText(this.eskiTelNo);
            }
        }else{
            Dialogs.bosOlamazMesajiGonder(this);
            this.telNoText.setText(this.eskiTelNo);
        }
    }
    private void sifreDegistirIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreDegistirIconMouseClicked
        ActionAyarlari.setVisible(this, new SifreYenilemeEkrani());
    }//GEN-LAST:event_sifreDegistirIconMouseClicked

    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        ActionAyarlari.setVisible(this,new HesapEkrani());
    }//GEN-LAST:event_geriIconMouseClicked

    
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
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AyarlarEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ayarlarEkraniPanel;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel;
    private javax.swing.JLabel mesajSifreLabel;
    private javax.swing.JLabel mesajTelNoLabel;
    private javax.swing.JLabel sifreDegistirIcon;
    private javax.swing.JTextField sifreText;
    private javax.swing.JLabel telNoDegistirIcon;
    private javax.swing.JTextField telNoText;
    // End of variables declaration//GEN-END:variables
}
