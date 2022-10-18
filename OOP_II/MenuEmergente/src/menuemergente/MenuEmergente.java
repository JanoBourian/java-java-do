package menuemergente;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class MenuEmergente {

    public static void main(String[] args) {
       
        JFrame frame = new JFrame("Frame!");
        frame.setLocation(100,100);
        frame.setVisible(true);
        frame.setSize(900, 600);
        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Bye!");
                System.exit(0);
            }
        });
        
        JPopupMenu popup = new JPopupMenu();
        JMenuItem menu1 = new JMenuItem("Menu Item");
        JMenuItem menu2 = new JMenuItem("Otro Item"); 
        popup.add(menu1);
        popup.add(menu2);
        
        frame.add(popup, BorderLayout.PAGE_START);
        
    }
    
}
