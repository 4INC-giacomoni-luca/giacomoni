package pescaOggetti;

// Classe Partita
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Partita {

    private Tabellone tabellone;
    private List<Giocatore> giocatori;
    private List<Oggetto> oggettiPescati;

    public Partita(Tabellone tabellone, List<Giocatore> giocatori) {
        this.tabellone = tabellone;
        this.giocatori = giocatori;

        this.oggettiPescati = new ArrayList<>();
    }

    public void calcolaPunteggio() {
        for (Giocatore giocatore : giocatori) {
            System.out.println(giocatore.getNome() + ": " + giocatore.getPunteggio() + " punti");
        }
    }

    public void stampaRisultati() {
        System.out.println("Oggetti pescati in ordine:");
        for (Oggetto oggetto : oggettiPescati) {
            System.out.println(oggetto.getNome());
        }
    }
}
