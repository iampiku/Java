import java.util.Scanner;
class hacker_rank{
      Scanner br = new Scanner(System.in);

      String str;

      void get_data(){
            str = br.nextLine();
      }

      void reduction(){
            String newString = " ";
            for(int i=0; i<str.length(); i++){
                  for(int j=0; j<i; j++){
                        if (str.charAt(i) == str.charAt(j)){
                              
                        }
                  }
            }
            System.out.println(newString);
      }
}
public class reduced_string{
      public static void main(String[] args) {
            hacker_rank ob = new hacker_rank();
            ob.get_data();
            ob.reduction();
      }
}