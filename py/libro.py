class Biblioteca:
    def __init__(self):
        self.clientes = []
        self.libros = []

    def registrar_cliente(self, name, age):
        self.clientes.append(Clientes(name, age))

    def registrar_libro(self, name, autor, precio_renta):
        self.libros.append(Libreria(name, autor, precio_renta))

    def rentar_libro(self, cliente, libro):
        libro.set_ocupado(True)
        cliente.agregar_libro_rentado(libro)

    def obtener_todos_usuarios(self):
        return self.clientes

    def obtener_todos_libros(self):
        return self.libros

    def obtener_usuarios_con_libros(self):
        return [cliente for cliente in self.clientes if cliente.get_libros_rentados()]

    def obtener_libros_disponibles(self):
        return [libro for libro in self.libros if not libro.esta_rentado()]

    def obtener_libros_rentados(self):
        return [libro for libro in self.libros if libro.esta_rentado()]

    def ver_cliente(self, name):
        for cliente in self.clientes:
            if cliente.get_name() == name:
                return cliente
        return None  # Usuario no encontrado

    def ver_libro(self, name):
        for libro in self.libros:
            if libro.get_name() == name:
                return libro
        return None  # Libro no encontrado
