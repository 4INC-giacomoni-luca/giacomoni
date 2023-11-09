package orologio;

public class OrologioTest {

    public static void main(String[] args) {

        Orologio o = new Orologio(13, 5, 8);
        OrologioDigitale d = new OrologioDigitale(13, 5, 8);
        OrologioCucu c = new OrologioCucu(12, 0, 0);

        System.out.println(o.dammiOrario());
        System.out.println(d.dammiOrario(12));
        System.out.println(c.carillon());
        System.out.println(o.toString());

    }

}
