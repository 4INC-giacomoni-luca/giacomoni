package pescaOggetti;

// Classe Giocatore
public class Giocatore {

    private String nome;
    private int punteggio;

    public Giocatore(String nome) {
        this.nome = nome;
        this.punteggio = 0;
    }

    public void incrementaPunteggio(int incremento) {
        punteggio += incremento;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Giocatore{" + "nome=" + nome + ", punteggio=" + punteggio + '}';
    }
    
    
}
