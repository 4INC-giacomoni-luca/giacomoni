package esDatiMultimediali;

public class Immagine extends Filmato {

    private int luminosita;

    public Immagine(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata, volume, luminosita);
        this.luminosita = luminosita;
    }

    @Override
    public void scurisci() {
        super.scurisci();
    }

    @Override
    public void schiarisci() {
        super.schiarisci();
    }

    @Override
    public String mostra() {

        String t = titolo;
        for (int i = 0; i < luminosita; i++) {
            t += "*";
        }
        return t;
    }

    @Override
    public String toString() {
        return "Immagine{" + "luminosita=" + luminosita + '}';
    }

}
