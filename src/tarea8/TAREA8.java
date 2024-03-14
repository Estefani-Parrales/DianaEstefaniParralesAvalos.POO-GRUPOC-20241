package tarea8;
import java.util.ArrayList;
import java.util.Scanner;       
import java.util.Random;
import static tarea8.Libreria.buscarLibroPorCodigo;
public class TAREA8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Random alea = new Random ();
        Libreria libreriaUno = new Libreria();          
        ArrayList<Usuarios>usuarios=new ArrayList<Usuarios>();   
        ArrayList<Books>libros=new ArrayList<Books>();
        ArrayList <Books>librosDisponibles = new ArrayList<Books>();
        ArrayList<Books>librosRentados=new ArrayList<Books>();
        ArrayList<Usuarios>usuariosActivos=new ArrayList<Usuarios>();
        
        Books libro1 = new Books ("Ciudad Media Luna Vol. 1", "8 de Octubre del 2020", "Sarah J. Aamas.", true, 1234);
        Books libro2 = new Books ("Sky.", "7 de Diciembre del 2018", "Joss Stringir", true, 5678);
        Books libro3 = new Books ("Fireligth", "9 de Octubre del 2017", "Unknow",true, 9012);
        
        Usuarios usuario1 = new Usuarios("Pedro.", 123, true);
        Usuarios usuario2 = new Usuarios("Patricio.", 456, true);
        Usuarios usuario3 = new Usuarios("Julián.", 789, false);
        
        usuariosActivos.add(usuario2);
        usuariosActivos.add(usuario3);
        
        librosDisponibles.add(libro1);
        librosDisponibles.add(libro2);
        librosDisponibles.add(libro3);
        int opcion;
        do {            
            System.out.println("BIENVENID@ A LA LIBRERÍA.");
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Registrar usuario.");
            System.out.println("2. Registrar libro.");
            System.out.println("3. Mostrar lista de usuarios.");
            System.out.println("4. Mostrar lista de libros.");
            System.out.println("5. Rentar libro.");
            System.out.println("6. Mostrar lista de libros rentados.");
            System.out.println("7. Mostrar lista de libros Disponibles.");
            System.out.println("8. Mostrar lista de usuarios activos.");
            System.out.println("9. Salir.");
            
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    leer.nextLine();
                    System.out.println("Ficha de registro de usuario.");
                    System.out.println("Ingresa el nombre: ");
                    String name = leer.nextLine();
                    Usuarios newUsuario = new Usuarios (name);
                    libreriaUno.registrarUsuario(newUsuario);
                    newUsuario.setUsuarioActivo(false);
                    System.out.println("Registro exitoso.");
                    System.out.println("¿Realizó alguna compra?");
                    System.out.println("1. Si   2. No");
                    int compra = leer.nextInt();
                    if (compra == 1) {
                        newUsuario.setUsuarioActivo(true);
                        usuariosActivos.add(newUsuario);
                    }
                    else if (compra == 2) {
                        newUsuario.setUsuarioActivo(false);
                    }
                    else {
                        System.out.println("Elija una opción para continuar.");
                    }
                    System.out.println("");
                    break;
                case 2:
                    leer.nextLine();
                    System.out.println("Ficha de registro de libro.");
                    System.out.println("Ingresa el título: ");
                    String nameBook = leer.nextLine();
                    System.out.println("Ingresa el nombre del autor: ");
                    String nameAuthor = leer.nextLine();
                    System.out.println("Ingresa la fecha de lanzamiento del libro en el orden número de día, mes escrito, año en número: ");
                    String fechaLanzamiento = leer.nextLine();
                    int ID = alea.nextInt((100)+1);
                    Books newBook = new Books(nameBook, nameAuthor, fechaLanzamiento, ID);
                    libreriaUno.registrarLibro(newBook);
                    System.out.println("");
                    break;
                case 3:
                    leer.nextLine();
                    libreriaUno.mostrarUsuarios();
                    System.out.println("");
                    break;
                case 4:
                    leer.nextLine();
                    libreriaUno.mostrarLibros();
                    System.out.println("");
                    break;
                case 5:
                    leer.nextLine();
                    System.out.println("ID del Libro que desea rentar: ");                    
                    int buscarID = leer.nextInt();
                    Books encontrarLibro = buscarLibroPorCodigo(librosDisponibles, buscarID);
                    if (encontrarLibro != null) {
                         System.out.println("Información del libro encontrado:");
                         System.out.println("Título: " + encontrarLibro.getTitulo());
                         System.out.println("ID: " + encontrarLibro.getLibroID());
                         System.out.println("Autor: " + encontrarLibro.getAuthorName());
                         System.out.println("Año de publicación: " + encontrarLibro.getFechaLanzamiento());
                         System.out.println("¿Rentar el libro? Escribir la respuesta en números. 1. Si. 2. No");
                            int rentar = leer.nextInt();
                            Usuarios usuarioRentar = new Usuarios ("Juancho.");
                            if (rentar == 1) {
                                usuarioRentar.rentarLibro(encontrarLibro);  
                                usuariosActivos.add(usuarioRentar);
                            }
                            else if (rentar == 2) {
                                System.out.println("Ok.");
                            }
                            else {
                                System.out.println("Selecciona 1 o 2.");
                            }
                    } 
                    else 
                    {
                        System.out.println("No se encontró ningún libro con el código ");
                    }                    
                    break;
                case 6:
                    leer.nextLine();
                    for (Books librosRentadosIterador : librosRentados) {
                        System.out.println(librosRentadosIterador.getTitulo());
                    }
                    break;
                case 7:
                    leer.nextLine();
                    for (Books librosDisponiblesIterador : librosDisponibles) {
                        System.out.println(librosDisponiblesIterador.getTitulo());
                        System.out.println(librosDisponiblesIterador.mostrarLibros());
                    }
                case 8:
                    leer.nextLine();
                    for (Usuarios usuariosActivosIterador : usuariosActivos) {
                        System.out.println(usuariosActivosIterador.mostrarUsuarios());
                    }
                case 9:
                    System.out.println("Nunca olvides la página donde quedaste. ¡Hasta luego!");
                    break;
                default: System.out.println("Ingrese una opción válida.");
                }
        } while (opcion != 9);                                 
    }       
}
