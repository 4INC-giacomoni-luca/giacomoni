package polimorfismo;

public class Figlio extends Padre {

    private String ff;

    public Figlio(int pp) {
        super(pp);
        this.ff = " figlio ";
    }

    public String getFf() {
        return ff;
    }

    public void incrAttF() {
        ff += " ho modificato il metodo del padre ";

    }

    @Override
    public String toString() {
        return super.toString() + " Stringa: " + ff;
    }

}
