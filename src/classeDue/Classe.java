package classeDue;

public class Classe {

    private Studente capoClasse;
    private Studente[] studenti;

    public Classe(Studente capoClasse, Studente[] studenti) {
        this.studenti = studenti.clone();
        setCapoClasse(capoClasse);
    }

    public boolean controllaOmonimia(Studente s) {

        boolean t = false;

        for (Studente st : studenti) {
            if (st.equals(s)) {
                t = true;
            }
        }
        return t;
    }

    public void setCapoClasse(Studente capoClasse) {
        this.capoClasse = capoClasse;
    }

    public void inveriAtt() throws Exception {
        String cognome = capoClasse.getNome();
        String nome = capoClasse.getCognome();
        capoClasse.setCognome(cognome);
        capoClasse.setNome(nome);

    }

    @Override
    public String toString() {
        String r = "nome capo Classe: " + capoClasse + "\n";
        for (int i = 0; i < studenti.length; i++) {
            r += "studenti[" + i + "]:" + studenti[i].toString() + "\n";
        }
        return r;
    }
}
