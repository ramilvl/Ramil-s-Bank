package gui.ayarlar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Dialogs {
    public static void bosOlamazMesajiGonder(JFrame frame){
        JOptionPane.showMessageDialog(frame, "Bütün Boşluqlar Dolu Olamlıdır!");
    }


    public static void ozelMesajGoster(JFrame frame,String message){
        JOptionPane.showMessageDialog(frame,message);
    }
    public static int onayMesajiGoster(JFrame frame, String message){
        int optionType = JOptionPane.YES_NO_OPTION;
        int selected = JOptionPane.showConfirmDialog(frame, message, "UYARI", optionType);
        if(optionType == selected){
            return 1;
        }
        return 0;
    }
}