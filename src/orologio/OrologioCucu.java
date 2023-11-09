package orologio;

public class OrologioCucu extends Orologio {

    public OrologioCucu(int ora, int minuti, int secondi) {
        super(ora, minuti, secondi);
    }

    public boolean carillon() {
        boolean var = false;

        if (getOra() == 12 && getMinuti() == 0 && getSecondi() == 0) {
            var = true;
        }

        return var;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
