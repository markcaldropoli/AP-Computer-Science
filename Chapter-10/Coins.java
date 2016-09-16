import java.util.Scanner;

public class Coins
{
  private int quarter = 25;
  private int dime = 10;
  private int nickel = 5;
  private int penny = 1;
  
  public Coins(int amount) {
    quarter = amount/25;
    dime = (amount - (quarter * 25))/10;
    nickel = (amount - ((quarter * 25) + (dime * 10)))/5;
    penny = (amount - ((quarter * 25) + (dime * 10) + (nickel * 5)));
  }
  
  public int getQuarters() {
    return quarter;
  }
  
  public int getDimes() {
    return dime;
  }
  
  public int getNickels() {
    return nickel;
  }
  
  public int getPennies() {
    return penny;
  }
  
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount of cents");
    int amount = sc.nextInt();
    Coins c = new Coins(amount);
    System.out.println("The amount of quarters is " + c.getQuarters());
    System.out.println("The amount of dimes is " + c.getDimes());
    System.out.println("The amount of nickels is " + c.getNickels());
    System.out.println("The amount of pennies is " + c.getPennies());
    sc.close();
  }
}
