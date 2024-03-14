class Inicio:
    list_of_employee = []
    project_manager = Employee ("Pedro", 34, 150000, 1234, AccountType.GOLD)
    desarrollador_web = Employee  ("Chucho", 24, 19000, 4567, AccountType.PLATINUM)
    patron = Employee  ("Rafa", 19, 70000000, 7890, AccountType.BLACK)
    list_of_employee.append(project_manager)
    list_of_employee.append(desarrollador_web)
    list_of_employee.append(patron)

    print ("Bienvenido al banco.")
    print("¿Qué quiere hacer?")
    print ("1. Agregar usuario. 2. Ver lista de usuarios. 3. Ver usuario específico. 4. Retirar. 5. Depositar. 6. Salir del programa.")
    opcion = input("Escriba el número a elegir: ")

    if opcion == "1":
        new_name = input("Ingrese el nombre: ")
        new_age = int(input("Ingrese la edad: "))
        new_salary = double(input("Ingrese el salario: $"))
        new_account_number = input("Ingrese el número de cuenta a registrar(maximo 4 digitos:")
        print("\n ¿De qué tipo son?"
          + " \n Tipos de cuenta:"
          + "\n PLATINUM (De $1,000 a $50,000"
          + "\n GOLD (De 50, 000 a 100, 000"
          + "\n BLACK(Cuenta sin límites")
        new_account_type = input().upper()
        new_employee = Employee(new_name, new_age, new_salary, new_account_number, new_account_type)
        list_of_employees.append(new_employee)
    elif (opcion == 2):
        for employee in list_of_employees:
            print(employee)
    elif (opcion == 3):
        numero_cuenta_usuario = input("Ingrese el númeor de cuenta del usuario a buscar: ")
        usuario_seleccionado = buscar_usuario(list_of_employee, numero_cuenta_usuario)
        if (usuario_seleccionado != 0):
            print("Información del usuario:")
            print(f"Nombre: {usuario_seleccionado.name}")
            print(f"Edad: {usuario_seleccionado.age}")
            print(f"Número de cuenta: {numero_cuenta_usuario}")
            print(f"Saldo: {usuario_seleccionado.salario}")
            print(f"Tipo de cuenta: {self.account_type}")

        print("Opciones. 1. Retirar dinero. 2. Depositar dinero.")
        respuesta = input("Elige: ")
        if (respuesta == 1):
            monto_retiro = float(input("Ingrese el monto a retirar"))
            usuario_seleccionado.retirar(monto_retiro)
        elif (respuesta == 2):
            monto_deposito = float(input("Monto a depositar: "))
            usuario_seleccionado.depositar(monto_deposito)
        else:
         print("Elija una opcion válida.")
    elif (opcion == 4) : 
        print("¡Hasta la próxima!")
    else :
        print("Error. Escriba una opción válida, escrita en números.")
    
    def buscar_usuario(list_of_employees, account_number):
        for employee in employee:            
            if (employee.cuentas[0].account_number == numero_cuenta_usuario):
                return employee