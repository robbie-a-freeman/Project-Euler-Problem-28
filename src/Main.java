public class Main {

    public static void main(String[] args) {

        int width = 1001;
        int n = (width + 1) / 2;
        int min = 2;
        int total = 1;
        int max, sum;

        for (int i = 2; i <= n; i++) {
            max = min + (i - 1) * 8 - 1;
            sum = (min + 2 * (i - 1) - 1 + max) * 2;
            total += sum;
            min = max + 1;
            System.out.println(total);
        }
        System.out.println(total);


    }
}
