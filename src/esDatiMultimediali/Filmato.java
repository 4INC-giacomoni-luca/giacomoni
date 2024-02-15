package esDatiMultimediali;

public class Filmato extends RegistrazioneAudio implements Riproducibile {

    private int luminosita;

    public Filmato(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata, volume);
        this.luminosita = luminosita;
    }

    public void schiarisci() {
        luminosita++;
    }

    public void scurisci() {
        if (luminosita > 0) {
            luminosita--;
        }
    }

    @Override
    public void alza() {
        super.alza(); 
    }

    @Override
    public void abbassa() {
        super.abbassa();
    }
    
    public String play() {
        String t = "";
        for (int i = 0; i < super.getDurata(); i++) {
            t += titolo;
            for (int j = 0; j < super.getVolume(); j++) {
                t += "!";
            }
            for (int k = 0; k < luminosita; k++) {
                t += "*";
            }
        }
        return t;
    }

    public String mostra() {
        String t = "";
        return t = (titolo + "Durata: " + super.getDurata() + " minuti");
    }

    @Override
    public String toString() {
        return "Filmato{" + "luminosita=" + luminosita + '}';
    }

}
