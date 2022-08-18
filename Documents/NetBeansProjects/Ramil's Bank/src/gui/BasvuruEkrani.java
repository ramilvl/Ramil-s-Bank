/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.KullaniciBasvuru;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class BasvuruEkrani extends javax.swing.JFrame implements IDuzenleyici,IBilgiController {
    
    private KullaniciBasvuru kullaniciBasvuruObject=null;
    
    public BasvuruEkrani() {
        initComponents();
        getEdits();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basvuruEkraniPanel = new javax.swing.JPanel();
        adSoyadLabel = new javax.swing.JLabel();
        guvenlikBilgileriLabel = new javax.swing.JLabel();
        adSoyadText = new javax.swing.JTextField();
        tcNoLabel = new javax.swing.JLabel();
        tcNoText = new javax.swing.JTextField();
        guvenlikSorusuLabel = new javax.swing.JLabel();
        telNoText = new javax.swing.JTextField();
        kisiselBilgilerLabel1 = new javax.swing.JLabel();
        telNoLabel1 = new javax.swing.JLabel();
        guvenlikSorusu = new javax.swing.JComboBox<>();
        guvenlikCevapLabel = new javax.swing.JLabel();
        guvenlikCevapText = new javax.swing.JTextField();
        basvurButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ramil's Bank Basvuru Ekrani");

        basvuruEkraniPanel.setBackground(new java.awt.Color(255, 255, 204));

        adSoyadLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adSoyadLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adSoyadLabel.setText("Ad Soyad :");

        guvenlikBilgileriLabel.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        guvenlikBilgileriLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        guvenlikBilgileriLabel.setText("Güvənlik məlumatları:");

        adSoyadText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tcNoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tcNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tcNoLabel.setText("Ş.V. No :");

        tcNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        guvenlikSorusuLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        guvenlikSorusuLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        guvenlikSorusuLabel.setText("Güvənlik sualı :");

        telNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        kisiselBilgilerLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        kisiselBilgilerLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kisiselBilgilerLabel1.setText("Şəxsi Məlumatlar");

        telNoLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        telNoLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telNoLabel1.setText("Telefon :");

        guvenlikSorusu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "İtinizin adı nədir?", "İbtidai müəlliminizin adı nədir?", "Yaşamaq istədiyiniz yer haradır?", "Və ya hər hansı bir cümlə girin(məsləhətlidir)?" }));

        guvenlikCevapLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        guvenlikCevapLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        guvenlikCevapLabel.setText("Cavab :");

        guvenlikCevapText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        basvurButton.setBackground(new java.awt.Color(204, 204, 255));
        basvurButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        basvurButton.setText("Qeydiyyat");
        basvurButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        basvurButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                basvurButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                basvurButtonMouseExited(evt);
            }
        });
        basvurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basvurButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout basvuruEkraniPanelLayout = new javax.swing.GroupLayout(basvuruEkraniPanel);
        basvuruEkraniPanel.setLayout(basvuruEkraniPanelLayout);
        basvuruEkraniPanelLayout.setHorizontalGroup(
            basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                        .addComponent(guvenlikCevapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(basvurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(guvenlikCevapText))))
                    .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                        .addComponent(guvenlikSorusuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(guvenlikSorusu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(guvenlikBilgileriLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                            .addComponent(tcNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                            .addComponent(adSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(adSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(telNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(222, Short.MAX_VALUE))
            .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(kisiselBilgilerLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(481, Short.MAX_VALUE)))
            .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(telNoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(524, Short.MAX_VALUE)))
        );
        basvuruEkraniPanelLayout.setVerticalGroup(
            basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(telNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(guvenlikBilgileriLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guvenlikSorusuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guvenlikSorusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guvenlikCevapText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guvenlikCevapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(basvurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addComponent(kisiselBilgilerLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(428, Short.MAX_VALUE)))
            .addGroup(basvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(basvuruEkraniPanelLayout.createSequentialGroup()
                    .addGap(242, 242, 242)
                    .addComponent(telNoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(243, Short.MAX_VALUE)))
        );

        basvuruEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {adSoyadLabel, adSoyadText});

        basvuruEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tcNoLabel, tcNoText});

        basvuruEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {guvenlikCevapText, guvenlikSorusu, guvenlikSorusuLabel, telNoText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basvuruEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basvuruEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        basvuruEkraniPanel.setFocusable(true);
        TextAyarlari.setOnlyAlphabetic(adSoyadText);
        TextAyarlari.setOnlyNumber(tcNoText);
        TextAyarlari.setOnlyNumber(telNoText);
        TextAyarlari.setMaxLimit(tcNoText, 11);
        TextAyarlari.setMaxLimit(telNoText, 11);
    }

    public KullaniciBasvuru getKullaniciBasvuruObject() {
        if(this.kullaniciBasvuruObject==null){
            kullaniciBasvuruObject=new KullaniciBasvuru();
        }
        return kullaniciBasvuruObject;
    }

    @Override
    public boolean bilgilerGecerlimi() {
        return TextAyarlari.textAlanlariDolumu(basvuruEkraniPanel);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
       return HesapBilgileri.getInstance();
    }
    
    
    
    
    private void basvurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basvurButtonActionPerformed
        if(this.bilgilerGecerlimi()){
            this.basvuruyuGerceklestir();
        }else{
            Dialogs.bosOlamazMesajiGonder(this);
        }
        
        
    }//GEN-LAST:event_basvurButtonActionPerformed

    private void basvuruyuGerceklestir(){
        
        this.getKullaniciBasvuruObject().setAdSoyad(this.adSoyadText.getText().trim());
        this.getKullaniciBasvuruObject().setTcNo(this.tcNoText.getText().trim());
        this.getKullaniciBasvuruObject().setTelNo(this.telNoText.getText().trim());
        
        this.getKullaniciBasvuruObject().setGuvenlikSorusu(String.valueOf(this.guvenlikSorusu.getSelectedItem()));
        this.getKullaniciBasvuruObject().setGuvenlikCevap(this.guvenlikCevapText.getText().trim());
        
        this.getKullaniciBasvuruObject().setMusteriNo(this.randomMusteriNoAl());
        this.getKullaniciBasvuruObject().setSifre(this.randomSifreAl());
        
        if(this.getKullaniciBasvuruObject().basvuruOnaylandiMi()){
            Dialogs.ozelMesajGoster(this,"Qeydiyyatınız ugurla qeydə alınmışdır.\n"
                    + " MÜştəri nömrəniz:"+this.getKullaniciBasvuruObject().getMusteriNo()
                    + "\nŞifrəniz:"+this.getKullaniciBasvuruObject().getSifre());
            ActionAyarlari.setVisible(this,new GirisEkrani());
        }else{
            Dialogs.ozelMesajGoster(this,"Qeydiyyatınız qeydə alınmamışdır.\n"
                    +"Zəhmət olmasa məlumatları yoxlayın!");
        }
        
    }
    
    private String randomMusteriNoAl(){
        String musteriNo;
        do{
            musteriNo=String.valueOf(1000000+(int)(Math.random()*9000000));
        }
        while(this.getKullaniciBasvuruObject().musteriNoTablodaVarMi());
        return musteriNo;
    }
    
    private String randomSifreAl(){
        String sifre;
        sifre=String.valueOf(1000+(int)(Math.random()*9000));
        return sifre;
    }
    
    
    private void basvurButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButtonMouseEntered
        ButtonAyarlari.setBgFg(basvurButton, Color.black, Color.white);
    }//GEN-LAST:event_basvurButtonMouseEntered

    private void basvurButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButtonMouseExited
        ButtonAyarlari.setOriginalBgFg(basvurButton);
    }//GEN-LAST:event_basvurButtonMouseExited

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
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasvuruEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adSoyadLabel;
    private javax.swing.JTextField adSoyadText;
    private javax.swing.JButton basvurButton;
    private javax.swing.JPanel basvuruEkraniPanel;
    private javax.swing.JLabel guvenlikBilgileriLabel;
    private javax.swing.JLabel guvenlikCevapLabel;
    private javax.swing.JTextField guvenlikCevapText;
    private javax.swing.JComboBox<String> guvenlikSorusu;
    private javax.swing.JLabel guvenlikSorusuLabel;
    private javax.swing.JLabel kisiselBilgilerLabel1;
    private javax.swing.JLabel tcNoLabel;
    private javax.swing.JTextField tcNoText;
    private javax.swing.JLabel telNoLabel1;
    private javax.swing.JTextField telNoText;
    // End of variables declaration//GEN-END:variables
}
