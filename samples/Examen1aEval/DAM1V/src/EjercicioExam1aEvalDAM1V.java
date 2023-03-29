import java.util.Scanner;

public class EjercicioExam1aEvalDAM1V {	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dineroJugador = 90;
        int dineroBanca = 1500;
        int tiradas = 0;
        boolean seguirJugando = true;

        while (seguirJugando && dineroJugador >= 6 && dineroBanca > 0) {
            System.out.print("Introduce la apuesta: ");
            int apuesta = sc.nextInt();
            while (apuesta < 6 || apuesta > dineroJugador) {
                System.out.println("La apuesta debe ser mínimo 6 y máximo " + dineroJugador);
                System.out.print("Introduce la apuesta: ");
                apuesta = sc.nextInt();
            }
            
            int dado1=0;
            int dado2=0;
            while(dado1<1 || dado1>6){
                System.out.print("Introduce la tirada del dado1: ");
                dado1 = sc.nextInt();
            }
            while(dado2<1 || dado2>6){
                System.out.print("Introduce la tirada del dado2: ");
                dado2 = sc.nextInt();
            }
            
            int suma = dado1 + dado2;
            if (suma == 7 || suma == 11) {
                System.out.println("El jugador gana");
                dineroJugador += apuesta * 3;
                dineroBanca -= apuesta * 3;
            } else if (suma == 2 || suma == 3 || suma == 12) {
                System.out.println("El jugador pierde");
                dineroJugador -= apuesta;
                dineroBanca += apuesta;
            } else {
                System.out.println("El jugador ni gana ni pierde, debe repetir la tirada");
            }
            tiradas++;

            //Comprobamos si el jugador y la banca tienen suficiente dinero
            if (dineroJugador < 6) {
                System.out.println("El jugador no puede seguir jugando, debe tener al menos 6€");
                break;
            }
            if (dineroBanca < 1) {
                System.out.println("La banca no puede seguir jugando, no tiene dinero");
                break;
            }
            System.out.print("¿Quiere seguir jugando (S/N)? ");
            String linea = sc.next();

            if(linea.charAt(0) == 'S'){
                seguirJugando = true;
            }else{
                seguirJugando = false;
            }            
        }
        System.out.println("Saldo final jugador: " + dineroJugador);
        System.out.println("Saldo final banca: " + dineroBanca);
        System.out.println("Tiradas totales: " + tiradas);
    }


}