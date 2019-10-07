package contactslist;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public abstract class SharewareMode {
    
    public static boolean verifyCode(String code) {
        if (code.length() != 10)
            return false;
        if (!code.startsWith("a"))
            return false;
        if (!code.endsWith("10"))
            return false;
        
        return true;
    }
    
    public static void removeAds(JLabel label) {
        label.setIcon(null);
    }
    
    public static void extendJList(JList list, JScrollPane scrollPane) {
        list.setSize(775, 343);
        scrollPane.setSize(775, 343);
        
    }
   
}
