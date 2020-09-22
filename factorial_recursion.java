import java.util.Scanner;

public class factorial_recursion {
    static int factorial(int a) {
        if (a == 0) {
            return 1;
        } else {
            return a * factorial(a - 1);
        }
    }

    public static void main(String args[]) {
        Scanner br = new Scanner(System.in);
        int num = br.nextInt();
        System.out.println("factorial of the number is " + factorial(num));
        br.close();
    }
}