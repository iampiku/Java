// example programe to show the working of interface in java;
interface Myclass {
      public void fuction_1();

      public void fuction_2();
}

class myschool implements Myclass {
      public void fuction_1() {
            System.out.println("implementation of fuction 1");
      }

      public void fuction_2() {
            System.out.println("implementation of fuction 2");
      }

      public static void main(String args[]) {
            myschool ob = new myschool();
            ob.fuction_1();
            ob.fuction_2();
      }
}
