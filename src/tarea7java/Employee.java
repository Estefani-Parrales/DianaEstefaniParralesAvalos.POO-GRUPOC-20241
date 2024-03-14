package tarea7java;
import java.util.ArrayList;
public class Employee {
    private String name ;
    private int age;
    private double salary;
    public AccountType type;
    private ArrayList <CuentaDeBanco> cuentas;

    Employee(String name, int age, double salary, enum AccountType) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.type = <AccountType> type;
    }
    public void EmployeeValid (String name, int age, double salary, ArrayList<CuentaDeBanco> cuentas) {
        if (this.name!= null && this.age > 18 && this.salary > 1000 && this.cuentas >= 1) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.cuentas = new CuentaDeBanco(accountNumber);
        }
        else {
            System.out.println("Agregue datos válidos.");
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public ArrayList<CuentaDeBanco> getCuentas() {
        return cuentas;
    }   
    public void setCuentas(ArrayList<CuentaDeBanco> cuentas) {
        this.cuentas = cuentas;
    }
    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }    
    public void retirar (double montoRetiro) {
        double saldoRetiro = saldo;
        if (montoRetiro < saldo && montoRetiro < maxDeposit) {
            saldo -= monto                  
        }
        return saldo;
    }
    public void depositar (double montoDepositar) {
        double saldoDeposito = saldo; 
        if (montoDepositar < saldo && montoDepositar < maxDeposit) {
            saldoDeposito += monto                  
        }
        return saldoDeposito;
    }
    public Employee buscarUsuario (ArrayList<Employee>employee, long buscarNumeroDeCuenta) {
            for (Employee employee : employees) {
            for (CuentaDeBanco cuenta : employee.getCuentas()) {
                if (cuenta.getAccountNumber() == accountNumber) {
                    return employee;
                }
            }
        }
    }
}
