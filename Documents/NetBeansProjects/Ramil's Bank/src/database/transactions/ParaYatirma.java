package database.transactions;

import database.DbConnection;
import database.IBilgiController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParaYatirma extends DbConnection implements IBilgiController {
    private int yatiralacakMiktar=0;

    public boolean paraYatirildiMi(){
        if(bilgilerGecerlimi()){
            String query="UPDATE kullanici_bakiye "
                    + "SET  bakiye=bakiye+ '"+ this.yatiralacakMiktar+ "'"
                    + " WHERE kullanici_id= '" +getHesapBilgileri().getKullaniciId()+"'";
            try {
                super.statement=super.connection.createStatement();
                statement.executeUpdate(query);
                getHesapBilgileri().setBakiye(getHesapBilgileri().getBakiye()+this.yatiralacakMiktar);
            } catch (SQLException ex) {
                Logger.getLogger(ParaYatirma.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        }else{
            return false;
    }
}
        
    @Override
    public boolean bilgilerGecerlimi() {
        return !(this.yatiralacakMiktar==0);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public int getYatiralacakMiktar() {
        return yatiralacakMiktar;
    }

    public void setYatiralacakMiktar(int yatiralacakMiktar) {
        this.yatiralacakMiktar = yatiralacakMiktar;
    }
    
    
    
}
