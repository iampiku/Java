public class command_line{
    public static void main(String args[]){ 
        int a,b,c=0;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = a + b;
        System.out.println("Sum of the two numbers" +" "+c);
    }
}