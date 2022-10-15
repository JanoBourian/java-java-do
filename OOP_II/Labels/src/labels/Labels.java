package labels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class Labels {

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
        label1.setText("Example 1");
        label1.setFont(new java.awt.Font("Calibri", 1, 18));
        
        JLabel label2 = new javax.swing.JLabel();
        label2.setText("Example 2");
        label2.setForeground(Color.CYAN);
        label2.setFont(new java.awt.Font("Calibri", 1, 12));
        
        JLabel label3 = new javax.swing.JLabel();
        label3.setText("Example 3");
        label3.setForeground(Color.GREEN);
        label3.setFont(new java.awt.Font("Calibri", 1, 12));
        
        frame.add(label1, BorderLayout.PAGE_START);
        frame.add(label2, BorderLayout.CENTER);
        frame.add(label3, BorderLayout.PAGE_END);
    }
    
}
