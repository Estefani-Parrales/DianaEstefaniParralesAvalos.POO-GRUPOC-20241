package tarea5;
public class Empleado {
    double sueldoBase = 15000;
    double bonificacion = 300;
    double horasExtra = 4*20 ;

    String calcualrPago (double sueldoBase) {
        return String.format("El sueldo base es: %f", sueldoBase);
    }
    String calcualrPago (double sueldoBase, double bonificacion) {
            return String.format("El pago, tomando en cuenta sueldo base y la bonificación, es de: $ %f",(sueldoBase+bonificacion)) ;
    }
    String calcualrPago (double sueldoBase, double bonificacion, double horasExtra) {
            return String.format("El pago, contando sueldo base, bonificación y horas extra,"
                    + "es de: $ %f", (sueldoBase+bonificacion+horasExtra)) ;
}
}