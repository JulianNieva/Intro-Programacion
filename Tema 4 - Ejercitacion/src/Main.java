public class Main {
    public static void main(String[] args)
    {
        //Inicializo todas las variables a utilizar
        int numeroIf = -1;
        int numeroWhile = 0;
        int numeroDoWhile = 3;
        String estacion = "primavera";

        //If, else-if, else
        if (numeroIf > 0){
            System.out.println("El valor de numeroIf "+ numeroIf+ " es positivo!");
        } else if (numeroIf == 0) {
            System.out.println("El valor de numeroIf es 0!");
        }
        else {
            System.out.println("El valor de numeroIf "+ numeroIf + " es negativo!");
        }

        //while
        while(numeroWhile < 3)
        {
            numeroWhile++;
            System.out.println("Valor de numeroWhile = "+numeroWhile);
        }

        //do-while
        do
        {
            numeroDoWhile++;
            System.out.println("Valor de numeroDoWhile = "+numeroDoWhile);

        }while(numeroDoWhile < 3);

        //for
        for (int numeroFor = 0; numeroFor <= 3;numeroFor++)
        {
            System.out.println("Valor de numeroFor = " + numeroFor);
        }

        //switch
        switch (estacion)
        {
            case "verano":
                System.out.println("Estamos en verano, a la pileta de inmediato!");
                break;
            case "invierno":
                System.out.println("Estamos en invierno, a ponerse un abrigo impermeable!");
                break;
            case "otoño":
                System.out.println("Estamos en otoño, a observar la caida de las hojas!");
                break;
            case "primavera":
                System.out.println("Estamos en primavera, a disfrutar la naturaleza!");
                break;
            default:
                System.out.println("No es una estacion valida...");
                break;
        }
    }
}