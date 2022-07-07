import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

class Calculator {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(br.readLine());
        double height = Double.parseDouble(br.readLine());
        Body.bodyIndex(weight, height);

    }

    public static class Body{

        public static void bodyIndex(Double weight, Double height) {
            double IMT = weight / (height * height);
            if (IMT < 16 ) {
                System.out.println("Выраженный дефицит массы тела");
            } else if (IMT <= 18.5) {
                System.out.println("Недостаточная (дефицит) масса тела");
            } else if (IMT <= 25) {
                System.out.println("Норма");
            } else if (IMT <= 30) {
                System.out.println("Избыточная масса тела (предожирение)");
            } else if (IMT <= 35) {
                System.out.println("Ожирение первой степени");
            } else if (IMT <= 40) {
                System.out.println("Ожирение второй степени");
            } else if (IMT > 40) {
                System.out.println("Ожирение третьей степени (морбидное)");
            }
        }
    }

}

