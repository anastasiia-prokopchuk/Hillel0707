package Mentor.mentor4.card;

public class Deck {
    final static Card[] deck = new Card[36];

    public Deck() {
        int i = 0;
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values())
                deck[i++] = new Card(rank, suit);
        }
    }


}
