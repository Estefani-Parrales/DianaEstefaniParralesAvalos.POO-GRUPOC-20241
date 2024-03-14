package tarea8;
import java.util.ArrayList;
import java.util.Random;
public class Usuarios {
    Random aleatorio = new Random();
    private String name;
    private int usuarioID;
    private boolean usuarioActivo;
    private ArrayList<Books>libros;

    public Usuarios(String name, int usuarioID, ArrayList<Books>libros, boolean usuarioActivo) {
        this.name = name;
        this.usuarioID = aleatorio.nextInt((100)+1);        
        this.libros = new ArrayList<>();
        this.usuarioActivo = false;
    }

    public Usuarios(String name, int usuarioID, boolean usuarioActivo) {
        this.name = name;
        this.usuarioID = usuarioID;
        this.usuarioActivo = usuarioActivo;
    }
    
    public ArrayList<Books> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Books> libros) {
        this.libros = libros;
    }

    public Usuarios(String name) {
        this.name = name;
    }    

    public boolean isUsuarioActivo() {
        return usuarioActivo;
    }

    public void setUsuarioActivo(boolean usuarioActivo) {
        this.usuarioActivo = usuarioActivo;
    }
    
    public String mostrarUsuarios(){
        return String.format("Usuarios: %s ID del usuario: %d", name, usuarioID);
    }
    public void rentarLibro (Books libroDispo) {
        if(libroDispo.isLibroDisponible()) {
            libroDispo.setLibroDisponible(false);
            System.out.println("El libro ha sido rentado con éxito.");
        }
        else 
        {
            System.out.println("El libro no está disponible.");
        }
    }    
}
