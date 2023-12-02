package Program;

/**
 *
 * @author UskoKruM2010 (https://uskokrum2010.com)
 */
public class Main {

    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Lexus", "Azul", 1.95);
        auto1.encender();
        auto1.acelerar();
        System.out.println(auto1.color);

        System.out.println("=====================================");

        Automovil auto2 = new Automovil("Omega", "Rojo", 2.10);
        auto2.encender();
        auto2.acelerar();

        System.out.println("=====================================");

        Automovil auto3 = new Automovil("Celta", "Verde", 1.70);
        auto3.encender();
    }

}
