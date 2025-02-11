//Alex Benson
// Lesson 31 Homework
// 2/11/25

public class BaseballCard {

    String name; // the name of the player on the card.
    int year; // the year the card was issued.
    boolean equal = false;

    public BaseballCard(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    // to string method override
    public String toString() {
        String info = "Card = " + this.name + "; Year = " + this.year;
        return info;
    }

    // equals method override
    public boolean equals(BaseballCard Card2) {
        // if equal, boolean equal = true and prints the message that they are the same
        if (name.equals(Card2.getName()) && year == Card2.getYear()) {
            System.out.println("The cards are the same.");
            equal = true;
            return equal;
        } else { // if not equal the system prints the not equal method set boolean equal to
                 // false
            System.out.println("The cards are not the same.");
            equal = false;
            return equal;
        }
    }

    public static void main(String[] args) {

        // create two instances of the card class
        BaseballCard Card1 = new BaseballCard("Jeter", 2010);
        BaseballCard Card2 = new BaseballCard("Ruth", 1930);

        // call the to string method
        System.out.println(Card1.toString());
        System.out.println(Card2.toString());

        // are they equal?
        Card1.equals(Card2);

        // create another instance of the card class
        BaseballCard Card1copy = new BaseballCard("Jeter", 2010);

        // call to string method again
        System.out.println(Card1.toString());
        System.out.println(Card1copy.toString());

        // check if these are equal
        Card1.equals(Card1copy);

    }

}
