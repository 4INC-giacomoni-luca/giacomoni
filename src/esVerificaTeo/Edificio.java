package esVerificaTeo;

import listaprodotti.Data;

public abstract class Edificio {

    private Impianto caldaia;
    private int nTermosifoni;
    private String nome;

    public Edificio(Impianto caldaia, int nTermosifoni, String nome) {
        this.caldaia = caldaia;
        this.nTermosifoni = nTermosifoni;
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnTermosifoni() {
        return nTermosifoni;
    }

    public void setnTermosifoni(int nTermosifoni) {
        this.nTermosifoni = nTermosifoni;
    }

    @Override
    public String toString() {
        return "Edificio{" + "caldaia=" + caldaia + ", nTermosifoni=" + nTermosifoni + ", nome=" + nome + '}';
    }

}
