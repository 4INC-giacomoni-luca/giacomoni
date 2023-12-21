package giacomoni;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        try {
            // Creazione di un'istanza di Persona
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date dataDiNascitaPersona = dateFormat.parse("12/12/1990");
            Persona persona = new Persona("Rossi", "Marco", dataDiNascitaPersona);

            // Stampa delle informazioni della persona
            System.out.println("Informazioni Persona:");
            System.out.println(persona.info());

            // Creazione di un'istanza di Studente
            Date dataDiNascitaStudente = dateFormat.parse("12/12/2000");
            Studente studente = new Studente(3, false, "Rossi", "Marco", dataDiNascitaStudente);

            // Aggiunta di voti allo studente
            studente.aggiungiVoto(8.0f);
            studente.aggiungiVoto(7.5f);
            studente.aggiungiVoto(9.0f);

            // Stampa delle informazioni dello studente
            System.out.println("\nInformazioni Studente:");
            System.out.println(studente.info());

            // Rimozione di un voto
            studente.rimuoviVoto(1);

            // Stampa delle informazioni aggiornate dello studente
            System.out.println("\nInformazioni Studente dopo rimozione voto:");
            System.out.println(studente.info());

            // Promozione dello studente
            if (studente.promuovi()) {
                System.out.println("\nStudente promosso alla classe " + studente.getClasse());
            } else {
                System.out.println("\nImpossibile promuovere lo studente oltre la quinta classe.");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
