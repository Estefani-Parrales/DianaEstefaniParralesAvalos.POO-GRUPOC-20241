package tarea5;
import java.util.*;
public class TAREA5 {
    public static void main(String[] args) {
        Rectángulo PrimerRectangulo = new Rectángulo () ;
        System.out.println(PrimerRectangulo.propiedades(2, 4));
        System.out.println(PrimerRectangulo.propiedades(3.5, 2.1));
        System.out.println("");
        
        Scanner leer = new Scanner (System.in) ;
        System.out.println("Sistema de pago. ");
        System.out.println("1. Sueldo. \n"
                + "2. Sueldo y bonificación. \n"
                + "3. Sueldo, bonificación y horas extra. \n"
                + "Ingrese el número que desea conocer");
        int datos = leer.nextInt();
        Empleado empleadoUno = new Empleado () ;
            switch (datos) {
                case 1 :
                    System.out.println("Sueldo: $"+empleadoUno.sueldoBase);
                    System.out.println(empleadoUno.calcualrPago(1500));
                    break ;
                case 2 :
                    System.out.println(" Sueldo: $"+empleadoUno.sueldoBase+"\n Bonificaciones: $"+empleadoUno.bonificacion);
                    System.out.println(empleadoUno.calcualrPago(15000, 300));
                    break ;
                case 3 :
                    System.out.println(" Sueldo: $"+empleadoUno.sueldoBase
                            +"\n Bonificaciones: $"+empleadoUno.bonificacion
                            +"\n Horas extra: $"+empleadoUno.horasExtra);
                    System.out.println(empleadoUno.calcualrPago(15000, 300, 4));
                    break ;
                default :
                    System.out.println("Ingrese un número del 1 al 3.");
    }
            System.out.println("");
            CalculadoraImpuesto impuestosUno = new CalculadoraImpuesto () ;
            System.out.println("Calculadora de impuestos.");
            System.out.println(impuestosUno.calcularImpuestos(3000));
            System.out.println(impuestosUno.calcularImpuestos(3000, 10));
            System.out.println(impuestosUno.calcularImpuestos(30, 10, 300));
            System.out.println("Persona 2.");
            System.out.println(impuestosUno.calcularImpuestos(50000));
            System.out.println(impuestosUno.calcularImpuestos(50000, 1));
            System.out.println(impuestosUno.calcularImpuestos(50000, 1, 300));
            
    }
    
}
