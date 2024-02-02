package esVerificaTeo;

public class Pubblico extends Edificio {

    private int nGriglie;
    private int nStanze;
    private boolean normativaAnticendio;

    public Pubblico(int nGriglie, int nStanze, boolean normativaAnticendio, Impianto caldaia, int nTermosifoni, String nome) {
        super(caldaia, nTermosifoni, nome);
        this.nGriglie = nGriglie;
        this.nStanze = nStanze;
        this.normativaAnticendio = normativaAnticendio;
    }

    public int getnGriglie() {
        return nGriglie;
    }

    public void setnGriglie(int nGriglie) {
        this.nGriglie = nGriglie;
    }

    public void setNormativaAnticendio(boolean normativaAnticendio) {
        this.normativaAnticendio = normativaAnticendio;
    }

    public void setnStanze(int nStanze) {
        this.nStanze = nStanze;
    }

    public int getnStanze() {
        return nStanze;
    }

    @Override
    public String toString() {
        return "Pubblico{" + "nGriglie=" + nGriglie + ", nStanze=" + nStanze + ", normativaAnticendio=" + normativaAnticendio + '}';
    }

}
