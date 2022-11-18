package hilos;

public class Proceso2 implements Runnable{
    
    @Override
    public void run(){
        for(int i = 0; i < 1000000; i++){
            System.out.println("PROCESO 2: "+ i);
        }
    }
}
