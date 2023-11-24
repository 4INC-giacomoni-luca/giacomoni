package listaprodotti;

public class Prodotto {

    private String nome;
    private String codiceBarre;
    private double prezzo;
    private double iva;
    private double peso;
    private double tara;

    public Prodotto(String nome, String codiceBarre, double prezzo, double iva, double peso, double tara) {
        this.nome = nome;
        this.codiceBarre = codiceBarre;
        this.prezzo = prezzo;
        this.iva = iva;
        this.peso = peso;
        this.tara = tara;
    }

    public String getCodiceBarre() {
        return codiceBarre;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public double getIva() {
        return iva;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public double getTara() {
        return tara;
    }
    

    public String toString() {

        String t = "\nnome: " + nome + "\ncodiceBarre: " + codiceBarre + "\nprezzo: "
                + prezzo + "\niva: " + iva + "\npeso: " + peso + "\ntara: " + tara;

        return t;
    }

}
