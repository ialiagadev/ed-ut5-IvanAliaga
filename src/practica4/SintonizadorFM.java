package practica4;

public class SintonizadorFM {
    private double frecuencia; // atributo privado que almacena la frecuencia en MHz

    // Constructor
    public SintonizadorFM() {
        this.frecuencia = 80.0; // frecuencia por defecto al crear un nuevo objeto
    }

    // Constructor con frecuencia inicial, ajustada al rango permitido
    public SintonizadorFM(double frecuenciaInicial) {
        if (frecuenciaInicial < 80.0) {
            this.frecuencia = 80.0;
        } else if (frecuenciaInicial > 108.0) {
            this.frecuencia = 108.0;
        } else {
            this.frecuencia = frecuenciaInicial;
        }
    }

    // Método público para mostrar la frecuencia sintonizada
    public void display() {
        System.out.println("Frecuencia sintonizada: " + this.frecuencia + " MHz");
    }

    // Método público para bajar la frecuencia en 0.5 MHz
    public void down() {
        this.frecuencia -= 0.5;
        comprobarRango();
    }

    // Método público para subir la frecuencia en 0.5 MHz
    public void up() {
        this.frecuencia += 0.5;
        comprobarRango();
    }

    // Método privado para comprobar y ajustar la frecuencia dentro del rango permitido
    private void comprobarRango() {
        if (this.frecuencia < 80.0) {
            this.frecuencia = 108.0;
        } else if (this.frecuencia > 108.0) {
            this.frecuencia = 80.0;
        }
    }
}
