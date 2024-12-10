
import java.util.Arrays;

public class Demo {

    public static void square(double[] values){
        for (int i = 0; i < values.length; i++){
            //square each element
            values[i] = values[i] * values[i];
        }
       
    }

    public static void main(String[] args) {
        
        double[] squares = {1, 2, 3, 4, 5, 6};
        System.out.println("Original array: " + Arrays.toString(squares));
        square(squares);
        System.out.print("New values are: " + Arrays.toString(squares));


    }
}
