package Mentor.mentor4.Education;

//// создать колледж, университет и школы -с помощью перечисления.
//// Вывести их в последовательности обучения используя ordinals

public class Main_enum {
    public static void main(String[] args) {


        for (Education item : Education.values()) {
            System.out.println(item);
        }

    }
}
