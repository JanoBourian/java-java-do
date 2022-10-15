package textfield;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class TextField {

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
        
        JTextField field1 = new JTextField();
        field1.setText("Text Box 1");
        
        JTextField field2 = new JTextField();
        field2.setText("Text Box 2");
        field2.setFont(new java.awt.Font("Tunga", 1, 24));
        field2.setForeground(new java.awt.Color(255, 51, 51));
        
        frame.add(field1, BorderLayout.LINE_START);
        frame.add(field2, BorderLayout.LINE_END);
        
        String text = field1.getText();
        String text2 = field2.getText();
        
        System.out.println(text);
        System.out.println(text2);
    }
    
}
