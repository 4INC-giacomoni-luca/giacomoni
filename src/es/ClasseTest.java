package es;

public class ClasseTest {

    public static void main(String[] args) {

        Studente studente1 = new Studente("Rossi", "Mario");
        Studente studente2 = new Studente("Bianchi", "Anna");
        Studente studente3 = new Studente("Verdi", "Luigi");

        Studente[] studenti = {studente1, studente2, studente3};

        Classe c = new Classe(studente2, studenti);

        System.out.println("Informazioni iniziali:");
        System.out.println(c.toString());

        c.invertiAttributi();

        System.out.println("\nInformazioni finali:");
        System.out.println(c.toString());
    }
}
