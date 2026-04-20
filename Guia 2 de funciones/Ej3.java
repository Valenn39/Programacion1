//3- Desarrolle una función que reciba un número de minutos y devuelva una cadena
//informando la cantidad de horas completas y minutos restantes.
//Ejemplo:
//Entrada: 135 → Salida: 2 horas y 15 minutos

import java.util.Scanner;


import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número en minutos: ");
        int min = sc.nextInt();

        String resultado = convertir(min);

        System.out.println(resultado);

        sc.close();
    }

    public static String convertir(int min) {
        int horas = min / 60;
        int minutosRestantes = min % 60;

        return horas + " horas y " + minutosRestantes + " minutos";
    }
}
