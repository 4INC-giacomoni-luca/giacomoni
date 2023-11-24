package polimorfismo;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Padre p = new Padre(3);
        System.out.println(p.toString());

        Figlio f = new Figlio(3);
        System.out.println(f.toString());

        Padre pf = new Figlio(3);
        System.out.println(pf.toString());

        Padre pp = pf;
        System.out.println(pp.toString());

        p.incAttP();

        System.out.println("p" + p.toString());
        System.out.println("pp" + pp.toString());

        pp.incAttP();

        System.out.println("p" + p.toString());
        System.out.println("pp" + pp.toString());

        f.incrAttF();
        System.out.println("f" + f.toString());

        pf.incAttP();
        System.out.println("pf" + pf.toString());

        /*Figlio ff;    
        ff = pp;*/
        Figlio ff = (Figlio) pp;
        System.out.println("ff" + ff.toString());

        /*Figlio ff = (Figlio) pf;
        System.out.println("ff"+ff.toString());*/
    }

}
