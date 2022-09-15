package Mentor.mentor1;

/*
 б) змінити закінчення в залежності від числа, яке стоїть перед словом гуска и вівця.
	“В хатинці є 1 гуска и 4 вівці”
	“В хатинці є 2 гускі и 3 вівці”
 */


public class Animals2 {
    public static void main(String[] args) {

        int sheep = 4;

        for (int i = 1; i < 5; i++) {
            String duck1 = "гуска";
            String sheep1 = "вівця";
           
            if (i > 1) {
                duck1 = "гуски";
            }

            if (sheep > 1) {
                sheep1 = "вівці";
            }

            System.out.println("У хатинці маємо " + i + " " + duck1 + " та " + (sheep--) + " " + sheep1);

        }


    }
}
