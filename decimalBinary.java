import java.util.Scanner;

public class decimalBinary {
  public static void decimalToBinary(int decimal) {
    if (decimal < 0)
      System.out.println("Number is too small");
    int binary[] = new int[1000];
    int i = 0;
    while (decimal > 0) {
      binary[i] = decimal % 2;
      decimal = decimal / 2;
      i++;
    }
    for (int j = i; j >= 0; j--) {
      System.out.print(binary[j]);
    }
  }

  public static void main(String[] args) {
    var scan = new Scanner(System.in);
    int decimal = scan.nextInt();
    decimalToBinary(decimal);
    scan.close();
  }
}