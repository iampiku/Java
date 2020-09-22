import java.util.Scanner;

class check {
    public void even_odd(int a) {
        if (a % 2 == 0) {
            System.out.println("the given number is even");
        } else {
            System.out.println("the given number is odd");
        }
    }

    public void prime(int a) {
        if (a <= 1) {
            System.out.println("the number is not a prime number");
        } else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    System.out.println("the number is not a prime number");
                } else {
                    System.out.println("prime number");
                    break;
                }
            }
        }
    }

    public void reverse(int a) {
        int reversed = 0;
        if (a <= 9) {
            System.out.println("the number is a single digit number");
        } else {
            while (a != 0) {
                int num = a % 10;
                reversed = reversed * 10 + num;
                a = a / 10;
            }
            System.out.println("revese of the number" + " " + reversed);
        }
    }

    public void factorial(int a) {
        System.out.println("factorial of the numbe is as follows");
        for (int i = 1; i <= a; ++i) {
            if (a % i == 0) {
                System.out.println(i + " ");
            }
        }
    }
}

class number_check extends check {
    public static void main(String args[]) {
        Scanner br = new Scanner(System.in);
        int x = br.nextInt();
        number_check ob = new number_check();
        ob.even_odd(x);
        ob.factorial(x);
        ob.prime(x);
        ob.reverse(x);
        br.close();
    }
}
