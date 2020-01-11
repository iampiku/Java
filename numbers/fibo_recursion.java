import java.util.Scanner;
public class fibo_recursion{
    public static void main(String args[]){
        Scanner br = new Scanner(System.in);
        int n = br.nextInt();
        for(int i=0;i<=n-1;++i){
            System.out.print(fibonacii(i)+" ");
        }
        br.close();
    }
    public static int fibonacii(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        else{
            return fibonacii(n-1) + fibonacii(n-2);
        }
    }
} 