package poo.u2.t3;
public class Book {
     String titulo = "Ciudad Media Luna Vol. 1 " ;
    String autor = "Sarah J. Maas. " ;
    String añoPublicacion = "2020 " ;
    String categoria = "Fantasía." ;


    public String getTitulo() {
        return titulo; 
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAñoPublicacion() {
        return añoPublicacion;
    }
    public void setAñoPublicacion(String añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }
    public String getCategoria() {
        return categoria;
    }

    /*public Book (String titulo, String autor, String añoPublicacion, String categoria) {
    this.titulo = titulo ;
    this.autor = autor ;
    this.añoPublicacion = añoPublicacion ;
    this.categoria = categoria ;
    }*/
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
