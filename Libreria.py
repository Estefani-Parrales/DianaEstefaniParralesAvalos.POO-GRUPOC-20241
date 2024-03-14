class Libreria:
    def __init__(self):
        self.libros = []
        self.usuarios = []
        self.libros_rentados = []
        self.libros_disponibles = []
        self.usuarios_activos = []

    def registrar_usuario(self, new_usuario: Usuarios):
        self.usuarios.append(new_usuario)

    def registrar_libro(self, new_book: Libros):
        self.libros.append(new_book)

    def rentar_libro(self, titulo_rentado_id: int):
        for libro in self.libros:
            if libro.get_libro_id() == titulo_rentado_id and libro.is_libro_disponible():
                self.libros_rentados.append(libro)
                libro.set_libro_disponible(False)
                return 0                
        return none

    def get_libros_disponibles(self):
        return self.libros_disponibles

    def buscar_libro_por_codigo(libros_disponibles: List[Libros], buscar_id: int):
        for libro in libros_disponibles:
            if libro.get_libro_id() == buscar_id:
                return libro
        return None