package es;

public class Studente {

    private String cognome;
    private String nome;

    public Studente(String cognome, String nome) {
        this.cognome = cognome;
        this.nome = nome;
    }

    public Studente(Studente studente) {

        this.cognome = studente.cognome;
        this.nome = studente.nome;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {

        String t = "";

        return t = "\nNOME: " + nome + "\nCOGNOME: " + cognome;
    }

}
