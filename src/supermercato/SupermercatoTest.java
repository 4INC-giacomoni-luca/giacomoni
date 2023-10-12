package supermercato;

public class SupermercatoTest {

    public static void main(String[] args) {
        String nome = "Lidl";
        String indirizzo = "Via Nuova 11";
        double[] prezzo = {0.40, 0.89, 3.20};
        int[] iva = {4, 5, 10};
        double[] peso = {500, 100, 150};
        double[] tara = {0.02, 0.01, 0.05};
        String[] desc = {"Acqua", "Patatine", "Banana"};
        String[] codice = {"801796057020", "8003130127922", "8004120902758"};

        Supermercato s = new Supermercato(nome, indirizzo, prezzo, iva, peso, tara, desc, codice);
        System.out.println(s.prezzoAlto());
        System.out.println(s.valoreMerce());
        System.out.println(s.pesoMinore());
        System.out.println(s.merciSopraMedia());
        //System.out.println(s.stampa());
    }

}
