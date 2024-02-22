package esOperatrice;

public class Main {

    public static void main(String[] args) {
        Operatrice<Integer> operatrice1 = new Operatrice<>();
        operatrice1.setVal1(10);
        operatrice1.setVal2(5);

        System.out.println("Somma: " + operatrice1.somma());
        System.out.println("Sottrazione: " + operatrice1.sottrazione());
        System.out.println("Moltiplicazione: " + operatrice1.moltiplicazione());
        System.out.println("Divisione: " + operatrice1.divisione());
        System.out.println("Tipo val1: " + operatrice1.tipoVal1());
        System.out.println("Tipo val2: " + operatrice1.tipoVal2());
        System.out.println(operatrice1);

        // Test con val2 null
        Operatrice<Double> operatrice2 = new Operatrice<>();
        operatrice2.setVal1(10.5);
    }
}
