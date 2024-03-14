package tarea7java;
public class CuentaDeBanco {
    private long accountNumber;
    private double saldo;
    public AccountType type;
    private char typeAccount;

    public CuentaDeBanco(long accountNumber, double saldo, AccountType type) {
        this.accountNumber = accountNumber;
        this.saldo = saldo;
        this.type = type;
        this.typeAccount = typeAccount;
    }

    public long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public AccountType getType() {
        return type;
    }
    public void setType(AccountType type) {
        this.type = type;
    }
    public char getTypeAccount() {
        return typeAccount;
    }
    public void setTypeAccount(char typeAccount) {
        this.typeAccount = typeAccount;
    }
    public enum AccountType {
        PLATINUM (1000, 50000),
        GOLD (50001,100000),
        BLACK (100001, Double.POSITIVE_INFINITY);
            private final double maxDeposit;
            private final double minDeposit;
         AccountType (double minDeposit, double maxDeposit) {
             this.minDeposit = minDeposit ;
             this.maxDeposit = maxDeposit ;
         }
        public double getMaxDeposit() {
            return maxDeposit;
        }
        public double getMinDeposit() {
            return minDeposit;
        }         
    }    
}
