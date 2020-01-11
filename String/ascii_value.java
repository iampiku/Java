import java.util.Scanner;
public class ascii_value{
      public static void main(String args[]){
            Scanner br = new Scanner(System.in);

            System.out.println("Enter the chararcter");
            char a = br.next().charAt(0);

            // type casting is used to get the ascii value of a character
            int ascii = (int)a;
            System.out.println(ascii);
            System.out.println("enter how many character you want to move forward");
            int num = br.nextInt();
            ascii += num; 

            // converting the ascii value to the corresponding character
            char b = (char)ascii;
            System.out.println(b);
            br.close();
      }
}