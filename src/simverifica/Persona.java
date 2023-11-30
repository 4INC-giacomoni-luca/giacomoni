package simverifica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {

    private String cognome;
    private String nome;
    private String codFisc;
    private String dataDiNascita;
    private static int numeroIstanze = 0;

    public Persona(String cognome, String nome, String codFisc, String dataDiNascita) throws Exception {
        setNome(nome);
        setCognome(cognome);
        setDataDiNascita(dataDiNascita);
        numeroIstanze++;
    }

    public Persona(Persona persona) throws Exception {
        this(persona.cognome, persona.nome, persona.codFisc, persona.dataDiNascita);
    }

    public final void setNome(String nome) throws Exception {
        if (nome == null || nome.trim().isEmpty()) {
            throw new Exception("Il nome non può essere vuoto o nullo");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public final void setCognome(String cognome) throws Exception {
        if (cognome == null || cognome.trim().isEmpty()) {
            throw new Exception("Il cognome non può essere vuoto o nullo");
        }
        this.cognome = cognome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCodFisc(String codFisc) {
        this.codFisc = codFisc;
    }

    public String getCodFisc() {
        return codFisc;
    }

    public final void setDataDiNascita(String dataDiNascita) throws Exception {
        SimpleDateFormat var = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date data = var.parse(dataDiNascita);
        } catch (ParseException e) {
            throw new Exception("Formato data di nascita non valido");
        }
        this.dataDiNascita = dataDiNascita;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public static int getNumeroIstanze() {
        return numeroIstanze;
    }

    public boolean verificaOmonimia(Persona persona) {
        return this.nome.equals(persona.nome) && this.cognome.equals(persona.cognome);
    }

    public int calcolaEta() throws Exception {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {

            LocalDate dataNascita = LocalDate.parse(dataDiNascita, formatter);

            LocalDate oggi = LocalDate.now();

            int eta = Period.between(dataNascita, oggi).getYears();

            return eta;

        } catch (Exception e) {
            throw new Exception("Errore nella conversione della data");

        }
    }

    @Override
    public String toString() {
        return "Persona{" + "cognome=" + cognome + ", nome=" + nome + ", codFisc=" + codFisc + ", dataDiNascita=" + dataDiNascita + ", numeroIstanze=" + numeroIstanze + '}';
    }

}
