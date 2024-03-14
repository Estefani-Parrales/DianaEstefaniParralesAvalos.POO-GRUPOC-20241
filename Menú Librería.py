def main ():
    def __init__(self):
        self.libreria_uno = Libreria()
        self.usuarios = []
        self.libros = []
        self.libros_disponibles = []
        self.libros_rentados = []
        self.usuarios_activos = []

        self.libro1 = Libros("Ciudad Media Luna Vol. 1", "8 de Octubre del 2020", "Sarah J. Aamas.", True, 1234)
        self.libro2 = Libros("Sky.", "7 de Diciembre del 2018", "Joss Stringir", True, 5678)
        self.libro3 = Libros("Fireligth", "9 de Octubre del 2017", "Unknow", True, 9012)

        self.usuario1 = Usuarios("Pedro.", 123, True)
        self.usuario2 = Usuarios("Patricio.", 456, True)
        self.usuario3 = Usuarios("Julián.", 789, False)

        self.usuarios_activos.append(self.usuario2)
        self.usuarios_activos.append(self.usuario3)

        self.libros_disponibles.append(self.libro1)
        self.libros_disponibles.append(self.libro2)
        self.libros_disponibles.append(self.libro3)
    print ("Hola y bienvenido al sistema.")
    opcion = int(input())
    while opcion != 9:
            print("BIENVENID@ A LA LIBRERÍA.")
            print("¿Qué desea hacer?")
            print("1. Registrar usuario.")
            print("2. Registrar libro.")
            print("3. Mostrar lista de usuarios.")
            print("4. Mostrar lista de libros.")
            print("5. Rentar libro.")
            print("6. Mostrar lista de libros rentados.")
            print("7. Mostrar lista de libros Disponibles.")
            print("8. Mostrar lista de usuarios activos.")
            print("9. Salir.")
            if opcion == 1:
                nombre = input("Ingresa el nombre: ")
                nuevo_usuario = Usuario(nombre, random.randint(1, 100), False)
                biblioteca.registrar_usuario(nuevo_usuario)
                print("Registro exitoso.")
                compra = int(input("¿Realizó alguna compra? (1. Sí / 2. No): "))
                if compra == 1:
                    nuevo_usuario.activo = True
                    biblioteca.usuarios_activos.append(nuevo_usuario)
                elif compra == 2:
                    nuevo_usuario.activo = False
                else:
                    print("Elija una opción válida.")

            elif opcion == 2:
                titulo = input("Ingresa el título: ")
                autor = input("Ingresa el nombre del autor: ")
                fecha_lanzamiento = input("Ingresa la fecha de lanzamiento del libro (dd de mes de yyyy): ")
                id_libro = random.randint(1000, 9999)
                nuevo_libro = Libro(titulo, fecha_lanzamiento, autor, True, id_libro)
                biblioteca.registrar_libro(nuevo_libro)
                print("Registro exitoso.")

            elif opcion == 3:
                print("Lista de usuarios:")
                for usuario in biblioteca.usuarios:
                    print(f"Nombre: {usuario.nombre}, ID: {usuario.id_usuario}")

            elif opcion == 4:
                print("Lista de libros:")
                for libro in biblioteca.libros:
                    print(f"Título: {libro.titulo}, ID: {libro.id_libro}")

            elif opcion == 5:
                id_libro = int(input("ID del libro que desea rentar: "))
                biblioteca.rentar_libro(id_libro)

            elif opcion == 6:
                print("Lista de libros rentados:")
                for libro in biblioteca.libros_rentados:
                    print(libro.titulo)

            elif opcion == 7:
                print("Lista de libros disponibles:")
                for libro in biblioteca.libros_disponibles:
                    print(f"Título: {libro.titulo}, ID: {libro.id_libro}")

            elif opcion == 8:
                print("Lista de usuarios activos:")
                for usuario in biblioteca.usuarios_activos:
                    print(f"Nombre: {usuario.nombre}, ID: {usuario.id_usuario}")

            elif opcion == 9:
                print("¡Hasta luego!")

            else:
                print("Ingrese una opción válida.")