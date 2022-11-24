package cooperativa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CRUDOperations extends Thread{
    
    public void agregarAltas(String cliente, String monto){

    }
    
    public void agregarDepositos(String cliente, String monto){

    }
    
    public void agregarRetiros(String cliente, String monto){

    }
    
    @Override
    public void run(){
        try{
            String nameFile = "balance";
            String completePath = System.getProperty("user.dir")+"\\"+nameFile+".txt";
            File f = new File(completePath);
            if(f.exists()){
                System.out.println("DENTRO DEL ARCHIVO");
                // Traemos todos los elementos actuales
                BufferedReader br = new BufferedReader(new FileReader(f));
                String st;
                System.out.println("PARTE 1");
                while((st = br.readLine()) != null){
                    String[] parts = st.split("\\,");
                    String valores[] = {parts[0], parts[1]};
                    cuentasActuales.add(valores);
                    itemsCuentasActuales += 1;
                }
                
                
                System.out.println("PARTE 2");
                // Damos de alta
                for(int i = 0; i < altasTotales; i++){
                    for(int j = 0; j< itemsCuentasActuales; j++){
                        if(altas.get(i)[1].equals(cuentasActuales.get(j)[1])){
                            altas.get(i)[0] = "XXXXX";
                            break;
                        }
                    }
                }
                
                System.out.println("PARTE 3");
                for(int i = 0; i < altasTotales; i++){
                    if(!(altas.get(i)[0].equals("XXXXX"))){
                        String valores[] = {altas.get(i)[0], altas.get(i)[1]};
                        cuentasActuales.add(valores);
                        itemsCuentasActuales += 1;
                        System.out.println("ITEM CUENTAS TOTALES: " + itemsCuentasActuales);
                    }
                }
                
                System.out.println("PARTE 4");
                System.out.println("ITEMSCUENTASACTUALES: "+ itemsCuentasActuales);
                for(int i = 0; i < itemsCuentasActuales; i++){
                    System.out.println("VALOR: " + cuentasActuales.get(i)[0] + "-"+ cuentasActuales.get(i)[1]);
                }
                
                // Realizamos los depósitos
        
                // Realizamos los retiros
                
                // Escribir información
                FileWriter ubication = null; 
                ubication = new FileWriter(completePath, true);
                BufferedWriter writer = new BufferedWriter(ubication);
                for(int i = 0; i < itemsCuentasActuales ; i++){
                 writer.write(cuentasActuales.get(i)[0]+ "," + cuentasActuales.get(i)[1] +",\n");
                }
                writer.close();
            }else{
                FileWriter ubication = new FileWriter(completePath, true);
                BufferedWriter writer = new BufferedWriter(ubication);
                writer.close();
            }
            
        }catch(Exception ex){
            System.out.println("EXCEPTION: "+ ex.toString());
        }
    }
    
    
}
