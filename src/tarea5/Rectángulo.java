package tarea5;
public class Rectángulo {
    String altura ;
    String base ;
    String propiedades (int altura, int base) {
        int perimetro = (2*base)+(2*altura);
        int area = base*altura;
        return String.format("Las propiedades de un rectágullo con enteros son: %d",area, perimetro);
    }
    String propiedades (double altura, double base) {
        double perimetro = (2*base)+(2*altura);
        double area = base*altura;
        return String.format("Las propiedades de un rectágullo con decimales son: %f",area, perimetro);
    }
}
