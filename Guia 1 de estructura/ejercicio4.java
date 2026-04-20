//4. Dadas las medidas de dos ángulos de un triángulo, determinar la medida del tercero e informar el
//resultado. Nota: La suma de los ángulos interiores de cualquier triángulo es siempre 180 grados


import java.util.Scanner;

public class ejercicio4 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la medida de el primer lado del triangulo: ");
        double medida1 = scanner.nextDouble();
        System.out.println("Ingrese la medida de el segundo lado del triangulo:");
        double medida2 = scanner.nextDouble();
        double medida3 = 180 - (medida1 + medida2);
        System.out.println("La medida del tercer lado del triangulo es: " + medida3);
        scanner.close();
        
    }
}