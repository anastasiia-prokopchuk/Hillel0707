package Mentor.mentor3.musician;

class Guitarist extends Musician {

    public Guitarist(String musicianName) {
        super(musicianName);
    }

    @Override
    public void play() {
        System.out.println(this.musicanName + " Play on Guitar");
    }

}
