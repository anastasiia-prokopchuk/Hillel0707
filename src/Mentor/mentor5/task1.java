package Mentor.mentor5;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task1 {
    // как проверить email на валидность
    public static void main(String[] args) {
        String text = "kjhkjh@sdfdsf.sdf";

        final String string = "kjhkjh@sdfdsf.sdf";
        Pattern pattern = Pattern.compile("^[A-Z0-9._%&*(-)]+@[A-Z0-9._(-)]+\\.[A-Z0-9]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(string);

        if (matcher.matches()) {
            System.out.println("email is valid");
        } else {
            System.out.println("email not valid");
        }

    }
}
