package tarea7java;
import java.util.ArrayList;
import java.util.Scanner;
public class Tarea7Java {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        ArrayList <Employee> listOfEmployees = new ArrayList <> ();
        Employee projectManager = new Employee ("Pedro", 35, 150000, 1234, GOLD);
        Employee desarrolladorWeb = new Employee ("Chuco", 24, 19000, 4567, PLATINUM);
        Employee patron = new Employee ("Rafa", 19, 70000000, 7890, BLACK);
        listOfEmployees.add(projectManager);
        listOfEmployees.add(desarrolladorWeb);
        listOfEmployees.add(patron);
        
        do {
        System.out.println("BIENVENIDO AL BANCO. ¿Qué desea hacer?");
        System.out.println("\n 1. Agregar usuario. \n  2. Ver lista de usuarios. \n 3. Ver un usuario en específico. \n 4. Salir.");
        int opcion = leer.nextInt();
        
        switch (opcion) {
            case 1 :
                System.out.println("Ingrese el nombre: ");
                String newName = leer.nextLine();
                System.out.println("Ingrese la edad: ");
                int newAge = leer.nextInt();
                double newSalary = leer.nextDouble();
                System.out.println("Número de cuenta: ");
                long newNumberAccount = leer.nextLong();
                System.out.println("\n ¿De qué tipo son?"
                        + " \n Tipos de cuenta:"
                        + "\n PLATINUM (De $1,000 a $50,000"
                        + "\n GOLD (De 50, 000 a 100, 000"
                        + "\n BLACK(Cuenta sin límites");
                String newAccountType = leer.nextLine();
                Employee newEmployee = new Employee(newName, newAge, newSalary, newNumberAccount,
                        Employee.AccountType.valueOf(newAccountType.toUpperCase()));
                listOfEmployees.add(newEmployee);
                break;
            case 2 :
                for (Employee empleados : listOfEmployees) {
                    System.out.println(empleados);
                }
                break;
            case 3 :
                System.out.println("Ingresa el número de cuenta del empleado: ");
                long buscarNumeroDeCuenta = leer.nextLong();
                Employee usuarioSeleccionado = encontrarUsuario(listOfEmployees, buscarNumeroDeCuenta);
                if (usuarioSeleccionado != 0)
                {
                    System.out.println("Información del Usuario:");
                    System.out.println("Nombre: " + employee.getNombre());
                    System.out.println("Número de Cuenta: " + employee.getNumeroCuenta());
                    System.out.println("Saldo Inicial: " + employee.getSaldo());
                    System.out.println("Tipo de cuenta: " + employee.getType());                
                    System.out.println("Opciones."
                        + "\n  1. Retirar dinero."
                        + "\n  2. Depositar dinero.");
                    int respuesta = leer.nextInt();
                    if (respuesta == 1) {
                        System.out.println("Ingrese el monto a retirar: ");
                        double montoRetiro = leer.nextDouble();
                        usuarioSeleccionado.retirar(montoRetiro);
                    }
                    if (respuesta == 2) {
                        System.out.println("Ingrese el monto a depositar: ");
                        double montoDeposito = leer.nextDouble();
                        usuarioSeleccionado.depositar(montoDeposito);
                    }
                    else {
                    System.out.println("Ingrese una opción válida.");
                    }
                }
                else 
                {
                        System.out.println("Usuario no encontrado.");
                }                
                break;        
                default : System.out.println("Error. Ingrese una opción válida, escrita en números.");
        }
        } while (opcion != 4);
                System.out.println("¡Hasta la próxima!");            
        }        
    }    
