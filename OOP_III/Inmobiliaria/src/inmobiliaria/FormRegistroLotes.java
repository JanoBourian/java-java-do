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
    // Botón Limpiar Formulario
    JButton btnLimpiar = new javax.swing.JButton();
    
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
        
        lblEntidad.setText("Entidad");
        lblSuperManzana.setText("SuperManzana");
        lblManzana.setText("Manzana");
        lblCalle.setText("Calle");
        lblUsoSuelo.setText("Uso de Suelo");
        lblLatitud.setText("Latitud");
        lblLongitud.setText("Longitud");
        lblSuperficie.setText("Superficie en metros");
        btnGuardar.setText("Guardar");
        btnRegresar.setText("Regresar");
        btnLimpiar.setText("Limpiar el formulario");
        
        btnGuardar.addMouseListener(
                new MouseAdapter(){
                    @Override
                    public void mouseClicked(MouseEvent e){
                        accionGuardar();
                    }
                }
        );
        
        btnRegresar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                frame.dispose();
            }
        });
        
        btnLimpiar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                limpiarFormulario();
            }
        });
        
        // The combobox options
        txtEntidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"CANCÚN", "IXTAPA", "LORETO"}));
        txtEntidad.setVisible(true);
        txtUsoSuelo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"RESIDENCIAL", "COMERCIAL", "HOTELERO"}));
        txtUsoSuelo.setVisible(true);

        GridLayout acomodo = new GridLayout(10, 2);
        frame.setLayout(acomodo);
        frame.add(lblEntidad);
        frame.add(txtEntidad);
        frame.add(lblSuperManzana);
        frame.add(txtSuperManzana);
        frame.add(lblManzana);
        frame.add(txtManzana);
        frame.add(lblCalle);
        frame.add(txtCalle);
        frame.add(lblUsoSuelo);
        frame.add(txtUsoSuelo);
        frame.add(lblLatitud);
        frame.add(txtLatitud);
        frame.add(lblLongitud);
        frame.add(txtLongitud);
        frame.add(lblSuperficie);
        frame.add(txtSuperficie);
        frame.add(btnGuardar);
        frame.add(btnRegresar);
        frame.add(btnLimpiar);
    }
    
    public void accionGuardar(){
        CRUDOperations operator = new CRUDOperations();
        String entidad = txtEntidad.getSelectedItem().toString();
        String superManzana = txtSuperManzana.getText();
        String manzana = txtManzana.getText();
        String calle = txtCalle.getText();
        String usoSuelo = txtUsoSuelo.getSelectedItem().toString();
        String latitud = txtLatitud.getText();
        String longitud = txtLongitud.getText();
        String superficie = txtSuperficie.getText();
        String response = operator.saveInformationLotes(entidad, superManzana, manzana, calle, usoSuelo, latitud, longitud, superficie);
        JOptionPane.showMessageDialog(null, response, "Mensaje", JOptionPane.PLAIN_MESSAGE);
    }
    
    public void limpiarFormulario(){
        txtSuperManzana.setText("");
        txtManzana.setText("");
        txtCalle.setText("");
        txtLatitud.setText("");
        txtLongitud.setText("");
        txtSuperficie.setText("");
    }
    
}
