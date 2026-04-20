//Desarrollar un programa en Java que simule un juego donde el usuario debe adivinar un número
//secreto generado aleatoriamente.
//El programa debe permitir elegir un nivel de dificultad, el cual determina el rango del número y la
//cantidad de intentos disponibles, según la siguiente tabla:
//Opc Nivel Rango Intentos
//1 Fácil 1 a 10 5
//2 Medio 1 a 50 7
//3 Difícil 1 a 100 10
//El programa debe:
//1- generar un número aleatorio dentro del rango correspondiente


import java.util.Random;
import java.util.Scanner;
public class ej1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bienvenido al juego de adivinar el número secreto!");
        System.out.println("Seleccione un nivel de dificultad:");
        System.out.println("1. Fácil (1 a 10, 5 intentos)");
        System.out.println("2. Medio (1 a 50, 7 intentos)");
        System.out.println("3. Difícil (1 a 100, 10 intentos)");

        int nivel = scanner.nextInt();
        int rangoMaximo = 0;
        int intentosDisponibles = 0;

        switch (nivel) {
            case 1:
                rangoMaximo = 10;
                intentosDisponibles = 5;
                break;
            case 2:
                rangoMaximo = 50;
                intentosDisponibles = 7;
                break;
            case 3:
                rangoMaximo = 100;
                intentosDisponibles = 10;
                break;
            default:
                System.out.println("Nivel no válido. Por favor, seleccione un nivel entre 1 y 3.");
                return;
        }

        int numeroSecreto = random.nextInt(rangoMaximo) + 1; // Genera un número entre 1 y rangoMaximo
        boolean adivinadoCorrectamente = false;

        for (int i = 0; i < intentosDisponibles; i++) {
            System.out.println("Intento " + (i + 1) + " de " + intentosDisponibles + ". Ingrese su suposición:");
            int suposicion = scanner.nextInt();

            if (suposicion == numeroSecreto) {
                adivinadoCorrectamente = true;
                break;
            } else if (suposicion < numeroSecreto) {
                System.out.println("El número secreto es mayor que " + suposicion + ".");
            } else {
                System.out.println("El número secreto es menor que " + suposicion + ".");
            }
        }

        if (adivinadoCorrectamente) {
            System.out.println("¡Felicidades! Has adivinado el número secreto: " + numeroSecreto);
        } else {
            System.out.println("Lo siento, has agotado tus intentos. El número secreto era: "
                    + numeroSecreto);       }                                                                          

        scanner.close();
    }
}

