package RegexEexercise;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("test@example.com");
        strings.add("John123");
        strings.add("Hej123, hur mår du?");
        strings.add("2024-11-24");
        strings.add("Startar med Java regex.");
        strings.add("Telefon: +46-123-456-789");
        strings.add("JAVA");

        System.out.println("Scenario 1: Validera e-postadresser");
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        for (String str : strings) {
            if (str.matches(emailRegex)) {
                System.out.println(str + " är en giltig e-postadress.");
            }
        }

        System.out.println("\nScenario 2: Extrahera siffror från strängar");
        String numberRegex = "\\d+";
        for (String str : strings) {
            Pattern pattern = Pattern.compile(numberRegex);
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                System.out.println("Hittad siffra i \"" + str + "\": " + matcher.group());
            }
        }

        // Scenario 3: Kontrollera om strängen börjar med ett visst prefix
        System.out.println("\nScenario 3: Kontrollera prefix");
        String prefixRegex = "^Startar.*";
        for (String str : strings) {
            if (str.matches(prefixRegex)) {
                System.out.println("\"" + str + "\" börjar med 'Startar'.");
            }
        }

        // Scenario 4: Byta ut ord i en sträng
        System.out.println("\nScenario 4: Byta ut specifika ord");
        String wordRegex = "Java";
        for (String str : strings) {
            String replacedStr = str.replaceAll(wordRegex, "C#");
            System.out.println("Original: " + str);
            System.out.println("Ersatt: " + replacedStr);
        }

        // Scenario 5: Extrahera alla ord som börjar med en versal
        System.out.println("\nScenario 5: Extrahera ord som börjar med versal");
        String capitalWordRegex = "\\b[A-Z][a-z]*\\b";
        for (String str : strings) {
            Pattern pattern = Pattern.compile(capitalWordRegex);
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                System.out.println("Hittat ord som börjar med versal i \"" + str + "\": " + matcher.group());
            }
        }
    }
}

//https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_expressions/Cheatsheet