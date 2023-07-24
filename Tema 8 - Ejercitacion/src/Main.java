public class Main {
    public static void main(String[] args) {
        //Instanciamos Persona
        Persona persona = new Persona();

        //Damos valores a la persona
        persona.setEdad(20);
        persona.setNombre("Julian");
        persona.setTelefono("12345678");

        //Mostramos sus valores
        System.out.printf("Nombre: %s\nEdad: %d\nTelefono: %s",persona.getNombre(),persona.getEdad(),persona.getTelefono());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}


