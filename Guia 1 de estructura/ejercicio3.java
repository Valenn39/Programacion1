//3. Ingresar dos valores enteros, el primero corresponde a la cantidad de lápices en stock y el segundo a la
//cantidad de lápices que se pueden colocar en una caja. Calcule cuantas cajas completas se pueden llenar
//con los lápices disponibles y cuantos lápices sueltos quedarían.
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un valor entero que corresponda a la cantidad de lapices en stock: ");
      
        int lapicesEnStock = scanner.nextInt();
        
        System.out.println("Ingrese la cantidad de lapices que se pueden colocar en una caja: ");
        int LapicesPorCaja = scanner.nextInt(); 

        int CantCajasllenas = lapicesEnStock / LapicesPorCaja;
        int LapicesSueltos = lapicesEnStock % LapicesPorCaja;

        System.out.println("Cantidad de cajas completas: " + CantCajasllenas);
        System.out.println("Lápices sueltos: " + LapicesSueltos);
        scanner.close();
    }
}
