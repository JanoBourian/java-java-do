package events;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Events {

    public static void main(String[] args) {
        JTextField message_box = new JTextField("Label");
        message_box.setVisible(true);
        message_box.setSize(50,50);
        message_box.setLocation(400,400);
        
        JButton boton = new JButton("Press here!");
        boton.setVisible(true);
        boton.setSize(100,100);
        boton.setLocation(100,100);
        
        JFrame frame = new JFrame("Window!");
        frame.setLocation(100, 100);
        frame.setVisible(true);
        frame.setSize(800,800);
        frame.add(boton);
        frame.add(message_box);
        
        boton.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Diste CLick en el Botón");
            }
        });
        
        message_box.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e){
                System.out.println(e);
            }
        });
        
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Se ha cerrado la aplicación!");
                System.exit(0);
            }
        });
    }
}