import java.util.Scanner;

public class String328b {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine();
            isCorrectName = checkName(name);
            if (!isCorrectName) System.out.println("Vvedi correctnoe imya");
        }
    }
    public static boolean checkName(String name) {
        String[] string = name.split(" ");
        System.out.println(string);
        return string.length == 3;
    }
}
