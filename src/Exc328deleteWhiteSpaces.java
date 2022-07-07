public class Exc328deleteWhiteSpaces {
    public static void main(String[] args) {
        System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));
    }

    private static String removeWhiteSpaces(String str) {
        String stringWithoutWhiteSpaces = str.replaceAll(" ", "");
        return stringWithoutWhiteSpaces;
    }
}
