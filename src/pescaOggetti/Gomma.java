package pescaOggetti;

// Sottoclasse Gomma
public class Gomma extends Oggetto {
    private String tipoDurezza;

    public Gomma(String nome, int punteggio, String tipoDurezza) {
        super(nome, punteggio);
        this.tipoDurezza = tipoDurezza;
    }

    public String getTipoDurezza() {
        return tipoDurezza;
    }
}