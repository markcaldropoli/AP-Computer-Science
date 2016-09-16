public class Exercise5
{
  public double totalWages(double hours, double rate) {
    double wages = 0;
    if (hours <= 40) {
      wages = hours * rate;
    } else if(hours > 40) {
      double regularHours = 40;
      double overtimeHours = hours - 40;
      double regularPay = regularHours * rate;
      double overtimePay = overtimeHours * (rate * 1.5);
      wages = regularPay + overtimePay;
    }
    
    return wages;
  }
}
