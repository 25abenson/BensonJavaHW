import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        //create array list
        ArrayList<String> names = new ArrayList<String>();

        //add elements
        names.add("Emily");
        names.add("Bob");
        names.add("Cindy");

        //print array list
        System.out.println(names);

        //iterate through list
        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        //remove an element
        names.remove(0);

        //print new array list
        System.out.println(names);

    }    
}
