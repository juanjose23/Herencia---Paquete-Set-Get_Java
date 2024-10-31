/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercio_5_g5;

/**
 *
 * @author 
 */

// Clase base Empleado
class Empleado {
    private String nombre;

    // Constructor por defecto
    public Empleado() {}

    // Constructor con parámetros
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Método set para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método get para nombre
    public String getNombre() {
        return nombre;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Empleado " + nombre;
    }
}

// Clase Directivo que hereda de Empleado
class Directivo extends Empleado {
    // Constructor
    public Directivo(String nombre) {
        super(nombre);
    }

    // Sobrescribe el método toString
    @Override
    public String toString() {
        return super.toString() + " -> Directivo";
    }
}

// Clase Operario que hereda de Empleado
class Operario extends Empleado {
    // Constructor
    public Operario(String nombre) {
        super(nombre);
    }

    // Sobrescribe el método toString
    @Override
    public String toString() {
        return super.toString() + " -> Operario";
    }
}

// Clase Oficial que hereda de Operario
class Oficial extends Operario {
    // Constructor
    public Oficial(String nombre) {
        super(nombre);
    }

    // Sobrescribe el método toString
    @Override
    public String toString() {
        return super.toString() + " -> Oficial";
    }
}

// Clase Tecnico que hereda de Operario
class Tecnico extends Operario {
    // Constructor
    public Tecnico(String nombre) {
        super(nombre);
    }

    // Sobrescribe el método toString
    @Override
    public String toString() {
        return super.toString() + " -> Tecnico";
    }
}

public class Ejercio_5_G5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          Empleado E1 = new Empleado("Rafa");
        Directivo D1 = new Directivo("Mario");
        Operario OP1 = new Operario("Alfonso");
        Oficial OF1 = new Oficial("Luis");
        Tecnico T1 = new Tecnico("Pablo");

        System.out.println(E1);
        System.out.println(D1);
        System.out.println(OP1);
        System.out.println(OF1);
        System.out.println(T1);
    }
    
}
