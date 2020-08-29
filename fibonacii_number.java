import java.util.Scanner;

public class fibonacii_number {
    public static void main(String args[]) {
        Scanner br = new Scanner(System.in);
        int n = br.nextInt();
        int a = 0;
        int b = 1;
        int sum;
        System.out.print(a + " " + b);
        for (int i = 1; i <= n - 2; ++i) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(" " + sum);
        }
        br.close();
    }
}