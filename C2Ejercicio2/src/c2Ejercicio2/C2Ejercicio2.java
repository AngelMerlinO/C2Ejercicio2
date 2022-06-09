
package c2Ejercicio2;

import java.util.Scanner;

public class C2Ejercicio2 {
    private String nombre;

    //constructor por defecto
   /*public Empleado() {
    }*/

    //constructor con un parámetro
    public C2Ejercicio2(String nombre) {
        this.nombre = nombre;
        System.out.println("Constructor de Empleado " + nombre);
    }
   
    //métodos get y set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //método toString()
    //devuelve un String formado por la palabra “Empleado” y el nombre de empleado                                
    @Override
    public String toString() {
        return "Empleado " + nombre;
    }
    
    public static String leerdatos(String nom){
        return "Escribe el nombre del " + nom + ":";
    }
    
    public static void main(String[] args) {
        Menu menu= new Menu ();
        menu.setVisible(true);
        C2Ejercicio2 E1 = new C2Ejercicio2(leerdatos("Empleado"));
        Directivo D1 = new Directivo(leerdatos("Directivo"));
        Operario OP1 = new Operario(leerdatos("Operario"));                                                                           
        Oficial OF1 = new Oficial(leerdatos("Oficial"));
        Tecnico T1 = new Tecnico(leerdatos("Técnico"));
        System.out.println(E1);
        System.out.println(D1);
        System.out.println(OP1);
        System.out.println(OF1);
        System.out.println(T1);
    }   
}
