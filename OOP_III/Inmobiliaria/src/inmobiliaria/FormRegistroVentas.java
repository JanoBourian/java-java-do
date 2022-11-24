package inmobiliaria;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormRegistroVentas {
    JFrame frame = new JFrame("Registro de Ventas!");
    JPanel panel = new javax.swing.JPanel();
    
    //Lote
    JLabel lblAvaluo = new javax.swing.JLabel();
    JComboBox txtAvaluo = new javax.swing.JComboBox();
    
    // Vendedor
    JLabel lblVendedor= new javax.swing.JLabel();
    JTextField txtVendedor = new javax.swing.JTextField();
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
        
        lblAvaluo.setText("Avaluo");
        lblVendedor.setText("Nombre del vendedor");
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
        CRUDOperations options = new CRUDOperations();
        
        String[] dictionary = options.getAllAvaluos();
        // The combobox options
        txtAvaluo.setModel(new javax.swing.DefaultComboBoxModel(dictionary));
        txtAvaluo.setVisible(true);

        GridLayout acomodo = new GridLayout(6, 2);
        frame.setLayout(acomodo);
        frame.add(lblAvaluo);
        frame.add(txtAvaluo);
        frame.add(lblVendedor);
        frame.add(txtVendedor);
        frame.add(btnGuardar);
        frame.add(btnRegresar);
        frame.add(btnLimpiar);
    }
    
    public void accionGuardar(){
        CRUDOperations operator = new CRUDOperations();
        int avaluo = txtAvaluo.getSelectedIndex();
        String vendedor = txtVendedor.getText();
        String response = operator.saveInformationVentas(avaluo, vendedor);
        JOptionPane.showMessageDialog(null, response, "Mensaje", JOptionPane.PLAIN_MESSAGE);
        operator.start();
    }
    
    public void limpiarFormulario(){
        txtVendedor.setText("");
    }
}
