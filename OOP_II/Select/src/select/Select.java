package select;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class Select {

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
        
        JCheckBox check1 = new javax.swing.JCheckBox();
        check1.setText("Check 1");
        System.out.println(check1.isSelected());
        
        JCheckBox check2 = new javax.swing.JCheckBox();
        check2.setText("Check 2");
        check2.setSelected(true);
        System.out.println(check2.isSelected());
        
        JCheckBox check3 = new javax.swing.JCheckBox();
        check3.setText("Check 3");
        check3.setForeground(Color.red);
        System.out.println(check3.isSelected());
        
        frame.add(check1, BorderLayout.NORTH);
        frame.add(check2, BorderLayout.SOUTH);
        frame.add(check3, BorderLayout.CENTER);
    }
}