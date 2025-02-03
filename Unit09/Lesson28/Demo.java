
import zoo.*;

public class Demo {
    public static void main(String[] args) {

        Bovine bessie = new Bovine("Bessie", 1100);
        bessie.feedHay(100);
        System.out.println("pounds of hay = " + bessie.getHayConsumed());

    }
}
