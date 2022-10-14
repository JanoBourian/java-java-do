package events;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Events {

    public static void main(String[] args) {
        JButton boton = new JButton("Press here!");
        boton.setVisible(true);
        boton.setSize(100,100);
        boton.setLocation(100,100);
        
        JFrame frame = new JFrame("Example of eventes");
        frame.setLocation(100, 100);
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.add(boton);
        
        boton.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Diste CLick en el Botón");
            }
        });
        
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
}