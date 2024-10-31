/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercio_9_g5;

/**
 *
 * @author 
 */

// Clase base Figuras
abstract class Figuras {
    // Método para obtener la cantidad de lados (por defecto en las figuras planas)
    public abstract int cantidadLados();

    // Método para calcular el área (implementado en las subclases)
    public abstract double area();

    // Método para calcular el perímetro (implementado en las subclases)
    public abstract double perimetro();
}

// Clase Geometrias que hereda de Figuras
abstract class Geometrias extends Figuras {
    // La clase puede tener otras propiedades o métodos comunes para las geometrías si es necesario.
}

// Clase Círculo que hereda de Geometrias
class Circulo extends Geometrias {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public int cantidadLados() {
        return 0; // El círculo no tiene lados
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
}

// Clase Triángulo que hereda de Geometrias
class Triangulo extends Geometrias {
    private double base;
    private double altura;
    private double lado1, lado2, lado3;

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public int cantidadLados() {
        return 3;
    }

    @Override
    public double area() {
        return (base * altura) / 2;
    }

    @Override
    public double perimetro() {
        return lado1 + lado2 + lado3;
    }
}

// Clase Cuadrado que hereda de Geometrias
class Cuadrado extends Geometrias {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public int cantidadLados() {
        return 4;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }
}

// Clase Rectángulo que hereda de Geometrias
class Rectangulo extends Geometrias {
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public int cantidadLados() {
        return 4;
    }

    @Override
    public double area() {
        return largo * ancho;
    }

    @Override
    public double perimetro() {
        return 2 * (largo + ancho);
    }
}

// Clase Rombo que hereda de Geometrias
class Rombo extends Geometrias {
    private double diagonalMayor;
    private double diagonalMenor;
    private double lado;

    public Rombo(double diagonalMayor, double diagonalMenor, double lado) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    @Override
    public int cantidadLados() {
        return 4;
    }

    @Override
    public double area() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }
}
public class Ejercio_9_G5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Circulo circulo = new Circulo(5);
        Triangulo triangulo = new Triangulo(3, 4, 3, 4, 5);
        Cuadrado cuadrado = new Cuadrado(4);
        Rectangulo rectangulo = new Rectangulo(5, 3);
        Rombo rombo = new Rombo(6, 4, 5);

        System.out.println("Círculo:");
        System.out.println("Cantidad de lados: " + circulo.cantidadLados());
        System.out.println("Área: " + circulo.area());
        System.out.println("Perímetro: " + circulo.perimetro());

        System.out.println("\nTriángulo:");
        System.out.println("Cantidad de lados: " + triangulo.cantidadLados());
        System.out.println("Área: " + triangulo.area());
        System.out.println("Perímetro: " + triangulo.perimetro());

        System.out.println("\nCuadrado:");
        System.out.println("Cantidad de lados: " + cuadrado.cantidadLados());
        System.out.println("Área: " + cuadrado.area());
        System.out.println("Perímetro: " + cuadrado.perimetro());

        System.out.println("\nRectángulo:");
        System.out.println("Cantidad de lados: " + rectangulo.cantidadLados());
        System.out.println("Área: " + rectangulo.area());
        System.out.println("Perímetro: " + rectangulo.perimetro());

        System.out.println("\nRombo:");
        System.out.println("Cantidad de lados: " + rombo.cantidadLados());
        System.out.println("Área: " + rombo.area());
        System.out.println("Perímetro: " + rombo.perimetro());
    }
    
}
