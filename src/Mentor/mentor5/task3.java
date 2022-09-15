package Mentor.mentor5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//"Мова значно за 4441-3333-4444-5555 позичила синтаксис 09 79999999із C і C++." +
//        " Зокрема, взято за основу об'єктну модель С++, проте " +
//        "її 5375 2222 3333 4444модифіковано. 334 ть появи деяких конфліктних" +
//        " 5375222233334444 ситуацій, що могли виникнути через помилки"


public class task3 {

    public static void main(String[] args) {
        final String regex = "(\\d{4}[ \\-]?){4}";
        final String string = "\"Мова значно за 4441-3333-4444-5555 позичила синтаксис 09 79999999із C і C++.\" +\n"
                + "                \" Зокрема, взято за основу об'єктну модель С++, проте \" +\n"
                + "                \"її 5375 2222 3333 4444модифіковано. 334 ть появи деяких конфліктних\" +\n"
                + "                \" 5375222233334444 ситуацій, що могли виникнути через помилки\"";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));

//            for (int i = 1; i <= matcher.groupCount(); i++) {
//                System.out.println("Group " + i + ": " + matcher.group(i));
//            }
        }
    }
}





