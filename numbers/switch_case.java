import java.util.Scanner;
public class switch_case{
    public static void main(String args[]){
        Scanner br = new Scanner(System.in);
        int x=0;
        System.out.println("enter the number to checked");
        int num = br.nextInt();
        System.out.println("press 1 to check the reverse of the number");
        System.out.println("press 2 to check wether the number is palindrom or not");
        int a = br.nextInt();
        switch(a){
            case 1:  
                while(num!=0){
                x = x*10;
                x = x + num%10;
                num = num/10;
            }
            System.out.println("the reversed number is:"+x);       
        break;
            case 2: 
            if(num==x)
                System.out.println("the given number is palindrom");
                else
                System.out.println("the given number is not palindrom");
        break;
        }
        System.out.println("You have enter a wrong choice");
        br.close();    
    }
}