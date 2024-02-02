package esVerificaTeo;

public class PluriFamigliare {

    private int nAppartamenti;
    private String nome;
    private Appartamento appartamento;
    private boolean normativaAntincendio;

    public PluriFamigliare(int nAppartamenti, String nome, Appartamento appartamento, boolean normativaAntincendio) {
        this.nAppartamenti = nAppartamenti;
        this.nome = nome;
        this.appartamento = appartamento;
        this.normativaAntincendio = normativaAntincendio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setnAppartamenti(int nAppartamenti) {
        this.nAppartamenti = nAppartamenti;
    }

    public int getnAppartamenti() {
        return nAppartamenti;
    }

    public void setNormativaAntincendio(boolean normativaAntincendio) {
        this.normativaAntincendio = normativaAntincendio;
    }

    public boolean isNormativaAntincendio() {
        return normativaAntincendio;
    }

    public void setAppartamento(Appartamento appartamento) {
        this.appartamento = appartamento;
    }

    public Appartamento getAppartamento() {
        return appartamento;
    }

    @Override
    public String toString() {
        return "PluriFamigliare{" + "nAppartamenti=" + nAppartamenti + ", nome=" + nome + ", appartamento=" + appartamento + ", normativaAntincendio=" + normativaAntincendio + '}';
    }

}
