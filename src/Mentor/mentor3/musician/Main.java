package Mentor.mentor3.musician;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Keyboardist keyboardist = new Keyboardist("Hero");
        Guitarist guitarist = new Guitarist("Guitar1");
        Musician musician = new Musician("All");

        List<Musician> musicians = Arrays.asList(keyboardist, guitarist, musician);
        for (Musician music : musicians) {
            music.play();
        }
    }

}
