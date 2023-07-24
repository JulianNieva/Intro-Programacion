public class Main {
    public static void main(String[] args) {
        //Creamos el objeto cliente y le damos valores
        Cliente cliente = new Cliente();
        cliente.nombre = "Roberto";
        cliente.edad = 25;
        cliente.telefono = "68712943";
        cliente.credito = 100;

        //Mostramos los datos del cliente
        System.out.printf("CLIENTE\nNombre: %s\nEdad: %d\nTelefono: %s\nCredito: %.2f",
                cliente.nombre,cliente.edad,cliente.telefono,cliente.credito);

        System.out.println("\n");

        //Hacemos lo mismo pero para Trabajador
        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Romero";
        trabajador.edad = 30;
        trabajador.telefono = "72849129";
        trabajador.salario = 300000;

        System.out.printf("TRABAJADOR\nNombre: %s\nEdad: %d\nTelefono: %s\nSalario: %.2f",
                trabajador.nombre,trabajador.edad,trabajador.telefono,trabajador.salario);
    }
}

class Persona{
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona{
   double credito;
}

class Trabajador extends Persona{
    double salario;
}