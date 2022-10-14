/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basictopics;

import javax.swing.JOptionPane;

/**
 *
 * @author super
 */
public class BasicTopics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] names;
        counter();
        int a = returnValue();
        System.out.println(a);
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Cuántos componentes deseas ver?: "));
        System.out.println(n);
        
        String aux;
        names = new String[n];
        for(int i = 0; i < n; i++){
            aux = JOptionPane.showInputDialog("Ingrese el nombre del elemento "+ i + ": ");
            names[i] = aux;
            System.out.println("names[" + i + "] = " + names[i]);
        }
        
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
        
    }
    
    public static void counter(){
        int basic = 0;
        while(basic < 10){
            System.out.println(basic);
            basic++;
        }
    }
    
    public static int returnValue(){
        return 1000;
    }
    
}
