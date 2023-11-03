package es;

public class Classe {

    private Studente capoClasse;
    private Studente[] studenti;

    public Classe(Studente capoClasse, Studente[] studenti) throws Exception {
        this.studenti = new Studente[studenti.length];
        for (int i = 0; i < studenti.length; i++) {
            this.studenti[i] = new Studente(studenti[i]);

        }
        setCapoClasse(capoClasse);
    }

    public Studente getCapoClasse() {
        return capoClasse;
    }

    public Studente[] getStudenti() {
        return studenti;
    }

    public void setCapoClasse(Studente capoClasse) {
        this.capoClasse = capoClasse;
    }

    public void setStudenti(Studente[] studenti) {
        this.studenti = studenti;
    }

    public void invertiAttributi() throws Exception {

        String nome = studenti[0].getNome();

        try {

            studenti[0].setNome(studenti[0].getCognome());
            studenti[0].setCognome(nome);

        } catch (Exception e) {
            throw new Exception("Non è stato effettuato lo scambio");
        }

    }

    public String toString() {

        String t = "";

        t = "\nIL CAPOCLASSE è: " + capoClasse + "\n";

        for (int i = 0; i < studenti.length; i++) {
            t += studenti[i].toString();

        }
        return t;
    }

}
