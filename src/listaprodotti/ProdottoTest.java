package listaprodotti;

import java.util.Calendar;
import java.util.Date;

public class ProdottoTest {

    public static void main(String[] args) {

        Prodotto p = new Prodotto("coca-coca", "0513056246", 5.0, 3.0, 2.0, 1.0);
        Negozio n = new Negozio(10);

        Calendar cal = Calendar.getInstance();
        cal.set(2023, 05, 22);
        Date d = cal.getTime();

        Prodotto[] f = new Prodotto[10];
        f[0] = new Alimentare(d, "patate", "0513469245", 2.5, 3.0, 5.0, 4.1);
        f[1] = new NonAlimentare(true, "sprite", "0513469245", 5.0, 2.0, 6.0, 1.0);

        System.out.println(f[0].toString());
        System.out.println(f[1].toString());

        Prodotto g = new Prodotto("te", "05685305646", 2.0, 4.0, 1.0, 8.0);
        n.addProdotto(g);
        System.out.println(n.toString());

    }

}
