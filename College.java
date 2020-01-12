// constructors are used to assign values to the class variables at the time of object creation, either explicitly done by the programmer or by Java itself (default constructor)
public class College{

    String name; // initializing instance variable
    long roll_no;
    int student_age;
    long student_id;

        College(){ // default constructor
            name = "Pradipta chatterjee";
            roll_no = 7040;
            student_age = 20;
            student_id = 40;
        }

        College(long num1,int num2, long num3, String str){ // parameterized constructor
            roll_no = num1;
            student_age = num2;
            student_id = num3;
            name = str;
        }

        public long getstudent_id(){ 
            return student_id;
        }

        public void getstudent_id(long student_id){
            this.student_id = student_id; // "this" keyword tell's the compiler the diffrence between instance variable and local variable
        }

        public long getroll_no(){
            return roll_no;
        }

        public void getroll_no(long roll_no){
            this.roll_no = roll_no;
        }

        public String getname(){
            return name;
        }

        public void getname(String name){
            this.name = name;
        }

        public int getage(){
            return student_age;
        }

        public void getage(int student_age){
            this.student_age = student_age;
        }

public static void main(String args[]){ // main fuction
         
            College ob = new College(); // object created to call the default constructor of the class
            System.out.println("Student's name" +" "+ ob.getname());
            System.out.println("roll no" +" "+ ob.getroll_no());
            System.out.println("Student's age" +" "+ ob.getage());
            System.out.println("College id number" +" "+ ob.getstudent_id());
            
            College obj = new College(7041,20,0025,"Indranil Dutta");
            System.out.println("Student's name" + obj.getname());
            System.out.println("roll no" + obj.getroll_no());
            System.out.println("Student's age" + obj.getage());
            System.out.println("College id number" + obj.getstudent_id());

    }
}