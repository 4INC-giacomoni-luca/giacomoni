package classe;

import java.util.ArrayList;
import java.util.Collections;

public class StudenteTest {

    public static void main(String[] args) throws Exception {
        // Creazione di una lista di studenti
        ArrayList<Studente> listaStudenti = new ArrayList<>();
        listaStudenti.add(new Studente("Rossi", "Mario"));
        listaStudenti.add(new Studente("Verdi", "Anna"));
        listaStudenti.add(new Studente("Bianchi", "Anna"));

        //stampa della lista non ordinata
        for (Studente studente : listaStudenti) {
            System.out.println(studente);
        }
        System.out.println("\n");
        // Ordinamento della lista
        Collections.sort(listaStudenti);

        // Stampa della lista ordinata
        for (Studente studente : listaStudenti) {
            System.out.println(studente);
        }

    }
}
