package database;

import database.transactions.HesapBilgileri;

public interface IBilgiController {
    
    public boolean bilgilerGecerlimi();
    
    public HesapBilgileri getHesapBilgileri();
}
