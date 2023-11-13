package orologio;

public class Orologio {

    private int ora;
    private int minuti;
    private int secondi;

    public Orologio(int ora, int minuti, int secondi) {
        this.ora = ora;
        this.minuti = minuti;
        this.secondi = secondi;
    }

    public int getOra() {
        return ora;
    }

    public int getMinuti() {
        return minuti;
    }

    public int getSecondi() {
        return secondi;
    }

    public String dammiOrario() {
        return String.format("%02d:%02d:%02d", ora, minuti, secondi);
    }

    public void aggiungiOre(int nOre) {

        ora += nOre;
        while (ora >= 24) {
            ora -= 24;

        }

    }

    public String toString() {
        String t = "";

        return t = "ATTRIBUTI: " + ora + "h" + " " + minuti + "m" + " " + secondi + "s";

    }

}
