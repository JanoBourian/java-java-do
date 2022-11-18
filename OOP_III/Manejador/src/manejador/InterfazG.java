package manejador;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class InterfazG{
    
    // Componentes que se van a utilizar
    // Frame
    JFrame frame = new JFrame("Registro de Riesgo!");
    
    // Barra de menú
    JPanel pnl1 = new javax.swing.JPanel();
    JMenuBar bar = new javax.swing.JMenuBar();
    JMenu element1 = new javax.swing.JMenu();
    JMenu element2 = new javax.swing.JMenu();
    JButton element3 = new javax.swing.JButton();
    
    // Método para inicializar los componentes
    public void aparienciaTotal(){
        System.out.println("Mensaje de prueba de ejecución");
        frame.setLocation(100,100);
        frame.setVisible(true);
        
        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Bye!");
                System.exit(0);
            }
        });
        
        aparienciaMenu();
        
        frame.add(bar, BorderLayout.PAGE_START);
        frame.add(pnl1, BorderLayout.PAGE_END);
        
    }
    
    public void aparienciaMenu(){
        pnl1.setBackground(Color.CYAN);
        element1.setText("Personal");
        element2.setText("Altas");
        element3.setText("Ingresar al formulario");
        element1.add(element2);
        element2.add(element3);
        bar.add(element1);
        System.out.println("Apariencia del menú");
        // Evento del botón
        element3.addMouseListener(
                new MouseAdapter(){
                    @Override
                    public void mouseClicked(MouseEvent e){
                        Formulario f = new Formulario();
                        frame.add(f.pnlFormulario, BorderLayout.CENTER);
                        f.menuFormulario();
                    }
                }
        );
    }
}


