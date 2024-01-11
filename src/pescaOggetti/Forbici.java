package pescaOggetti;
// Sottoclasse Forbice

public class Forbici extends Oggetto {

    private String tipoPunta;

    public Forbici(String nome, int punteggio, String tipoPunta) {
        super(nome, punteggio);
        this.tipoPunta = tipoPunta;
    }

    public String getTipoPunta() {
        return tipoPunta;
    }
}
