package es;

public class Studente {

    private String cognome;
    private String nome;

    public Studente(String cognome, String nome)throws Exception {
        setNome(nome);
        setCognome(cognome);
    }

    public Studente(Studente studente) {

        this.cognome = studente.cognome;
        this.nome = studente.nome;

    }

    public final void setNome(String nome)throws Exception {
        this.nome = controllo(nome);
    }

    public final void setCognome(String cognome)throws Exception {
        this.cognome = controllo(cognome);
    }
    
    private String controllo(String nome) throws Exception {
        
        nome = nome.trim();
        try{
            if(nome.isEmpty()){
                throw new Exception("inserire un nome");
            }else{
                for(int i=0 ; i<nome.length() ; i++){
                    if(!(Character.isLetter(nome.charAt(i))
                            ||Character.isSpaceChar(nome.charAt(i))
                                ||nome.charAt(i)== '\''
                                ) ){
                        throw new Exception("il nome deve contenere solo lettere");
                    }
                }
            }
        }catch(Exception e){
            throw e;
        }
        return nome;
    }
  
    
    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {

        String t = "";

        return t = "\nNOME: " + nome + "\nCOGNOME: " + cognome;
    }

}
