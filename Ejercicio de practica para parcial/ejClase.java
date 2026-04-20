

public class ejClase {
    private static int contarVocal(String texto, char vocal) {
        int contador = 0;

        for(int i = 0; i < texto.length(); i++){
            if (Character.toLowerCase(texto.charAt(i)) == vocal ){
                contador++;
            }
        }
        return contador; 
    }
}
