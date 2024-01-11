package pescaOggetti;

// Classe base per gli oggetti
public class Oggetto {

    private String nome;
    private int punteggio;

    public Oggetto(String nome, int punteggio) {
        this.nome = nome;
        this.punteggio = punteggio;
    }

    public String getNome() {
        return nome;
    }

    public int getPunteggio() {
        return punteggio;
    }

    @Override
    public String toString() {
        return "Oggetto{" + "nome=" + nome + ", punteggio=" + punteggio + '}';
    }

}
