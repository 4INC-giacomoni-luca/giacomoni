package esDatiMultimediali;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DatoMultimediale[] datiMultimediali = new DatoMultimediale[5];

        for (int i = 0; i < datiMultimediali.length; i++) {
            System.out.println("Inserisci il tipo di dato multimediale (1 - Registrazione Audio, 2 - Filmato, 3 - Immagine):");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Inserisci il titolo:");
            String titolo = scanner.nextLine();

            switch (tipo) {
                case 1: {
                    System.out.println("Inserisci la durata:");
                    int durata = scanner.nextInt();
                    System.out.println("Inserisci il volume:");
                    int volume = scanner.nextInt();
                    datiMultimediali[i] = new RegistrazioneAudio(titolo, durata, volume);
                    break;
                }
                case 2: {
                    System.out.println("Inserisci la durata:");
                    int durata = scanner.nextInt();
                    System.out.println("Inserisci il volume:");
                    int volume = scanner.nextInt();
                    System.out.println("Inserisci la luminosità:");
                    int luminosita = scanner.nextInt();
                    datiMultimediali[i] = new Filmato(titolo, durata, volume, luminosita);
                    break;
                }
                case 3: {
                    System.out.println("Inserisci la luminosità:");
                    int luminosita = scanner.nextInt();
                    datiMultimediali[i] = new Immagine(titolo, tipo, tipo, luminosita);
                    break;
                }
                default:
                    break;
            }
        }
    }
}
