package classe;

public class StudenteTest {

    public static void main(String[] args) {
        try {
            Studente s = new Studente("De Lucia", "Ciccio Bello");
            s.setNome("Prova");
            System.out.println(s.toString());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}
