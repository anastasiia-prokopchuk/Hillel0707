package Mentor.mentor3.musician;

import java.util.Scanner;

class Musician {

    protected String musicanName;

    public void play() {
        System.out.println(this.musicanName + " Play on any instruments");
    }

    public Musician(String musicanName) {
        this.musicanName = musicanName;
    }


}
