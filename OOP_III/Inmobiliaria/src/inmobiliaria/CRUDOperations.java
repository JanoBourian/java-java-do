package inmobiliaria;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import javax.swing.*;

public class CRUDOperations {
    
    public String saveInformationLotes(
            String entidad,
            String super_manzana,
            String manzana,
            String calle,
            String uso_suelo,
            String latitud,
            String longitud,
            String superficie
    ){
        String stringToSave = entidad + "," +
                super_manzana +"," +
                manzana + "," +
                calle  + "," +
                uso_suelo  + "," +
                latitud  + "," +
                longitud  + "," +
                superficie  + ",\n";
        String nameFile = "inventario";
        String completePath = System.getProperty("user.dir")+"\\"+nameFile+".txt";
        System.out.println("COMPLETE PATH: " + completePath);
        int res = checkLines(completePath);
        FileWriter ubication = null; 
        if (res <= -1){
            return "Ocurrió un error en el guardado";
        }else{
            String completeString = res + "," + stringToSave;
            try{
                ubication = new FileWriter(completePath, true);
                BufferedWriter writer = new BufferedWriter(ubication);
                writer.write(completeString);
                writer.close();
                return "Guardado Exitoso";
            }catch(Exception ex){
                System.out.println("EXCEPTION: "+ ex.toString());
                return "Ocurrió un error en el guardado";
            }
        }
        
        
    }
    
    public String saveInformationAvaluos(
            int lote,
            String fechaAvaluo, 
            String vigencia,
            String valor
        ){
        String stringToSave =  lote + "," + fechaAvaluo +"," +
            vigencia +"," +
            valor + ",\n";
        
        String nameFile = "avaluos";
        String completePath = System.getProperty("user.dir")+"\\"+nameFile+".txt";
        System.out.println("COMPLETE PATH: " + completePath);
        int res = checkLines(completePath);
        FileWriter ubication = null; 
        if (res <= -1){
            return "Ocurrió un error en el guardado";
        }else{
            String completeString = res + "," + stringToSave;
            try{
                ubication = new FileWriter(completePath, true);
                BufferedWriter writer = new BufferedWriter(ubication);
                writer.write(completeString);
                writer.close();
                return "Guardado Exitoso";
            }catch(Exception ex){
                System.out.println("EXCEPTION: "+ ex.toString());
                return "Ocurrió un error en el guardado";
            }
        }
    }
    
    public String saveInformationVentas(int avaluo,
            String vendedor
        ){
        String stringToSave =  avaluo + "," + 
            vendedor + ",\n";
        
        String nameFile = "ventas";
        String completePath = System.getProperty("user.dir")+"\\"+nameFile+".txt";
        System.out.println("COMPLETE PATH: " + completePath);
        int res = checkLines(completePath);
        FileWriter ubication = null; 
        if (res <= -1){
            return "Ocurrió un error en el guardado";
        }else{
            String completeString = res + "," + stringToSave;
            try{
                ubication = new FileWriter(completePath, true);
                BufferedWriter writer = new BufferedWriter(ubication);
                writer.write(completeString);
                writer.close();
                return "Guardado Exitoso";
            }catch(Exception ex){
                System.out.println("EXCEPTION: "+ ex.toString());
                return "Ocurrió un error en el guardado";
            }
        }
    }
    
    public int checkLines(String completePath){
        File f = new File(completePath);
        int number = 0; 
        if(f.exists()){
            try{
                BufferedReader br = new BufferedReader(new FileReader(f));
                String st;
                while((st=br.readLine())!= null){
                    number = number + 1;
                }
                return number + 1;
            }catch(IOException ioe){
                System.out.println("ERROR: "+ ioe.toString());
                return -1;
            }
        }else{
            return 1;
        }
    }
    
    public String[] getAllLotes(){
        String nameFile = "inventario";
        String completePath = System.getProperty("user.dir")+"\\"+nameFile+".txt";
        File f = new File(completePath);
        int number = 0;
        if(f.exists()){
            try{
                BufferedReader br = new BufferedReader(new FileReader(f));
                String st;
                while((st=br.readLine())!= null){
                    number = number + 1;
                }
                System.out.println("NUMBER: " + number);
                String[] lista = new String[number]; 
                int i = 0; 
                br = new BufferedReader(new FileReader(f));
                while(i < number){
                    lista[i] = br.readLine();
                    i++;
                }
                return lista;
            }catch(IOException ioe){
                System.out.println("ERROR: "+ ioe.toString());
                return null;
            }
        }else{
            return null;
        }
    }
    
    public String[] getAllAvaluos(){
        String nameFile = "avaluos";
        String completePath = System.getProperty("user.dir")+"\\"+nameFile+".txt";
        File f = new File(completePath);
        int number = 0;
        if(f.exists()){
            try{
                BufferedReader br = new BufferedReader(new FileReader(f));
                String st;
                while((st=br.readLine())!= null){
                    number = number + 1;
                }
                System.out.println("NUMBER: " + number);
                String[] lista = new String[number]; 
                int i = 0; 
                br = new BufferedReader(new FileReader(f));
                while(i < number){
                    lista[i] = br.readLine();
                    i++;
                }
                return lista;
            }catch(IOException ioe){
                System.out.println("ERROR: "+ ioe.toString());
                return null;
            }
        }else{
            return null;
        }
    }
    
    public String[] getAllVentas(){
        String nameFile = "avaluos";
        String completePath = System.getProperty("user.dir")+"\\"+nameFile+".txt";
        File f = new File(completePath);
        int number = 0;
        if(f.exists()){
            try{
                BufferedReader br = new BufferedReader(new FileReader(f));
                String st;
                while((st=br.readLine())!= null){
                    number = number + 1;
                }
                System.out.println("NUMBER: " + number);
                String[] lista = new String[number]; 
                int i = 0; 
                br = new BufferedReader(new FileReader(f));
                while(i < number){
                    lista[i] = br.readLine();
                    i++;
                }
                return lista;
            }catch(IOException ioe){
                System.out.println("ERROR: "+ ioe.toString());
                return null;
            }
        }else{
            return null;
        }
    }
}
