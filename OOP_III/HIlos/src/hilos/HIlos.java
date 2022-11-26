package hilos;


public class HIlos {

    public static void main(String[] args) {
        // TODO code application logic here
        Proceso1 proceso_1 = new Proceso1();
        Thread proceso_2 = new Thread(new Proceso2());
        
        proceso_1.start();
        proceso_2.start();
    }
    
}
