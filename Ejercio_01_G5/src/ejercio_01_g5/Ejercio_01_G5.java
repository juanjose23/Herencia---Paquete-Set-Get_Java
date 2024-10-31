/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercio_01_g5;

/**
 *
 * @author 
 */

 class Cuenta {
    // Atributos de la clase
    private String nombreCliente;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    // Constructor por defecto
    public Cuenta() {
        this.nombreCliente = "";
        this.numeroCuenta = "";
        this.tipoInteres = 0.0;
        this.saldo = 0.0;
    }

    // Constructor con todos los parámetros
    public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    // Getters y setters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método ingreso
    public boolean ingreso(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            return true;
        }
        return false;
    }

    // Método reintegro
    public boolean reintegro(double cantidad) {
        if (cantidad > 0 && this.saldo >= cantidad) {
            this.saldo -= cantidad;
            return true;
        }
        return false;
    }

    // Método transferencia
    public boolean transferencia(Cuenta cuentaDestino, double importe) {
        if (importe > 0 && this.saldo >= importe) {
            this.saldo -= importe;
            cuentaDestino.ingreso(importe);
            return true;
        }
        return false;
    }
}

public class Ejercio_01_G5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Crear dos cuentas con el constructor con parámetros
        Cuenta cuentaOrigen = new Cuenta("Juan Pérez", "123456789", 1.5, 1000.0);
        Cuenta cuentaDestino = new Cuenta("Ana García", "987654321", 1.5, 500.0);

        // Mostrar el saldo inicial de las cuentas
        System.out.println("Saldo inicial cuenta de origen: " + cuentaOrigen.getSaldo());
        System.out.println("Saldo inicial cuenta de destino: " + cuentaDestino.getSaldo());

        // Realizar un ingreso en la cuenta de origen
        if (cuentaOrigen.ingreso(200.0)) {
            System.out.println("Ingreso realizado en cuenta de origen. Nuevo saldo: " + cuentaOrigen.getSaldo());
        } else {
            System.out.println("Ingreso fallido en cuenta de origen.");
        }

        // Intentar un reintegro en la cuenta de origen
        if (cuentaOrigen.reintegro(100.0)) {
            System.out.println("Reintegro realizado en cuenta de origen. Nuevo saldo: " + cuentaOrigen.getSaldo());
        } else {
            System.out.println("Reintegro fallido en cuenta de origen.");
        }

        // Realizar una transferencia de cuentaOrigen a cuentaDestino
        double importeTransferencia = 300.0;
        if (cuentaOrigen.transferencia(cuentaDestino, importeTransferencia)) {
            System.out.println("Transferencia de " + importeTransferencia + " realizada de cuenta de origen a cuenta de destino.");
            System.out.println("Nuevo saldo cuenta de origen: " + cuentaOrigen.getSaldo());
            System.out.println("Nuevo saldo cuenta de destino: " + cuentaDestino.getSaldo());
        } else {
            System.out.println("Transferencia fallida. Saldo insuficiente en cuenta de origen.");
        }
    }
    
}
