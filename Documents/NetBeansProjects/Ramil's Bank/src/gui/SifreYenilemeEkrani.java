package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.SifreYenileme;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;


public class SifreYenilemeEkrani extends javax.swing.JFrame implements IDuzenleyici,IBilgiController {

    private SifreYenileme sifreYenilemeObject=null;
    
    public SifreYenilemeEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        sifreYenilemePanel.setFocusable(true);
        TextAyarlari.setOnlyNumber(tcNoText);
        TextAyarlari.setMaxLimit(tcNoText, 11);
        TextAyarlari.setOnlyNumber(telefonNoText);
        TextAyarlari.setMaxLimit(telefonNoText, 11);
        if(getHesapBilgileri().getKullaniciId()==0){
            this.eskiSifreText.setEnabled(false);
        }
    }

    public JPasswordField getEskiSifreText() {
        return eskiSifreText;
    }

    private boolean isEnabledEskiSifreText(){
        return this.getEskiSifreText().isEnabled();
    }

    @Override
    public boolean bilgilerGecerlimi() {
        return TextAyarlari.textAlanlariDolumu(this.sifreYenilemePanel);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public SifreYenileme getSifreYenilemeObject() {
        if(this.sifreYenilemeObject==null){
            sifreYenilemeObject=new SifreYenileme();
        }
        return sifreYenilemeObject;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sifreYenilemePanel = new javax.swing.JPanel();
        geriIcon = new javax.swing.JLabel();
        sifreYenilemeLabel = new javax.swing.JLabel();
        tcNoLabel = new javax.swing.JLabel();
        tcNoText = new javax.swing.JTextField();
        telefonNoLabel = new javax.swing.JLabel();
        telefonNoText = new javax.swing.JTextField();
        guvenlikCevapLabel = new javax.swing.JLabel();
        guvenlikCevapText = new javax.swing.JTextField();
        eskiSifreLabel = new javax.swing.JLabel();
        yeniSifreLabel = new javax.swing.JLabel();
        sifreTekrarLabel = new javax.swing.JLabel();
        eskiSifreText = new javax.swing.JPasswordField();
        yeniSifreText = new javax.swing.JPasswordField();
        sifreTekrarText = new javax.swing.JPasswordField();
        sifreyiYenileButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sifreYenilemePanel.setBackground(new java.awt.Color(204, 255, 204));

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });

        sifreYenilemeLabel.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        sifreYenilemeLabel.setForeground(new java.awt.Color(255, 0, 153));
        sifreYenilemeLabel.setText("??ifr?? Yenil??m?? ");

        tcNoLabel.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        tcNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tcNoLabel.setText("??.V No :");

        telefonNoLabel.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        telefonNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telefonNoLabel.setText("Telefon No :");

        guvenlikCevapLabel.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        guvenlikCevapLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        guvenlikCevapLabel.setText("T??hl??k??sizlik Sual?? Cavab?? :");

        guvenlikCevapText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guvenlikCevapTextActionPerformed(evt);
            }
        });

        eskiSifreLabel.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        eskiSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        eskiSifreLabel.setText("K??hn?? ??ifr?? :");

        yeniSifreLabel.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        yeniSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yeniSifreLabel.setText("Yeni ??ifr?? :");

        sifreTekrarLabel.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        sifreTekrarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sifreTekrarLabel.setText("Yeni ??ifr?? T??krar?? :");

        sifreyiYenileButton.setBackground(new java.awt.Color(255, 255, 153));
        sifreyiYenileButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        sifreyiYenileButton.setText("??ifr??ni Yenil??");
        sifreyiYenileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifreyiYenileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sifreyiYenileButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sifreyiYenileButtonMouseExited(evt);
            }
        });
        sifreyiYenileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreyiYenileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sifreYenilemePanelLayout = new javax.swing.GroupLayout(sifreYenilemePanel);
        sifreYenilemePanel.setLayout(sifreYenilemePanelLayout);
        sifreYenilemePanelLayout.setHorizontalGroup(
            sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                        .addComponent(telefonNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(telefonNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(geriIcon))
                        .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sifreYenilemeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tcNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addComponent(tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                                .addComponent(guvenlikCevapLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(guvenlikCevapText, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(eskiSifreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(eskiSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                        .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sifreTekrarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yeniSifreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(yeniSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sifreTekrarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(159, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sifreYenilemePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sifreyiYenileButton)
                .addGap(202, 202, 202))
        );

        sifreYenilemePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {eskiSifreText, guvenlikCevapText, sifreTekrarText, yeniSifreText});

        sifreYenilemePanelLayout.setVerticalGroup(
            sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geriIcon)
                .addGap(18, 18, 18)
                .addComponent(sifreYenilemeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tcNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guvenlikCevapText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guvenlikCevapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eskiSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eskiSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yeniSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yeniSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifreTekrarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifreTekrarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sifreyiYenileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        sifreYenilemePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {eskiSifreText, guvenlikCevapText, sifreTekrarText, yeniSifreText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sifreYenilemePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sifreYenilemePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        if(isEnabledEskiSifreText()){
            ActionAyarlari.setVisible(this,new AyarlarEkrani());
        }else{
            ActionAyarlari.setVisible(this,new GirisEkrani());
        }
        
        
    }//GEN-LAST:event_geriIconMouseClicked

    private void guvenlikCevapTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guvenlikCevapTextActionPerformed
        
    }//GEN-LAST:event_guvenlikCevapTextActionPerformed

    private void sifreyiYenileButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreyiYenileButtonMouseEntered
        ButtonAyarlari.setBgFg(sifreyiYenileButton,Color.cyan,Color.black);
    }//GEN-LAST:event_sifreyiYenileButtonMouseEntered

    private void sifreyiYenileButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreyiYenileButtonMouseExited
        ButtonAyarlari.setOriginalBgFg(sifreyiYenileButton);
    }//GEN-LAST:event_sifreyiYenileButtonMouseExited

    private void sifreyiYenileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreyiYenileButtonActionPerformed
       if(this.bilgilerGecerlimi()){
           this.sifreyiYenile();
       }else{
           Dialogs.bosOlamazMesajiGonder(this);
       }
    }//GEN-LAST:event_sifreyiYenileButtonActionPerformed

    private void sifreyiYenile(){
        String yeniSifre=String.valueOf(this.yeniSifreText.getPassword());
        String yeniSifreTekrar=String.valueOf(this.sifreTekrarText.getPassword());
        if(yeniSifre.equals(yeniSifreTekrar)){
            this.sifreyiOnayla();
        }else{
            Dialogs.ozelMesajGoster(this, "Parollar uy??un g??lmir!");
        }
    }
    
    private void sifreyiOnayla(){
        this.getSifreYenilemeObject().setTcNo(this.tcNoText.getText());
        this.getSifreYenilemeObject().setTelNo(this.telefonNoText.getText());
        this.getSifreYenilemeObject().setGuvenlikCevap(this.guvenlikCevapText.getText());
        if(this.isEnabledEskiSifreText()){
            this.getSifreYenilemeObject().setEskiSifre(String.valueOf(this.eskiSifreText.getPassword()));
        }
        this.getSifreYenilemeObject().setYeniSifre(String.valueOf(this.yeniSifreText.getPassword()));
        if(this.getSifreYenilemeObject().sifreYenilendiMi()){
            Dialogs.ozelMesajGoster(this, "Parolunuz u??urla b??rpa olundu.");
            if(this.isEnabledEskiSifreText()){
                ActionAyarlari.setVisible(this, new HesapEkrani());
            }else{
                ActionAyarlari.setVisible(this, new GirisEkrani());
            }
        }else{
                Dialogs.ozelMesajGoster(this, "Parolu s??f??rlamaq m??mk??n olmad?? \n"
                + "Z??hm??t olmasa m??lumatlar??n??z?? yenid??n yoxlay??n!");
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
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SifreYenilemeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eskiSifreLabel;
    private javax.swing.JPasswordField eskiSifreText;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel guvenlikCevapLabel;
    private javax.swing.JTextField guvenlikCevapText;
    private javax.swing.JLabel sifreTekrarLabel;
    private javax.swing.JPasswordField sifreTekrarText;
    private javax.swing.JLabel sifreYenilemeLabel;
    private javax.swing.JPanel sifreYenilemePanel;
    private javax.swing.JButton sifreyiYenileButton;
    private javax.swing.JLabel tcNoLabel;
    private javax.swing.JTextField tcNoText;
    private javax.swing.JLabel telefonNoLabel;
    private javax.swing.JTextField telefonNoText;
    private javax.swing.JLabel yeniSifreLabel;
    private javax.swing.JPasswordField yeniSifreText;
    // End of variables declaration//GEN-END:variables
}
