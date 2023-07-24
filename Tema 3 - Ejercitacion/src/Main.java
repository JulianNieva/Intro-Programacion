public class Main {
    public static void main(String[] args)
    {
        //Parte 1
        sumarNumeros(30,20,40);

        //Parte 2
        Coche miCoche = new Coche();
        miCoche.sumarCantPuertas();
        System.out.println("Cantidad de puertas en miCoche = " + miCoche.cantidadPuertas);
    }

    public static void sumarNumeros(int primerNumero, int segundoNumero, int tercerNumero)
    {
        int resultado = primerNumero+segundoNumero+tercerNumero;
        System.out.println("Resultado de la suma = " + resultado);
    }
}

class Coche {
    public int cantidadPuertas = 4;

    public void sumarCantPuertas()
    {
        this.cantidadPuertas++;
    }
}