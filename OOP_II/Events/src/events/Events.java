package events;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class Events {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Example of eventes");
        frame.setLocation(100, 100);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
}