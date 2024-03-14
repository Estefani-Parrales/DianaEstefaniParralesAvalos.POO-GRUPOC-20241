package tarea7java;
import java.util.ArrayList;
public class Banco {
    private long accountNumber;
    private ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();
    private ArrayList<Banco> listOfAccounts = new ArrayList<Banco>();

    public Banco(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

}
