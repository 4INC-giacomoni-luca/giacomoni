package orologio;

public class OrologioTest {

    public static void main(String[] args) {

        Orologio o = new Orologio(13, 5, 8);
        OrologioDigitale d = new OrologioDigitale(01, 5, 8);
        OrologioCucu c = new OrologioCucu(12, 0, 0, true);

        Orologio[] arrayOrologi = {new Orologio(13, 5, 8), new OrologioDigitale(01, 5, 8), new OrologioCucu(12, 0, 0, true)};

        for (Orologio orologio : arrayOrologi) {
            System.out.println("Orologio: " + orologio.dammiOrario());

        }

        for (Orologio orologio : arrayOrologi) {
            orologio.aggiungiOre(2);
        }

        for (Orologio orologio : arrayOrologi) {
            System.out.println("Orologio dopo: " + orologio.dammiOrario());
        }
        /*
        System.out.println("\n");

        System.out.println("Orologio: " + o.dammiOrario());
        System.out.println("Orologio Digitale: " + d.dammiOrario(12));
        System.out.println("Orologio Cucu: " + c.dammiOrario());

        o.aggiungiOre(5);
        d.aggiungiOre(24);
        c.aggiungiOre(8);

        System.out.println("\nOrologio dopo: " + o.dammiOrario());
        System.out.println("Orologio Digitale dopo: " + d.dammiOrario(12));
        System.out.println("Orologio Cucu dopo: " + c.dammiOrario());*/
    }
}
