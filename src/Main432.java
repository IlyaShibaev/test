import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main432 {
    public static void main(String[] args) {
        String stringA = "Regular Expressions or Regex is an API for defining String patterns that can be used for searching, manipulating and editing a text. It is widely used to define a constraint on strings such as a password. Regular Expressions are provided under java.util.regex package.";
        Pattern pattern = Pattern.compile("s\s*s");
        Matcher matcher = pattern.matcher(stringA);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("Found match\n" + stringA.substring(start, end) + "\nfrom " + start + " to " + (end - 1));
        }
    }
}
