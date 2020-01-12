/*The try statement allows you to define a block of code to be tested for errors while it is being executed.
The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.*/
public class try_catch{
    public static void main(String args[]){
        try{
            int arr[] = {1,2,3,4};
            System.out.println(arr[10]);
        }catch(Exception e){
            System.out.println("array is going out of bound");
        }
    }
}