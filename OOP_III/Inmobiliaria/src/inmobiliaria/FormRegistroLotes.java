package inmobiliaria;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class FormRegistroLotes {
    JFrame frame = new JFrame("Registro de Lotes!");
    JPanel panel = new javax.swing.JPanel();
    
    // Entidad
    JLabel lblEntidad = new javax.swing.JLabel();
    JComboBox txtEntidad = new javax.swing.JComboBox();    
    // Super Manzana
    JLabel lblSuperManzana = new javax.swing.JLabel();
    JTextField txtSuperManzana = new javax.swing.JTextField();
    // Manzana
    JLabel lblManzana = new javax.swing.JLabel();
    JTextField txtManzana = new javax.swing.JTextField();
    // Calle
    JLabel lblCalle = new javax.swing.JLabel();
    JTextField txtCalle = new javax.swing.JTextField();
    // Uso_suelo
    JLabel lblUsoSuelo = new javax.swing.JLabel();
    JComboBox txtUsoSuelo= new javax.swing.JComboBox();
    // Latitud
    JLabel lblLatitud = new javax.swing.JLabel();
    JTextField txtLatitud = new javax.swing.JTextField();
    // Longitud
    JLabel lblLongitud = new javax.swing.JLabel();
    JTextField txtLongitud = new javax.swing.JTextField();
    // Superficie 
    JLabel lblSuperficie = new javax.swing.JLabel();
    JTextField txtSuperficie = new javax.swing.JTextField();
    // Botón guardar
    JButton btnGuardar = new javax.swing.JButton();
    // Botón regresar 
    JButton btnRegresar = new javax.swing.JButton();
    
    public void setForm(){
        frame.setLocation(200,200);
        frame.setSize(600, 300);
        frame.setVisible(true);
        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Bye!");
                System.exit(0);
            }
        });
        
        txtEntidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"CANCÚN", "IXTAPA", "LORETO"}));
        txtEntidad.setVisible(true);
        
        txtUsoSuelo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"RESIDENCIAL", "COMERCIAL", "HOTELERO"}));
        txtUsoSuelo.setVisible(true);
    }
    
    public void accionGuardar(){
        
    }
    
}
