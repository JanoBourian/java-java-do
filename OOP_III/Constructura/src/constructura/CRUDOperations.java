/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructura;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import javax.swing.*;
/**
 *
 * @author super
 */
public class CRUDOperations {
    /*
    The order of information in a text file is:
    - encargado:string
    - obra:string
    - zona:string
    - metros:string
    - departamento:string
    - fechaEntrega:string
    - nameFile:string
    */
    
    // Save information in a text file
    public void saveInformation(
            String encargado, 
            String obra,
            String zona, 
            String metros,
            String departamento,
            String fechaEntrega, 
            String nameFile){
        
        String stringToSave = encargado + 
                "," +
                obra + 
                "," +
                zona +
                "," +
                metros +
                "," +
                departamento + 
                "," +
                fechaEntrega+ 
                ",\n";
        
        String completePath = System.getProperty("user.dir")+"/"+nameFile+".txt";
        FileWriter ubication = null; 
        try{
            ubication = new FileWriter(completePath, true);
        }catch(IOException ex){
            System.out.println("EXCEPTION: "+ ex.toString());
        }
        try{
            BufferedWriter writer = new BufferedWriter(ubication);
            writer.write(stringToSave);
            writer.close();
        }catch(Exception ex){
            System.out.println("EXCEPTION: "+ ex.toString());
        }
        
    }
    
    // Search information in a text file
    public String searchInformation(String encargado, String obra, String nameFile){
        String completePath = System.getProperty("user.dir")+"/"+nameFile+".txt";
        File f = new File(completePath);
        if(f.exists()){
            try{
                BufferedReader br = new BufferedReader(new FileReader(f));
                String st;
                while((st=br.readLine())!= null){
                    if((st.contains(encargado+",")) & (st.contains(obra+","))){
                        return st;
                    }
                }
                return "No se encontró información con esos parámetros";
            }catch(IOException ioe){
                System.out.println("ERROR: "+ ioe.toString());
                return "Some error!";
            }
        }else{
            return "Ruta o archivo no encontrado";
        }
    }

    
    // Delete information in a text file 
    public String deleteInformation(String encargado, String zona, String nameFile){
        String completePath = System.getProperty("user.dir")+"/"+nameFile+".txt";
        File f = new File(completePath);
        if(f.exists()){
            try{
                BufferedReader br = new BufferedReader(new FileReader(f));
                String bigestString = "";
                String st;
                while((st=br.readLine())!= null){
                    if((st.contains(encargado+",")) & (st.contains(zona+","))){
                        System.out.println("Eliminado");
                    }else{
                        bigestString =  bigestString + st + "\n";
                    }
                }
                FileWriter ubication = null; 
                try{
                    ubication = new FileWriter(completePath);
                }catch(IOException ex){
                    System.out.println("EXCEPTION: "+ ex.toString());
                }
                try{
                    BufferedWriter writer = new BufferedWriter(ubication);
                    writer.write(bigestString);
                    writer.close();
                }catch(Exception ex){
                    System.out.println("EXCEPTION: "+ ex.toString());
               }
                
                return "Información con base en parámetros ha sido eliminada";
            }catch(IOException ioe){
                System.out.println("ERROR: "+ ioe.toString());
                return "Some error!";
            }
        }else{
            return "Ruta o archivo no encontrado";
        }
    }
    
    // Search nameFile and rename
    public String renameFile(String currentName, String newName){
        try{
            String currentCompletePath = System.getProperty("user.dir")+"/"+currentName+".txt";
            String newCompletePath = System.getProperty("user.dir")+"/"+newName+".txt";
            File file = new File(currentCompletePath);
            File rename = new File(newCompletePath);
            boolean flag = file.renameTo(rename);
            if(flag){
                return "File Succesfully Rename!";
            }else{
                return "Operation Failed";
            }
        }catch(Exception e){
            System.out.println("ERROR: "+ e);
            return "Ocurrió un error en tiempo de ejecución";
        }
        
    }
    
    
}
