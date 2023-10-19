package applicazione;

public class Condominio {

    private String nome;
    private String indirizzo;
    private int AppartamentiTot;
    private Appartamento[] appartamenti;

    public Condominio(String nome, String indirizzo, Appartamento[] a) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.appartamenti = new Appartamento[AppartamentiTot];
        for (int i = 0; i < AppartamentiTot; i++) {
            appartamenti[i] = new Appartamento(a[i]);
        }
    }

    public String getNome() {
        return nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public int appartamentiTotali() {
        return AppartamentiTot;
    }

    public String maxAppartamento() {

        int c = 0;

        for (int i = 1; i < AppartamentiTot; i++) {
            if (appartamenti[i].getMillesimi() > appartamenti[i].getMillesimi()) {
                c = i;
            }

        }
        return appartamenti[c].getNominativo();
    }

    public void addAppartamento(Appartamento a) {
        appartamenti[AppartamentiTot] = new Appartamento(a);
        AppartamentiTot++;

    }

    public void remAppartamento(int indice) {
        shiftSx(indice);
    }

    private void shiftSx(int indice) {
        for (int i = indice; i < AppartamentiTot - 1; i++) {
            appartamenti[i - 1] = appartamenti[i];
        }
    }

    public String stampa() {

        String t = "";

        t = "NOME " + nome + "INDIRIZZO: " + indirizzo + "APP TOTALI: " + AppartamentiTot;

        for (int i = 0; i < AppartamentiTot; i++) {
            t += appartamenti[i].stampa();

        }
        return t;

    }

}
