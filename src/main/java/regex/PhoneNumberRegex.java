package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberRegex {
    public static void main(String[] args) {
        String phoneNumber = "123-456-7890";
        String regex = "\\d{3}-\\d{3}-\\d{4}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        if(matcher.matches()) {
            System.out.println("Valid phone number format" + phoneNumber);
        }  else {
            System.out.println("Invlaid phone number format");
        }

        String formattedPhone = phoneNumber.replaceAll("-", "@");
        System.out.println("Formatted phone number: " + formattedPhone);
    }

}
