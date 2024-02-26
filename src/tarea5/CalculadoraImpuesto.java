package tarea5;
public class CalculadoraImpuesto {
    double impuestos ;
    double porcentajeDeImpuestos = 300;
    double dividendos = 400 ;
    double ventas ;
    double exencion = 15000;
    String calcularImpuestos (int ingresos) {
        return String.format("Los ingresos con impuestos son de: %.3f", (ingresos+0.15));
    }
    String calcularImpuestos (int ventas, double procentajeDeImpuestos) {
        return String.format("Las ventas con impuestos son de: %.3f", ventas * (porcentajeDeImpuestos/100));
    }
     public static double calcularImpuestos(double dividendos, double porcentajeImpuestos, double exencion) {
        double impuestos = dividendos * (porcentajeImpuestos / 100);
        if (impuestos > exencion) {
            return impuestos - exencion;
        } else {
            return 0;
        }
    
    }
}
