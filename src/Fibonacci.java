public class Fibonacci {
    public static void main(String[] args) {
        // print the first 30 numbers from the fibonacci sequence
        int before = 0;
        int after = 1;
        int sum = 1;

        for(int x = 0; x < 31; ++x) {
            System.out.println(before);
            sum = before + after;
            before = after;
            after = sum;
            }
    }
}
