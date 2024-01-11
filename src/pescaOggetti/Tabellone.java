package pescaOggetti;

// Classe Tabellone
class Tabellone {

    private int righe;
    private int colonne;
    private Oggetto[][] tabellone;

    public Tabellone(int righe, int colonne) {
        this.righe = righe;
        this.colonne = colonne;
        this.tabellone = new Oggetto[righe][colonne];
    }

    public int getRighe() {
        return righe;
    }

    public int getColonne() {
        return colonne;
    }

    public void inserisciOggetto(int riga, int colonna, Oggetto oggetto) {
        tabellone[riga][colonna] = oggetto;
    }

    public boolean isCellaLibera(int riga, int colonna) {
        return tabellone[riga][colonna] == null;
    }

}
