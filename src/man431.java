public class man431 {
    public static void main(String[] args) {
        String abs = "ABC";
        StringBuilder sb = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            sb.reverse();
        }
        System.out.println((System.currentTimeMillis() - startTime));
    }
}
