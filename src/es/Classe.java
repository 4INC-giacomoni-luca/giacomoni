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
    
    public void invertiAtt(){
       //questo metodo inverte gli attributi 
        
    }
    
   
    public String toString() {

        String t = "";

        for (int i = 0; i < studenti.length; i++) {
            t += studenti[i].toString();

        }
        return t;
    }

}
