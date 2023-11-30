package esEccezioni;

import java.util.Scanner;

public class TriangoloRettangoloTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        

        try {
            TriangoloRettangolo t = new TriangoloRettangolo(100000, 20.0, 30.0, "blu", "flhl43er");
            
            
                   
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } 
    }
}