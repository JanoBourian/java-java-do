package spinner;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class Spinner {


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
        
        JSpinner spn1 = new javax.swing.JSpinner();
        spn1.setModel(new javax.swing.SpinnerNumberModel(1, 0, 5, 1));
        
        JSpinner spn2 = new JSpinner();
        spn2.setModel(new javax.swing.SpinnerListModel(
                new String[] {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"}
        ));
        
        frame.add(spn1, BorderLayout.PAGE_START);
        frame.add(spn2, BorderLayout.PAGE_END);
        
        spn1.getValue().toString();
        spn2.getValue().toString();
    }
    
}
