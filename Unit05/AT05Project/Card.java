// Alex Benson
// AT05 Project
// 11/13/24

import java.util.Random;
import java.util.Scanner;

public class Card{
    Scanner in = new Scanner (System.in);

    //public enumeration
    public enum SuitofCard {HEART, SPADE, CLUB, DIAMOND};
    public enum ValofCard {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};

    //member variable declaration
    private SuitofCard suit;
    private ValofCard rank;

    private char spade   = '\u2660';    // ♠
    private char heart   = '\u2661';    // ♡
    private char club    = '\u2663';    // ♣
    private char diamond = '\u2662';    // ♢


    //constructor
    public Card(){
        drawRank();
        drawSuit();   
    }

    //override constructor
   public Card(SuitofCard inputsuit, ValofCard inputrank){
        setRank(inputrank);
        setSuit(inputsuit);
   }

    //get suit method
    public SuitofCard getSuit(){
        return suit; 
    }

    //get rank method
    public ValofCard getRank(){
        return rank;
    }

    //set rank method
    public void setRank(ValofCard nextValofCard){
        rank = nextValofCard;
    }

    //set suit method
     public void setSuit(SuitofCard nextSuitofCard){
        suit = nextSuitofCard;
    }

    //random card method
    public void drawSuit(){
        int suitpick = new Random().nextInt(SuitofCard.values().length);
        suit = SuitofCard.values()[suitpick];
    }

    //random rank method
    public void drawRank(){
        int rankpick = new Random().nextInt(ValofCard.values().length);
        rank = ValofCard.values()[rankpick];
    }

    //get face of card
    public void getFace(){
        if (suit == SuitofCard.CLUB){
            System.out.print(club);
        } else if (suit == SuitofCard.HEART){
            System.out.print(heart);
        } else if (suit == SuitofCard.SPADE){
            System.out.print(spade);
        } else {
            System.out.print(diamond);
        }

        if (rank == ValofCard.TWO){
            System.out.println("2");
        } else if (rank == ValofCard.THREE){
            System.out.println("3");
        } else if (rank == ValofCard.FOUR){
            System.out.println("4");
        } else if (rank == ValofCard.FIVE){
            System.out.println("5");
        } else if (rank == ValofCard.SIX){
            System.out.println("6"); 
        } else if (rank == ValofCard.SEVEN){
            System.out.println("7");
        } else if (rank == ValofCard.EIGHT){
            System.out.println("8");
        } else if (rank == ValofCard.NINE){
            System.out.println("9");
        } else if (rank == ValofCard.TEN){
            System.out.println("T");
        } else if (rank == ValofCard.JACK){
            System.out.println("J");
        } else if (rank == ValofCard.QUEEN){
            System.out.println("Q");
        } else if (rank == ValofCard.KING){
            System.out.println("K");
        } else {
            System.out.println("A");
        }
    }
    public static void main(String[] args) {

        //creates specific card instance
        Card specificCard = new Card(SuitofCard.HEART, ValofCard.QUEEN);

        //creates random card instance
        Card randomCard = new Card();

        //prints the specific card to user
        System.out.println("The queen of hearts looks like this... ");
        specificCard.getFace();

        System.out.println("Your ten random cards are... ");

        //loops for ten random cards
        for (int i = 0; i <= 10; i++){
            randomCard.drawRank();
            randomCard.drawSuit();
            randomCard.getFace();
        }

    }
}