/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercio_10_g5;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author jrios
 */
abstract class Barco {

    protected String matricula;
    protected double eslora; // en metros
    protected int anioFabricacion;

    public Barco(String matricula, double eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    // Método abstracto para calcular el módulo
  public int modulo() {
    return (int) eslora;
}

    // Método para calcular el precio del alquiler
    public double precioAlquiler(int dias) {
        return (dias * (10 * eslora + 2)); // Cálculo base
    }
}

class Velero extends Barco {

    private int numeroMastiles;

    public Velero(String matricula, double eslora, int anioFabricacion, int numeroMastiles) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public int modulo() {
        return (int) (super.modulo() + numeroMastiles); // Módulo base + mástiles
    }
}

class EmbarcacionDeportiva extends Barco {

    private int potenciaCV;

    public EmbarcacionDeportiva(String matricula, double eslora, int anioFabricacion, int potenciaCV) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    @Override
    public int modulo() {
        return (int) (super.modulo() + potenciaCV); // Módulo base + potencia
    }
}

class YateLujo extends Barco {

    private int potenciaCV;
    private int numeroCamarotes;

    public YateLujo(String matricula, double eslora, int anioFabricacion, int potenciaCV, int numeroCamarotes) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public int modulo() {
        return (int) (super.modulo() + potenciaCV + numeroCamarotes); // Módulo base + potencia + camarotes
    }
}

class Alquiler {

    private String nombreCliente;
    private String dniCliente;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String posicionAmarre;
    private Barco barco;

    public Alquiler(String nombreCliente, String dniCliente, LocalDate fechaInicio, LocalDate fechaFin, String posicionAmarre, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public int diasAlquiler() {
        return (int) (fechaFin.toEpochDay() - fechaInicio.toEpochDay()) + 1; // +1 para incluir ambos días
    }

    public double calcularPrecioAlquiler() {
        return barco.precioAlquiler(diasAlquiler());
    }

    @Override
    public String toString() {
        return "Alquiler{"
                + "nombreCliente='" + nombreCliente + '\''
                + ", dniCliente='" + dniCliente + '\''
                + ", fechaInicio=" + fechaInicio
                + ", fechaFin=" + fechaFin
                + ", posicionAmarre='" + posicionAmarre + '\''
                + ", barco=" + barco.matricula
                + ", precioTotal=" + calcularPrecioAlquiler()
                + '}';
    }
}

public class Ejercio_10_G5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);

        // Crear un barco de ejemplo
        System.out.print("Introduce el tipo de barco (Velero, EmbarcacionDeportiva, YateLujo): ");
        String tipoBarco = scanner.nextLine();

        System.out.print("Introduce la matrícula del barco: ");
        String matricula = scanner.nextLine();

        System.out.print("Introduce la eslora del barco en metros: ");
        double eslora = scanner.nextDouble();

        System.out.print("Introduce el año de fabricación del barco: ");
        int anioFabricacion = scanner.nextInt();

        Barco barco = null;

        switch (tipoBarco.toLowerCase()) {
            case "velero":
                System.out.print("Introduce el número de mástiles: ");
                int numeroMastiles = scanner.nextInt();
                barco = new Velero(matricula, eslora, anioFabricacion, numeroMastiles);
                break;

            case "embarcaciondeportiva":
                System.out.print("Introduce la potencia en CV: ");
                int potenciaCV = scanner.nextInt();
                barco = new EmbarcacionDeportiva(matricula, eslora, anioFabricacion, potenciaCV);
                break;

            case "yatelujo":
                System.out.print("Introduce la potencia en CV: ");
                potenciaCV = scanner.nextInt();
                System.out.print("Introduce el número de camarotes: ");
                int numeroCamarotes = scanner.nextInt();
                barco = new YateLujo(matricula, eslora, anioFabricacion, potenciaCV, numeroCamarotes);
                break;

            default:
                System.out.println("Tipo de barco no reconocido.");
                return;
        }

        // Crear el alquiler
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Introduce el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Introduce el DNI del cliente: ");
        String dniCliente = scanner.nextLine();

        System.out.print("Introduce la fecha de inicio (YYYY-MM-DD): ");
        LocalDate fechaInicio = LocalDate.parse(scanner.nextLine());

        System.out.print("Introduce la fecha de fin (YYYY-MM-DD): ");
        LocalDate fechaFin = LocalDate.parse(scanner.nextLine());

        System.out.print("Introduce la posición del amarre: ");
        String posicionAmarre = scanner.nextLine();

        Alquiler alquiler = new Alquiler(nombreCliente, dniCliente, fechaInicio, fechaFin, posicionAmarre, barco);

        // Mostrar información del alquiler
        System.out.println(alquiler);

        scanner.close();
    }

}
