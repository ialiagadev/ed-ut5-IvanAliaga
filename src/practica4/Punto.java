package practica4;

// Clase Punto
public class Punto {
    private double x;
    private double y;

    // Constructor
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Método para desplazar en el eje X
    public void desplazaX(double dx) {
        this.x += dx;
    }

    // Método para desplazar en el eje Y
    public void desplazaY(double dy) {
        this.y += dy;
    }

    // Método para desplazar en ambos ejes
    public void desplaza(double dx, double dy) {
        desplazaX(dx);
        desplazaY(dy);
    }

    // Método para calcular la distancia euclidiana entre dos puntos
    public double distanciaEuclidea(Punto otro) {
        double distanciaX = this.x - otro.x;
        double distanciaY = this.y - otro.y;
        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
    }

    // Método para mostrar información sobre el punto
    public void muestra() {
        System.out.println("Coordenadas del punto: (" + this.x + ", " + this.y + ")");
    }
}
