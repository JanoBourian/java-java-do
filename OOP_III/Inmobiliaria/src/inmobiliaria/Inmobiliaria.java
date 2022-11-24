package inmobiliaria;

public class Inmobiliaria {

    public static void main(String[] args) {
        // TODO code application logic here
        CRUDOperations operator = new CRUDOperations();
        operator.searchInformation("1", "IXTAPA");
        MenuApp menu = new MenuApp();
        menu.setMenuApp();
    }
    
}
