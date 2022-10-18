# java-java-do
Schoolar codes about java. 

# Important statemnts

```java
import javax.swing.JOptionPane;

int n = Integer.parseInt(JOptionPane.showInputDialog("Cuántos componentes deseas ver?: "));
System.out.println(n);
```

@override when you going to set the function
```java
package basictopics;

public abstract class AbstractClass {
    public abstract void areaCircul(int a);
    public abstract void setName(String name);
}
```

```java
package basictopics;

final class FinalClass {
    
    final public void finalMethod(){
        System.out.println("I'm a final method in a final class!");
    }
}
```

NOTE: Interfaces ares useful when you want to inherit from two or more classes:

Arrays:
```java
String[] names;
String aux;
names = new String[n];
for(int i = 0; i < n; i++){
    aux = JOptionPane.showInputDialog("Ingrese el nombre del elemento "+ i + ": ");
    names[i] = aux;
    System.out.println("names[" + i + "] = " + names[i]);
}
```

Try - Catch
```java
try{
    Alumno alumno = new Alumno();
    alumno.setName("Fernando");
    alumno.setAge(31);
    alumno.setMatricula(26568);
    alumno.getAge();
    alumno.getMatricula();
    alumno.getName();
}catch(java.lang.AbstractMethodError e){
    System.out.println(e);
}
```

## Events

Basic event
```java
package events;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class Events {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Example of eventes");
        frame.setLocation(100, 100);
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
}
```

Example of event mouse

```java
package events;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Events {

    public static void main(String[] args) {
        JButton boton = new JButton("Press here!");
        boton.setVisible(true);
        boton.setSize(100,100);
        boton.setLocation(100,100);
        
        JFrame frame = new JFrame("Example of eventes");
        frame.setLocation(100, 100);
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.add(boton);
        
        boton.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Diste CLick en el Botón");
            }
        });
        
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
}
```

Mouse events and keyboard events

```java
package events;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Events {

    public static void main(String[] args) {
        JTextField message_box = new JTextField("Label");
        message_box.setVisible(true);
        message_box.setSize(50,50);
        message_box.setLocation(400,400);
        
        JButton boton = new JButton("Press here!");
        boton.setVisible(true);
        boton.setSize(100,100);
        boton.setLocation(100,100);
        
        JFrame frame = new JFrame("Window!");
        frame.setLocation(100, 100);
        frame.setVisible(true);
        frame.setSize(800,800);
        frame.add(boton);
        frame.add(message_box);
        
        boton.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println("Diste CLick en el Botón");
            }
        });
        
        message_box.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e){
                System.out.println(e);
            }
        });
        
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Se ha cerrado la aplicación!");
                System.exit(0);
            }
        });
    }
}
```

Panels

```java
package gcomponents;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class GComponents {

    public static void main(String[] args) {
        // Frame
        JFrame frame = new JFrame("Window!");
        frame.setLocation(200, 200);
        frame.setVisible(true);
        frame.setSize(500, 500);
        
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing( WindowEvent e){
                System.out.println("The window was closed!");
                System.exit(0);
            }
        });
        
        // Panels
        JPanel panel = new javax.swing.JPanel();
        JPanel panel2 = new javax.swing.JPanel();
        JPanel panel3 = new javax.swing.JPanel();
        
        panel.setBackground(Color.CYAN);
        panel2.setBackground(Color.MAGENTA);
        panel3.setBackground(Color.ORANGE);
        
        frame.add(panel, BorderLayout.PAGE_START);
        frame.add(panel2, BorderLayout.CENTER);
        frame.add(panel3, BorderLayout.PAGE_END);
    }
}
```

Labels

```java
package labels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class Labels {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame!");
        frame.setLocation(100,100);
        frame.setVisible(true);
        frame.setSize(500, 500);
        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Bye!");
                System.exit(0);
            }
        });
        
        JLabel label1 = new javax.swing.JLabel();
        label1.setText("Example 1");
        label1.setFont(new java.awt.Font("Calibri", 1, 18));
        
        JLabel label2 = new javax.swing.JLabel();
        label2.setText("Example 2");
        label2.setForeground(Color.CYAN);
        label2.setFont(new java.awt.Font("Calibri", 1, 12));
        
        JLabel label3 = new javax.swing.JLabel();
        label3.setText("Example 3");
        label3.setForeground(Color.GREEN);
        label3.setFont(new java.awt.Font("Calibri", 1, 12));
        
        frame.add(label1, BorderLayout.PAGE_START);
        frame.add(label2, BorderLayout.CENTER);
        frame.add(label3, BorderLayout.PAGE_END);
    }
}
```

Buttons

```java
package buttons;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class Buttons {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame!");
        frame.setLocation(100,100);
        frame.setVisible(true);
        frame.setSize(500, 500);
        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Bye!");
                System.exit(0);
            }
        });
        
        JButton btn = new javax.swing.JButton();
        btn.setText("Boton 1");
        btn.setMnemonic('b');
        
        JButton btn2 = new javax.swing.JButton();
        btn2.setText("Boton 2");
        btn2.setBackground(Color.red);
        
        JButton btn3 = new javax.swing.JButton();
        btn3.setText("Boton 3");
        
        frame.add(btn, BorderLayout.PAGE_START);
        frame.add(btn2, BorderLayout.CENTER);
        frame.add(btn3, BorderLayout.PAGE_END);
    }
}
```

Selectable fields

```java
package select;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class Select {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame!");
        frame.setLocation(100,100);
        frame.setVisible(true);
        frame.setSize(500, 500);
        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Bye!");
                System.exit(0);
            }
        });
        
        JCheckBox check1 = new javax.swing.JCheckBox();
        check1.setText("Check 1");
        System.out.println(check1.isSelected());
        
        JCheckBox check2 = new javax.swing.JCheckBox();
        check2.setText("Check 2");
        check2.setSelected(true);
        System.out.println(check2.isSelected());
        
        JCheckBox check3 = new javax.swing.JCheckBox();
        check3.setText("Check 3");
        check3.setForeground(Color.red);
        System.out.println(check3.isSelected());
        
        frame.add(check1, BorderLayout.NORTH);
        frame.add(check2, BorderLayout.SOUTH);
        frame.add(check3, BorderLayout.CENTER);
    }
}
```

ComboBox

```java
package list;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class List {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame!");
        frame.setLocation(100,100);
        frame.setVisible(true);
        frame.setSize(500, 500);
        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Bye!");
                System.exit(0);
            }
        });
        
        JComboBox list1 = new javax.swing.JComboBox();
        list1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"UNO", "DOS", "TRES"}));
        list1.setVisible(true);
        
        frame.add(list1);
        System.out.println(list1.getSelectedItem().toString());
        System.out.println(list1.getSelectedIndex());
    }
}
```

TextField

```java
package textfield;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class TextField {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Frame!");
        frame.setLocation(100,100);
        frame.setVisible(true);
        frame.setSize(500, 500);
        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Bye!");
                System.exit(0);
            }
        });
        
        JTextField field1 = new JTextField();
        field1.setText("Text Box 1");
        
        JTextField field2 = new JTextField();
        field2.setText("Text Box 2");
        field2.setFont(new java.awt.Font("Tunga", 1, 24));
        field2.setForeground(new java.awt.Color(255, 51, 51));
        
        frame.add(field1, BorderLayout.LINE_START);
        frame.add(field2, BorderLayout.LINE_END);
        
        String text = field1.getText();
        String text2 = field2.getText();
        
        System.out.println(text);
        System.out.println(text2);
    }
}
```

TextArea

```java
package textarea;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class TextArea {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Frame!");
        frame.setLocation(100,100);
        frame.setVisible(true);
        frame.setSize(500, 500);
        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Bye!");
                System.exit(0);
            }
        });
        
        JTextArea area1 = new JTextArea();
        area1.setColumns(10);
        area1.setText("Text area 1");
        
        JTextArea area2 = new JTextArea();
        area2.setColumns(20);
        area2.setText("Text area 2");
        area2.setEditable(false);
        
        frame.add(area1, BorderLayout.LINE_START);
        frame.add(area2, BorderLayout.LINE_END);       
        
        String text = area1.getText();
        String text2 = area2.getText();
        
        System.out.println(text);
        System.out.println(text2);
    }
}
```

Separator

```java
package separator;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class Separator {


    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Frame!");
        frame.setLocation(100,100);
        frame.setVisible(true);
        frame.setSize(500, 500);
        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Bye!");
                System.exit(0);
            }
        });
        
        JLabel label1 = new javax.swing.JLabel();
        label1.setText("Label 1");
        
        JLabel label2 = new javax.swing.JLabel();
        label2.setText("Etiqueta 2");
        
        frame.add(label1, BorderLayout.PAGE_START);
        frame.add(new JSeparator(SwingConstants.HORIZONTAL),BorderLayout.CENTER);
        frame.add(label2, BorderLayout.PAGE_END);
    }
}
```

Spinner

```java
package spinner;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class Spinner {


    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Frame!");
        frame.setLocation(100,100);
        frame.setVisible(true);
        frame.setSize(500, 500);
        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Bye!");
                System.exit(0);
            }
        });
        
        JSpinner spn1 = new javax.swing.JSpinner();
        spn1.setModel(new javax.swing.SpinnerNumberModel(1, 0, 5, 1));
        
        JSpinner spn2 = new JSpinner();
        spn2.setModel(new javax.swing.SpinnerListModel(
                new String[] {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"}
        ));
        
        frame.add(spn1, BorderLayout.PAGE_START);
        frame.add(spn2, BorderLayout.PAGE_END);
        
        spn1.getValue().toString();
        spn2.getValue().toString();
    }
}
```

Tree

```java
package tree;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class Tree {


    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Frame!");
        frame.setLocation(100,100);
        frame.setVisible(true);
        frame.setSize(500, 500);
        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Bye!");
                System.exit(0);
            }
        });
        
        JTree arbol = new javax.swing.JTree();
        javax.swing.tree.DefaultMutableTreeNode e1 = new javax.swing.tree.DefaultMutableTreeNode("Start");
        javax.swing.tree.DefaultMutableTreeNode e2 = new javax.swing.tree.DefaultMutableTreeNode("First Part");
        javax.swing.tree.DefaultMutableTreeNode e3 = new javax.swing.tree.DefaultMutableTreeNode("E1-S1");
        
        e1.add(e2);
        e2.add(e3);
        
        e3 = new javax.swing.tree.DefaultMutableTreeNode("E2-S1");
        e2.add(e3);
        e3 = new javax.swing.tree.DefaultMutableTreeNode("E2-S1");
        e2.add(e3);
        
        e2 = new javax.swing.tree.DefaultMutableTreeNode("Second Part");
        e3 = new javax.swing.tree.DefaultMutableTreeNode("E1-S1");
        e2.add(e3);
        e3 = new javax.swing.tree.DefaultMutableTreeNode("E2-S1");
        e2.add(e3);
        
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("SE1-E2-S2");
        e3.add(treeNode4);
        e2.add(e3);
        e1.add(e2);
        
        arbol.setModel(new javax.swing.tree.DefaultTreeModel(e1));
        
        frame.add(arbol, BorderLayout.CENTER);   
    }   
}
```

Example of little menu

```java
package menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class Menu {

    public static void main(String[] args) {
        
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
        
        JPanel pnl1 = new javax.swing.JPanel();
        pnl1.setBackground(Color.CYAN);
        
        JMenuBar bar = new javax.swing.JMenuBar();
        JMenu element1 = new javax.swing.JMenu();
        element1.setText("Elemento 1");
        
        JMenu element2 = new javax.swing.JMenu();
        element2.setText("Elemento 2");
        
        JMenu element3 = new javax.swing.JMenu();
        element3.setText("SUB Elemento 1");
        
        element2.add(element3);
        bar.add(element1);
        bar.add(element2);
        
        frame.add(bar, BorderLayout.PAGE_START);
        frame.add(pnl1, BorderLayout.PAGE_END);
    }
}
```

Menú Emergente

```java
package menuemergente;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class MenuEmergente {

    public static void main(String[] args) {
       
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
        
        JPopupMenu popup = new JPopupMenu();
        JMenuItem menu1 = new JMenuItem("Menu Item");
        JMenuItem menu2 = new JMenuItem("Otro Item"); 
        popup.add(menu1);
        popup.add(menu2);
        
        frame.add(popup, BorderLayout.PAGE_START);
        
    }
    
}

```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```

```java
```
