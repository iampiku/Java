/* Static variable in Java is variable which belongs to the class and initialized only once at the start of the execution.*/
//It is a variable which belongs to the class and not to object(instance)
//Static variables are initialized only once, at the start of the execution. These variables will be initialized first, before the initialization of any instance variables
//A single copy to be shared by all instances of the class
//A static variable can be accessed directly by the class name and doesn’t need any object
public class variable{

    static String name;
    static int roll_no;
    static void Demo(){
        name = "Pradipta Chatterjee";
        roll_no = 39;
        
    }
    public static void main(String args[]){

        System.out.println("Name of the Student"   +name);
        System.out.println("roll no"   +roll_no);

    }
}