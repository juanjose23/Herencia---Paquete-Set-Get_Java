/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercio_2_g5;

/**
 *
 * @author jrios
 */

 class Contador {
    // Atributo de la clase
    private int cont;

    // Constructor por defecto que inicializa el contador a 0
    public Contador() {
        this.cont = 0;
    }

    // Constructor con parámetros para inicializar el contador, asegurando que no sea negativo
    public Contador(int cont) {
        if (cont < 0) {
            this.cont = 0;
        } else {
            this.cont = cont;
        }
    }

    // Getter para obtener el valor del contador
    public int getCont() {
        return cont;
    }

    // Setter para asignar un nuevo valor al contador, asegurando que no sea negativo
    public void setCont(int cont) {
        if (cont >= 0) {
            this.cont = cont;
        }
    }

    // Método para incrementar el contador en 1
    public void incrementar() {
        this.cont++;
    }

    // Método para decrementar el contador en 1, asegurando que no sea negativo
    public void decrementar() {
        if (this.cont > 0) {
            this.cont--;
        } else {
            this.cont = 0;
        }
    }
}
public class Ejercio_2_G5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          // Crear un contador usando el constructor por defecto
        Contador contador1 = new Contador();
        System.out.println("Valor inicial de contador1 (constructor por defecto): " + contador1.getCont());

        // Incrementar y decrementar contador1
        contador1.incrementar();
        System.out.println("Valor de contador1 después de incrementar: " + contador1.getCont());
        contador1.decrementar();
        System.out.println("Valor de contador1 después de decrementar: " + contador1.getCont());

        // Crear un contador con un valor inicial positivo
        Contador contador2 = new Contador(10);
        System.out.println("\nValor inicial de contador2 (constructor con parámetro 10): " + contador2.getCont());

        // Incrementar y decrementar contador2
        contador2.incrementar();
        System.out.println("Valor de contador2 después de incrementar: " + contador2.getCont());
        contador2.decrementar();
        contador2.decrementar();
        System.out.println("Valor de contador2 después de dos decrementos: " + contador2.getCont());

        // Intentar crear un contador con un valor negativo
        Contador contador3 = new Contador(-5);
        System.out.println("\nValor inicial de contador3 (constructor con parámetro -5): " + contador3.getCont());
    }
    
}
