import java.util.Scanner;
class solution {
    Scanner br = new Scanner(System.in);

    String twelve_hour;
    
      void get_data(){
        twelve_hour = br.nextLine();
      }

      void convert(){
            String str [] = twelve_hour.split(":");
            if(str[2].contains("PM")){
                  int n = Integer.parseInt(str[0]);
                  n = n + 12;
            }
            String answer = str[0]+":"+str[1]+":"+str[2];
            System.out.println(answer);
      }
      
}
public class time_conversion{
      public static void main(String args[]){
            solution ob = new solution();
            ob.get_data();
            ob.convert();
      }
}