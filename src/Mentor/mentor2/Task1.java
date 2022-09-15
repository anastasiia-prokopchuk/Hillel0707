package Mentor.mentor2;

public class Task1 {

    /**
     * Написать функцию, которая переводит:
     * - все буквы "А" -> "Т"
     * - все буквы "T" -> "A"
     * - все буквы "C" -> "G"
     * - все буквы "G" -> "C"
     * Вводная строка - это набор букв «A», «T», «C», «G»
     * <p>
     * Пример:
     * "ATTGC" // вернуть "TAACG"
     * "GTAT" // вернуть "CATA"
     */


    public static String makeComplement(String dna) {
        String str = "";
        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == 'A') {
                str += "T";
            }
            if (dna.charAt(i) == 'T') {
                str += "A";
            }
            if (dna.charAt(i) == 'C') {
                str += "G";
            }
            if (dna.charAt(i) == 'G') {
                str += "C";
            }
        }

        return str;
    }

    public static void main(String[] args) {

        String result = makeComplement("ATTGC");
        System.out.println(result);
        String result2 = makeComplement("GTAT");
        System.out.println(result2);

    }


}

