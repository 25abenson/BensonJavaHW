// Alex Benson
// AT06 Project
// 1/8/24

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Card {
    Scanner in = new Scanner(System.in);

    // public enumeration
    public enum SuitofCard {
        HEART, SPADE, CLUB, DIAMOND
    };

    public enum ValofCard {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    };

    // member variable declaration
    private SuitofCard suit;
    private ValofCard rank;

    private char spade = '\u2660'; // ♠
    private char heart = '\u2661'; // ♡
    private char club = '\u2663'; // ♣
    private char diamond = '\u2662'; // ♢

    // constructor
    public Card() {
        drawRank();
        drawSuit();
    }

    // override constructor
    public Card(SuitofCard inputsuit, ValofCard inputrank) {
        setRank(inputrank);
        setSuit(inputsuit);
    }

    // clear screen method
    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // pause game method
    public void delay(long msec) {
        try {
            Thread.sleep(msec);
        } catch (Exception e) {
        }
    }

    // get suit method
    public SuitofCard getSuit() {
        return suit;
    }

    // get rank method
    public ValofCard getRank() {
        return rank;
    }

    // set rank method
    public void setRank(ValofCard nextValofCard) {
        rank = nextValofCard;
    }

    // get numeric value of card
    public int getNumCardVal() {
        if (rank == ValofCard.TWO) {
            return 2;
        } else if (rank == ValofCard.THREE) {
            return 3;
        } else if (rank == ValofCard.FOUR) {
            return 4;
        } else if (rank == ValofCard.FIVE) {
            return 5;
        } else if (rank == ValofCard.SIX) {
            return 6;
        } else if (rank == ValofCard.SEVEN) {
            return 7;
        } else if (rank == ValofCard.EIGHT) {
            return 8;
        } else if (rank == ValofCard.NINE) {
            return 9;
        } else if (rank == ValofCard.ACE) {
            return 11;
        } else {
            return 10;
        }
    }

    // set suit method
    public void setSuit(SuitofCard nextSuitofCard) {
        suit = nextSuitofCard;
    }

    // random card method
    public void drawSuit() {
        int suitpick = new Random().nextInt(SuitofCard.values().length);
        suit = SuitofCard.values()[suitpick];
    }

    // random rank method
    public void drawRank() {
        int rankpick = new Random().nextInt(ValofCard.values().length);
        rank = ValofCard.values()[rankpick];
    }

    // get face of card
    public void getFace() {
        if (suit == SuitofCard.CLUB) {
            System.out.print(club);
        } else if (suit == SuitofCard.HEART) {
            System.out.print(heart);
        } else if (suit == SuitofCard.SPADE) {
            System.out.print(spade);
        } else {
            System.out.print(diamond);
        }

        if (rank == ValofCard.TWO) {
            System.out.print("2");
        } else if (rank == ValofCard.THREE) {
            System.out.print("3");
        } else if (rank == ValofCard.FOUR) {
            System.out.print("4");
        } else if (rank == ValofCard.FIVE) {
            System.out.print("5");
        } else if (rank == ValofCard.SIX) {
            System.out.print("6");
        } else if (rank == ValofCard.SEVEN) {
            System.out.print("7");
        } else if (rank == ValofCard.EIGHT) {
            System.out.print("8");
        } else if (rank == ValofCard.NINE) {
            System.out.print("9");
        } else if (rank == ValofCard.TEN) {
            System.out.print("T");
        } else if (rank == ValofCard.JACK) {
            System.out.print("J");
        } else if (rank == ValofCard.QUEEN) {
            System.out.print("Q");
        } else if (rank == ValofCard.KING) {
            System.out.print("K");
        } else {
            System.out.print("A");
        }

    }
}

public class Project {
    public static void main(String[] args) {

        // create Scanner
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Would you like to play a round of Blackjack (Y) or type Q to quit:");
            if (in.nextLine().equals("Q")) {
                System.out.println("Hope you play again soon! Till next time!");
                break;
            } else {

                // create array list for player hand
                ArrayList<Card> playerHand = new ArrayList<Card>();

                // create array list for dealer hand
                ArrayList<Card> dealerHand = new ArrayList<Card>();

                // creat player score
                int playerScore = 0;

                // create dealer score
                int dealerScore = 0;

                // creates random card instance
                Card dealerfirstCard = new Card();

                // add to dealer arraylist
                dealerHand.add(dealerfirstCard);

                // get numeric value of card 1
                int numericdealer1 = dealerfirstCard.getNumCardVal();

                // creates random card instance
                Card dealersecondCard = new Card();

                // add to dealer arraylist
                dealerHand.add(dealersecondCard);

                // get numeric value of card 2
                int numericdealer2 = dealersecondCard.getNumCardVal();

                // calculate total
                dealerScore = numericdealer1 + numericdealer2;
                if (dealerScore > 21) {
                    for (int k = 0; i < dealerHand.size(); k++) {
                        dealerHand.get(i);
                        if (dealerHand.get(i).getNumCardVal() == 11) {
                            dealerScore = dealerScore - 10;
                        }
                    }
                }

                // print dealer hand
                System.out.print("Dealer: ");
                for (int i = 0; i < dealerHand.size(); i++) {
                    if (i == 1) {
                        System.out.print("**");
                        System.out.print(" ");
                    } else {
                        dealerHand.get(i).getFace();
                        System.out.print(" ");
                    }
                }
                System.out.println("");

                // creates random card instance
                Card playerfirstCard = new Card();

                // add to player arraylist
                playerHand.add(playerfirstCard);

                // get numeric value of card 1
                int numericplayer1 = playerfirstCard.getNumCardVal();

                // creates random card instance
                Card playersecondCard = new Card();

                // add to player arraylist
                playerHand.add(playersecondCard);

                // get numeric value of card 2
                int numericplayer2 = playersecondCard.getNumCardVal();

                // calculate total
                playerScore = numericplayer1 + numericplayer2;
                if (playerScore > 21) {
                    for (int i = 0; i < playerHand.size(); i++) {
                        playerHand.get(i);
                        if (playerHand.get(i).getNumCardVal() == 11) {
                            playerScore = playerScore - 10;
                        }
                    }
                }

                // print player hand
                System.out.print("Player: ");
                // iterate through list and print on seperate lines
                for (int i = 0; i < playerHand.size(); i++) {
                    playerHand.get(i).getFace();
                    System.out.print(" ");
                }
                System.out.println(" ");

                if (playerScore < 21) {

                    for (int j = playerScore; playerScore < 21;) {
                        System.out.print("Would you like to hit (H) or stand(S)? ");
                        int i = 2;

                        if (in.nextLine().equals("H")) {
                            // creates random card instance
                            Card playernewCard = new Card();

                            // add to player arraylist
                            playerHand.add(playernewCard);
                            playerHand.get(i).getFace();
                            i++;

                            // get numeric value of card 1
                            int numericplayernew = playernewCard.getNumCardVal();

                            // calculate new total and display it
                            playerScore = playerScore + numericplayernew;
                            if (playerScore > 21) {
                                for (int k = 0; i < playerHand.size(); k++) {
                                    playerHand.get(i);
                                    if (playerHand.get(i).getNumCardVal() == 11) {
                                        playerScore = playerScore - 10;
                                    }
                                }
                            }

                        } else {
                            break;
                        }
                    }
                }
                if (playerScore == 21) {
                    System.out.println("Your Score is 21! Let's see what the dealer has.");
                } else if (playerScore > 21) {
                    System.out.println("Ooh you're total is over 21...Bust!");
                    break;
                } else {
                    System.out.println("You total stands. Let's see what the dealer has!");
                }

                // now do the dealer hand
                // print dealer hand

                // if dealer is under 17 they must hit
                if (dealerScore < 17) {
                    for (int j = dealerScore; dealerScore < 17;) {
                        // creates random card instance
                        Card dealernewCard = new Card();

                        // add to player arraylist
                        dealerHand.add(dealernewCard);
                        dealernewCard.getFace();

                        // get numeric value of card
                        int numericdealernew = dealernewCard.getNumCardVal();

                        // calculate new total and display it
                        dealerScore = dealerScore + numericdealernew;
                        if (dealerScore > 21) {
                            for (int k = 0; i < dealerHand.size(); k++) {
                                dealerHand.get(i);
                                if (dealerHand.get(i).getNumCardVal() == 11) {
                                    dealerScore = dealerScore - 10;
                                }
                            }
                        }

                    }
                } else if (dealerScore > 21) {
                    // if dealer busts
                    System.out.println("Dealer Busts! You win!");
                } else {
                    // compare the totals
                    if (dealerScore > playerScore) {
                        System.out.println("Aw the dealer won. You lose. Try again.");
                    } else if (dealerScore == playerScore) {
                        System.out.println("Your scores are equal. Draw.");
                    } else {
                        System.out.println("Congrats! You are closer to 21! You win!");
                    }
                }
            }
        }
    }
}
