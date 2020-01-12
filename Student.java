class database{ // program to demostrate the working of multiple inheritance in java;
    private String name;
    private int Roll_no;
    void get_data(String name,int roll){
        this.name = name;
        Roll_no = roll;
    }
    void display_Student(){
        System.out.println("Name of the Student" +" "+ name);
        System.out.println("roll no of the student" +" "+ Roll_no);
    }
}
class marks extends database{
    protected int mark_1;
    protected int mark_2;
    void get_marks (int a,int b){
        mark_1 = a;
        mark_2 = b;
    }
    void display_marks(){
        System.out.println("mark of maths" +" "+ mark_1);
        System.out.println("mark of eng" +" "+ mark_2);
    }
}
class result extends marks{
    protected int result;
    void get_result(){
        result = super.mark_1+super.mark_2;
    }
    void display_result(){
        if(result > 70){
            System.out.println("pass" +" "+ result);
        }else{
            System.out.println("failed try again");
        }
    }
}
public class Student{
    public static void main(String args[]){
        result ob = new result();
        ob.get_data("Pradipta Chattejee", 39);
        ob.display_Student();
        ob.get_marks(39,38);
        ob.display_marks();
        ob.get_result();
        ob.display_result();
    }
}
