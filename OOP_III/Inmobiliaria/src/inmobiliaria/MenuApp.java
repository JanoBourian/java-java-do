package inmobiliaria;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class MenuApp {
    
    JFrame frame = new JFrame("Menú General Inmobiliaria!");
    JMenuBar bar = new javax.swing.JMenuBar(); 
    JMenu element1 = new javax.swing.JMenu();
    JMenu element2 = new javax.swing.JMenu();
    JButton element3 = new javax.swing.JButton();
    JButton element4 = new javax.swing.JButton();
    JButton element5 = new javax.swing.JButton();
    JButton element6 = new javax.swing.JButton();
    
    public void setMenuApp(){
        System.out.println("You are in the menuapp");
        frame.setLocation(100, 100);
        frame.setVisible(true);
        frame.setSize(900, 600);
        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Bye!");
                System.exit(0);
            }
        });
        
        aparienciaMenu();
        
        frame.add(bar, BorderLayout.PAGE_START);
    }
    
    public void aparienciaMenu(){
        element1.setText("Contrucción");
        element2.setText("Inmobiliaria");
        element3.setText("Ingresar al formulario para Registrar Lotes");
        element4.setText("Ingresar al formulario para Registrar Avalúos");
        element5.setText("Ingresar al formulario para Registrar Ventas");
        element6.setText("Ingresar al formulario para Consultas");
        element1.add(element2);
        element2.add(element3);
        element2.add(element4);
        element2.add(element5);
        element2.add(element6);
        bar.add(element1);
        
        // Here is the place for the events
        element3.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Diste CLick en el Botón para ir a Lotes");
                goToLotes();
            }
        });
        
        element4.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Diste CLick en el Botón para ir a Lotes");
                goToAvaluos();
            }
        });
    }
    
    public void goToLotes(){
        FormRegistroLotes form = new FormRegistroLotes();
        form.setForm();
    }
    
    public void goToAvaluos(){
        FormRegistroAvaluos form = new FormRegistroAvaluos();
        form.setForm();
    }
}
