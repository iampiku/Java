import java.util.Scanner;
import java.util.Vector;

class demo {

      Scanner br = new Scanner(System.in);
      // create default vector of capacity 10
      Vector<Integer> v = new Vector<Integer>();

      // inesrting elements in the vector;
      public void get_data() {
            System.out.println("Enter the number of elements of vector you want to enter ");
            int n = br.nextInt();
            System.out.println("Enter the elements of the vector");
            for (int i = 0; i < n; i++) {
                  int num = br.nextInt();
                  v.add(num);
            }
      }

      // display all the element of the vector;
      public void initial_display() {
            System.out.println(v);
      }

      // Search performed in vector;
      public void search() {
            System.out.print("Enter the element you want to search ");
            int find = br.nextInt();
            if (v.contains(find)) {
                  System.out.println("Searched elements in the array");
            } else {
                  System.out.println("Not found");
            }
      }

      // inceasing the capacity of the vector;
      public void Capacity_vector() {
            v.ensureCapacity(25);
            // will display the capacity of the vector as output;
            System.out.println("Capacity of the array" + " " + v.capacity());
      }

      // extract an elements of the vector of a user specified index;
      public void get_element() {
            System.out.print("Enter the index of the element you need ");
            int num = br.nextInt();
            System.out.println("Elemenet of index" + " " + num + " " + "is" + " " + v.get(num));
      }

      // extract the index of the given element in the vector;
      public void get_index() {
            System.out.print("Enter the element who's index is needed ");
            int num = br.nextInt();
            System.out.println("Index of the element is" + " " + v.indexOf(num));
      }

      // removing element of the given index;
      public void remove_index() {
            System.out.print("Enter the index of the element you want to remove ");
            int num = br.nextInt();
            v.remove(num);
            System.out.println("Vector after removing element" + " " + v);
      }

      // check the size of the vector;
      public void check_size() {
            System.out.println("Size of the vector " + " " + v.size());
      }

      // remove element of the vector;
      public void remove_element() {
            System.out.println("Enter the elementc you want to delete from the vector ");
            int num = br.nextInt();
            v.removeElement(num);
            System.out.println("new Vector " + v);
      }

      // inserting an element in the vector;
      public void insert() {
            System.out.println("Enter the element you want to insert in the vector ");
            int num = br.nextInt();
            System.out.println("Enter the index at which you want to insert the element ");
            int index = br.nextInt();
            v.insertElementAt(num, index);
            System.out.println(v);
      }

      // check whether the vector is empty or not;
      public boolean check_empty() {
            if (v.isEmpty()) {
                  return true;
            } else {
                  return false;
            }
      }

}

public class Vector_demo {
      public static void main(String args[]) {
            demo ob = new demo();
            ob.get_data();
            ob.initial_display();
            ob.search();
            ob.Capacity_vector();
            ob.get_element();
            ob.get_index();
            ob.remove_index();
            ob.check_size();
            ob.remove_element();
            ob.insert();
            ob.check_empty();
      }
}