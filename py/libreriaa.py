class Libreria:
    def __init__(self, name, autor, precio_renta):
        self.ocupado = False
        self.name = name
        self.autor = autor
        self.precio_renta = precio_renta

    def esta_rentado(self):
        return self.ocupado

    def set_ocupado(self, rented):
        self.ocupado = rented

    def get_name(self):
        return self.name

    def set_name(self, name):
        self.name = name

    def get_autor(self):
        return self.autor

    def set_autor(self, autor):
        self.autor = autor

    def get_precio_renta(self):
        return self.precio_renta

    def set_precio_renta(self, precio_renta):
        self.precio_renta = precio_renta