package menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class Menu {

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
        
        JPanel pnl1 = new javax.swing.JPanel();
        pnl1.setBackground(Color.CYAN);
        
        JMenuBar bar = new javax.swing.JMenuBar();
        JMenu element1 = new javax.swing.JMenu();
        element1.setText("Elemento 1");
        
        JMenu element2 = new javax.swing.JMenu();
        element2.setText("Elemento 2");
        
        JMenu element3 = new javax.swing.JMenu();
        element3.setText("SUB Elemento 1");
        
        element2.add(element3);
        bar.add(element1);
        bar.add(element2);
        
        frame.add(bar, BorderLayout.PAGE_START);
        frame.add(pnl1, BorderLayout.PAGE_END);
    }
}