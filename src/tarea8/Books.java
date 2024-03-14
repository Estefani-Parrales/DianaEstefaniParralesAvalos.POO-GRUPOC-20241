package tarea8;
import java.util.ArrayList;
import java.util.Random;
public class Books {
    private String titulo;
    private String fechaLanzamiento;
    private String authorName;
    boolean libroDisponible;
    private int libroID;

    public Books(String titulo, String fechaLanzamiento, String authorName, boolean libroDipsonible,int libroID) {
        this.titulo = titulo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.authorName = authorName;
        this.libroDisponible = true;
        this.libroID = libroID;
        
    }

    public Books(String titulo, String fechaLanzamiento, String authorName, int libroID) {
        this.titulo = titulo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.authorName = authorName;
        this.libroID = libroID;
    }

    public Books(int libroID) {
        this.libroID = libroID;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getLibroID() {
        return libroID;
    }
    public void setLibroID(int libroID) {        
            this.libroID = libroID;
    }
    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }
    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
   
    public boolean isLibroDisponible() {
        return libroDisponible;
    }
    public void setLibroDisponible(boolean libroDisponible) {
        this.libroDisponible = libroDisponible;
    }  
    public String mostrarLibros(){
        return String.format("Libro: %s, Autor: %s ID: %d", titulo, authorName, libroID);
    }
    public String mostrarLibrosRentados() {
        return String.format("Libro: %s", titulo);
    }      
}
