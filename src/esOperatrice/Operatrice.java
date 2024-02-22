package esOperatrice;

public class Operatrice<T extends Number> {

    private T val1;
    private T val2;

    public Operatrice() {
        this.val1 = null;
        this.val2 = null;
    }

    public Operatrice(T val1, T val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public T getVal1() {
        return val1;
    }

    public void setVal1(T val1) {
        this.val1 = val1;
    }

    public T getVal2() {
        return val2;
    }

    public void setVal2(T val2) {
        this.val2 = val2;
    }

    // Metodo per la somma
    public T somma() {
        return (T) verificaTipo(val1.doubleValue() + val2.doubleValue());
    }

    // Metodo per la sottrazione
    public T sottrazione() {
        return (T) verificaTipo(val1.doubleValue() - val2.doubleValue());
    }

    // Metodo per la moltiplicazione
    public T moltiplicazione() {
        return (T) verificaTipo(val1.doubleValue() * val2.doubleValue());
    }

    // Metodo per la divisione
    public T divisione() {
        if (val2.doubleValue() == 0) {
            throw new ArithmeticException("Divisione per zero non consentita");
        }
        return (T) verificaTipo(val1.doubleValue() / val2.doubleValue());
    }

    // Metodo per ottenere il tipo di val1
    public Class<?> tipoVal1() {
        return val1.getClass();
    }

    // Metodo per ottenere il tipo di val2
    public Class<?> tipoVal2() {
        return val2.getClass();
    }

    // Metodo per verificare il tipo e lanciare un'eccezione se il valore è null
    private <T> T verificaTipo(T valore) {
        if (val1 == null || val2 == null) {
            throw new NullPointerException("I valori non possono essere null");
        }
        return valore;
    }

    @Override
    public String toString() {
        return "Operatrice{"
                + "val1=" + val1
                + ", val2=" + val2
                + '}';
    }
}
