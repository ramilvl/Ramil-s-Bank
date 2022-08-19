package gui;

import database.IBilgiController;
import database.transactions.FaturaOdemeleri;
import database.transactions.HesapBilgileri;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class OdemelerEkrani extends javax.swing.JFrame implements IDuzenleyici,IBilgiController {

    private FaturaOdemeleri faturaOdemeleriObject=null;
    
    public OdemelerEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        odemelerEkraniPanel.setFocusable(true);
        this.kullaniciAdiSoyadiLabel.setText("Hörmətli "+getHesapBilgileri().getAdSoyad());
        this.elektrikBorcu.setText(String.valueOf(getHesapBilgileri().getElektrikFaturasi()));
        this.suBorcu.setText(String.valueOf(getHesapBilgileri().getSuFaturasi()));
        this.dogalgazBorcu.setText(String.valueOf(getHesapBilgileri().getDogalgazFaturasi()));
        this.internetBorcu.setText(String.valueOf(getHesapBilgileri().getInternetFaturasi()));
    }

    @Override
    public boolean bilgilerGecerlimi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public FaturaOdemeleri getFaturaOdemeleriObject() {
        if(this.faturaOdemeleriObject==null){
            faturaOdemeleriObject=new FaturaOdemeleri();
        }
        return faturaOdemeleriObject;
    }

    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        odemelerEkraniPanel = new javax.swing.JPanel();
        geriIcon = new javax.swing.JLabel();
        kullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        mesajElektrikLabel = new javax.swing.JLabel();
        elektrikBorcu = new javax.swing.JLabel();
        elektrikOdeButton = new javax.swing.JButton();
        mesajSuLabel = new javax.swing.JLabel();
        suBorcu = new javax.swing.JLabel();
        suOdeButton = new javax.swing.JButton();
        mesajQazLabel = new javax.swing.JLabel();
        dogalgazBorcu = new javax.swing.JLabel();
        dogalgazOdeButton = new javax.swing.JButton();
        mesajInternetLabel = new javax.swing.JLabel();
        internetBorcu = new javax.swing.JLabel();
        internetOdeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ramil's Bank Odemeler Ekrani");

        odemelerEkraniPanel.setBackground(new java.awt.Color(204, 255, 204));

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

        mesajElektrikLabel.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        mesajElektrikLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajElektrikLabel.setText("Ümumi Elektrik Pulu Borcunuz :");

        elektrikBorcu.setBackground(new java.awt.Color(255, 255, 255));
        elektrikBorcu.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        elektrikBorcu.setForeground(new java.awt.Color(51, 153, 255));
        elektrikBorcu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        elektrikBorcu.setText("[ELEKTRIK BORC]");

        elektrikOdeButton.setBackground(new java.awt.Color(255, 204, 255));
        elektrikOdeButton.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        elektrikOdeButton.setText("Ödəmək");
        elektrikOdeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        elektrikOdeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                elektrikOdeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                elektrikOdeButtonMouseExited(evt);
            }
        });
        elektrikOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elektrikOdeButtonActionPerformed(evt);
            }
        });

        mesajSuLabel.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        mesajSuLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajSuLabel.setText("Ümumi Su Pulu Borcunuz :");

        suBorcu.setBackground(new java.awt.Color(255, 255, 255));
        suBorcu.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        suBorcu.setForeground(new java.awt.Color(51, 153, 255));
        suBorcu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        suBorcu.setText("[Su BORC]");

        suOdeButton.setBackground(new java.awt.Color(204, 204, 255));
        suOdeButton.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        suOdeButton.setText("Ödəmək");
        suOdeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        suOdeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                suOdeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                suOdeButtonMouseExited(evt);
            }
        });
        suOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suOdeButtonActionPerformed(evt);
            }
        });

        mesajQazLabel.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        mesajQazLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajQazLabel.setText("Ümumi Qaz Pulu Borcunuz :");

        dogalgazBorcu.setBackground(new java.awt.Color(255, 255, 255));
        dogalgazBorcu.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        dogalgazBorcu.setForeground(new java.awt.Color(51, 153, 255));
        dogalgazBorcu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dogalgazBorcu.setText("[Qaz BORC]");

        dogalgazOdeButton.setBackground(new java.awt.Color(204, 255, 255));
        dogalgazOdeButton.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        dogalgazOdeButton.setText("Ödəmək");
        dogalgazOdeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dogalgazOdeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dogalgazOdeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dogalgazOdeButtonMouseExited(evt);
            }
        });
        dogalgazOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dogalgazOdeButtonActionPerformed(evt);
            }
        });

        mesajInternetLabel.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        mesajInternetLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajInternetLabel.setText("Ümumi İnternet Pulu Borcunuz :");

        internetBorcu.setBackground(new java.awt.Color(255, 255, 255));
        internetBorcu.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        internetBorcu.setForeground(new java.awt.Color(51, 153, 255));
        internetBorcu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        internetBorcu.setText("[İnternet BORC]");

        internetOdeButton.setBackground(new java.awt.Color(255, 255, 204));
        internetOdeButton.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        internetOdeButton.setText("Ödəmək");
        internetOdeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        internetOdeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                internetOdeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                internetOdeButtonMouseExited(evt);
            }
        });
        internetOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internetOdeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout odemelerEkraniPanelLayout = new javax.swing.GroupLayout(odemelerEkraniPanel);
        odemelerEkraniPanel.setLayout(odemelerEkraniPanelLayout);
        odemelerEkraniPanelLayout.setHorizontalGroup(
            odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(geriIcon))
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, odemelerEkraniPanelLayout.createSequentialGroup()
                                .addComponent(mesajElektrikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mesajSuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mesajQazLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mesajInternetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(suBorcu)
                            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dogalgazBorcu)
                                    .addComponent(elektrikBorcu)
                                    .addComponent(internetBorcu))
                                .addGap(27, 27, 27)
                                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(internetOdeButton)
                                    .addComponent(suOdeButton)
                                    .addComponent(elektrikOdeButton)
                                    .addComponent(dogalgazOdeButton))))
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        odemelerEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dogalgazBorcu, elektrikBorcu, internetBorcu, suBorcu});

        odemelerEkraniPanelLayout.setVerticalGroup(
            odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geriIcon)
                .addGap(10, 10, 10)
                .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesajElektrikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elektrikBorcu)
                    .addComponent(elektrikOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesajSuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suBorcu)
                    .addComponent(suOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesajQazLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dogalgazBorcu)
                    .addComponent(dogalgazOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesajInternetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(internetBorcu)
                    .addComponent(internetOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        odemelerEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dogalgazBorcu, elektrikBorcu, internetBorcu, suBorcu});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(odemelerEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(odemelerEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        ActionAyarlari.setVisible(this,new HesapEkrani());
    }//GEN-LAST:event_geriIconMouseClicked

    private void setBgFg(Component c){
        ButtonAyarlari.setBgFg((JButton) c, Color.black, Color.white);
    }
    private void elektrikOdeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elektrikOdeButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_elektrikOdeButtonMouseEntered

    private void elektrikOdeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elektrikOdeButtonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_elektrikOdeButtonMouseExited

    private void suOdeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suOdeButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_suOdeButtonMouseEntered

    private void suOdeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suOdeButtonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_suOdeButtonMouseExited

    private void dogalgazOdeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dogalgazOdeButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_dogalgazOdeButtonMouseEntered

    private void dogalgazOdeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dogalgazOdeButtonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_dogalgazOdeButtonMouseExited

    private void internetOdeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_internetOdeButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_internetOdeButtonMouseEntered

    private void internetOdeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_internetOdeButtonMouseExited
        ButtonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_internetOdeButtonMouseExited

    private void elektrikOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elektrikOdeButtonActionPerformed
        double elektrikTutari=Double.valueOf(this.elektrikBorcu.getText());
        if(this.faturaOncedenOdenmisMi(elektrikTutari)){
            Dialogs.ozelMesajGoster(this, "Elektrik borcu artıq ödənilib!");
        }else{
            this.faturayiOde("elektrik", elektrikTutari);
        }
    }//GEN-LAST:event_elektrikOdeButtonActionPerformed

    private void suOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suOdeButtonActionPerformed
        double suTutari=Double.valueOf(this.suBorcu.getText());
        if(this.faturaOncedenOdenmisMi(suTutari)){
            Dialogs.ozelMesajGoster(this, "Su borcu artıq ödənilib!");
        }else{
            this.faturayiOde("su", suTutari);
        }
    }//GEN-LAST:event_suOdeButtonActionPerformed

    private void dogalgazOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dogalgazOdeButtonActionPerformed
        double dogalgazTutari=Double.valueOf(this.dogalgazBorcu.getText());
        if(this.faturaOncedenOdenmisMi(dogalgazTutari)){
            Dialogs.ozelMesajGoster(this, "Təbii qaz borcu artıq ödənilib!");
        }else{
            this.faturayiOde("dogalgaz", dogalgazTutari);
        }
    }//GEN-LAST:event_dogalgazOdeButtonActionPerformed

    private void internetOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internetOdeButtonActionPerformed
        double internetTutari=Double.valueOf(this.internetBorcu.getText());
        if(this.faturaOncedenOdenmisMi(internetTutari)){
            Dialogs.ozelMesajGoster(this, "İnternet borcu artıq ödənilmişdir!");
        }else{
            this.faturayiOde("internet", internetTutari);
        }
    }//GEN-LAST:event_internetOdeButtonActionPerformed

    private boolean faturaOncedenOdenmisMi(double odenecekTutar){
        return odenecekTutar==0.0;
    }
    
    private void faturayiOde(String faturaIsmi,double faturaTutari){
        this.getFaturaOdemeleriObject().setFaturaIsmi(faturaIsmi);
        this.getFaturaOdemeleriObject().setFaturaTutari(faturaTutari);
        
        if(getFaturaOdemeleriObject().faturaOdendiMi()){
            Dialogs.ozelMesajGoster(this, "Borcunuz uğurla ödənildi.");
            ActionAyarlari.setVisible(this,new HesapEkrani());
        }else{
            Dialogs.ozelMesajGoster(this, "Ödəniş prosesi uğursuz oldu!");
        }
        
    }
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
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OdemelerEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dogalgazBorcu;
    private javax.swing.JButton dogalgazOdeButton;
    private javax.swing.JLabel elektrikBorcu;
    private javax.swing.JButton elektrikOdeButton;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel internetBorcu;
    private javax.swing.JButton internetOdeButton;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel;
    private javax.swing.JLabel mesajElektrikLabel;
    private javax.swing.JLabel mesajInternetLabel;
    private javax.swing.JLabel mesajQazLabel;
    private javax.swing.JLabel mesajSuLabel;
    private javax.swing.JPanel odemelerEkraniPanel;
    private javax.swing.JLabel suBorcu;
    private javax.swing.JButton suOdeButton;
    // End of variables declaration//GEN-END:variables
}
