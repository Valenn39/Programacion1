package EjerciciosExtrasFuncionesProcedimientos;
import java.util.Scanner;
public class tablero {
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cantidad de filas");
        int filas = sc.nextInt();

        System.out.print("Ingrese canntidad de columnas: ");
        int columnas = sc.nextInt();

        sc.close();
    }

    private static String obtenerValor(int filas, int columnas){
        if ((filas + columnas) % 2 == 0 ){
            return "X";
        }else {
            return "0";
        }
    }
    private static void generarTablero(int filas, int columnas) {
        for(int i=0; i < filas; i++){
            for (int j=0; j< columnas; j++){
                System.out.print(obtenerValor(i,j)+ " ");
            }
            System.out.println();
        }
    }
    
}
