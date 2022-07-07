public class Array1 {
    public static void main(String[] args) {
        int[] nums = new int[11];
        int k = 5;
        for (int i = 0; i <= 10; ++i) {
            nums[i] = k;
            k++;
            System.out.println(nums[i]);
        }
    }
}
