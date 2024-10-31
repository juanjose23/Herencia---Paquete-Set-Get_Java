/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercio_7_g5;

/**
 *
 * @author 
 */
// Clase Punto para representar coordenadas x-y
class Punto {
    private double x;
    private double y;

    // Constructor
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Método para calcular la distancia entre dos puntos
    public double distancia(Punto otro) {
        return Math.sqrt(Math.pow(otro.getX() - x, 2) + Math.pow(otro.getY() - y, 2));
    }
}

// Clase Cuadrilatero como superclase
class Cuadrilatero {
    private Punto p1, p2, p3, p4;

    // Constructor
    public Cuadrilatero(Punto p1, Punto p2, Punto p3, Punto p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    // Getters para los puntos
    public Punto getP1() {
        return p1;
    }

    public Punto getP2() {
        return p2;
    }

    public Punto getP3() {
        return p3;
    }

    public Punto getP4() {
        return p4;
    }
}

// Clase Trapezoide que hereda de Cuadrilatero
class Trapezoide extends Cuadrilatero {
    // Constructor
    public Trapezoide(Punto p1, Punto p2, Punto p3, Punto p4) {
        super(p1, p2, p3, p4);
    }

    // Método para calcular el área del trapezoide
    public double area() {
        double base1 = getP1().distancia(getP2());
        double base2 = getP3().distancia(getP4());
        double altura = Math.abs(getP1().getY() - getP3().getY());
        return ((base1 + base2) * altura) / 2;
    }
}

// Clase Paralelogramo que hereda de Cuadrilatero
class Paralelogramo extends Cuadrilatero {
    // Constructor
    public Paralelogramo(Punto p1, Punto p2, Punto p3, Punto p4) {
        super(p1, p2, p3, p4);
    }

    // Método para calcular el área del paralelogramo
    public double area() {
        double base = getP1().distancia(getP2());
        double altura = Math.abs(getP1().getY() - getP3().getY());
        return base * altura;
    }
}

// Clase Rectángulo que hereda de Paralelogramo
class Rectangulo extends Paralelogramo {
    // Constructor
    public Rectangulo(Punto p1, Punto p2, Punto p3, Punto p4) {
        super(p1, p2, p3, p4);
    }

    // Método para calcular el área del rectángulo
    @Override
    public double area() {
        double largo = getP1().distancia(getP2());
        double ancho = getP2().distancia(getP3());
        return largo * ancho;
    }
}

// Clase Cuadrado que hereda de Rectángulo
class Cuadrado extends Rectangulo {
    // Constructor
    public Cuadrado(Punto p1, Punto p2, Punto p3, Punto p4) {
        super(p1, p2, p3, p4);
    }

    // Método para calcular el área del cuadrado
    @Override
    public double area() {
        double lado = getP1().distancia(getP2());
        return lado * lado;
    }
}

public class Ejercio_7_G5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         // Creación de puntos para las figuras
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(4, 0);
        Punto p3 = new Punto(3, 3);
        Punto p4 = new Punto(1, 3);

        // Creación de instancias de cada clase
        Trapezoide trapezoide = new Trapezoide(p1, p2, p3, p4);
        Paralelogramo paralelogramo = new Paralelogramo(p1, p2, new Punto(4, 3), p4);
        Rectangulo rectangulo = new Rectangulo(p1, p2, new Punto(4, 3), new Punto(0, 3));
        Cuadrado cuadrado = new Cuadrado(p1, new Punto(2, 0), new Punto(2, 2), new Punto(0, 2));

        // Imprimir el área de cada figura
        System.out.println("Área del trapezoide: " + trapezoide.area());
        System.out.println("Área del paralelogramo: " + paralelogramo.area());
        System.out.println("Área del rectángulo: " + rectangulo.area());
        System.out.println("Área del cuadrado: " + cuadrado.area());
    }
    
}
