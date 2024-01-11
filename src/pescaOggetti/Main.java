package pescaOggetti;

import java.util.ArrayList;
import java.util.List;

// Classe principale Main
public class Main {

    public static void main(String[] args) {
        // Esempio di utilizzo
        Tabellone tabellone = new Tabellone(3, 3);
        Giocatore giocatore1 = new Giocatore("Giocatore 1");
        Giocatore giocatore2 = new Giocatore("Giocatore 2");

        List<Giocatore> giocatori = new ArrayList<>();
        giocatori.add(giocatore1);
        giocatori.add(giocatore2);

        Partita par = new Partita(tabellone, giocatori);

        // Inserimento di oggetti nel tabellone (da implementare con oggetti specifici)
        tabellone.inserisciOggetto(0, 0, new Forbici("Forbice 1", 5, "Punta A"));
        tabellone.inserisciOggetto(1, 1, new Gomma("Gomma 1", 2, "Dura"));
        tabellone.inserisciOggetto(2, 2, new Matita("Matita 1", 1));
        tabellone.inserisciOggetto(2, 0, new Penna("Penna 1", 4, false));

    }
}
