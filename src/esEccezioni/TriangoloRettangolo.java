package esEccezioni;

/**
 * La classe TriangoloRettangolo serve per calcolare perimetro e area di un
 * triangolo rettangolo
 *
 * @author Cognome Nome Classe Anno
 * @version 1.0
 */
public class TriangoloRettangolo {

    private Double base;
    private Double altezza;
    private Double lato;
    private String colore;
    private String id;

    /**
     * Costruttore senza parametri <br> 
     * {@link #setBase(Double)}    <br>
     * {@link #setAltezza(Double)} <br>
     * {@link #setLato(Double)}
     */
    public TriangoloRettangolo() {
        
    }

    /**
     * Costruttore con tutti i parametri
     *
     * @param base
     * @param altezza
     * @param lato
     * @throws java.lang.Exception
     */
    public TriangoloRettangolo(double base, Double altezza, Double lato, String colore, String id) throws Exception {
        setBase(base);
        setAltezza(altezza);
        setLato(lato);
        setColore(colore);
        setId(id);
    }

    /**
     * Restituisce il valore della base
     *
     * @return base
     */
    public Double getBase() {
        return base;
    }

    /**
     * Imposta/modifica il valore della base
     *
     * @param base
     * @throws java.lang.Exception
     */
    public final void setBase(Double base) throws Exception {
        if (base == null) {
            throw new Exception("Il valore dell'altezza deve essere null!");
        }

        if (base > 0) {
            this.base = base;
        } else {
            throw new Exception("Il valore della base deve essere maggiore di 0!");
        }
    }
    
    public Double getAltezza() {
        return altezza;
    }

    public final void setAltezza(Double altezza) throws Exception {
        if (altezza == null) {
            throw new Exception("Il valore dell'altezza deve essere null!");
        }

        if (altezza > 0) {
            this.altezza = altezza;
        } else {
            throw new Exception("Il valore dell'altezza deve essere maggiore di 0!");
        }
    }

    public Double getLato() {
        return lato;
    }

    public final void setLato(Double lato) throws Exception {
        try {
            if (lato > 0) {
                this.lato = lato;
            } else {
                throw new Exception("Il valore del lato deve essere maggiore di 0!");
            }
        } catch (NullPointerException e) {
            throw new NullPointerException /*Exception*/ ("Il valore del lato non può essere null!");
        } catch (Exception e){
            throw new Exception /*Exception*/ ("Errore generico!");
        }
    }

    public String getColore() {
        return colore;
    }

    public final void setColore(String colore) throws Exception {
        try {
            if (!colore.isEmpty())
                if (colore.length() >= 3)
                    this.colore = colore;
                else
                    throw new Exception("Il colore deve avere almeno 3 caratteri!");
            else 
                throw new Exception("Il colore non può essere una stringa vuota!");                                    
        } catch (NullPointerException e) {
            throw new NullPointerException /*Exception*/ ("Il colore non può essere null!");
        }                 
    }        

    public String getId() {
        return id;
    }

    public void setId(String id) throws Exception {
        try {
            if (!id.isEmpty()) {                
                id.substring(1000);
                Integer.parseInt(id);
                this.id = id;
            } else {
                throw new Exception("Il colore non può essere una stringa vuota!");
            }
        } catch (NullPointerException e) {
            throw new NullPointerException /*Exception*/ ("Il colore non può essere null!");
        } catch (NumberFormatException e){
            throw new NumberFormatException /*Exception*/ ("Inserire solo numeri!");
        } catch (StringIndexOutOfBoundsException e ){
            throw new StringIndexOutOfBoundsException /*Exception*/ ("Stringa troppo lunga!");
        } catch (Exception e) {
            throw new Exception ("Errore generico!");
        }
    }
        
    /**
     * Restituisce il valore del perimetro
     *
     * @return perimetro
     */
    public double perimetro() {
        double perimetro;

        perimetro = base + altezza + lato;

        return perimetro;
    }

    /**
     * Restituisce il valore dell'area
     *
     * @return area
     */
    public double area() {
        double area;

        area = (base * altezza) / 2;

        return area;
    }

    /**
     * Restituisce il valore degli attributi
     *
     * @return valore degli attributi
     */
    public String info() {
        //dichiarazione della variabile testo che mi servirà per restituire la stringa con il valore degli attributi
        String testo;

        testo =   "base   : " + base    + "\n"
                + "altezza: " + altezza + "\n"
                + "lato   : " + lato    + "\n";

        return testo;
    }
}