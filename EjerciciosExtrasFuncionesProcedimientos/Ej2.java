
public class Ej2{
    public static void main(String[] args)




}

private static String obtenerCaracter(int fila, int columna, int base, int altura){
    String auxiliar;
    if(fila == 0 || fila == altura - 1 || columna == 0 || columna == base - 1 ){
        auxiliar = "* ";

    }else {
        auxiliar = " ";
    }
    return auxiliar;  
}

private static void dubujarRectangulo(int base, int altura){
    for (int i = 0; i < altura; i++){
        for(int j= 0; i< altura; i++){
            System.out.print(obtenerCaracter(i,j, base, altura));
        }
        System.out.println();
    }
}