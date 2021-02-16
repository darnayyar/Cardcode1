package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Darpan Nayyar Student id: 991623744
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] card = new Card[2];
        Card c1 = new Card();
        Card c2 = new Card();
        card[0] = c1;
        card[1] = c2;
        c1.setSuit("spades");
        c1.setValue(4);
        c2.setSuit("Hearts");
        c2.setValue(7);
        for (Card c : card) {
            System.out.println(c.getSuit());
            System.out.println(c.getValue());
        }

    }

}
