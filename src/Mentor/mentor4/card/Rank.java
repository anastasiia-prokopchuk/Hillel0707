package Mentor.mentor4.card;

public enum Rank {
    SIX("шість"),
    SEVEN("сім"),
    EIGHT("вісім"),
    NINE("двєять"),
    TEN("десять"),
    JACK("валет"),
    QUEEN("дама"),
    KING("король"),
    ACE("туз");


    private String translation;


    Rank(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }


    @Override
    public String toString() {
        return "переклад = " + translation;
    }


}
