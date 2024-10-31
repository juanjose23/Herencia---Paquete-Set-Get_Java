/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercio_12_g5;

/**
 *
 * @author 
 */

class Perro {

    // Método ladrido sin parámetros
    public void ladrido() {
        System.out.println("Guau! Guau!");
    }

    // Método ladrido con un parámetro String
    public void ladrido(String tipo) {
        System.out.println("El perro ladra como un " + tipo + ": Guau! Guau!");
    }

    // Método ladrido con un parámetro int (puede representar el volumen)
    public void ladrido(int volumen) {
        String sonido = "Guau! Guau!";
        StringBuilder ladridoVolumen = new StringBuilder();

        for (int i = 0; i < volumen; i++) {
            ladridoVolumen.append(sonido).append(" ");
        }
        System.out.println("El perro ladra con un volumen de " + volumen + ": " + ladridoVolumen.toString().trim());
    }

    // Método ladrido con un parámetro booleano (por ejemplo, si está emocionado)
    public void ladrido(boolean emocionado) {
        if (emocionado) {
            System.out.println("¡El perro está emocionado y ladra fuertemente! Guau! Guau!");
        } else {
            System.out.println("El perro ladra tranquilo: guau...");
        }
    }
}


public class Ejercio_12_G5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Perro miPerro = new Perro();

        // Llamadas al método ladrido con diferentes parámetros
        miPerro.ladrido(); // Ladrido por defecto
        miPerro.ladrido("pastor alemán"); // Ladrido con tipo
        miPerro.ladrido(3); // Ladrido con volumen
        miPerro.ladrido(true); // Ladrido con emoción
        miPerro.ladrido(false); // Ladrido sin emoción
    }
    
}
