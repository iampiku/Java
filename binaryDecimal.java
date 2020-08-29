import java.util.Scanner;

public class binaryDecimal {
  public static int binaryToDecimal(int binary) {
    int power = 0;
    int decimal = 0;
    if (binary == 0)
      return 0;
    while (binary > 0) {
      int temp = binary % 10;
      decimal += temp * Math.pow(2, power);
      binary = binary / 10;
      power++;
    }
    return decimal;
  }

  public static void main(String[] args) {
    var scan = new Scanner(System.in);
    int binary = scan.nextInt();
    System.out.print(binaryToDecimal(binary));
    scan.close();
  }
}