package es;

public class Classe {

    private Studente capoClasse;
    private Studente[] studenti;

    public Classe(Studente capoClasse, Studente[] studenti) {
        this.capoClasse = capoClasse;
        this.studenti = studenti;
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

    public void invertiAttributi() {

        Studente var = capoClasse;
        capoClasse = studenti[0];
        studenti[0] = var;
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
