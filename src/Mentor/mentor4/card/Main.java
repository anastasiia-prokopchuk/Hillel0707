package Mentor.mentor4.card;

public class Main {
    public static void main(String[] args) {
        Rank rank = Rank.ACE;
        System.out.println(rank.getTranslation());


        Suit suit = Suit.DIAMONDS;
        System.out.println(suit.name());


        System.out.println(Rank.valueOf("SIX"));


        Rank king = Rank.KING;
        System.out.println(king.ordinal());

    }
}
