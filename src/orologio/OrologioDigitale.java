package orologio;

public class OrologioDigitale extends Orologio {

    public OrologioDigitale(int ora, int minuti, int secondi) {
        super(ora, minuti, secondi);
    }

    public String dammiOrario(int tipo) {
        int var = getOra();
        String testo = "";
        String t = "AM";

        if (tipo == 12) {
            if (var > 12) {
                var -= 12;
                t = "PM";
            }
            testo += String.format("%02d:%02d:%02d %s", var % 12, getMinuti(), getSecondi(), t);
        } else {
            testo += super.dammiOrario();
        }

        return testo;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
