package list;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class List {

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
        
        JComboBox list1 = new javax.swing.JComboBox();
        list1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"UNO", "DOS", "TRES"}));
        list1.setVisible(true);
        
        frame.add(list1);
        System.out.println(list1.getSelectedItem().toString());
        System.out.println(list1.getSelectedIndex());
    }
    
}
