package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extract {
    public static void main(String[] args) {
        String text = "Priset är 120 kr och frakten är 45 kr.";
        String regex = "\\d+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("FOUND A NUMBER " + matcher.group());
        }
    }
}
