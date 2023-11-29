class Automovil():

    def __init__(self, modelo, color, altura) -> None:
        self.modelo = modelo
        self.color = color
        self.altura = altura
        self.esta_encendido = False
        print(f"Auto '{modelo}' creado.")

    def encender(self):
        if self.esta_encendido:
            print("El auto ya está encendido.")
        else:
            print("Verificando si existe combustible...")
            print("Verificando controles...")
            print("El auto se ha encendido.")
            self.esta_encendido = True

    def acelerar(self):
        if self.esta_encendido:
            print("El auto está acelerando...")

    def frenar(self):
        if self.esta_encendido:
            print("El auto está frenando...")


auto1 = Automovil("Lexus", "Azul", 1.95)
auto1.encender()
auto1.acelerar()
print(auto1.color)

print("=====================================")

auto2 = Automovil("Omega", "Rojo", 2.10)
auto2.encender()
auto2.acelerar()

print("=====================================")

auto3 = Automovil("Celta", "Verde", 1.70)
