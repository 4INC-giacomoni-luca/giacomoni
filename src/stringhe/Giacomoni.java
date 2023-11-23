package stringhe;

public class Giacomoni {

    public static void main(String[] args) {
        
        // Concatenazione di due stringhe
        String a = "conca";
        String b = "tenazione";
        String c = a + b;
        System.out.println(c);  

        // Metodo concat() per concatenare stringhe
        String cConcat = a.concat(b);
        System.out.println(cConcat);

        // Conversione di una stringa in minuscolo
        String str = "tEsT";
        System.out.println(str.toLowerCase());  

        // Conversione di una stringa in maiuscolo
        System.out.println(str.toUpperCase());  
        
        // Rimozione degli spazi iniziali e finali
        String strWithSpaces = "  abc  ";
        String noSpaces = strWithSpaces.trim();
        System.out.println("*" + noSpaces + "*");  

        // Rimozione di tutti gli spazi
        String strWithAllSpaces = " a b cd  e f";
        String noAllSpace = strWithAllSpaces.replaceAll(" ", "");
        System.out.println(noAllSpace);  

        // Estrazione di una sottostringa
        String strSubstring = "Ciao Mondo";
        String newS = strSubstring.substring(5);
        System.out.println(newS);  

        // Divisione di una stringa usando il punto come delimitatore
        String strToSplit = "a.b.c.d.e.f";
        String[] splits = strToSplit.split("\\.");
        for (String s : splits) {
            System.out.println(s);
        }

        // Confronto di stringhe
        String strA = "Casa";
        String strB = "Casa";
        boolean isEqual = strA.equals(strB);
        System.out.println(isEqual);  

        // Confronto di stringhe ignorando maiuscole/minuscole
        String strC = "Casa";
        String strD = "casa";
        boolean isEqualIgnoreCase = strC.equalsIgnoreCase(strD);
        System.out.println(isEqualIgnoreCase);  
    }
}

    
