/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercio_11_g5;

/**
 *
 * @author 
 */
// Clase A con un constructor sin parámetros
class A {
    public A() {
        System.out.println("Constructor de A sin parámetros");
    }
}

// Clase B con un constructor sin parámetros
class B {
    public B() {
        System.out.println("Constructor de B sin parámetros");
    }
}

// Clase C que hereda de A y tiene una variable de tipo B
class C extends A {
    private B b = new B(); // Se inicializa una instancia de B

    // Clase C no tiene constructor explícito
}

class A1 {
    public A1(String mensaje) {
        System.out.println("Constructor de A con parámetro: " + mensaje);
    }
}

// Clase B con un constructor que toma un parámetro
class B1 {
    public B1(String mensaje) {
        System.out.println("Constructor de B con parámetro: " + mensaje);
    }
}

// Clase C que hereda de A y tiene una variable de tipo B
class C1 extends A1 {
    private B1 b;

    // Como A tiene un constructor con parámetro, necesitamos definir el constructor de C
    public C1(String mensajeA, String mensajeB) {
        super(mensajeA); // Llamada al constructor de A con un parámetro
        b = new B1(mensajeB); // Inicialización de la variable b de tipo B con el parámetro
    }
}


public class Ejercio_11_G5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           C c = new C(); // Crear una instancia de C
            C1 c1 = new C1("Hola desde A", "Hola desde B");
    }
    
}
