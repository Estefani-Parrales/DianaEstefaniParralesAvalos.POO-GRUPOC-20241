class Books:
   class Books:
    def __init__(self, titulo, fecha_lanzamiento, autor_name, libro_disponible=True, libro_id=None):
        self.titulo = titulo
        self.fecha_lanzamiento = fecha_lanzamiento
        self.autor_name = autor_name
        self.libro_disponible = libro_disponible
        if libro_id is not None:
            self.libro_id = libro_id
        else:
            self.libro_id = self.generar_id()

    def generar_id(self):
        return hash(f"{self.titulo}{self.fecha_lanzamiento}{self.autor_name}")

    def get_titulo(self):
        return self.titulo

    def get_libro_id(self):
        return self.libro_id

    def get_fecha_lanzamiento(self):
        return self.fecha_lanzamiento

    def set_fecha_lanzamiento(self, fecha_lanzamiento):
        self.fecha_lanzamiento = fecha_lanzamiento

    def get_autor_name(self):
        return self.autor_name

    def set_autor_name(self, autor_name):
        self.autor_name = autor_name

    def is_libro_disponible(self):
        return self.libro_disponible

    def set_libro_disponible(self, libro_disponible):
        self.libro_disponible = libro_disponible

    def mostrar_libros(self):
        return f"Libro: {self.titulo}, Autor: {self.autor_name} ID: {self.libro_id}"

    def mostrar_libros_rentados(self):
        return f"Libro: {self.titulo}"