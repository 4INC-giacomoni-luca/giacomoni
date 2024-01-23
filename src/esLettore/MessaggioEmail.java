package esLettore;

public class MessaggioEmail implements Messaggio {

    private String testo;
    private String mittente;
    private String oggetto;

    public MessaggioEmail(String testo, String mittente, String oggetto) {
        this.testo = testo;
        this.mittente = mittente;
        this.oggetto = oggetto;
    }

    @Override
    public String leggiTesto() {
        return "\nMittente: " + mittente + "\nOggetto: " + oggetto + "\nTesto Email: " + testo;
    }
}
