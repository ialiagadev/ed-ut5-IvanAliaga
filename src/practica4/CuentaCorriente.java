package practica4;

public class CuentaCorriente {
    private String DNI;
    private String nombreTitular;
    private double saldo;

    // Constructor parametrizado
    public CuentaCorriente(String DNI, String nombreTitular) {
        this.DNI = DNI;
        this.nombreTitular = nombreTitular;
        this.saldo = 0;
    }

    // Método para ingresar dinero
    public void ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Se han ingresado " + cantidad + " euros a la cuenta.");
        } else {
            System.out.println("La cantidad a ingresar debe ser mayor que 0.");
        }
    }

    // Método para sacar dinero
    public boolean sacarDinero(double cantidad) {
        if (cantidad > 0 && cantidad <= this.saldo) {
            this.saldo -= cantidad;
            System.out.println("Se han retirado " + cantidad + " euros de la cuenta.");
            return true; // Operación realizada con éxito
        } else {
            System.out.println("No es posible realizar la operación. Saldo insuficiente.");
            return false; // Operación fallida
        }
    }

    // Método para mostrar información de la cuenta corriente
    public void mostrarInformacion() {
        System.out.println("Nombre del titular: " + this.nombreTitular);
        System.out.println("DNI: " + this.DNI);
        System.out.println("Saldo actual: " + this.saldo + " euros");
    }

    // Método getter para obtener el saldo
    public double getSaldo() {
        return this.saldo;
    }

    // Método getter para obtener el DNI
    public String getDNI() {
        return this.DNI;
    }

    // Método getter para obtener el nombre del titular
    public String getNombreTitular() {
        return this.nombreTitular;
    }
}
