/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercio_8_g5;

/**
 *
 * @author 
 */
public class Persona {
     // Atributos
    private String nombre;
    private int edad;
    private String dni;
    private char sexo; // 'H' para hombre, 'M' para mujer
    private double peso; // en kg
    private double altura; // en metros

    // Constantes
    private static final char SEXO_DEFAULT = 'H';
    private static final int PESO_IDEAL = 0;
    private static final int BAJO_PESO = -1;
    private static final int SOBREPESO = 1;

    // Constructor por defecto
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dni = "";
        this.sexo = SEXO_DEFAULT;
        this.peso = 0;
        this.altura = 0;
    }

    // Constructor con nombre, edad y sexo
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
    }

    // Constructor con todos los atributos
    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    // Métodos
    private void comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            this.sexo = sexo;
        } else {
            this.sexo = SEXO_DEFAULT;
        }
    }

    public int calcularIMC() {
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return BAJO_PESO; // -1
        } else if (imc >= 20 && imc <= 25) {
            return PESO_IDEAL; // 0
        } else {
            return SOBREPESO; // 1
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setSexo(char sexo) {
        comprobarSexo(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String ver() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", DNI: " + dni + ", Sexo: " + sexo +
               ", Peso: " + peso + "kg, Altura: " + altura + "m";
    }
}
