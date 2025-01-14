// Alex Benson
// AT06 Project
// 1/8/24

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

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
    private boolean visible = true; // set card visible

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

    // override constructor
    public Card(boolean visible) {
        this();
        setVisibilty(visible);
    }

    // set visibility
    public boolean getVisibilty() {
        return visible;
    }

    // set visibility
    public void setVisibilty(boolean visible) {
        this.visible = visible;
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
        if (visible == false) {
            System.out.print("##");
        } else {
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
}

public class Project {

    // clear screen method
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // draw board function
    public static void drawBoard(ArrayList<Card> cards) {
        int i = 0;
        while (i < cards.size()) {
            cards.get(i).getFace();
            i++;
            if (i == cards.size() - 1) {
                System.out.print(" ");
            } else {
                System.out.print(" ");
            }
        }
    }

    // pause game method
    public static void delay(long msec) {
        try {
            Thread.sleep(msec);
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {

        // create Scanner
        Scanner in = new Scanner(System.in);

        // char spade = '\u2660'; // ♠
        // char heart = '\u2661'; // ♡

        Card opening1 = new Card();
        Card opening2 = new Card();

        clearScreen();
        System.out.println("------------------------------");
        System.out.println("  +------+     ");
        System.out.println("  |      |          +------+");
        System.out.println("  |  **  |          |     *|");
        System.out.println("  |      |          |   *  |");
        System.out.println("  +------+          | *    |");
        System.out.println("                    +------+");
        System.out.println("");
        System.out.println("        Welcome to....");
        System.out.println("THE VISUAL STUDIO CODE CASINO");
        System.out.println("------------------------------");

        delay(3000);

        while (true) {
            System.out.print("Would you like to play a round of Blackjack (type any key) or type Q to quit:");
            if (in.nextLine().toUpperCase().equals("Q")) {
                clearScreen();
                System.out.println("Hope you play again soon! Till next time!");
                break;
            } else {
                clearScreen();
                delay(500);
                System.out.println("Dealing Hands...");
                delay(1000);
                clearScreen();

                // create array list for player hand
                ArrayList<Card> playerHand = new ArrayList<Card>();

                // create array list for dealer hand
                ArrayList<Card> dealerHand = new ArrayList<Card>();

                // creat player score
                int playerScore = 0;

                // create dealer score
                int dealerScore = 0;

                // creates random card instance
                Card dealerfirstCard = new Card(true);

                // add to dealer arraylist
                dealerHand.add(dealerfirstCard);

                // get numeric value of card 1
                int numericdealer1 = dealerfirstCard.getNumCardVal();

                // creates random card instance
                Card dealersecondCard = new Card(false);

                // add to dealer arraylist
                dealerHand.add(dealersecondCard);

                // get numeric value of card 2
                int numericdealer2 = dealersecondCard.getNumCardVal();

                // calculate total
                dealerScore = numericdealer1 + numericdealer2;
                if (dealerScore > 21) {
                    for (int k = 0; k < dealerHand.size(); k++) {
                        dealerHand.get(k);
                        if (dealerHand.get(k).getNumCardVal() == 11) {
                            dealerScore = dealerScore - 10;
                        }
                    }
                }

                // print dealer hand
                dealersecondCard.setVisibilty(false);
                System.out.print("Dealer: ");
                drawBoard(dealerHand);
                System.out.println("");

                // creates random card instance
                Card playerfirstCard = new Card(true);

                // add to player arraylist
                playerHand.add(playerfirstCard);

                // get numeric value of card 1
                int numericplayer1 = playerfirstCard.getNumCardVal();

                // creates random card instance
                Card playersecondCard = new Card(true);

                // add to player arraylist
                playerHand.add(playersecondCard);

                // get numeric value of card 2
                int numericplayer2 = playersecondCard.getNumCardVal();

                // calculate total
                playerScore = numericplayer1 + numericplayer2;

                // print player hand
                System.out.print("Player: ");
                drawBoard(playerHand);
                System.out.println();

                int aceCount = 0;
                if (numericplayer1 == 11) {
                    aceCount++;
                }
                if (numericplayer2 == 11) {
                    aceCount++;
                }

                if (playerScore < 21) {

                    for (int j = 0; playerScore < 21; j++) {

                        System.out.print("Would you like to hit (H) or stand(S)? ");

                        if (in.nextLine().toLowerCase().equals("h")) {
                            // creates random card instance
                            Card playernewCard = new Card();
                            // add to player arraylist
                            playerHand.add(playernewCard);

                            // get numeric value of card 1
                            int numericplayernew = playernewCard.getNumCardVal();

                            // calculate new total and display it
                            playerScore = playerScore + numericplayernew;
                            if (numericplayernew == 11 && playerScore > 21) {
                                playerScore = playerScore - 10;
                            }
                            if (aceCount > 0 && playerScore > 21) {
                                playerScore = playerScore - 10 * aceCount;
                                aceCount = 0;
                            }

                            clearScreen();
                            // print dealer hand
                            System.out.print("Dealer: ");
                            drawBoard(dealerHand);
                            System.out.println();
                            // print player hand
                            System.out.print("Player: ");
                            drawBoard(playerHand);
                            System.out.println();

                            delay(1000);

                        } else {
                            break;
                        }

                    }
                }
                if (playerScore == 21) {

                    System.out.println("Your Score is 21! Let's see what the dealer has.");
                    delay(3000);
                    // now do the dealer hand
                    // print dealer hand
                    dealersecondCard.setVisibilty(true);
                    clearScreen();
                    // print dealer hand
                    System.out.print("Dealer: ");
                    drawBoard(dealerHand);
                    System.out.println();
                    // print player hand
                    System.out.print("Player: ");
                    drawBoard(playerHand);
                    System.out.println();

                    delay(1000);

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
                                for (int i = 0; i < dealerHand.size(); i++) {
                                    dealerHand.get(i);
                                    if (dealerHand.get(i).getNumCardVal() == 11 && dealerScore > 21) {
                                        dealerScore = dealerScore - 10;
                                    }
                                }
                            }

                            clearScreen();
                            // print dealer hand
                            System.out.print("Dealer: ");
                            drawBoard(dealerHand);
                            System.out.println();
                            // print player hand
                            System.out.print("Player: ");
                            drawBoard(playerHand);
                            System.out.println();

                            delay(1000);

                        }
                    } else if (dealerScore > 21) {
                        for (int k = 0; k <= 1; k++) {
                            dealerHand.get(k);
                            if (dealerScore > 21) {
                                for (int i = 0; i < dealerHand.size(); i++) {
                                    dealerHand.get(i);
                                    if (dealerHand.get(i).getNumCardVal() == 11 && dealerScore > 21) {
                                        dealerScore = dealerScore - 10;
                                    }
                                }
                            }
                        }
                        // if dealer busts
                        System.out.println("Dealer Busts! You win!");
                    }
                    // compare the totals
                    if (dealerScore <= 21 && dealerScore > playerScore) {
                        System.out.println("Aw the dealer won. You lose. Try again.");

                    } else if (dealerScore > 21) {
                        System.out.println("Dealer Busts! You win!");
                    } else if (dealerScore == playerScore) {
                        System.out.println("Your scores are equal. Draw.");
                    } else {
                        System.out.println("Congrats! You are closer to 21! You win!");
                    }

                }

                if (playerScore > 21) {
                    for (int k = 0; k <= 1; k++) {
                        playerHand.get(k);
                        if (playerScore > 21) {
                            for (int i = 0; i < playerHand.size(); i++) {
                                playerHand.get(i);
                                if (playerHand.get(i).getNumCardVal() == 11 && playerScore > 21) {
                                    playerScore = playerScore - 10;
                                }
                            }
                        }
                    }

                    System.out.println("Ooh you're total is over 21...Bust! The dealer wins!");

                } else if (playerScore < 21) {

                    System.out.println("You total stands. Let's see what the dealer has!");
                    // now do the dealer hand
                    // print dealer hand
                    dealersecondCard.setVisibilty(true);
                    clearScreen();
                    // print dealer hand
                    System.out.print("Dealer: ");
                    drawBoard(dealerHand);
                    System.out.println();
                    // print player hand
                    System.out.print("Player: ");
                    drawBoard(playerHand);
                    System.out.println();

                    delay(1000);

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
                                for (int i = 0; i < dealerHand.size(); i++) {
                                    dealerHand.get(i);
                                    if (dealerHand.get(i).getNumCardVal() == 11 && dealerScore > 21) {
                                        dealerScore = dealerScore - 10;
                                    }
                                }
                            }

                            clearScreen();
                            // print dealer hand
                            System.out.print("Dealer: ");
                            drawBoard(dealerHand);
                            System.out.println();
                            // print player hand
                            System.out.print("Player: ");
                            drawBoard(playerHand);
                            System.out.println();

                            delay(1000);

                        }
                    } else if (dealerScore > 21) {
                        for (int k = 0; k <= 1; k++) {
                            dealerHand.get(k);
                            if (dealerScore > 21) {
                                for (int i = 0; i < dealerHand.size(); i++) {
                                    dealerHand.get(i);
                                    if (dealerHand.get(i).getNumCardVal() == 11 || dealerScore > 21) {
                                        dealerScore = dealerScore - 10;
                                    }
                                }
                            }
                        }
                        // if dealer busts
                        System.out.println("Dealer Busts! You win!");
                    }
                    // compare the totals
                    if (dealerScore <= 21 && dealerScore > playerScore) {
                        System.out.println("Aw the dealer won. You lose. Try again.");

                    } else if (dealerScore > 21) {
                        System.out.println("Dealer Busts! You win!");
                    } else if (dealerScore == playerScore) {
                        System.out.println("Your scores are equal. Draw.");
                    } else {
                        System.out.println("Congrats! You win!");
                    }

                }
            }
        }

    }
}
