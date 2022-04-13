import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final int[] valoresPerder = {2, 3, 12};
    private static final int[] valoresGanar = {7, 11};
    private static final double APUESTA_MIN = 20;
    private static double apuesta = 0;
    private static double saldo = 500;

    public static void main(String[] args) {
        int opcion;

        do {

            System.out.println("Bienvenido al casino");
            System.out.println("Introduce una opción");
            System.out.println("Opcion 1 Jugar");
            System.out.println("Opcion 2 Salir");

            opcion = pedirOpcion(new int[]{1, 2});

            switch (opcion) {
                case 1:
                    System.out.println("Cuanto quieres apostars");
                    apuesta = apostar();
                    System.out.println("Has apostado " + apuesta);
                    System.out.println("¿Que quiere hacer?");
                    System.out.println("Tirar");
                    pedirOpcion(new int[]{1});
                    int tirada1 = tirarDados();
                    System.out.println("sacaste: " + tirada1);

                    if (estaEn(valoresGanar, tirada1)) {
                        System.out.println("Has ganado");
                        saldo += apuesta;
                    } else if (estaEn(valoresPerder, tirada1)) {
                        System.out.println("Has perdido sacaste :");
                        saldo -= apuesta;
                    } else {
                        logicasegundatirada(tirada1);
                    }
                    if (saldo < 20) {
                        System.out.println("Su saldo no permite jugar");
                        System.exit(0);
                    }

                    break;
                case 2:
                    System.out.println("Salir");
                    System.exit(0);
                    break;
            }


        } while (true);
    }

    private static void logicasegundatirada(int tirada1) {
        int tirada2=0;

        do {
            System.out.println("Que quieres hacer");
            System.out.println("Opcion 1 apostar");
            System.out.println("Opcion 2 tirar");
            int opcion = pedirOpcion(new int[]{1, 2});


            switch (opcion) {
                case 1:
                    System.out.println("Cuanto quieres apostars");
                    apuesta = apostar();
                    System.out.println("¿Que quiere hacer?");

                case 2:
                    System.out.println("Tirar");
                    pedirOpcion(new int[]{1});
                    tirada2 = tirarDados();
                    System.out.println("sacaste:" + tirada2);
                    if (tirada1 == tirada2) {
                        System.out.println("Has ganados: ");
                    } else if (tirada2 == 7) {
                        System.out.println("Has perdido");
                        if (saldo < 20) {
                            System.out.println("Su saldo no permite jugar");
                            System.exit(0);
                        }
                    } else {
                        System.out.println("Vuelves a tirar");
                    }
            }

        } while (tirada1 != tirada2 && tirada2 != 7);
    }

    private static int pedirOpcion(int[] opciones) {
        do {
            try {
                int value = sc.nextInt();
                if (estaEn(opciones, value)) {
                    return value;
                } else {
                    System.out.println("El valor introducido no es correcto");
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduce un valor numerico");
                sc.nextLine();
            }
        } while (true);
    }

    private static boolean estaEn(int[] win, int value) {
        for (int i : win) {
            if (value == i) {
                return true;
            }
        }
        return false;
    }

    private static int tirarDados() {
        Random random = new Random();
        return random.nextInt(6) + 1 + random.nextInt(6) + 1;
    }

    private static double apostar() {

        if (saldo < APUESTA_MIN) throw new RuntimeException("Saldo inferior a la apuesta minima");

        double apostar;

        do {
            try {
                apostar = sc.nextDouble();
                if (apostar >= APUESTA_MIN && apostar <= saldo) {
                    return apostar;
                } else {
                    System.out.println("Apuesta incorrecta");
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduce un valor numerico");
                sc.nextLine();
            }
        } while (true);

    }


}
