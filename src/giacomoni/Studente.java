package giacomoni;

import java.util.Date;

public class Studente extends Persona {

    private static final String SCUOLA = "I.T.T. Buonarroti";
    private Integer classe;
    private Boolean isRipetente;
    private Float[] voti;

    public Studente() {
        super();
    }

    public Studente(Integer classe, Boolean isRipetente, String cognome, String nome, Date dataDiNascita) {
        super(cognome, nome, dataDiNascita);
        setClasse(classe);
        setIsRipetente(isRipetente);
        this.voti = new Float[0];
    }

    public Integer getClasse() {
        return classe;
    }

    public void setClasse(Integer classe) {
        if (classe == null || classe < 1 || classe > 5) {
            throw new IllegalArgumentException("La classe non è valida.");
        }
        this.classe = classe;
    }

    public Boolean getIsRipetente() {
        return isRipetente;
    }

    public void setIsRipetente(Boolean isRipetente) {
        if (isRipetente == null) {
            throw new IllegalArgumentException("Il campo isRipetente non può essere null.");
        }
        this.isRipetente = isRipetente;
    }

    public void aggiungiVoto(Float voto) {
        if (voto == null || voto < 0 || voto > 10) {
            throw new IllegalArgumentException("Il voto non è valido.");
        }
        Float[] nuoviVoti = new Float[voti.length + 1];
        System.arraycopy(voti, 0, nuoviVoti, 0, voti.length);
        nuoviVoti[voti.length] = voto;
        voti = nuoviVoti;
    }

    public void rimuoviVoto(Integer posizione) {
        if (posizione == null || posizione < 0 || posizione >= voti.length) {
            throw new IllegalArgumentException("La posizione del voto non è valida.");
        }
        Float[] nuoviVoti = new Float[voti.length - 1];
        System.arraycopy(voti, 0, nuoviVoti, 0, posizione);
        System.arraycopy(voti, posizione + 1, nuoviVoti, posizione, voti.length - posizione - 1);
        voti = nuoviVoti;
    }

    public boolean promuovi() {
        return promuovi(1);
    }

    public boolean promuovi(Integer numeroClassi) {
        if (numeroClassi == null || numeroClassi <= 0) {
            throw new IllegalArgumentException("Il numero di classi da promuovere non è valido.");
        }
        classe += numeroClassi;
        return true;
    }

    @Override
    public String info() {
        String infoPersona = super.info();

        return "Scuola: " + SCUOLA
                + "\nClasse: " + classe
                + "\n" + infoPersona
                + "\nRipetente: " + (isRipetente ? "si" : "no");
    }

}
