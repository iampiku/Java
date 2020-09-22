
// implementetion of calculator program using inheritance of java
import java.util.Scanner;

class calculation {
    private static int result;

    calculation() {
        result = 0;
    }

    public static void addition(int a, int b) {
        result = a + b;
        System.out.println("sum of the numbers" + result);
    }

    public static void subtraction(int a, int b) {
        result = a - b;
        System.out.println("diffrence of the numbers" + result);
    }

    public static void multiplication(int a, int b) {
        result = a * b;
        System.out.println("multiplication of the numbers" + result);
    }

    public static void division(int a, int b) {
        result = a / b;
        System.out.println("division of the numbers" + result);
    }

}

class calculator extends calculation {
    public static void main(String args[]) {
        Scanner br = new Scanner(System.in);
        int x = br.nextInt();
        int y = br.nextInt();
        addition(x, y);
        subtraction(x, y);
        multiplication(x, y);
        division(x, y);
        br.close();
    }
}