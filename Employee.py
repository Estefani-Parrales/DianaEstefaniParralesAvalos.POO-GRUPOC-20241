class Employee:
    def __init__(self, name, age, salary, cuentas=None):
        self._name = name
        self._age = age
        self._salary = salary
        self._cuenta = None
        self._cuentas = cuentas
    def name(self):
        return self._name
    def name(self, new_name):
        self._name = new_name
    def age(self):
        return self._age
    def age(self, new_age):
        if (18 <= new_age <= 65):
            self._age = new_age
        else:
            print("Edad no válida.")
    def salary(self):
        return self._salary
    def salary(self, value):
        if (value >= 0):
            self._salary = value
        else:
            print("Agregue un salario.")
    def cuenta(self):
        return self._cuenta
    def cuenta(self, value):
        self._cuenta = value