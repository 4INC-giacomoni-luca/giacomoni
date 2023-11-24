package listaprodotti;

import java.time.LocalDate;

public class Alimentare extends Prodotto {

    private Data dataScadenza;

    public Alimentare(Data dataScadenza, String nome, String codiceBarre, double prezzo, double iva, double peso, double tara) {
        super(nome, codiceBarre, prezzo, iva, peso, tara);
        this.dataScadenza = dataScadenza;
    }

    public Data getDataScadenza() {
        return dataScadenza;
    }

    public double calcolaSconto() throws Exception {

        LocalDate data = LocalDate.now();
        Data d = new Data(data.getDayOfMonth(), data.getMonthValue(), data.getYear());
        int scadenza = dataScadenza.diffData(d);
        int sconto = 0;
        if (scadenza > 0) {
            if (scadenza < 10) {
                sconto = 30;
                if (scadenza < 2) {
                    sconto = 50;
                }
            }

        } else {
            throw new Exception("Il prodotto è scaduto!");
        }

        return super.getPrezzo() - getPrezzo()* sconto / 100;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLa data di scadenza e': " + dataScadenza.getGiorno() + "/" + dataScadenza.getMese() + "/" + dataScadenza.getAnno(); //To change body of generated methods, choose Tools | Templates.
    }

}
