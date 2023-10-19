package applicazione;

public class Amministrazione {

    private String nomeAmministrazione;
    private int totCondominio;
    private Condominio[] condomini;

    public Amministrazione(String nomeAmministrazione, int totCondominio) {
        this.nomeAmministrazione = nomeAmministrazione;
        this.totCondominio = totCondominio;
        this.condomini = new Condominio[3];
    }

    public String nMaxApp() {

        int c = 0;

        for (int i = 1; i < totCondominio; i++) {
            if (condomini[i].appartamentiTotali() > condomini[c].appartamentiTotali()) {
                c = i;
            }

        }
        return condomini[c].stampa();

    }

    public String nomeMaxCond() {

        String val = "";

        for (int i = 1; i < totCondominio; i++) {

            val += condomini[i].maxAppartamento();

        }

        return val;
    }

}
