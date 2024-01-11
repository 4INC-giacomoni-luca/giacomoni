package classeDue;

public class ClasseMain {

    public static void main(String[] args) {
        Studente test = null;
        Studente test1 = null;
        Studente test2 = null;

        try {
            test = new Studente("Mario", "Rossi");
            test1 = new Studente("Luca", "Giacomoni");
            test2 = new Studente("Lara", "Nani");

            Studente[] st = {test, test1, test2};
            Classe cl = new Classe(test1, st);
            System.out.println(cl);
            System.out.println(cl.controllaOmonimia(test));
            cl.inveriAtt();
            System.out.println(cl);

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
