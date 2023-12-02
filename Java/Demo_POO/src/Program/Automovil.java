package Program;

/**
 *
 * @author UskoKruM2010 (https://uskokrum2010.com)
 */
public class Automovil {

    public String modelo;
    public String color;
    public double altura;
    public boolean estaEncendido;

    public Automovil(String modelo, String color, double altura) {
        this.modelo = modelo;
        this.color = color;
        this.altura = altura;
        this.estaEncendido = false;
        System.out.println("Auto " + this.modelo + " creado.");
    }

    public void encender() {
        if (this.estaEncendido) {
            System.out.println("El auto ya está encendido.");
        } else {
            System.out.println("Verificando si existe combustible...");
            System.out.println("Verificando controles...");
            System.out.println("El auto se ha encendido.");
            this.estaEncendido = true;
        }
    }

    public void acelerar() {
        if (this.estaEncendido) {
            System.out.println("El auto está acelerando...");
        }
    }

    public void frenar() {
        if (this.estaEncendido) {
            System.out.println("El auto está frenando...");
        }
    }

}
