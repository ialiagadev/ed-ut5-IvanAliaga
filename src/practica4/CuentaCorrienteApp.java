package practica4;



public class CuentaCorrienteApp {

    public static void main(String[] args) {
        // Crear dos cuentas con titulares y DNIs distintos
        CuentaCorriente cuenta1 = new CuentaCorriente("12345678A", "Juan Perez");
        CuentaCorriente cuenta2 = new CuentaCorriente("87654321B", "María Rodriguez");

        // Realizar ingresos de cantidades distintas en cada cuenta
        cuenta1.ingresarDinero(1000);
        cuenta2.ingresarDinero(500);

        // Mostrar información de cada cuenta
        System.out.println("Información de la cuenta 1:");
        cuenta1.mostrarInformacion();

        System.out.println("\nInformación de la cuenta 2:");
        cuenta2.mostrarInformacion();

        // Intentar extraer dinero de cada cuenta
        boolean extraccionExitosaCuenta1 = cuenta1.sacarDinero(700);
        boolean extraccionExitosaCuenta2 = cuenta2.sacarDinero(1000);

        // Mostrar mensajes de éxito o fracaso correspondientes
        System.out.println("\nResultado de la extracción en la cuenta 1: " + (extraccionExitosaCuenta1 ? "Éxito" : "Fracaso"));
        System.out.println("Resultado de la extracción en la cuenta 2: " + (extraccionExitosaCuenta2 ? "Éxito" : "Fracaso"));
    }
}
