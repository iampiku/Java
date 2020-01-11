// this program will the star pyramid pattern;
import java.util.Scanner;
class hacker_rank{
      Scanner br = new Scanner(System.in);

      static int n;

      void get_data(){
            n = br.nextInt();           
      }
      // i = number of rows to be printed in a pyramid;
      // j = number of colums to be printed in a pyramid;
      void left_upper_pyramid(){ 
            for(int i=0; i<n; i++){
                  for(int j=i+1; j<=n; j++){
                        System.out.print("#");
                  }
                  System.out.println();
            }
      }

      void left_lower_pyramid(){
            for(int i=0; i<n; i++){
                  for(int j=0; j<=i; j++){
                        System.out.print("#");
                  }
                  System.out.println();
            }
      }

      void right_lower_pyramid(){
            for(int i=0; i<n; i++){
                  for(int j=n; j>i; j--){
                        System.out.print(" ");
                  }
                  for(int k=0; k<=i; k++){
                        System.out.print("#");
                  }
                  System.out.println();
            }
      }

      void right_upper_pyramid(){
            for(int i=0; i<n; i++){

            }
      }
}
public class pyramid{
      public static void main(String args[]){
            hacker_rank ob = new hacker_rank();
            ob.get_data();
            ob.left_upper_pyramid();
            ob.left_lower_pyramid();
            ob.right_lower_pyramid();
            ob.right_upper_pyramid();
      }
}