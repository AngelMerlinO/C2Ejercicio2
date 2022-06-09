package c2Ejercicio2;

public class Operario extends C2Ejercicio2{
    
    //constructor por defecto
    /*public Operario() {
    }*/

    //constructor con un parámetro
    public Operario(String nombre) {
        super(nombre);
        System.out.println("Constructor de Operario");
    }

    
    //modificación del método toString() para mostrar el mensaje adecuado                                         
    @Override
    public String toString() {
        return super.toString() + " -> Operario";
    }
   
}