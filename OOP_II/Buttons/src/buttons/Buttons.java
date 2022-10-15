package buttons;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class Buttons {

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
        
        JButton btn = new javax.swing.JButton();
        btn.setText("Boton 1");
        btn.setMnemonic('b');
        
        JButton btn2 = new javax.swing.JButton();
        btn2.setText("Boton 2");
        btn2.setBackground(Color.red);
        
        JButton btn3 = new javax.swing.JButton();
        btn3.setText("Boton 3");
        
        frame.add(btn, BorderLayout.PAGE_START);
        frame.add(btn2, BorderLayout.CENTER);
        frame.add(btn3, BorderLayout.PAGE_END);
    }
}