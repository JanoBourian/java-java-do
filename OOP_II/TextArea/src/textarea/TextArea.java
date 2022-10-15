package textarea;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class TextArea {

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
        
        JTextArea area1 = new JTextArea();
        area1.setColumns(10);
        area1.setText("Text area 1");
        
        JTextArea area2 = new JTextArea();
        area2.setColumns(20);
        area2.setText("Text area 2");
        area2.setEditable(false);
        
        frame.add(area1, BorderLayout.LINE_START);
        frame.add(area2, BorderLayout.LINE_END);       
        
        String text = area1.getText();
        String text2 = area2.getText();
        
        System.out.println(text);
        System.out.println(text2);
    }
}