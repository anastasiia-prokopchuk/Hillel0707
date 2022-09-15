package Mentor.mentor3.musician;

class Keyboardist extends Musician {
    public Keyboardist(String musicianName) {
        super(musicianName);
    }

    @Override
    public void play() {
        System.out.println(this.musicanName + " Play on Keyboard");
    }


}
