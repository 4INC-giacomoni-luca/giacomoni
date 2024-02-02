package esVerificaTeo;

import listaprodotti.Data;

public class Impianto {

    private int dimensione;
    private double potenza;
    private boolean acquaCalda;
    private String modello;
    private String marca;
    private Data dataControlloFumi;
    private Data dataControlloAnnuale;

    public Impianto(int dimensione, double potenza, boolean acquaCalda, String modello, String marca, Data dataControlloFumi, Data dataControlloAnnuale) {
        this.dimensione = dimensione;
        this.potenza = potenza;
        this.acquaCalda = acquaCalda;
        this.modello = modello;
        this.marca = marca;
        this.dataControlloFumi = dataControlloFumi;
        this.dataControlloAnnuale = dataControlloAnnuale;
    }

    @Override
    public String toString() {
        return "Impianto{" + "dimensione=" + dimensione + ", potenza=" + potenza + ", acquaCalda=" + acquaCalda + ", modello=" + modello + ", marca=" + marca + ", dataControlloFumi=" + dataControlloFumi + ", dataControlloAnnuale=" + dataControlloAnnuale + '}';
    }

}
