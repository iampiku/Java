import java.util.Scanner;
class solution{
      Scanner br = new Scanner(System.in);

      String str;

      void get_data(){
            str = br.nextLine();
      }

      void calculate(){
            char arr[] = str.toCharArray();
            for(int i=1; i<str.length(); i++){
                  if(arr[i] - arr[i-1] != 1){
                        System.out.println("True");
                  }else{
                        System.out.println("False");
                  }
            }
      }
}
public class alphabet{
      public static void main(String args[]){
            solution ob= new solution();
            ob.get_data();
            ob.calculate();
      }
}