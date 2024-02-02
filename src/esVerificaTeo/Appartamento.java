package esVerificaTeo;

public class Appartamento {

    private int nStanze;
    private int nPersone;
    private double contabilitàEnergetica;

    public Appartamento(int nStanze, int nPersone, double contabilitàEnergetica) {
        this.nStanze = nStanze;
        this.nPersone = nPersone;
        this.contabilitàEnergetica = contabilitàEnergetica;
    }

    public void setnStanze(int nStanze) {
        this.nStanze = nStanze;
    }

    public int getnStanze() {
        return nStanze;
    }

    public void setnPersone(int nPersone) {
        this.nPersone = nPersone;
    }

    public int getnPersone() {
        return nPersone;
    }

    public void setContabilitàEnergetica(double contabilitàEnergetica) {
        this.contabilitàEnergetica = contabilitàEnergetica;
    }

    public double getContabilitàEnergetica() {
        return contabilitàEnergetica;
    }

    @Override
    public String toString() {
        return "Appartamento{" + "nStanze=" + nStanze + ", nPersone=" + nPersone + ", contabilit\u00e0Energetica=" + contabilitàEnergetica + '}';
    }
    
    

}
