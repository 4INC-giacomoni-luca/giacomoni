package trycatch;

import java.util.Scanner;

public class testTryCatch {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Insrisci il dividendo: ");
            int dividendo = in.nextInt();

            System.out.print("Insrisci il divisore: ");
            int divisore = in.nextInt();

            int divisione = dividendo / divisore;

            System.out.print(divisione);
        } catch (ArithmeticException e) {
            System.err.println("Impossibile dividere per zero");

        }
        try {
            int[] vett = {1, 2, 3};

            for (int i = 0; i < 3; i++) {
                System.out.println("\n" + vett[i]);

            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Oltre lunghezza vettore");

        } /*catch (Exception e) {
            System.err.println("Errore generico");
        }*/

    }

}
