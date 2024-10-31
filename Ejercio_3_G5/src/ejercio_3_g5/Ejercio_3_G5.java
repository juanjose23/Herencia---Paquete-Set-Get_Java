/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercio_3_g5;

/**
 *
 * @author 
 */

 class Libro {
    // Atributos de la clase
    private String titulo;
    private String autor;
    private int numEjemplares;
    private int numPrestados;

    // Constructor por defecto
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.numEjemplares = 0;
        this.numPrestados = 0;
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, int numEjemplares, int numPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numPrestados = Math.min(numPrestados, numEjemplares); // Evitar prestar más de los ejemplares disponibles
    }

    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getNumPrestados() {
        return numPrestados;
    }

    public void setNumPrestados(int numPrestados) {
        if (numPrestados <= this.numEjemplares) {
            this.numPrestados = numPrestados;
        }
    }

    // Método préstamo
    public boolean prestamo() {
        if (numPrestados < numEjemplares) {
            numPrestados++;
            return true;
        }
        return false;
    }

    // Método devolución
    public boolean devolucion() {
        if (numPrestados > 0) {
            numPrestados--;
            return true;
        }
        return false;
    }

    // Método toString para mostrar los datos del libro
    @Override
    public String toString() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nEjemplares: " + numEjemplares + 
               "\nEjemplares prestados: " + numPrestados;
    }
 }
public class Ejercio_3_G5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Crear un libro con el constructor con parámetros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 5, 2);

        // Mostrar información del libro
        System.out.println("Información del libro:\n" + libro1);

        // Intentar realizar un préstamo
        if (libro1.prestamo()) {
            System.out.println("\nPréstamo realizado. Ejemplares prestados: " + libro1.getNumPrestados());
        } else {
            System.out.println("\nNo hay ejemplares disponibles para préstamo.");
        }

        // Intentar realizar una devolución
        if (libro1.devolucion()) {
            System.out.println("Devolución realizada. Ejemplares prestados: " + libro1.getNumPrestados());
        } else {
            System.out.println("No hay ejemplares prestados para devolver.");
        }

        // Mostrar información del libro después de las operaciones
        System.out.println("\nInformación del libro después de las operaciones:\n" + libro1);
    }
    
}
