package esDatiMultimediali;

public abstract class DatoMultimediale {

    protected String titolo;

    public DatoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    public abstract String play();
}
