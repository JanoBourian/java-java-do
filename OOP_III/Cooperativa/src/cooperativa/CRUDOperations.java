package cooperativa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CRUDOperations extends Thread{
    
    // General properties for correct work
    String clienteGeneral;
    String montoGeneral;
    String nameFile = "balance";
    String completePath = System.getProperty("user.dir")+"\\"+nameFile+".txt";
    File f = new File(completePath);
    String nuevoMonto = "";
    String mensajeAdicional = "\n";
    String bigString = "";
    
    public String agregarAltas(String cliente, String monto){
        try{
            boolean op = checkFile();
            if(op){
                clienteGeneral = cliente;
                montoGeneral = monto;
                run();
                return clienteGeneral+ " ahora tiene: " + nuevoMonto + mensajeAdicional;
            }else{
                System.out.println("OCURRIÓ UN ERROR GRAVE!");
                return "Operación no se pudo realizar, contacte a soporte!";
            }
        }catch(Exception ex){
            System.out.println("EXCEPTION: "+ ex.toString());
            return "Operación no se pudo realizar, contacte a soporte!";
        }
    }
    
    public String agregarDepositos(String cliente, String monto){
        try{
            boolean op = checkFile();
            if(op){
                clienteGeneral = cliente;
                montoGeneral = monto;
                run();
                return clienteGeneral+ " ahora tiene: " + nuevoMonto + mensajeAdicional;
            }else{
                System.out.println("OCURRIÓ UN ERROR GRAVE!");
                return "Operación no se pudo realizar, contacte a soporte!";
            }
        }catch(Exception ex){
            System.out.println("EXCEPTION: "+ ex.toString());
            return "Operación no se pudo realizar, contacte a soporte!";
        }
    }
    
    public String agregarRetiros(String cliente, String monto){
        try{
            boolean op = checkFile();
            if(op){
                clienteGeneral = cliente;
                montoGeneral = "-"+monto;
                run();
                return clienteGeneral+ " ahora tiene: " + nuevoMonto + mensajeAdicional;
            }else{
                System.out.println("OCURRIÓ UN ERROR GRAVE!");
                return "Operación no se pudo realizar, contacte a soporte!";
            }
        }catch(Exception ex){
            System.out.println("EXCEPTION: "+ ex.toString());
            return "Operación no se pudo realizar, contacte a soporte!";
        }
    }
    
    public boolean checkFile(){
        // Checar si existe el archivo
        try{
            FileWriter ubication = null; 
            if(! f.exists()){
                ubication = new FileWriter(completePath, true);
                return true;
            }
            return true;
        }catch(Exception ex){
            System.out.println("EXCEPTION: "+ ex.toString());
            return false;
        }
    }
    
    @Override
    public void run(){
        try{
            // Guarda la información 
            // Abrimos el archivo de texto
            File f = new File(completePath);
            // Preparamos la información actual 
            BufferedReader br = new BufferedReader(new FileReader(f));
            String st;
            int elementosActuales = 0; 
            while((st=br.readLine())!= null){
                // Ahora ya sabemos las dimensiones
                elementosActuales += 1;
            }
            System.out.println("ELEMENTOS ACTUALES: " + elementosActuales);
            // Se construye un arreglo con la información actual
            if(elementosActuales > 0){
                String[][] elementos = new String[elementosActuales][2];
                int internos = 0;
                br = new BufferedReader(new FileReader(f));
                while((st=br.readLine())!= null){
                    // Se agrega información 
                    System.out.println("INTERNOS: " + internos);
                    String[] parts = st.split("\\,");
                    elementos[internos][0] = parts[0];
                    elementos[internos][1] = parts[1];
                    internos++;
                }
                // En caso de que sí buscamos ccincidencias
                internos = 0;
                br = new BufferedReader(new FileReader(f));
                int coincidencia = 0; 
                while((st=br.readLine())!= null){
                    // Se agrega información 
                    String[] parts = st.split("\\,");
                    System.out.println(parts[0]);
                    System.out.println(parts[1]);
                    System.out.println(clienteGeneral);
                    if(parts[0].equals(clienteGeneral)){
                        // En caso de que haya coincidencia operamos
                        float val = new Float(parts[1]);
                        float mov = new Float(montoGeneral);
                        float operacion = val + mov;
                        if((operacion)>=0){
                            // Es posible la operación modificamos ese parámetro
                            elementos[internos][1] = Float.toString(operacion);
                            nuevoMonto = Float.toString(operacion);
                        }else{
                            // No es posible dejamos tal cual
                            mensajeAdicional += "NO FUE POSIBLE REALIZAR ALGUNA OPERACIÓN\n";
                        }
                        coincidencia = 1; 
                    }
                    internos++;
                }
                // Guardamos lo que hay
                for(int i = 0; i < elementosActuales; i++){
                    bigString = bigString + elementos[i][0]+","+elementos[i][1]+",\n";
                }
                // Si no hubo coincidencia guardamos
                if(coincidencia == 0){
                    bigString = bigString + clienteGeneral +","+montoGeneral+",\n";
                    mensajeAdicional += "SE AGREGÓ CORRECTAMENTE\n";
                }
            }else{
                // En caso de no existir creamos un arreglo a guardar y guardamos
                // pero el monto debe ser positivo 
                float value = new Float(montoGeneral);
                if(value>0){
                    bigString = bigString + clienteGeneral +","+montoGeneral+",\n";
                    mensajeAdicional += "SE AGREGÓ CORRECTAMENTE\n";
                }else{
                    mensajeAdicional += "MONTO NEGATIVO NO ES VÁLIDO PARA DAR DE ALTA UNA CUENTA\n";
                }
            }
            FileWriter ubication = null; 
            ubication = new FileWriter(completePath);
            BufferedWriter writer = new BufferedWriter(ubication);
            writer.write(bigString);
            writer.close();
            
            // Acaba todo
            clienteGeneral = "";
            montoGeneral = ""; 
        }catch(Exception ex){
            System.out.println("EXCEPTION: "+ ex.toString());
        }
    }
    
}
