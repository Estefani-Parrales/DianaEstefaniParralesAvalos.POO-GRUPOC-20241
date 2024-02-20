package poo.u2.t3;

public class POOU2T3 {
    public static void main(String[] args) {
        Persona uno = new Persona ("Tinga", 23, "12 de Abril de 1978", "Mujer") ;
      Persona dos = new Persona ("Josefín", 14, "28 de Febrero del 2010", "Hombre") ;
      Persona tres = new Persona ("Tuki", 57, "30 de Diciembre de 1780", "Mujer") ;
      Persona cuatro = new Persona ("Juancho", 37, "27 de Julio del 2023", "Hombre") ;
        System.out.println("Registro de Personas.");
        System.out.println("Nombre.     Edad.       Fecha Nacimiento.        Género.");
        System.out.println(uno.dataPerson());
        System.out.println(dos.dataPerson());
        System.out.println(tres.dataPerson());
        System.out.println(cuatro.dataPerson());
        
        System.out.println("Libros.");
               Book original = new Book();
        System.out.println("\n"+original.toString());
        System.out.println("");
        
        Book book1 = new Book () ;
        book1.setTitulo ("Misty.") ;
        book1.setAutor("Joss Stringir.");
        book1.setAñoPublicacion ("2017") ;
        book1.setCategoria ("Romance.") ;
        System.out.println("Título: "+book1.getTitulo()+"\n"+"Autor: "+book1.getAutor()+"\n"+"Año de Publicación: "+book1.getAñoPublicacion()+"\n"+"Categoría: "+book1.getCategoria());
        System.out.println("");
        
        Book book2 = new Book () ;
        book2.setTitulo ("Una Corte de Rosas y Espinas.") ;
        book1.setAutor("Sarah J. Maas.");
        book1.setAñoPublicacion ("2020") ;
        book1.setCategoria ("Fantasía") ;
        System.out.println("Título: "+book2.getTitulo()+"\n"+"Autor: "+book2.getAutor()+"\n"+"Año de Publicación: "+book2.getAñoPublicacion()+"\n"+"Categoría: "+book2.getCategoria());
        System.out.println("");
        
        Book book3 = new Book () ;
        book3.setTitulo ("Las mil y una noches.") ;
        book1.setAutor("Mario Vargas Llosa.");
        book1.setAñoPublicacion ("2008") ;
        book1.setCategoria ("Ciencia ficción.") ;
        System.out.println("Título: "+book1.getTitulo()+"\n"+"Autor: "+book1.getAutor()+"\n"+"Año de Publicación: "+book1.getAñoPublicacion()+"\n"+"Categoría: "+book1.getCategoria());
        System.out.println("");
        System.out.println("Propiedades de un rectángulo.") ;
            Rectángulo rectangulo1 = new Rectángulo (1.2, 3.4) ;
            Rectángulo rectangulo2 = new Rectángulo (4.5, 3.0) ;
            Rectángulo rectangulo3 = new Rectángulo (26, 72) ;
            Rectángulo rectangulo4 = new Rectángulo (504, 3) ;
            System.out.println("Rectángulo 1.") ;
            System.out.println("Area= " + rectangulo1.area() + "\nPerímetro =" + rectangulo1.perimetro() ) ;
            System.out.println("Rectángulo 2.") ;
            System.out.println("Area= " + rectangulo2.area() + "\nPerímetro =" + rectangulo2.perimetro() ) ;
            System.out.println("Rectángulo 3.") ;
            System.out.println("Area= " + rectangulo3.area() + "\nPerímetro =" + rectangulo3.perimetro() ) ;
            System.out.println("Rectángulo 4.") ;
            System.out.println("Area= " + rectangulo4.area() + "\nPerímetro =" + rectangulo4.perimetro() ) ;
            
        System.out.println("Fin de la tarea.");           
  
    }
    
}
