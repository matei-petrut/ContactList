package contactslist;

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
   
}
