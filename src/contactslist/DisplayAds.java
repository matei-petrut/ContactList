package contactslist;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class DisplayAds extends Thread {
    String[] images = {"1", "2", "3", "4", "5", "6", "7", "8"};
    BufferedImage image;
    JLabel label;
    private volatile boolean flag = false;   
    
    DisplayAds(JLabel label) {
        this.label = label;
    }
    
    public void stopRunning()
    {
        flag = true;
    }
    
    public void run() {
        
        while (!flag) {
            for (int i = 1; i < 9; i++) {
                try {
                    image = ImageIO.read(new File("src\\images\\ad" + i + ".jpg"));
                } catch (IOException e) {
                    e.printStackTrace();
            }
            Image dimg = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imgIcon = new ImageIcon(dimg);
            label.setIcon(imgIcon);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(DisplayAds.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        }
        }
        
    
}
