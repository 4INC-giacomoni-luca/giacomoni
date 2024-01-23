package esLettore;

public class Ebook implements Messaggio {

    private String titolo;
    private int numeroPagine;
    private String[] pagine;

    public Ebook(String titolo, int numeroPagine, String[] pagine) {
        this.titolo = titolo;
        this.numeroPagine = numeroPagine;
        this.pagine = pagine;
    }

    @Override
    public String leggiTesto() {
        String t = "\nTitolo: " + titolo + "\nNumero totale di pagine: " + numeroPagine;
        for (int i = 0; i < pagine.length; i++) {
            t += "\nPagina[" + i + "]" + ":" + pagine[i];
        }
        return t;
    }

}
