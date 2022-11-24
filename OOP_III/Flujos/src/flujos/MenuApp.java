package flujos;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MenuApp {
    File file = null;

    JFrame frame = new JFrame("Registro de Alumnos");
    JPanel panel = new javax.swing.JPanel();
    
    // No. estudiante
    JLabel lblNoEstudiante = new javax.swing.JLabel();
    JTextField txtNoEstudiante = new javax.swing.JTextField();
    
    // Nombre
    JLabel lblNombre = new javax.swing.JLabel();
    JTextField txtNombre = new javax.swing.JTextField();
    
    // Apellido paterno
    JLabel lblPaterno = new javax.swing.JLabel();
    JTextField txtPaterno = new javax.swing.JTextField();
    
    // Apellido materno
    JLabel lblMaterno = new javax.swing.JLabel();
    JTextField txtMaterno = new javax.swing.JTextField();
    
    // Carrera
    JLabel lblCarrera = new javax.swing.JLabel();
    JTextField txtCarrera = new javax.swing.JTextField();
    
    // Fotografía
    JLabel lblFotografia = new javax.swing.JLabel();
    JButton btnLoadFile = new javax.swing.JButton();
    
    // Fotografia en Stream
    JButton btnConvertFile = new javax.swing.JButton();
    JTextArea txtConvertFile = new JTextArea();
    
    // Información en Stream
    JButton btnConvertInfo = new javax.swing.JButton();
    JTextArea txtConvertInfo = new JTextArea();
    
    // Visualizar el formulario
    public void setForm(){
        // Formulario y opciones de cerrado
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

        lblNoEstudiante.setText("NoEstudiante");
        lblNombre.setText("Nombre");
        lblPaterno.setText("Paterno");
        lblMaterno.setText("Materno");
        lblCarrera.setText("Carrera");
        lblFotografia.setText("Fotografia");
        btnLoadFile.setText("Cargar Fotografía");
        btnConvertFile.setText("Imagen");
        btnConvertInfo.setText("Caracteres");
        
        // Acciones/eventos
        btnLoadFile.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                setFile();
            }
        });
        
        btnConvertFile.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                streamFile();
            }
        });
        
        btnConvertInfo.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                streamInfo();
            }
        });

        // Acomodo
        GridLayout acomodo = new GridLayout(8, 2);
        frame.setLayout(acomodo);
        frame.add(lblNoEstudiante);
        frame.add(txtNoEstudiante);
        frame.add(lblNombre);
        frame.add(txtNombre);
        frame.add(lblPaterno);
        frame.add(txtPaterno);
        frame.add(lblMaterno);
        frame.add(txtMaterno);
        frame.add(lblCarrera);
        frame.add(txtCarrera);
        frame.add(lblFotografia);
        frame.add(btnLoadFile);
        frame.add(btnConvertFile);
        frame.add(txtConvertFile);
        frame.add(btnConvertInfo);
        frame.add(txtConvertInfo);
    }
    
    // Subir la fotografía
    public void setFile(){
        JFileChooser fc= new JFileChooser();
        fc.showOpenDialog(null);
        file = fc.getSelectedFile();
        System.out.print(file);
    }
    
    // Operaciones para convertir el archivo en stream y presentar 
    public void streamFile(){

        FileInputStream in = null;
        
        try{            
            in = new FileInputStream(file);
            System.out.println("IN: "+ in.toString());
            System.out.println(in.read());
            txtConvertFile.setText(in.toString());
            
        }catch(IOException e){
            System.out.println("EXCEPTION: " + e.toString());
        }
    }
    
    // Operaciones para convertir la información en stream y presentar 
    public void streamInfo(){
        String noEstudiante = txtNoEstudiante.getText();
        String nombre = txtNombre.getText();
        String paterno = txtPaterno.getText();
        String materno = txtMaterno.getText();
        String carrera = txtCarrera.getText();
        String stringToConvert = noEstudiante + ","+
                nombre + ","+
                paterno + ","+
                materno + ","+
                carrera+ ",";
        
        System.out.println(stringToConvert);
        try{
            byte[] bytes = stringToConvert.getBytes(StandardCharsets.UTF_8);
            System.out.println("BYTES: " + bytes);
            InputStream in = new ByteArrayInputStream(bytes);
            String out = null; 
            Scanner scanner = new Scanner(in, StandardCharsets.UTF_8.name());
            out = scanner.useDelimiter("\\A").next();
            txtConvertInfo.setText(out);
            in.close();
        }catch(IOException e){
            System.out.println("EXCEPTION: " + e.toString());
        }
    }
}
