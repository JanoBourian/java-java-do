package inmobiliaria;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class FormRegistroAvaluos {
    
    JFrame frame = new JFrame("Registro de Avalúos!");
    JPanel panel = new javax.swing.JPanel();
    
    //Lote
    JLabel lblLote = new javax.swing.JLabel();
    JComboBox txtLote = new javax.swing.JComboBox();    
    // Fecha avalúo
    JLabel lblFechaAvaluo= new javax.swing.JLabel();
    JTextField txtFechaAvaluo = new javax.swing.JTextField();
    // Vigencia
    JLabel lblVigencia = new javax.swing.JLabel();
    JTextField txtVigencia = new javax.swing.JTextField();
    // Valor
    JLabel lblValor = new javax.swing.JLabel();
    JTextField txtValor = new javax.swing.JTextField();
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
        
        lblLote.setText("Lote");
        lblFechaAvaluo.setText("Fecha Vigencia");
        lblVigencia.setText("Vigencia");
        lblValor.setText("Valor");
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
        
        String[] dictionary = options.getAllLotes();
        // The combobox options
        txtLote.setModel(new javax.swing.DefaultComboBoxModel(dictionary));
        txtLote.setVisible(true);

        GridLayout acomodo = new GridLayout(6, 2);
        frame.setLayout(acomodo);
        frame.add(lblLote);
        frame.add(txtLote);
        frame.add(lblFechaAvaluo);
        frame.add(txtFechaAvaluo);
        frame.add(lblVigencia);
        frame.add(txtVigencia);
        frame.add(lblValor);
        frame.add(txtValor);
        frame.add(btnGuardar);
        frame.add(btnRegresar);
        frame.add(btnLimpiar);
    }
    
    public void accionGuardar(){
        CRUDOperations operator = new CRUDOperations();
        int lote = txtLote.getSelectedIndex();
        String fechaAvaluo = txtFechaAvaluo.getText();
        String vigencia = txtVigencia.getText();
        String valor = txtValor.getText();
        String response = operator.saveInformationAvaluos(lote, fechaAvaluo, vigencia, valor);
        JOptionPane.showMessageDialog(null, response, "Mensaje", JOptionPane.PLAIN_MESSAGE);
    }
    
    public void limpiarFormulario(){
        txtFechaAvaluo.setText("");
        txtVigencia.setText("");
        txtValor.setText("");
    }
}
