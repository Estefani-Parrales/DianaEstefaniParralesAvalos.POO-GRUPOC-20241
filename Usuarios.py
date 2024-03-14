class usuarios:
    import random
from typing import List

class Libros:
    def __init__(self, titulo: str, libro_disponible: bool):
        self.titulo = titulo
        self.libro_disponible = libro_disponible

    def is_libro_disponible(self) -> bool:
        return self.libro_disponible

    def set_libro_disponible(self, libro_disponible: bool):
        self.libro_disponible = libro_disponible

    def mostrar_libros(self):
        return f"Libro: {self.titulo}"


class Usuarios:
    def __init__(self, name: str, usuario_id: int, libros: List[Libros], usuario_activo: bool):
        self.name = name
        self.usuario_id = usuario_id
        self.libros = libros
        self.usuario_activo = usuario_activo

    def get_libros(self) -> List[Libros]:
        return self.libros

    def set_libros(self, libros: List[Libros]):
        self.libros = libros

    def is_usuario_activo(self) -> bool:
        return self.usuario_activo

    def set_usuario_activo(self, usuario_activo: bool):
        self.usuario_activo = usuario_activo

    def mostrar_usuarios(self):
        return f"Usuarios: {self.name} ID del usuario: {self.usuario_id}"

    def rentar_libro(self, libro_dispo: Libros):
        if libro_dispo.is_libro_disponible():
            libro_dispo.set_libro_disponible(False)
            print("El libro ha sido rentado con éxito.")
        else:
            print("El libro no está disponible.")