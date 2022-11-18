package hilos;

public class Proceso1 extends Thread {
    
    @Override
    public void run(){
        for(int i = 0; i < 100000; i++){
            System.out.println("PROCESO 1: "+ i);
        }
    }
}
