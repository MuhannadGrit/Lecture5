package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceText {
    public static void main(String[] args) {
        String text = "Java is cooooool!";
        String regex = "Java";
        String replacement = "C#";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        String result = matcher.replaceAll(replacement);
        System.out.println(result);

    }
}
