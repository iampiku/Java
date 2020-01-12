abstract class office{ // abstract class implementetion
    abstract double cal_salary();
}
class abstract_employee{

    String name;
    String position;
    String company_name;
    double salary;
    
    abstract_employee(String name,String position,String company_name,double salary){ // parameterised constructor
        
        this.name = name;
        this.position = position;
        this.company_name = company_name;
        this.salary = salary;

    }
    double cal_salary(){ // final salary calculation
        
        double hr = 0.59;
        double tr = 0.889;
        return (hr*tr*salary);

    }
    void display(){ 
        
        System.out.println("Name of the employee" +" "+ name);
        System.out.println("Position in the company" +" "+ position);
        System.out.println("Name of the company" +" "+ company_name);
        System.out.println("total Salary of the employee" +" "+ cal_salary());
        
    }
}
public class employee{
    public static void main(String args[]){
        abstract_employee ob = new abstract_employee("Pradipta Chatterjee","junior developer","amazon",50000.00);
        abstract_employee obj = new abstract_employee("Manish Kumar Singh","junior developer","amazon",60000.00);
        ob.display();
        obj.display();
    }
}
