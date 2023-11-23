package listaprodotti;

public class Negozio {

    private Prodotto[] prodotti;
    private int dimL;

    public Negozio(int dimF) {

        prodotti = new Prodotto[dimF];

    }

    public void addProdotto(Prodotto d) {
        prodotti[dimL] = d;
        dimL++;

    }

    @Override
    public String toString() {

        String t = "";

        for (int i = 0; i < dimL; i++) {
            t += prodotti[i].toString() + "\ndiml: " + dimL;

        }

        return t;

    }

}
