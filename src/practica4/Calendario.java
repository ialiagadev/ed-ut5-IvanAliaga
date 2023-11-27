package practica4;

public class Calendario {
    private int anyo;
    private int mes;
    private int dia;

    // Constructor
    public Calendario(int anyo, int mes, int dia) {
        if (esFechaValida(anyo, mes, dia)) {
            this.anyo = anyo;
            this.mes = mes;
            this.dia = dia;
        } else {
            System.out.println("FECHA INVÁLIDA.");
        }
    }

    // Método privado para verificar si una fecha es válida
    private boolean esFechaValida(int anyo, int mes, int dia) {
        if (mes >= 1 && mes <= 12) {
            int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if (dia >= 1 && dia <= diasPorMes[mes]) {
                return true;
            }
        }
        return false;
    }

    // Método para incrementar en un día la fecha
    public void incrementarDia() {
        dia++;
        if (!esFechaValida(anyo, mes, dia)) {
            dia = 1;
            incrementarMes();
        }
    }

    // Método para incrementar en un mes la fecha
    public void incrementarMes() {
        mes++;
        if (mes > 12) {
            mes = 1;
            incrementarAnyo(1);
        }
    }

    // Método para incrementar en un número de años la fecha
    public void incrementarAnyo(int cantidad) {
        anyo += cantidad;
    }

    // Método para mostrar la fecha por consola
    public void mostrar() {
        System.out.println("FECHA: " + anyo + "-" + mes + "-" + dia);
    }

    // Método para determinar si dos fechas son iguales
    public boolean iguales(Calendario otraFecha) {
        return this.anyo == otraFecha.anyo && this.mes == otraFecha.mes && this.dia == otraFecha.dia;
    }
}
