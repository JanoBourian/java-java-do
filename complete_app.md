```java
package conversor;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class Conv {
    // Components
    
    // Money components
    JPanel pnlMoney = new javax.swing.JPanel();
    JLabel lbl1 = new javax.swing.JLabel();
    JComboBox cmbMoney = new javax.swing.JComboBox();
    JLabel lbl2 = new javax.swing.JLabel();
    JTextField txtCoins = new javax.swing.JTextField();
    JButton btnMoney = new javax.swing.JButton();
    
    // Temperature components
    JPanel pnlGrados = new javax.swing.JPanel();
    JLabel lblCentigrados = new javax.swing.JLabel();
    JSpinner spnCentigrados = new javax.swing.JSpinner();
    JCheckBox cbKelvin = new javax.swing.JCheckBox();
    JTextField txtKelvin = new javax.swing.JTextField();
    JCheckBox cbFh = new javax.swing.JCheckBox();
    JTextField txtFh = new javax.swing.JTextField();
    JButton btnTemp = new javax.swing.JButton();
    
    // Longitud
    JPanel pnlLongitud = new javax.swing.JPanel();
    JLabel lblLongitud = new javax.swing.JLabel();
    
    // Centímetros - Pulgadas
    JTextField txtPul = new javax.swing.JTextField();
    JLabel lblTxtPul = new javax.swing.JLabel();
    JTextField txtCentimetrosPul = new javax.swing.JTextField();
    JLabel lblCentimetroPul = new javax.swing.JLabel();
    JButton btnCentimetrosPul = new javax.swing.JButton();
    
    // Yardas - Metros
    JTextField txtYardas = new javax.swing.JTextField();
    JLabel lblTxtYardas = new javax.swing.JLabel();
    JTextField txtMetrosYardas = new javax.swing.JTextField();
    JLabel lblMetrosYardas = new javax.swing.JLabel();
    JButton btnMetrosYardas = new javax.swing.JButton();
    
    // Kilómetros - Millas
    JTextField txtMillas = new javax.swing.JTextField();
    JLabel lblTxtMillas = new javax.swing.JLabel();
    JTextField txtKmMillas = new javax.swing.JTextField();
    JLabel lblKmMillas = new javax.swing.JLabel();
    JButton btnKmMillas = new javax.swing.JButton();
    

    public void aparienciaTotal() {
        
        JFrame frame = new JFrame("Frame!");
        frame.setLocation(100,100);
        frame.setVisible(true);
        frame.setSize(900, 600);
        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Bye!");
                System.exit(0);
            }
        });
        
        aparienciaMoney();
        aparienciaGrados();
        aparienciaLongitud();
        
        frame.add(pnlMoney, BorderLayout.WEST);
        frame.add(pnlGrados, BorderLayout.CENTER );
        frame.add(pnlLongitud, BorderLayout.EAST);
    }
    
    public void aparienciaMoney(){
        pnlMoney.setBackground(new java.awt.Color(255, 255, 255));
        pnlMoney.setBorder(
                javax.swing.BorderFactory.createTitledBorder(
                        javax.swing.BorderFactory.createLineBorder(
                        new java.awt.Color(153, 0, 0)),
                        "Equivalencia de moneda",
                        javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                        javax.swing.border.TitledBorder.DEFAULT_POSITION,
                        new java.awt.Font("Tahoma", 0, 11),
                        new java.awt.Color(153, 0, 0)
        ));
        
        lbl1.setText("De: ");
        lbl2.setText("A pesos: ");
        
        cmbMoney.setModel(
                new javax.swing.DefaultComboBoxModel(
                        new String[] {"Euro", "Dolar", "Libra"}
                )
        );
        btnMoney.setText("Convertir");
        
        // Manejo de eventos en los botones
        btnMoney.addMouseListener(
                new MouseAdapter(){
                    @Override
                    public void mouseClicked(MouseEvent e){
                        equivalenciaMoneda();
                    }
                }
        );
        
        // Componentes del panel moneda
        GridLayout acomodo = new GridLayout(3,2);
        pnlMoney.setLayout(acomodo);
        pnlMoney.add(lbl1);
        pnlMoney.add(cmbMoney);
        pnlMoney.add(lbl2);
        pnlMoney.add(txtCoins);
        pnlMoney.add(btnMoney);
    }
        
    public void equivalenciaMoneda(){
        int eleccion = cmbMoney.getSelectedIndex();
        if(eleccion == 0){
            System.out.println("16.99");
            txtCoins.setText("16.99");
        }
        if(eleccion == 1){
            System.out.println("12.64");
            txtCoins.setText("12.64");
        }
        if(eleccion == 2){
            System.out.println("20.27");
            txtCoins.setText("20.27");
        }
    }
    
    public void aparienciaGrados(){
        pnlGrados.setBackground(new java.awt.Color(255, 255, 255));
        pnlGrados.setBorder(
                javax.swing.BorderFactory.createTitledBorder(
                        javax.swing.BorderFactory.createLineBorder(
                        new java.awt.Color(153, 0, 0)),
                        "Equivalencia de Grados",
                        javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                        javax.swing.border.TitledBorder.DEFAULT_POSITION,
                        new java.awt.Font("Tahoma", 0, 11),
                        new java.awt.Color(153,255, 0)
        ));
            
        lblCentigrados.setText("Centigrados");
        cbKelvin.setText("Kelvin");
        cbFh.setText("Fahrenheit");
        btnTemp.setText("Convertir");
        
        // Manejo de eventos del botón convertir
        btnTemp.addMouseListener(
                new MouseAdapter(){
                    @Override
                    public void mouseClicked(MouseEvent e){
                        equivalenciaGrados();
                    }
                }
        );
        
        // Componentes del panel Grados
        GridLayout acomodo = new GridLayout(4,2);
        pnlGrados.setLayout(acomodo);
        pnlGrados.add(lblCentigrados);
        pnlGrados.add(spnCentigrados);
        pnlGrados.add(cbFh);
        pnlGrados.add(txtFh);
        pnlGrados.add(cbKelvin);
        pnlGrados.add(txtKelvin);
        pnlGrados.add(btnTemp);
    }
    
    public void equivalenciaGrados(){
        int centigrados = Integer.parseInt(spnCentigrados.getValue().toString());
        
        double fr = ((9.0/5.0)*centigrados) + 32;
        float kv = (float) (centigrados+273.15);
        
        if(cbKelvin.isSelected()){
            txtKelvin.setText(String.valueOf(kv));
        }
        
        if(cbFh.isSelected()){
            txtFh.setText(String.valueOf(fr));
        }
    }
    
    public void aparienciaLongitud(){
            
        pnlLongitud.setBackground(new java.awt.Color(255, 255, 255));
        pnlLongitud.setBorder(
                javax.swing.BorderFactory.createTitledBorder(
                        "Equivalencia de Longitud"
        ));
        lblTxtPul.setText("Pulgadas");
        lblCentimetroPul.setText("Centímetros");
        btnCentimetrosPul.setText("Convertir");
        lblTxtYardas.setText("Yardas");
        lblMetrosYardas.setText("Metros");
        btnMetrosYardas.setText("Convertir");
        lblTxtMillas.setText("Millas");
        lblKmMillas.setText("Kilómetros");
        btnKmMillas.setText("Convertir");
        
        // Eventos de cada botón
        
        btnCentimetrosPul.addMouseListener(
                new MouseAdapter(){
                    @Override
                    public void mouseClicked(MouseEvent e){
                        convertirCm();
                    }
                }
        );
        
        btnMetrosYardas.addMouseListener(
                new MouseAdapter(){
                    @Override
                    public void mouseClicked(MouseEvent e){
                        convertirMt();
                    }
                }
        );
        
        btnKmMillas.addMouseListener(
                new MouseAdapter(){
                    @Override
                    public void mouseClicked(MouseEvent e){
                        convertirKm();
                    }
                }
        );
        
        // Se agregan los componentes
        GridLayout acomodo = new GridLayout(9,2);
        pnlLongitud.setLayout(acomodo);
        
        pnlLongitud.add(lblTxtPul);
        pnlLongitud.add(txtPul);
        pnlLongitud.add(lblCentimetroPul);
        pnlLongitud.add(txtCentimetrosPul);
        pnlLongitud.add(btnCentimetrosPul);
        pnlLongitud.add(new JLabel(" "));
        
        pnlLongitud.add(lblTxtYardas);
        pnlLongitud.add(txtYardas);
        pnlLongitud.add(lblMetrosYardas);
        pnlLongitud.add(txtMetrosYardas);
        pnlLongitud.add(btnMetrosYardas);
        pnlLongitud.add(new JLabel(" "));
        
        pnlLongitud.add(lblTxtMillas);
        pnlLongitud.add(txtMillas);
        pnlLongitud.add(lblKmMillas);
        pnlLongitud.add(txtKmMillas);
        pnlLongitud.add(btnKmMillas);
        pnlLongitud.add(new JLabel(" "));
        
    }
    
    public void convertirCm(){
        int pulgadas = Integer.parseInt(txtPul.getText());
        float cm = (float) (pulgadas*2.56);
        System.out.println(cm);
        txtCentimetrosPul.setText(String.valueOf(cm));
    }
    
    public void convertirMt(){
        int yardas = Integer.parseInt(txtYardas.getText());
        float metros = (float) (yardas*0.91440);
        System.out.println(metros);
        txtMetrosYardas.setText(String.valueOf(metros));
    }
    
    public void convertirKm(){
        int millas = Integer.parseInt(txtMillas.getText());
        float km = (float) (millas*1.609344);
        System.out.println(km);
        txtKmMillas.setText(String.valueOf(km));
    }
    
}

```