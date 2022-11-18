/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructura;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

/**
 *
 * @author super
 */
public class GeneralForm {
    JFrame frame = new JFrame("General Form!");
    JPanel panel = new javax.swing.JPanel();
    // Encargado
    JLabel lblEncargado = new javax.swing.JLabel();
    JTextField txtEncargado = new javax.swing.JTextField();
    // Obra
    JLabel lblObra = new javax.swing.JLabel();
    JTextField txtObra = new javax.swing.JTextField();
    // Zona
    JLabel lblZona = new javax.swing.JLabel();
    JTextField txtZona = new javax.swing.JTextField();
    // Metros
    JLabel lblMetros = new javax.swing.JLabel();
    JTextField txtMetros = new javax.swing.JTextField();
    // Departamento
    JLabel lblDepartamento = new javax.swing.JLabel();
    JTextField txtDepartamento = new javax.swing.JTextField();
    // Fecha de Entrega
    JLabel lblEntrega = new javax.swing.JLabel();
    JTextField txtEntrega = new javax.swing.JTextField();
    // Archivo
    JLabel lblNameFile = new javax.swing.JLabel();
    JTextField txtNameFile = new javax.swing.JTextField();
    // Botón Guardar
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
        
        lblEncargado.setText("Encargado:");
        lblObra.setText("Obra:");
        lblZona.setText("Zona:");
        lblMetros.setText("Metros:");
        lblDepartamento.setText("Departamento:");
        lblEntrega.setText("Fecha:");
        lblNameFile.setText("Nombre del archivo a guardar:");
        btnGuardar.setText("Guardar");
        btnRegresar.setText("Regresar");
        
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
        
        GridLayout acomodo = new GridLayout(9, 2);
        frame.setLayout(acomodo);
        frame.add(lblEncargado);
        frame.add(txtEncargado);
        frame.add(lblObra);
        frame.add(txtObra);
        frame.add(lblZona);
        frame.add(txtZona);
        frame.add(lblMetros);
        frame.add(txtMetros);
        frame.add(lblDepartamento);
        frame.add(txtDepartamento);
        frame.add(lblEntrega);
        frame.add(txtEntrega);
        frame.add(lblNameFile);
        frame.add(txtNameFile);
        frame.add(btnGuardar);
        frame.add(btnRegresar);
        
    }
    
    public void accionGuardar(){
        CRUDOperations operator = new CRUDOperations();
        String encargado = txtEncargado.getText();
        String obra = txtObra.getText();
        String zona = txtZona.getText();
        String metros = txtMetros.getText();
        String departamento = txtDepartamento.getText();
        String entrega = txtEntrega.getText();
        String nameFile = txtNameFile.getText();
        operator.saveInformation(encargado, obra, zona, metros, departamento, entrega, nameFile);
        JOptionPane.showMessageDialog(null, "Se agregó", "Mensaje", JOptionPane.PLAIN_MESSAGE);
        txtEncargado.setText("");
        txtObra.setText("");
        txtZona.setText("");
        txtMetros.setText("");
        txtDepartamento.setText("");
        txtEntrega.setText("");
        txtNameFile.setText("");
    }
}
