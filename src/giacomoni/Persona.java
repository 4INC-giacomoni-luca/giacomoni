package giacomoni;

import java.time.LocalDate;
import java.time.Period;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona {

    private String cognome;
    private String nome;
    private Date dataDiNascita;
    private static int numeroIstanze = 0;

    public Persona() {
        numeroIstanze++;
    }

    public Persona(String cognome, String nome, Date dataDiNascita) {
        this();
        setNominativi(cognome, nome);
        setValidaDataDiNascita(dataDiNascita);
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        setNominativi(cognome, this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        setNominativi(this.cognome, nome);
    }

    public Date getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(Date dataDiNascita) {
        setValidaDataDiNascita(dataDiNascita);
    }

    public static int getNumeroIstanze() {
        return numeroIstanze;
    }

    public boolean verificaOmonimia(Persona persona) {
        return this.cognome.equals(persona.getCognome()) && this.nome.equals(persona.getNome());
    }

    public int calcolaEta() {
        if (dataDiNascita == null) {
            throw new IllegalArgumentException("La data di nascita non è valida.");
        }

        LocalDate dataNascitaLocalDate = dataDiNascita.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        LocalDate oggi = LocalDate.now();

        Period differenza = Period.between(dataNascitaLocalDate, oggi);

        return differenza.getYears();
    }

    public String info() {
        if (cognome == null || nome == null || dataDiNascita == null) {
            throw new IllegalStateException("Tutti gli attributi devono essere inizializzati.");
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE dd MMMM yyyy");

        return "Cognome: " + cognome + "\nNome: " + nome + "\nData di nascita: " + dateFormat.format(dataDiNascita);
    }

    private void setNominativi(String cognome, String nome) {
        controlloNominativi(cognome);
        controlloNominativi(nome);
        this.cognome = cognome;
        this.nome = nome;
    }

    private void controlloNominativi(String nominativo) {
        if (nominativo == null || nominativo.isEmpty()) {
            throw new IllegalArgumentException("Il nominativo non è valido.");
        }
    }

    private void setValidaDataDiNascita(Date dataDiNascita) {
        if (dataDiNascita == null || dataDiNascita.after(new Date())) {
            throw new IllegalArgumentException("La data di nascita non è valida.");
        }
        this.dataDiNascita = dataDiNascita;
    }
}
