package practica4;

// Clase PuntoApp
public class PuntoApp {
    public static void main(String[] args) {
        // Crear dos puntos
        Punto punto1 = new Punto(3.0, 4.0);
        Punto punto2 = new Punto(6.0, 8.0);

        // Mostrar información de los puntos
        System.out.println("Información del punto 1:");
        punto1.muestra();

        System.out.println("\nInformación del punto 2:");
        punto2.muestra();

        // Desplazar el punto 1
        punto1.desplaza(2.0, -1.0);

        // Mostrar información después del desplazamiento
        System.out.println("\nInformación del punto 1 después del desplazamiento:");
        punto1.muestra();

        // Calcular la distancia entre los dos puntos
        double distancia = punto1.distanciaEuclidea(punto2);
        System.out.println("\nDistancia entre el punto 1 y el punto 2: " + distancia);
    }
}

