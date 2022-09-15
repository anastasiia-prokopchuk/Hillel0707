package Homeworks;

public class Test13 {
    public static void main(String[] args) {

        int[] array = new int[10];
        double sum = 0;
        double averageNumber = 0;

        for (int index : array) {

            array[index] = (int) (Math.random() * 11 + 10);
            sum += array[index];
        }

        averageNumber = sum / array.length;
        System.out.println(averageNumber);
    }
}
