//1- Clase Persona
//a. Defina una clase Persona con atributos nombre y edad.
//b. Declare un objeto Persona en el main.
//c. Asigne valores a sus atributos y muestra los datos por consola.
public class Persona2 {

    String nombre; 
    int edad; 
    public static void main (String[] args){ 
        Persona2 unaPersona = new Persona2(); 
        unaPersona.nombre = "Valentin";
        unaPersona.edad = 19;
        //objeto.lo que quiero del atributo.
        System.out.println("Mi nombre es " + unaPersona.nombre + "y mi edad es " + unaPersona.edad );
        saludar(unaPersona); //para static void
        //Persona1.saludar(unaPersona); hago explicito que es un metodo de la clase
    }
     static void saludar(Persona2 unaPersona){
        System.out.println("Hola soy "+ unaPersona.nombre+ "y tengo " + unaPersona.edad+ "años.");
    }

    
}
//2- Métodos en la clase
//Amplíe la clase Persona agregando un método estatico (Static) saludar() que imprima:
//"Hola, soy [nombre] y tengo [edad] años."
//Crea varios objetos y llama al método.