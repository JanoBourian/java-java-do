package gcomponents;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class GComponents {

    public static void main(String[] args) {
        // Frame
        JFrame frame = new JFrame("Window!");
        frame.setLocation(200, 200);
        frame.setVisible(true);
        frame.setSize(500, 500);
        
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing( WindowEvent e){
                System.out.println("The window was closed!");
                System.exit(0);
            }
        });
        
        // Panels
        JPanel panel = new javax.swing.JPanel();
        JPanel panel2 = new javax.swing.JPanel();
        JPanel panel3 = new javax.swing.JPanel();
        
        panel.setBackground(Color.CYAN);
        panel2.setBackground(Color.MAGENTA);
        panel3.setBackground(Color.ORANGE);
        
        frame.add(panel, BorderLayout.PAGE_START);
        frame.add(panel2, BorderLayout.CENTER);
        frame.add(panel3, BorderLayout.PAGE_END);
    }
}