//2. Dado un Nº del 1 al 7 determinar (mostrar) el nombre del día de la semana que corresponde. Si el nro
//está fuera de rango infórmelo como un error de ingreso de datos. 

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresá un número (1-7): ");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Error: número fuera de rango");
        }

        scanner.close();
    }
}