import java.util.Scanner;
public class sum_9{
      public static void main(String args[]){
      Scanner br = new Scanner(System.in);
      int n = br.nextInt();
      int arr[] = new int[n];
      for(int i=0; i<n; i++){
            arr[i] = br.nextInt();
            }
      for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                  if(arr[i]+arr[j] == 9){
                        System.out.println(arr[i] +" "+ arr[j]);
                  }
            }
      }
      br.close();     
      }
}