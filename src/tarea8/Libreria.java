package tarea8;
import java.util.ArrayList;
public class Libreria {
    private ArrayList<Books>libros=new ArrayList<Books>();
    private ArrayList<Usuarios>usuarios=new ArrayList<Usuarios>();
    private ArrayList<Books>librosRentados=new ArrayList<Books>();
    private ArrayList<Books>librosDisponibles=new ArrayList<Books>();
    private ArrayList<Usuarios>usuariosActivos=new ArrayList<Usuarios>();

    Libreria() {
        
    }
    
    public void mostrarLibros(){
        for (Books librosInterpreter : libros){
            System.out.println(librosInterpreter.mostrarLibros());
        }             
    }
    public void mostrarUsuarios(){
        for (Usuarios usuariosInterpreter : usuarios){
            System.out.println(usuariosInterpreter.mostrarUsuarios());
        }   
    }
    public void registrarUsuario(Usuarios newUsuario) {
        usuarios.add(newUsuario);
    }
    public void registrarLibro(Books newBook) {
        libros.add(newBook);
    }   
    public int rentarLibro (Books tituloRentadoID) {
        librosRentados.add(tituloRentadoID);
        return 0;
    } 

    public ArrayList<Books> getLibrosDisponibles() {
        return librosDisponibles;
    }    
    public static Books buscarLibroPorCodigo(ArrayList<Books> librosDisponibles, int buscarID) {
        for (Books libro : librosDisponibles) {
            if (libro.getLibroID() == buscarID) {
                return libro; 
            }
        }
        return null;
    }        
}
           