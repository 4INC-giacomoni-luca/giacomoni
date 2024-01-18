package classe;

import java.util.ArrayList;
import java.util.Objects;

public class Studente {

    private String cognome;
    private String nome;
    private ArrayList<Float> voti = new ArrayList<>();

    public Studente(Studente studente) {
        this.cognome = studente.cognome;
        this.nome = studente.nome;
    }

    public Studente(String cognome, String nome) throws Exception {
        setCognome(cognome);
        setNome(nome);
    }

    public void aggiungiVoto(float voto) {
        voti.add(voto);
    }

    public void rimuoviUltimoVoto() {
        if (!voti.isEmpty()) {
            voti.remove(voti.size() - 1);
        }
    }

    public void rimuoviVoto(int posizione) {
        if (posizione >= 0 && posizione < voti.size()) {
            voti.remove(posizione);
        }
    }

    public void rimuoviVoto(float voto) {
        voti.remove(voto);
    }

    public Float votoMinore() {

        float minVoto = voti.get(0);

        for (Float voto : voti) {
            if (voto < minVoto) {
                minVoto = voto;
            }
        }

        return minVoto;
    }

    public Float votoMaggiore() {
        float maxVoto = voti.get(0);

        for (Float voto : voti) {
            if (voto > maxVoto) {
                maxVoto = voto;
            }
        }

        return maxVoto;
    }

    public Float mediaVoti() {
        float sum = 0;
        for (Float voto : voti) {
            sum += voto;
        }
        return sum / voti.size();
    }

    private void bubbleSort(boolean par) {
        int n = voti.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                float voto1 = voti.get(j);
                float voto2 = voti.get(j + 1);

                if ((par && voto1 > voto2) || (!par && voto1 < voto2)) {
                    voti.set(j, voto2);
                    voti.set(j + 1, voto1);
                }
            }
        }
    }

    public void ordinaVotoCrescente() {
        bubbleSort(true);
    }

    public void ordinaVotoDecrescente() {
        bubbleSort(false);
    }

    public String getCognome() {
        return cognome;
    }

    public final void setCognome(String cognome) throws Exception {
        if (cognome == null) {
            throw new Exception("L'attributo cognome non puÃ² essere nullo!");
        }

        if (cognome.equals("")) {
            throw new Exception("L'attributo cognome non puÃ² essere vuoto!");
        }

        String[] cognomi = cognome.split(" ");

        for (int i = 0; i < cognomi.length; i++) {
            if ((int) cognomi[i].charAt(0) < 65 || (int) cognomi[i].charAt(0) > 90) {
                throw new Exception("L'attributo cognome deve avere le iniziali maiuscole!");
            }

            for (int j = 1; j < cognomi[i].length(); j++) {
                if ((int) cognomi[i].charAt(j) < 97 || (int) cognomi[i].charAt(j) > 122) {
                    throw new Exception("L'attributo cognome non deve contenere caratteri speciali e solo le iniziali maiuscole!");
                }
            }
        }

        this.cognome = cognome.trim();
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) throws Exception {
        controlloStringa(nome);  //se viene sollevata un'eccezione la riga successiva non viene eseguita
        this.nome = nome;
    }

    // Cosa manca? apostrofo e caratteri accentati
    private void controlloStringa(String testo) throws Exception { //non e' necesseraio che questo metodo restituisca un boolen se prevista la gestione delle eccezioni
        try {
            if (testo.equals("")) {
                throw new Exception("L'attributo non puo' essere vuoto!");
            }

            String[] testi = testo.split(" ");

            for (int i = 0; i < testi.length; i++) {
                // controllo del primo carattere maiuscolo
                if ((int) testi[i].charAt(0) < 65 || (int) testi[i].charAt(0) > 90) {
                    throw new Exception("L'attributo deve avere le iniziali maiuscole!");
                }

                // controllo dei successivi caratteri minuscoli
                for (int j = 1; j < testi[i].length(); j++) {
                    if ((int) testi[i].charAt(j) < 97 || (int) testi[i].charAt(j) > 122) {
                        throw new Exception("L'attributo non deve contenere caratteri speciali e solo le iniziali maiuscole!");
                    }
                }
            }

            testo = testo.trim(); //il metodo trim() della classe String elimina gli spazi all'inizio e alla fine della stringa

        } catch (NullPointerException e) {
            throw new NullPointerException /*oppure Exception*/("L'attributo non puo' essere null");
        } catch (StringIndexOutOfBoundsException e) {
            throw new StringIndexOutOfBoundsException /*oppure Exception*/("Non e' consentito l'utilizzo di piu' di uno spazio!");
        }
    }

    @Override
    public String toString() {
        return "[" + cognome + " " + nome + "]";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.cognome);
        hash = 41 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Studente other = (Studente) obj;
        if (!Objects.equals(this.cognome, other.cognome)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    protected classe.Studente clone() throws CloneNotSupportedException {
        return (classe.Studente) super.clone();
    }

}
