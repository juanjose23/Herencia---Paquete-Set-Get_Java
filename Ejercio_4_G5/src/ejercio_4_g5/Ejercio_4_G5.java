/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercio_4_g5;

/**
 *
 * @author 
 */
class Fraccion {
    // Atributos para numerador y denominador
    private int num;
    private int den;

    // Constructor por defecto que inicializa a 0/1
    public Fraccion() {
        this.num = 0;
        this.den = 1;
    }

    // Constructor con parámetros
    public Fraccion(int num, int den) {
        if (den == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        this.num = num;
        this.den = den;
        simplificar();
    }

    // Getter para numerador y denominador
    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    // Método para sumar otra fracción
    public Fraccion sumar(Fraccion otra) {
        int nuevoNum = this.num * otra.den + otra.num * this.den;
        int nuevoDen = this.den * otra.den;
        return new Fraccion(nuevoNum, nuevoDen);
    }

    // Método para restar otra fracción
    public Fraccion restar(Fraccion otra) {
        int nuevoNum = this.num * otra.den - otra.num * this.den;
        int nuevoDen = this.den * otra.den;
        return new Fraccion(nuevoNum, nuevoDen);
    }

    // Método para multiplicar otra fracción
    public Fraccion multiplicar(Fraccion otra) {
        int nuevoNum = this.num * otra.num;
        int nuevoDen = this.den * otra.den;
        return new Fraccion(nuevoNum, nuevoDen);
    }

    // Método para dividir otra fracción
    public Fraccion dividir(Fraccion otra) {
        if (otra.num == 0) {
            throw new ArithmeticException("No se puede dividir por una fracción con numerador 0.");
        }
        int nuevoNum = this.num * otra.den;
        int nuevoDen = this.den * otra.num;
        return new Fraccion(nuevoNum, nuevoDen);
    }

    // Método para simplificar la fracción
    private void simplificar() {
        int gcd = mcd(num, den);
        this.num /= gcd;
        this.den /= gcd;
        if (den < 0) {  // Asegurar que el denominador es positivo
            this.num = -this.num;
            this.den = -this.den;
        }
    }

    // Método para calcular el Máximo Común Divisor (MCD)
    private int mcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Método toString para representar la fracción
    @Override
    public String toString() {
        return num + "/" + den;
    }
}
public class Ejercio_4_G5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         // Crear fracciones
        Fraccion f1 = new Fraccion(1, 2);
        Fraccion f2 = new Fraccion(3, 4);

        // Sumar fracciones
        Fraccion suma = f1.sumar(f2);
        System.out.println("Suma: " + suma);

        // Restar fracciones
        Fraccion resta = f1.restar(f2);
        System.out.println("Resta: " + resta);

        // Multiplicar fracciones
        Fraccion multiplicacion = f1.multiplicar(f2);
        System.out.println("Multiplicación: " + multiplicacion);

        // Dividir fracciones
        Fraccion division = f1.dividir(f2);
        System.out.println("División: " + division);
    }
    
}
