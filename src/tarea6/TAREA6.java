package tarea6;
public class TAREA6 {
    public static void main(String[] args) {
        Producto audifonos = new Producto ("Huawaii", 900, 0) ;
        Producto celular = new Producto ("Samsung", 800, 3) ;
        Producto pantalla = new Producto ("Redmi", 900, 0) ;
        System.out.println(" Producto: "+audifonos.getName()
                          +"\n Precio: "+audifonos.getPrecio()
                          +"\n Stock: "+audifonos.getStock()) ;
         System.out.println("Aumentar producto +8.");
        System.out.println("Nueva cantidad: "+audifonos.aumentarStock(0, 8));
        System.out.println("Reducir 4 productos. Nueva cantidad: "+pantalla.reducirStock(4));
        System.out.println(" Producto: "+celular.getName()
                          +"\n Precio: "+celular.getPrecio()
                          +"\n Stock: "+celular.getStock()) ;
         System.out.println("Aumentar producto +14.");
        System.out.println("Nueva cantidad: "+pantalla.aumentarStock(3, 14));
        System.out.println("Reducir 2 productos. Nueva cantidad: "+pantalla.reducirStock(2));
        System.out.println(" Producto: "+pantalla.getName()
                          +"\n Precio: "+pantalla.getPrecio()
                          +"\n Stock: "+pantalla.getStock()) ;
        System.out.println("Aumentar producto.");
        System.out.println("Nueva cantidad: "+pantalla.aumentarStock(3, 5));
        System.out.println("Reducir 5 productos. Nueva cantidad: "+pantalla.reducirStock(5));
    }
    
}
