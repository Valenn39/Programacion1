package Integrador;

public class Ciudadano {
    private String apellido;
    private String nombre;
    private Fecha nacimiento;
    private Tramite tramite;  // no se pasa en el constructor

    // Constructor: tramite siempre arranca en NINGUNO
    public Ciudadano(String apellido, String nombre, Fecha nacimiento) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.tramite = Tramite.NINGUNO;  // fijo
    }

    // Getters y setters simples
    public String getApellido()      { return apellido; }
    public String getNombre()        { return nombre; }
    public Fecha getNacimiento()     { return nacimiento; }
    public Tramite getTramite()      { return tramite; }
    public void setApellido(String a){ this.apellido = a; }
    public void setNombre(String n)  { this.nombre = n; }

    // Edad: años entre nacimiento y hoy
    public int getEdad() {
        return nacimiento.distanciaEnAnios(Fecha.hoy());
    }

    // setTramite CON validaciones
    public void setTramite(Tramite t) {
        if (t == Tramite.REGISTRO_AUTO && getEdad() < 16) {
            System.out.println("Error: necesita al menos 16 años para REGISTRO_AUTO.");
            this.tramite = Tramite.NINGUNO;
        } else if (t == Tramite.ABRIR_EMPRESA && getEdad() < 18) {
            System.out.println("Error: necesita al menos 18 años para ABRIR_EMPRESA.");
            this.tramite = Tramite.NINGUNO;
        } else {
            this.tramite = t;  // todo OK, se asigna
        }
    }

    @Override
    public String toString() {
        return apellido + ", " + nombre +
               " | Nacimiento: " + nacimiento.getDia() + "/" + nacimiento.getMes() + "/" + nacimiento.getAnio() +
               " | Edad: " + getEdad() +
               " | Trámite: " + tramite;
    }
}

