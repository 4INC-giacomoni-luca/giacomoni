package simverifica;

public class Test {

    public static void main(String[] args) throws Exception {

        Persona persona1 = new Persona("Rossi", "Mario", "RSSMRA80M01H501Z", "20/05/2025");
        Persona persona2 = new Persona("Bianchi", "Luca", "BNCLCU90M02H456Y", "15/05/2022");

        try {
            System.out.println(persona1.toString());
            System.out.println(persona2.toString());

            System.out.println("Numero di istanze create: " + Persona.getNumeroIstanze());

            System.out.println("Verifica omonimia: " + persona1.verificaOmonimia(persona2));
            System.out.println("Età di " + persona1.getNome() + ": " + persona1.calcolaEta() + " anno/i");
            System.out.println("Età di " + persona2.getNome() + ": " + persona2.calcolaEta() + " anno/i");

        } catch (Exception e) {
            System.err.println(e.getMessage());

        }

    }
}
