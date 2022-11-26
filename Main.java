public class Main {
    public static void main(String[] args) {
        int numeroIf = -50;
        int numeroWhile = 0;
        String estacion = "Otoño";

        if(numeroIf < 0) {
            System.out.println("Es negativo");
        }
        else if(numeroIf > 0) {
            System.out.println("Es positivo");
        }
        else {
            System.out.println("Es 0");
        }

        while(numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        numeroWhile = 0;

        do {
            numeroWhile++;
        } while(numeroWhile < 3);
        System.out.println(numeroWhile);

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        switch(estacion) {
            case "Verano":
                System.out.println("Estamos en verano");
                break;
            case "Primavera":
                System.out.println("Estamos en primavera");
                break;
            case "Otoño":
                System.out.println("Estamos en otoño");
                break;
            case "Invierno":
                System.out.println("Estamos en invierno");
                break;
            default:
                System.out.println("Te equivocaste con las estaciones");
        }
    }
}