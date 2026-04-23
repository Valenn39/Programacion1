package Integrador;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    // Constructor
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    // Getters
    public int getDia()  { return dia; }
    public int getMes()  { return mes; }
    public int getAnio() { return anio; }

    // Método estático: siempre devuelve 25/09/2025
    public static Fecha hoy() {
        return new Fecha(25, 9, 2025);
    }

    // Cuántos años completos hay entre this y la fecha recibida
    public int distanciaEnAnios(Fecha otra) {
        int años = otra.anio - this.anio;

        // Si en la otra fecha todavía no llegó el cumpleaños, resto 1
        if (otra.mes < this.mes || (otra.mes == this.mes && otra.dia < this.dia)) {
            años--;
        }

        return años;
    }
}