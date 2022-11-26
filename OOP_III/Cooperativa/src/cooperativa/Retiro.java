package cooperativa;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class Retiro {
    JFrame frame = new JFrame("RETIRAR DINERO");
    JPanel panel = new javax.swing.JPanel();
    
    // Número de cliente
    JLabel lblNumeroCliente= new javax.swing.JLabel();
    JTextField txtNumeroCliente = new javax.swing.JTextField();
    
    // Monto inicial
    JLabel lblMontoInicial= new javax.swing.JLabel();
    JTextField txtMontoInicial = new javax.swing.JTextField();
    
    // Botón para generar operación
    JButton btnGuardar = new javax.swing.JButton();
    
    // Botón regresar 
    JButton btnRegresar = new javax.swing.JButton();
    
    public void setForm(){
        frame.setLocation(200,200);
        frame.setSize(400, 150);
        frame.setVisible(true);
        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Bye!");
                System.exit(0);
            }
        });
        
        lblNumeroCliente.setText("Numero de Cliente");
        lblMontoInicial.setText("Retiro $");
        btnGuardar.setText("Retirar");
        btnRegresar.setText("Regresar");
        
        btnRegresar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                frame.dispose();
            }
        });
        
        btnGuardar.addMouseListener(
                new MouseAdapter(){
                    @Override
                    public void mouseClicked(MouseEvent e){
                        accionGuardar();
                    }
                }
        );
        
        GridLayout acomodo = new GridLayout(3,2);
        frame.setLayout(acomodo);
        frame.add(lblNumeroCliente);
        frame.add(txtNumeroCliente);
        frame.add(lblMontoInicial);
        frame.add(txtMontoInicial);
        frame.add(btnGuardar);
        frame.add(btnRegresar);
        
    }
    
    public void accionGuardar(){
        
         // Información a guardar
        String numero = txtNumeroCliente.getText();
        String monto = txtMontoInicial.getText();
        CRUDOperations operator = new CRUDOperations();
        String mensaje = operator.agregarRetiros(numero, monto);
        JOptionPane.showMessageDialog(null, mensaje, "Mensaje", JOptionPane.PLAIN_MESSAGE);
        txtNumeroCliente.setText("");
        txtMontoInicial.setText("");
    }
}
