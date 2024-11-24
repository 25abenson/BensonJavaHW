import java.util.Scanner;

public class Demo{

    public static void main(String[] args) {
        //instance of scanner class
        Scanner in = new Scanner(System.in);

        int mostbiggest = Integer.MIN_VALUE;


        while (true){
            System.out.print("Enter a value or q to quit: ");
            if (in.hasNext("q") || in.hasNext("Q")){
                //consume the token to remove it from the list
                in.next();
                break;
            }
            int val = in.nextInt();
            if (val > mostbiggest){
                mostbiggest = val;
            }
        }

        System.out.println("Max = " + mostbiggest);
    


    }
}