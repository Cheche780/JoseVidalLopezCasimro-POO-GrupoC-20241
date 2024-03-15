class Main:
    def __init__(self):
        self.biblioteca = Biblioteca()

    def start(self):
        while True:
            self.display_menu()
            escoger = int(input("Enter your choice: "))
            if escoger == 1:
                nombre_usuario = input("Ingresa el nombre del usuario: ")
                edad_usuario = int(input("Ingresa la edad del usuario: "))
                self.biblioteca.registrar_cliente(nombre_usuario, edad_usuario)
            elif escoger == 2:
                nombre_libro = input("Ingresa el nombre del libro: ")
                autor = input("Ingresa el autor del libro: ")
                precio_libro = float(input("Ingresa el precio del libro: "))
                self.biblioteca.registrar_libro(nombre_libro, autor, precio_libro)
            elif escoger == 3:
                usuario_rentar = input("Ingresa el nombre del usuario: ")
                libro_rentado = input("Ingresa el nombre del libro: ")
                cliente = self.biblioteca.ver_cliente(usuario_rentar)
                libro = self.biblioteca.ver_libro(libro_rentado)
                if cliente and libro:
                    self.biblioteca.rentar_libro(cliente, libro)
                    print("Libro rentado exitosamente.")
                else:
                    print("Usuario o libro no encontrado.")
            elif escoger == 4:
                self.display_users(self.biblioteca.obtener_todos_usuarios())
            elif escoger == 5:
                self.display_books(self.biblioteca.obtener_todos_libros())
            elif escoger == 6:
                self.display_users(self.biblioteca.obtener_usuarios_con_libros())
            elif escoger == 7:
                self.display_books(self.biblioteca.obtener_libros_disponibles())
            elif escoger == 8:
                self.display_books(self.biblioteca.obtener_libros_rentados())
            elif escoger == 9:
                print("Guardando información...")
                # Aquí puedes implementar la lógica para guardar la información en un archivo
            elif escoger == 10:
                print("Saliendo...")
                break
            else:
                print("Selección inválida. Por favor, intenta nuevamente.")

    def display_menu(self):
        print("Seleccione 1 para registrar clientes")
        print("Seleccione 2 para registrar libros")
        print("Seleccione 3 para rentar libros")
        print("Seleccione 4 para ver lista de usuarios")
        print("Seleccione 5 para ver lista de libros")
        print("Seleccione 6 para ver usuarios con libros")
        print("Seleccione 7 para ver libros disponibles")
        print("Seleccione 8 para ver libros rentados")
        print("Seleccione 9 para guardar información")
        print("Seleccione 10 para salir")

    def display_users(self, clientes):
        print("Usuarios registrados:")
        for cliente in clientes:
            print(cliente.get_name())

    def display_books(self, libros):
        print("Libros registrados:")
        for libro in libros:
            print(libro.get_name())