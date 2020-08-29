public class exception_handling {
    public static void main(String args[]) {
        try {
            int arr[] = { 1, 5, 7, 9, 4 };
            System.out.println(arr[10]);
            try {
                int x = arr[2] / 0;
            } catch (Exception e2) {
                System.out.println("divisin with zero is not possible");
            }
        } catch (Exception e1) {
            System.out.println("the array is going out of bound");
        }
    }
}