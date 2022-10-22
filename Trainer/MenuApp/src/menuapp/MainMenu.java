package menuapp;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class MainMenu {
    
    JFrame frame = new JFrame("Window!");
    JButton boton = new JButton("Press here!");
    
    public void setMainMenu(){
        System.out.println("You are in the main menu");
        frame.setLocation(100, 100);
        frame.setVisible(true);
        frame.setSize(800,800);
        frame.add(boton);
        
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Se ha cerrado la aplicación!");
                System.exit(0);
            }
        });
        
        boton.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Diste CLick en el Botón");
                goToForm();
            }
        });
    }
    
    public void goToForm(){
        Form form = new Form();
        form.setForm();
    }
    
}
