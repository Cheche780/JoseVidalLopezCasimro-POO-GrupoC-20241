class Clientes:
    def __init__(self, name, age):
        self.name = name
        self.age = age
        self.libros_rentados = []

    def get_name(self):
        return self.name

    def set_name(self, name):
        self.name = name

    def get_libros_rentados(self):
        return self.libros_rentados

    def agregar_libro_rentado(self, libro):
        self.libros_rentados.append(libro)