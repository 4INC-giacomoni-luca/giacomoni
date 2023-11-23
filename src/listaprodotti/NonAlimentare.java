package listaprodotti;

public class NonAlimentare extends Prodotto {

    private boolean plastica;

    public NonAlimentare(boolean plastica, String nome, String codiceBarre, double prezzo, double iva, double peso, double tara) {
        super(nome, codiceBarre, prezzo, iva, peso, tara);
        this.plastica = plastica;
    }

    public boolean isPlastica() {
        return plastica;
    }

    @Override
    public String toString() {
        return super.toString() + "\nplastica: " + plastica; //To change body of generated methods, choose Tools | Templates.
    }

}
