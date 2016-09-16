package contest1;

import java.util.Scanner;

public class Main
{

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    //Test 1
    System.out.println("Enter 1st Test Input:");
    System.out.println("(The output will show after all 3 parts of the input are entered)");
    int a1 = sc.nextInt();
    int a2 = sc.nextInt();
    int a3 = sc.nextInt();
    System.out.print(decimalToBinary(a1) + " ");
    System.out.print(decimalToBinary(a2) + " ");
    System.out.print(decimalToBinary(a3));
    System.out.print(" and ");
    permissions(decimalToBinary(a1));
    permissions(decimalToBinary(a2));
    permissions(decimalToBinary(a3));
    System.out.println();
    
    //Test 2
    System.out.println("\nEnter 2nd Test Input: ");
    System.out.println("(The output will show after all 3 parts of the input are entered)");
    int b1 = sc.nextInt();
    int b2 = sc.nextInt();
    int b3 = sc.nextInt();
    System.out.print(decimalToBinary(b1) + " ");
    System.out.print(decimalToBinary(b2) + " ");
    System.out.print(decimalToBinary(b3));
    System.out.print(" and ");
    permissions(decimalToBinary(b1));
    permissions(decimalToBinary(b2));
    permissions(decimalToBinary(b3));
    System.out.println();
    
    //Test 3
    System.out.println("\nEnter 3rd Test Input: ");
    System.out.println("(The output will show after all 3 parts of the input are entered)");
    String c1 = sc.next();
    String c2 = sc.next();
    String c3 = sc.next();
    binaryToDecimal(c1);
    binaryToDecimal(c2);
    binaryToDecimal(c3);
    System.out.print(" and ");
    permissions(c1);
    permissions(c2);
    permissions(c3);
    System.out.println();
    
    //Test 4
    System.out.println("\nEnter 4th Test Input: ");
    System.out.println("(The output will show after all 3 parts of the input are entered)");
    String d1 = sc.next();
    String d2 = sc.next();
    String d3 = sc.next();
    binaryToDecimal(d1);
    binaryToDecimal(d2);
    binaryToDecimal(d3);
    System.out.print(" and ");
    permissions(d1);
    permissions(d2);
    permissions(d3);
    System.out.println();
    
    //Test 5
    System.out.println("\nEnter 5th Test Input: ");
    System.out.println("(The output will show after all 3 parts of the input are entered)");
    String e1 = sc.next();
    String e2 = sc.next();
    String e3 = sc.next();
    binaryToDecimal(permissionsToBinary(e1));
    binaryToDecimal(permissionsToBinary(e2));
    binaryToDecimal(permissionsToBinary(e3));
    System.out.print(" and ");
    System.out.print(permissionsToBinary(e1) + " ");
    System.out.print(permissionsToBinary(e2) + " ");
    System.out.print(permissionsToBinary(e3));
    sc.close();
  }
  
  //Changes the value of each decimal digit into binary
  public static int digit(int x, int digit) {
    x = (int) ((x/Math.pow(10,digit-1)) % 10);
    return x;
  }
  
  //Formats and prints the binary values
  public static String decimalToBinary(int x) {
    String result = String.format("%3s",Integer.toBinaryString(digit(x,1))).replace(' ', '0');
    return result;
  }
  
  //Changes the binary values into decimal values and prints the decimal values
  public static void binaryToDecimal(String x) {
    System.out.print(Integer.parseInt(x,2));
  }
  
  //Determines permissions based on binary
  public static void permissions(String n) {
    int r = 0;
    int w = 0;
    int x = 0;
    int i = Integer.valueOf(n);
    
    switch(i) {
    case 000:
      r = 0;
      w = 0;
      x = 0;
      break;
    case 1:
      r = 0;
      w = 0;
      x = 1;
      break;
    case 10:
      r = 0;
      w = 1;
      x = 0;
      break;
    case 11:
      r = 0;
      w = 1;
      x = 1;
      break;
    case 100:
      r = 1;
      w = 0;
      x = 0;
      break;
    case 101:
      r = 1;
      w = 0;
      x = 1;
      break;
    case 110:
      r = 1;
      w = 1;
      x = 0;
      break;
    case 111:
      r = 1;
      w = 1;
      x = 1;
      break;
    }

    if(r == 1) {
      System.out.print("r");
    } else {
      System.out.print("-");
      }
    
    if(w == 1) {
      System.out.print("w");
    } else {
      System.out.print("-");
    }
    
    if(x == 1) {
      System.out.print("x ");
    } else {
      System.out.print("- ");
    }
  }
  
  public static String permissionsToBinary(String x) {
      String string1 = x.replace('r' , '1');
      String string2 = string1.replace('w', '1');
      String string3 = string2.replace('x', '1');
      String result = string3.replace('-', '0');
    
    return result;
  }
  
}
