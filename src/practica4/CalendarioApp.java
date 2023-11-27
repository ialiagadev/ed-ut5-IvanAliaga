package practica4;
public class CalendarioApp {
    public static void main(String[] args) {
        // Crear un objeto de tipo Calendario
        Calendario fecha1 = new Calendario(2023, 12, 31);

        // Mostrar la fecha
        System.out.println("Fecha inicial:");
        fecha1.mostrar();

        // Incrementar un día y mostrar la nueva fecha
        fecha1.incrementarDia();
        System.out.println("\nFecha después de incrementar un día:");
        fecha1.mostrar();

        // Incrementar un mes y mostrar la nueva fecha
        fecha1.incrementarMes();
        System.out.println("\nFecha después de incrementar un mes:");
        fecha1.mostrar();

        // Incrementar 3 años y mostrar la nueva fecha
        fecha1.incrementarAnyo(3);
        System.out.println("\nFecha después de incrementar 3 años:");
        fecha1.mostrar();

        // Crear otra fecha para probar el método iguales
        Calendario fecha2 = new Calendario(2023, 11, 15);

        // Mostrar la segunda fecha
        System.out.println("\nSegunda fecha:");
        fecha2.mostrar();

        // Verificar si las dos fechas son iguales
        System.out.println("\nLas dos fechas son iguales: " + fecha1.iguales(fecha2));
    }
}

