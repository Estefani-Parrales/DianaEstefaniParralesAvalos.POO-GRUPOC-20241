package tarea6;
public class Producto {
     private String name ;
    private float precio ;
    private int stock ;

    Producto(String name, float precio, int stock) {
        this.name = name;
        this.precio = precio;
        this.stock = stock;
    }

    Producto(String name, double precio, int stock) {
        this.name = name;
        this.precio = (float) precio;
        this.stock = 0 ;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null)
            System.out.println("Ingrese el nombre del producto.");
        else
        this.name = name;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        if (precio > 0) {
        this.precio = precio;
            System.out.println(precio);
        }
        else 
            System.out.println("Agregar cantidad.");
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock > 0) {
        this.stock = stock ;
            System.out.println(stock);
        }
        else 
            System.out.println("Agregar cantidad.");
    }
    String aumentarStock (int cantidad, int stock) {
        cantidad += stock ;
        if (stock > 0) {
        this.stock = stock ;
        }
        return String.format("%d" , cantidad) ;
    }
    String reducirStock (int cantidad) {
        if (stock > 0 && stock <= this.stock) {
            cantidad = stock -1;
        }
        return String.format("%d", cantidad) ;
    }
}