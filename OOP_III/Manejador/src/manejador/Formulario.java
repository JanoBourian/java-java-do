package manejador;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import javax.swing.*;

public class Formulario extends JPanel{
    
    //Componentes del Formulario
    JPanel pnlFormulario = new javax.swing.JPanel();
    JLabel lblBrigadista = new javax.swing.JLabel();
    JTextField txtBrigadista= new javax.swing.JTextField();
    JLabel lblPiso = new javax.swing.JLabel();
    JTextField txtPiso= new javax.swing.JTextField();
    JLabel lblEdificio = new javax.swing.JLabel();
    JTextField txtEdificio = new javax.swing.JTextField();
    JLabel lblZona = new javax.swing.JLabel();
    JTextField txtZona= new javax.swing.JTextField();
    JButton btnGuardar = new javax.swing.JButton();
    JButton btnAbrir = new javax.swing.JButton();
    JButton btnSalir = new javax.swing.JButton();
    
    public void menuFormulario(){
        pnlFormulario.setBackground(new java.awt.Color(255, 255, 255));
        pnlFormulario.setBorder(
                javax.swing.BorderFactory.createTitledBorder(
                        javax.swing.BorderFactory.createLineBorder(
                        new java.awt.Color(153, 0, 0)),
                        "Formulario para guardar información",
                        javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                        javax.swing.border.TitledBorder.DEFAULT_POSITION,
                        new java.awt.Font("Tahoma", 0, 11),
                        new java.awt.Color(153, 0, 0)
        ));
    
    lblBrigadista.setText("Nombre del Brigadista: ");
    lblPiso.setText("Piso: ");
    lblEdificio.setText("Nombre del edificio: ");
    lblZona.setText("Zona: ");
    btnGuardar.setText("Guardar");
    btnAbrir.setText("Abrir");
    btnSalir.setText("Salir");
    
    btnGuardar.addMouseListener(
                new MouseAdapter(){
                    @Override
                    public void mouseClicked(MouseEvent e){
                        accionGuardar();
                    }
                }
        );
   
    btnAbrir.addMouseListener(
                new MouseAdapter(){
                    @Override
                    public void mouseClicked(MouseEvent e){
                        accionAbrir();
                    }
                }
        );
    
    btnSalir.addMouseListener(
                new MouseAdapter(){
                    @Override
                    public void mouseClicked(MouseEvent e){
                        accionSalir();
                    }
                }
        );
    
    GridLayout acomodo = new GridLayout(6, 2);
    pnlFormulario.setLayout(acomodo);
    pnlFormulario.add(lblBrigadista);
    pnlFormulario.add(txtBrigadista);
    pnlFormulario.add(lblPiso);
    pnlFormulario.add(txtPiso);
    pnlFormulario.add(lblEdificio);
    pnlFormulario.add(txtEdificio);
    pnlFormulario.add(lblZona);
    pnlFormulario.add(txtZona);
    pnlFormulario.add(btnGuardar);
    pnlFormulario.add(btnAbrir);
    pnlFormulario.add(btnSalir);

    }
    
    public void accionGuardar(){
        System.out.println("Acción Guardar");
        String brigadista = txtBrigadista.getText();
        String piso = txtPiso.getText();
        String edificio = txtEdificio.getText();
        String zona = txtZona.getText();   
        String completo = brigadista + "\n" + piso + "\n" + edificio + "\n" + zona + "\n";
        System.out.println(completo);
        txtBrigadista.setText("");
        txtPiso.setText("");
        txtEdificio.setText("");
        txtZona.setText("");
        
        String ruta = JOptionPane.showInputDialog("Ingresa el nombre del archivo: ");
        String carpeta = System.getProperty("user.dir");
        String direccionCompleta = carpeta+"/"+ruta+".txt";
        FileWriter ubicacion = null;
        try {
            ubicacion = new FileWriter(direccionCompleta);
        } catch (IOException ex) {
        }
        try{
            BufferedWriter escritor = new BufferedWriter(ubicacion);
            escritor.write(completo); 
            escritor.close(); 
        } catch(Exception e){
        }

        
    }
    
    public void accionAbrir(){
        System.out.println("Acción Abrir");
        String carpeta = System.getProperty("user.dir");
        // Selección del archivo a visualizar
        JFileChooser fc = new JFileChooser(carpeta);
        fc.showOpenDialog(null);
        File file = fc.getSelectedFile();
        System.out.println(file);
        String texto = "";
        String linea = "";
        try{
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while(((linea = br.readLine()))!= null){
                texto += linea+"\n";
            }
            System.out.println(texto);
            
        }catch(Exception e){
            
        }
        JOptionPane.showMessageDialog(null, texto, "Información contenida en el archivo", JOptionPane.PLAIN_MESSAGE);
    }
    
    public void accionSalir(){
        System.out.println("Acción Salir");
        pnlFormulario.setVisible(false);        
    }
    
    
}
