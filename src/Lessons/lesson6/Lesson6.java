package Lessons.lesson6;

public class Lesson6 {
    public static void main(String[] args) {
        String text = "Hello i am MAks";

        if (text.equalsIgnoreCase("Hello i am Maks")) {
            System.out.println("Ok");
        } else {
            System.out.println("Fail");
        }

        String text2 = "Hello i am Alex";
        System.out.println(text2.indexOf("l"));
        System.out.println(text2.lastIndexOf("l"));

        int num = 1256341;
        String temp = String.valueOf(num);  //format to string
        System.out.println(temp);

        //string -> int
        String num2 = "45463";
        int temp2 = Integer.parseInt(num2);
        System.out.println(temp2);

        //округления
        double num3 = 5.25f;
        System.out.println(Math.round(num3)); //до ближайшего целого
        System.out.println(Math.floor(num3)); //до ближайшего меньшего
        System.out.println(Math.ceil(num3));  //до ближайшего большего


        String[] myArr = {"Привет", "меня", "зовут", "Макс"};
        reverseArray(myArr);

    }

    //перевернуть массив - на собесдованиях

    public static void reverseArray(String[] arr) {
        int lengthArr = arr.length;
        String temp;

        //[n - i - 1] n - длина массива, i - итертор

        for (int i = 0; i < lengthArr / 2; i++) {
            temp = arr[lengthArr - i - 1];
            arr[lengthArr - i - 1] = arr[i];
            arr[i] = temp;
        }

        for (String str : arr) {
            System.out.print(str + " ");
        }
    }


}
