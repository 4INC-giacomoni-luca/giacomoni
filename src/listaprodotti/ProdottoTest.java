package listaprodotti;

public class ProdottoTest {

    public static void main(String[] args) {

        Prodotto p = new Prodotto("coca-coca", "05143256246", 6.0, 2.0, 4.0, 5.0);
        Prodotto p1 = new Prodotto("fanta", "05130646246", 4.0, 5.0, 2.0, 9.0);
        Prodotto p2 = new Prodotto("pepsi", "05453056246", 2.0, 1.0, 8.0, 2.0);

        Data d = new Data(10, 03, 2023);
        Data d1 = new Data(10, 03, 2023);
        Data d2 = new Data(10, 03, 2023);

        Alimentare a = new Alimentare(d, "coca-coca", "05143256246", 6.0, 2.0, 4.0, 5.0);
        Alimentare a1 = new Alimentare(d1, "fanta", "05130646246", 4.0, 5.0, 2.0, 9.0);
        Alimentare a2 = new Alimentare(d2, "pepsi", "05453056246", 2.0, 1.0, 8.0, 2.0);

        System.out.println(a.toString());
        System.out.println(a1.toString());
        System.out.println(a2.toString());

        NonAlimentare n = new NonAlimentare(true, "coca-coca", "05143256246", 6.0, 2.0, 4.0, 5.0);
        NonAlimentare n1 = new NonAlimentare(false, "fanta", "05130646246", 4.0, 5.0, 2.0, 9.0);
        NonAlimentare n2 = new NonAlimentare(true, "pepsi", "05453056246", 2.0, 1.0, 8.0, 2.0);

        System.out.println(n.toString());
        System.out.println(n1.toString());
        System.out.println(n2.toString());

        /*Prodotto[] f = new Prodotto[10];
        
        f[0] = new Alimentare(d, "patate", "0513469245", 2.5, 3.0, 5.0, 4.1);
        f[1] = new NonAlimentare(true, "sprite", "0513469245", 5.0, 2.0, 6.0, 1.0);*/
    }

}
