import java.util.Scanner;
public class reverse_number{
    public static void main(String args[]){
        Scanner br = new Scanner(System.in);
        int num,x=0;
        System.out.println("please enter the number");
        num = br.nextInt();
        while(num!=0){
            x = x*10;
            x = x + num%10;
            num = num/10;
        }
        System.out.println("the reversed number:"+x);
        br.close();
    }
}