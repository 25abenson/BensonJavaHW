public class PartB {
    
    public static void main(String[] args) {
        
         double[] numbers ={ 2.2, 1.0, 3.7, 4.1, 88.0 };
         int index = 5;

        System.out.println("here are the values entered: " );
        for (int i = 0; i < index; i++){
            System.out.println(numbers[i]);
    }

    double av = (numbers[1] + numbers[2] + numbers[3] + numbers[4] + numbers[0]) / 5;
    System.out.println("Average = " + av);
}
}
