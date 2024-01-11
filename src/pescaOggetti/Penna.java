package pescaOggetti;

// Sottoclasse Penna
class Penna extends Oggetto {

    private boolean stilografica;

    public Penna(String nome, int punteggio, boolean stilografica) {
        super(nome, punteggio);
        this.stilografica = stilografica;
    }

    public boolean isStilografica() {
        return stilografica;
    }
}
