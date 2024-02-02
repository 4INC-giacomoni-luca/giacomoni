package esVerificaTeo;

import listaprodotti.Data;

public class MonoFamigliare extends Edificio {

    private int nStanze;
    private int nResidenti;

    public MonoFamigliare(int nStanze, int nResidenti, Impianto caldaia, int nTermosifoni, String nome) {
        super(caldaia, nTermosifoni, nome);
        this.nStanze = nStanze;
        this.nResidenti = nResidenti;
    }

    public void setnStanze(int nStanze) {
        this.nStanze = nStanze;
    }

    public int getnStanze() {
        return nStanze;
    }

    public void setnResidenti(int nResidenti) {
        this.nResidenti = nResidenti;
    }

    public int getnResidenti() {
        return nResidenti;
    }

    @Override
    public String toString() {
        return "MonoFamigliare{" + "nStanze=" + nStanze + ", nResidenti=" + nResidenti + '}';
    }

}
