class Bank {
    private String name;

    Bank(String name) {
        this.name = name;
    }

    public String getBankName() {
        return this.name;
    }
}

class Employee {
    private String name;

    Employee(String name) {
        this.name = name;
    }

    public String getEmployeeName() {
        return this.name;
    }
}

public class Association {
    public static void main(String args[]) {
        Bank ob = new Bank("ICICI");
        Employee obj = new Employee("Pradipta Chatterjee");
        System.out.println(obj.getEmployeeName() + " " + "is the employee of" + " " + ob.getBankName());
    }
}