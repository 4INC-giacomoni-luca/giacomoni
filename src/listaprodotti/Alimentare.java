package listaprodotti;

import java.util.Date;

public class Alimentare extends Prodotto {

    private Date dataScadenza;

    public Alimentare(Date dataScadenza, String nome, String codiceBarre, double prezzo, double iva, double peso, double tara) {
        super(nome, codiceBarre, prezzo, iva, peso, tara);
        this.dataScadenza = dataScadenza;
    }

    public Date getDataScadenza() {
        return dataScadenza;
    }

    public double calcolaSconto() {
        double sconto = 0.0;

        return sconto;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLa data di scadenza e': " + dataScadenza; //To change body of generated methods, choose Tools | Templates.
    }

}
