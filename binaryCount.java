
// consecutive ones in binary number;
import java.util.Scanner;

public class binaryCount {
  public static int binaryNumber(int num) {
    if (num <= 0)
      return 0;
    if (num == 1)
      return 1;
    int count = 0, max = 0;
    while (num > 0) {
      int remainder = num % 2;
      if (remainder == 1)
        count++;
      else
        count = 0;
      max = Math.max(count, max);
      num /= 2;
    }
    return max;
  }

  public static void main(String[] args) {
    var scan = new Scanner(System.in);
    int num = scan.nextInt();
    System.out.println(binaryNumber(num));
    scan.close();
  }
}