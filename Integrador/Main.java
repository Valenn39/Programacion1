package Integrador;

public class Main {
    public static void main(String[] args) {

        
        Ciudadano c1 = new Ciudadano("García", "Lucas", new Fecha(1, 1, 2015));
        System.out.println(c1);

        c1.setTramite(Tramite.REGISTRO_AUTO);   
        System.out.println(c1);

        Ciudadano c2 = new Ciudadano("López", "Ana", new Fecha(10, 3, 2008));
        System.out.println(c2);

        c2.setTramite(Tramite.REGISTRO_AUTO);  
        System.out.println(c2);

        c2.setTramite(Tramite.ABRIR_EMPRESA);   
        System.out.println(c2);

        Ciudadano c3 = new Ciudadano("Martínez", "Pedro", new Fecha(5, 5, 1995));
        System.out.println(c3);
        c3.setTramite(Tramite.ABRIR_EMPRESA); 
        System.out.println(c3);
    }
}
    

