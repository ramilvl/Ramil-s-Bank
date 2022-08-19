package gui;

import database.IBilgiController;
import database.transactions.Havale;
import database.transactions.HesapBilgileri;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import javax.swing.JOptionPane;


public class HavaleEkrani extends javax.swing.JFrame implements IDuzenleyici,IBilgiController{

    private Havale havaleObject=null;
    
    private final String MUSTERI_NO_TEXT_ORIGINAL="Müştəri No";
    private int gonderilecekMiktar=0;
    public HavaleEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
       this.setLocationRelativeTo(null);
       this.setResizable(false);
       this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
       havaleEkraniPanel.setFocusable(true);
       TextAyarlari.setOnlyNumber(gonderilecekMiktarText);
       TextAyarlari.setMaxLimit(gonderilecekMiktarText,5);
       TextAyarlari.setOnlyNumber(musteriNoText);
       musteriNoText.setText(MUSTERI_NO_TEXT_ORIGINAL);
       this.kullaniciAdiSoyadiLabel.setText("Hörmətli "+getHesapBilgileri().getAdSoyad());
       this.bakiyeLabel.setText(String.valueOf(getHesapBilgileri().getBakiye()));
    }

    @Override
    public boolean bilgilerGecerlimi() {
        return !(this.gonderilecekMiktarText.getText().equals("")
                || this.musteriNoText.getText().equals(this.MUSTERI_NO_TEXT_ORIGINAL));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public Havale getHavaleObject() {
        if(this.havaleObject==null){
            havaleObject=new Havale();
        }
        return havaleObject;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        havaleEkraniPanel = new javax.swing.JPanel();
        kullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        limitUyariLabel = new javax.swing.JLabel();
        gondereceginizMiktarLabel = new javax.swing.JLabel();
        bakiyeLabel = new javax.swing.JLabel();
        toplamBakiyenizLabel = new javax.swing.JLabel();
        gonderilecekMiktarText = new javax.swing.JTextField();
        havaleButton = new javax.swing.JButton();
        geriIcon = new javax.swing.JLabel();
        havaleAlacakKisiLabel = new javax.swing.JLabel();
        musteriNoText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        havaleEkraniPanel.setBackground(new java.awt.Color(255, 204, 255));

        kullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kullaniciAdiSoyadiLabel.setForeground(new java.awt.Color(255, 51, 51));
        kullaniciAdiSoyadiLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kullaniciAdiSoyadiLabel.setText("Hörmətli [AD SOYAD]");

        limitUyariLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        limitUyariLabel.setText("Birdəfəlik 20.000 azn və aşağısını göndərə bilərsiniz ");

        gondereceginizMiktarLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gondereceginizMiktarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gondereceginizMiktarLabel.setText("Göndərəcəyiniz Miqdar :");

        bakiyeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bakiyeLabel.setText("[Balans]");

        toplamBakiyenizLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        toplamBakiyenizLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        toplamBakiyenizLabel.setText("Ümumi Balans :");

        gonderilecekMiktarText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gonderilecekMiktarText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gonderilecekMiktarTextActionPerformed(evt);
            }
        });
        gonderilecekMiktarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                gonderilecekMiktarTextKeyReleased(evt);
            }
        });

        havaleButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        havaleButton.setText("Transfer et");
        havaleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        havaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                havaleButtonActionPerformed(evt);
            }
        });

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });

        havaleAlacakKisiLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        havaleAlacakKisiLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        havaleAlacakKisiLabel.setText("Transferi Qəbul Edəcək Şəxs : ");

        musteriNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        musteriNoText.setForeground(new java.awt.Color(153, 153, 153));
        musteriNoText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                musteriNoTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                musteriNoTextFocusLost(evt);
            }
        });
        musteriNoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteriNoTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout havaleEkraniPanelLayout = new javax.swing.GroupLayout(havaleEkraniPanel);
        havaleEkraniPanel.setLayout(havaleEkraniPanelLayout);
        havaleEkraniPanelLayout.setHorizontalGroup(
            havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, havaleEkraniPanelLayout.createSequentialGroup()
                .addGap(0, 55, Short.MAX_VALUE)
                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, havaleEkraniPanelLayout.createSequentialGroup()
                        .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, havaleEkraniPanelLayout.createSequentialGroup()
                        .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(toplamBakiyenizLabel)
                                    .addComponent(gondereceginizMiktarLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                                        .addComponent(havaleAlacakKisiLabel)
                                        .addGap(26, 26, 26)
                                        .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(musteriNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(havaleButton)))
                                    .addComponent(gonderilecekMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(34, 34, 34))))
            .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geriIcon))
                    .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(limitUyariLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        havaleEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {gondereceginizMiktarLabel, gonderilecekMiktarText, havaleAlacakKisiLabel, musteriNoText});

        havaleEkraniPanelLayout.setVerticalGroup(
            havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geriIcon)
                .addGap(10, 10, 10)
                .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(limitUyariLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toplamBakiyenizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gonderilecekMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gondereceginizMiktarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(musteriNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(havaleAlacakKisiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(havaleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        havaleEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {gondereceginizMiktarLabel, gonderilecekMiktarText, havaleAlacakKisiLabel, musteriNoText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(havaleEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(havaleEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void gonderilecekMiktarTextActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void gonderilecekMiktarTextKeyReleased(java.awt.event.KeyEvent evt) {                                                   
        this.gonderilecekMiktar=TextAyarlari.checkTheTextKeyReleased(gonderilecekMiktarText, 20000);
    }                                                  

    private void havaleButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             

        if(this.bilgilerGecerlimi()){
            this.havaleYap();
        }else{
            Dialogs.bosOlamazMesajiGonder(this);
        }
    }                                            

    
    private void havaleYap(){
        getHavaleObject().setGonderilecekMiktar(this.gonderilecekMiktar);
        getHavaleObject().setHavaleAlacakKisi(this.musteriNoText.getText());
        
        if(getHavaleObject().havaleYapildiMi()){
            Dialogs.ozelMesajGoster(this,"Köçürmə əməliyyatı uğurlu oldu. \n"
                    + "Göndərilən müştəri nömrəsi:"+this.musteriNoText.getText()
                    +"\n Göndərilən Məbləğ:"+this.gonderilecekMiktar+" AZN");
            ActionAyarlari.setVisible(this, new HesapEkrani());
        }else{
            Dialogs.ozelMesajGoster(this,"Köçürmə əməliyyatı alınmadı.\n"
                    + "Zəhmət olmasa məlumatlarınızı yoxlayın!");
        }
        
    }
    
    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {                                      
        ActionAyarlari.setVisible(this,new HesapEkrani());
    }                                     

    private void musteriNoTextActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void musteriNoTextFocusGained(java.awt.event.FocusEvent evt) {                                          
        TextAyarlari.checkTheTextFocusGained(musteriNoText,MUSTERI_NO_TEXT_ORIGINAL);
    }                                         

    private void musteriNoTextFocusLost(java.awt.event.FocusEvent evt) {                                        
        TextAyarlari.checkTheTextFocusLost(musteriNoText);
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
            java.util.logging.Logger.getLogger(HavaleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HavaleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HavaleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HavaleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HavaleEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel bakiyeLabel;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel gondereceginizMiktarLabel;
    private javax.swing.JTextField gonderilecekMiktarText;
    private javax.swing.JLabel havaleAlacakKisiLabel;
    private javax.swing.JButton havaleButton;
    private javax.swing.JPanel havaleEkraniPanel;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel;
    private javax.swing.JLabel limitUyariLabel;
    private javax.swing.JTextField musteriNoText;
    private javax.swing.JLabel toplamBakiyenizLabel;
    // End of variables declaration                   
}
