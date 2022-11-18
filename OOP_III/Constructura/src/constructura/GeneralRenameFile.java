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
public class GeneralRenameFile {
    JFrame frame = new JFrame("General Rename!");
    JPanel panel = new javax.swing.JPanel();
    // Archivo
    JLabel lblNameFile = new javax.swing.JLabel();
    JTextField txtNameFile = new javax.swing.JTextField();
    // Archivo
    JLabel lblNewNameFile = new javax.swing.JLabel();
    JTextField txtNewNameFile = new javax.swing.JTextField();
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
        
        lblNameFile.setText("Nombre actual del archivo");
        lblNewNameFile.setText("Nombre del nuevo archivo:");
        btnGuardar.setText("Renombrar");
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
        
        GridLayout acomodo = new GridLayout(3, 2);
        frame.setLayout(acomodo);
        frame.add(lblNameFile);
        frame.add(txtNameFile);
        frame.add(lblNewNameFile);
        frame.add(txtNewNameFile);
        frame.add(btnGuardar);
        frame.add(btnRegresar);
        
    }
    
    public void accionSearch(){
        CRUDOperations operator = new CRUDOperations();
        String nameFile = txtNameFile.getText();
        String newNameFile = txtNewNameFile.getText();
        String info = operator.renameFile(nameFile, newNameFile);
        System.out.println("INFO: "+ info);
        JOptionPane.showMessageDialog(null, info, "Mensaje", JOptionPane.PLAIN_MESSAGE);
        txtNameFile.setText("");
        txtNewNameFile.setText("");
    }
}
