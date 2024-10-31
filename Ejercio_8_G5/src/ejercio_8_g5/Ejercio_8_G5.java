/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercio_8_g5;

import java.util.Scanner;

/**
 *
 * @author 
 */

public class Ejercio_8_G5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // Primer objeto: Pedir datos por teclado
        System.out.print("Introduce el nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Introduce la edad: ");
        int edad = scanner.nextInt();
        
        System.out.print("Introduce el sexo (H/M): ");
        char sexo = scanner.next().charAt(0);
        
        System.out.print("Introduce el DNI: ");
        String dni = scanner.next(); // Pide el DNI
        
        System.out.print("Introduce el peso (kg): ");
        double peso = scanner.nextDouble();
        
        System.out.print("Introduce la altura (m): ");
        double altura = scanner.nextDouble();

        // Ahora el constructor tiene todos los parámetros necesarios
        Persona persona1 = new Persona(nombre, edad, dni, sexo, peso, altura);

        // Segundo objeto: Sin peso y altura
        Persona persona2 = new Persona(nombre, edad, sexo);

        // Tercer objeto: Por defecto
        Persona persona3 = new Persona();
        persona3.setNombre(nombre);
        persona3.setEdad(edad);
        persona3.setSexo(sexo);
        persona3.setPeso(peso);
        persona3.setAltura(altura);

        // Comprobar IMC y edad para cada objeto
        for (Persona persona : new Persona[]{persona1, persona2, persona3}) {
            int imcResult = persona.calcularIMC();
            String imcMessage = "";
            switch (imcResult) {
                case -1: imcMessage = "Está por debajo de su peso ideal."; break;
                case 0: imcMessage = "Está en su peso ideal."; break;
                case 1: imcMessage = "Tiene sobrepeso."; break;
            }
            System.out.println(persona.ver() + " " + imcMessage);
            System.out.println("Es mayor de edad: " + persona.esMayorDeEdad());
        }

        scanner.close();
    }
    
}
