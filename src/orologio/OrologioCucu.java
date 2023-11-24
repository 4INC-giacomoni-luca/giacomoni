package orologio;

public class OrologioCucu extends Orologio {

    private boolean carillon;

    public OrologioCucu(int ora, int minuti, int secondi, boolean carillon) {
        super(ora, minuti, secondi);
        this.carillon = carillon;
    }

    public void setCarillon(boolean carillon) {
        this.carillon = carillon;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }

}
