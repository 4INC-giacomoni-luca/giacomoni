package supermercato;

public class Azienda {

    private String nome;
    private String sedeLegale;
    private Supermercato[] supermercati;

    public Azienda(String nome, String sedeLegale, Supermercato[] supermercati) {
        this.nome = nome;
        this.sedeLegale = sedeLegale;
        this.supermercati = copia(supermercati);
    }

    private Supermercato[] copia(Supermercato[] copiaS) {
        Supermercato[] temp = new Supermercato[copiaS.length];
        for (int i = 0; i < copiaS.length; i++) {
            temp[i] = copiaS[i];

        }
        return temp;

    }
    
}