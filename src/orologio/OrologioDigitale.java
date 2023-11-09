package orologio;

public class OrologioDigitale extends Orologio {

    public OrologioDigitale(int ora, int minuti, int secondi) {
        super(ora, minuti, secondi);
    }

    public String dammiOrario(int tipo) {
        int var = getOra();
        String testo = "";
        String t = "";

        if (tipo == 12 || tipo == 24) {

            if (tipo == 12) {
                if (getOra() > 12) {
                    var = var - 12;
                    t = "PM";
                } else {
                    t = "AM";
                }
                testo += String.format("%02d:%02d:%02d" + t, var, getMinuti(), getSecondi(), t);
            } else {
                testo = super.dammiOrario();
            }

        }

        return testo;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
