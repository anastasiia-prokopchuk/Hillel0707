package Mentor.mentor1;

/*
в) Порахувати кількість ніг у кожного із наборів із розрахунку, що гуска має 2 ноги, а вівця чотири
Доповнити висновок на консоль:
“В хатинці є 1 гуска та 4 вівці. Кількість ніг = 18”
     “В хатинці є 2 гуски та 3 вівці. Кількість ніг = 16”
*/
public class Animals3 {
    public static void main(String[] args) {
        int sheep = 4;
        int duckleg = 2;
        int sheepleg = 4;

        for (int i = 1; i < 5; i++) {
            String duck1 = "гуска";
            String sheep1 = "вівця";

            if (i > 1) {
                duck1 = "гуски";
            }

            if (sheep > 1) {
                sheep1 = "вівці";
            }


            System.out.println("У хатинці маємо " + i + " " + duck1 + " та " + (sheep) + " " + sheep1 + ". Кількість ніг =" + (duckleg * i + sheepleg * sheep));
            sheep--;
        }

    }
}
