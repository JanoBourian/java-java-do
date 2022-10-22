package menuapp;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;


public class Form {
    
    JFrame frame = new JFrame("Window!");
    JButton boton = new JButton("Next Steps!");
    
    public void setForm(){
        System.out.println("You are in the main Form");
        frame.setLocation(400, 400);
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.add(boton);
        
        boton.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Diste CLick en el Botón dentro del formulario");
                frame.dispose();
            }
        });
    }
    
}
