package esDatiMultimediali;

public class RegistrazioneAudio extends DatoMultimediale implements Riproducibile {

    private int durata;
    private int volume;

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    public int getDurata() {
        return durata;
    }

    public int getVolume() {
        return volume;
    }

    public void alza() {
        volume++;
    }

    public void abbassa() {
        if (volume > 0) {
            volume--;
        }
    }

    @Override
    public String play() {
        String t = "";
        for (int i = 0; i < durata; i++) {
            t += titolo;
            for (int j = 0; j < volume; j++) {
                t += "!";
            }
        }
        return t;
    }

    @Override
    public String toString() {
        return "RegistrazioneAudio{" + "durata=" + durata + ", volume=" + volume + '}';
    }

}
