import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneGeneratorModule4dop1 {
    static String phoneList = "";

    static void generateNumber(int number) {
        StringBuilder phoneList = new StringBuilder();
        for (int i = 0; i < number; i++) {
            StringBuilder phone = new StringBuilder("+7 (926) ");
            for (int j = 0; j <= 6; j++) {
                Random random = new Random();
                int randomDigit = random.nextInt(0, 10);
                if (j == 3) phone.append("-");
                phone.append(randomDigit);
                if (j == 6) phone.append("; ");
            }
            phoneList.append(phone);
        }
    }
    static void getPlatinumNumbers(){
        Pattern pattern = Pattern.compile("00-0000");
        Matcher matcher = pattern.matcher(phoneList);
        while (matcher.find()){
            System.out.println("+7 (926) " + phoneList.substring(matcher.start(), matcher.end()));
        }
    }

    public static void main(String[] args) {
        generateNumber(10000000);
        getPlatinumNumbers();
    }
}
