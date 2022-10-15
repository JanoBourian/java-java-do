package separator;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class Separator {


    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Frame!");
        frame.setLocation(100,100);
        frame.setVisible(true);
        frame.setSize(500, 500);
        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Bye!");
                System.exit(0);
            }
        });
        
        JLabel label1 = new javax.swing.JLabel();
        label1.setText("Label 1");
        
        JLabel label2 = new javax.swing.JLabel();
        label2.setText("Etiqueta 2");
        
        frame.add(label1, BorderLayout.PAGE_START);
        frame.add(new JSeparator(SwingConstants.HORIZONTAL),BorderLayout.CENTER);
        frame.add(label2, BorderLayout.PAGE_END);
    }
    
}
