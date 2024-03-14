class Cuenta_De_Banco:
    def __init__(self, account_number, saldo, account_type):
        self._account_number = account_number
        self._saldo = 0.0
        self._account_type = account_type

    def depositar(self, monto_deposito):
        self._saldo += monto
    def retirar(self, monto_retiro):
        if (self._saldo >= monto):
            self._saldo -= monto
        else:
            print("Fondos insuficientes.")

    def get_saldo(self):
        return self._saldo
        
    from enum import Enum
    class AccountType(Enum):
        PLATINUM(1000, 5000)
        GOLD(50001, 100000)
        BLACK(100001, float('inf'))
