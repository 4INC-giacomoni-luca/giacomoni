package esempioEccezioni;

import java.util.Scanner;

public class TriangoloRettangoloTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        

        try {
            TriangoloRettangolo t = new TriangoloRettangolo(10, 20.0, 30.0, "rosso", "aa12");
            
            
                   
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } 
    }
}