package poo.u2.t3;
public class Persona {
    String name ;
    int edad ;
    String fechaNacimiento ;
    String genero ;

    public Persona (String name, int edad, String fechaDeNacimeinto, String genero) {
    this.name = name ;
    this.edad = edad ;
    this.fechaNacimiento = fechaNacimiento ;
    this.genero = genero ;
    }
    String dataPerson () {
        return String.format("%-15s%-15d%-15s%-15s%n", name, edad, fechaNacimiento, genero) ;
    }
}
