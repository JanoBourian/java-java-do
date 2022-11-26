package cooperativa;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class MenuApp {
    
    JFrame frame = new JFrame("COOPERATIVA");
    JButton element1 = new javax.swing.JButton();
    JButton element2 = new javax.swing.JButton();
    JButton element3 = new javax.swing.JButton();
    JButton element4 = new javax.swing.JButton();
    
    public void setMenuApp(){
        frame.setLocation(100, 100);
        frame.setVisible(true);
        frame.setSize(300, 100);
        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Bye!");
                System.exit(0);
            }
        });
        
        aparienciaMenu();
    }
    
    public void aparienciaMenu(){
        element1.setText("Depositar");
        element2.setText("Retirar");
        element3.setText("Agregar Cliente");
        element4.setText("Procesar Órdenes");
        
        GridLayout acomodo = new GridLayout(2,2);
        frame.setLayout(acomodo);
        frame.add(element1);
        frame.add(element2);
        frame.add(element3);
        //frame.add(element4);
        
        element1.addMouseListener(
                new MouseAdapter(){
                    @Override
                    public void mouseClicked(MouseEvent e){
                        depositar();
                    }
                }
        );
        
        element2.addMouseListener(
                new MouseAdapter(){
                    @Override
                    public void mouseClicked(MouseEvent e){
                        retirar();
                    }
                }
        );
        
        element3.addMouseListener(
                new MouseAdapter(){
                    @Override
                    public void mouseClicked(MouseEvent e){
                        agregarCliente();
                    }
                }
        );
        
        element4.addMouseListener(
                new MouseAdapter(){
                    @Override
                    public void mouseClicked(MouseEvent e){
                        procesarOrdenes();
                    }
                }
        );
    }
    
    public void depositar(){
        Deposito form = new Deposito();
        form.setForm();
    }
    
    public void retirar(){
        Retiro form = new Retiro();
        form.setForm();
    }
    
    public void agregarCliente(){
        AgregarCliente form = new AgregarCliente();
        form.setForm();
    }
    
    public void procesarOrdenes(){
        CRUDOperations operator = new CRUDOperations();
        operator.start();
    }
}
