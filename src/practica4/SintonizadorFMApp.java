package practica4;

public class SintonizadorFMApp {
    public static void main(String[] args) {
        // Crear 3 objetos de tipo SintonizadorFM
        SintonizadorFM sintonizador1 = new SintonizadorFM(); // Frecuencia por defecto (80 MHz)
        SintonizadorFM sintonizador2 = new SintonizadorFM(107.0); // Frecuencia inicial: 107 MHz
        SintonizadorFM sintonizador3 = new SintonizadorFM(200.0); // Frecuencia inicial fuera de rango: 108 MHz

        // Bajar 1 MHz al primer sintonizador
        sintonizador1.down();

        // Subir 2 MHz al segundo sintonizador
        sintonizador2.up();
        sintonizador2.up();

        // Mostrar por pantalla las frecuencias de cada sintonizador
        System.out.println("1er sintonizador:");
        sintonizador1.display();

        System.out.println("\n2º sintonizador:");
        sintonizador2.display();

        System.out.println("\n3er sintonizador:");
        sintonizador3.display();
    }
}
