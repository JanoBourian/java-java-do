/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructura;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author super
 */
public class GeneralSearch {
    JFrame frame = new JFrame("General Search!");
    JPanel panel = new javax.swing.JPanel();
    // Encargado
    JLabel lblEncargado = new javax.swing.JLabel();
    JTextField txtEncargado = new javax.swing.JTextField();
    // Obra
    JLabel lblObra = new javax.swing.JLabel();
    JTextField txtObra = new javax.swing.JTextField();
    // Archivo
    JLabel lblNameFile = new javax.swing.JLabel();
    JTextField txtNameFile = new javax.swing.JTextField();
    // Botón Guardar
    JButton btnGuardar = new javax.swing.JButton();
    // Botón regresar
    JButton btnRegresar = new javax.swing.JButton();
    
    public void setForm(){
        frame.setLocation(200,200);
        frame.setSize(600, 150);
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
        lblNameFile.setText("Nombre del archivo a trabajar:");
        btnGuardar.setText("Buscar");
        btnRegresar.setText("Regresar");
        
        btnGuardar.addMouseListener(
                new MouseAdapter(){
                    @Override
                    public void mouseClicked(MouseEvent e){
                        accionSearch();
                    }
                }
        );
        
        btnRegresar.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                frame.dispose();
            }
        });
        
        GridLayout acomodo = new GridLayout(4, 2);
        frame.setLayout(acomodo);
        frame.add(lblEncargado);
        frame.add(txtEncargado);
        frame.add(lblObra);
        frame.add(txtObra);
        frame.add(lblNameFile);
        frame.add(txtNameFile);
        frame.add(btnGuardar);
        frame.add(btnRegresar);
        
    }
    
    public void accionSearch(){
        CRUDOperations operator = new CRUDOperations();
        String encargado = txtEncargado.getText();
        String obra = txtObra.getText();
        String nameFile = txtNameFile.getText();
        String info = operator.searchInformation(encargado, obra, nameFile);
        System.out.println("INFO: "+ info);
        JOptionPane.showMessageDialog(null, info, "Información encontrada", JOptionPane.PLAIN_MESSAGE);
    }
}
