// implementetion of calculator program using inheritance of java
import java.util.Scanner;
class calculation{
    int result;

    public void addition(int a,int b){
        result = a+b;
        System.out.println("sum of the numbers" + result);
    }

    public void subtraction(int a,int b){
        result = a-b;
        System.out.println("diffrence of the numbers" + result);
    }

    public void multiplication(int a,int b){
        result = a*b;
        System.out.println("multiplication of the numbers" + result);
    }

    public void division(int a,int b){
        result = a/b;
        System.out.println("division of the numbers" + result);
    }
    
}
class calculator extends calculation{
    public static void main(String args[]){
        Scanner br = new Scanner(System.in);
        int x = br.nextInt();
        int y = br.nextInt();
        calculator ob = new calculator();
        ob.addition(x,y);
        ob.subtraction(x,y);
        ob.multiplication(x,y);
        ob.division(x,y);
        br.close();
    }
}