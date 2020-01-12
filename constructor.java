class constructor{
    int a;
    String name;
    constructor(){
        // default constructor example;
        name = "Pardipta Chatterjee";
        a = 21;
        System.out.println("The default constructor");
    }
    public static void main(String args[]){
        constructor ob = new constructor();
        System.out.println("My age is " +ob.a);
        System.out.println("My name is " +ob.name);
    }
}