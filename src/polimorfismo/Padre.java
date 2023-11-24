package polimorfismo;

public class Padre {

    private int pp;

    public Padre(int pp) {
        this.pp = pp;
    }

    public int getPp() {
        return pp;
    }

    public void incAttP() {

        pp++;

    }

    @Override
    public String toString() {
        return "Padre{" + "pp=" + pp + '}';
    }

}
