package Lessons.lesson17;

public class CompareToExample {
    public static void main(String[] args) {
        String strSample = "a";
        System.out.println("Compare To 'a' b is " + strSample.compareTo("b"));

        strSample = "b";
        System.out.println("Compare To 'b' a is " + strSample.compareTo("a"));

        strSample = "b";
        System.out.println("Compare To 'b' b is " + strSample.compareTo("b"));
    }

}
