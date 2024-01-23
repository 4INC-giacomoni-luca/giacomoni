package esLettore;

public class Main {

    public static void main(String[] args) {

        String[] pagina = new String[5];
        pagina[0] = "afahpfhasfhsauiefrhoiufp";
        pagina[1] = "fsfstgregdrsgsdgsrrgsfgsrsgrrsgsrgrp";
        pagina[2] = "srgtsdgrsrgsfsefsfsefsf";
        pagina[3] = "afahpfhasfhsauiefrhoiufp";
        pagina[4] = "afahpfhasfhsauiefrhoiufp";

        MessaggioWhatsApp m = new MessaggioWhatsApp("prova testo WhatsApp", "faccina sorriedente");
        MessaggioEmail me = new MessaggioEmail("prova testo Email", "Luca Giacomoni", "esLettura");
        Ebook e = new Ebook("La storia di Luca", 5, pagina);

        System.out.println(m.leggiTesto());
        System.out.println(me.leggiTesto());
        System.out.println(e.leggiTesto());

    }
}
