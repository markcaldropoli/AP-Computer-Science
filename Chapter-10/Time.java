public class Time
{
  private int hours;
  private int mins;
  
  public Time(int h, int m) {
    if(h >= 0 && h <= 24) {
      hours = h;
    } else {
      throw new IllegalArgumentException("The hour is not between 0 and 24");
    }
    if(m >= 0 && m <= 60) {
      mins = m;
    } else {
      throw new IllegalArgumentException("The minute is not between 0 and 60");
    }
  }
  
  private int toMins() {
    return (hours * 60) + mins;
  }
  
  public boolean lessThan(Time t) {
    if(this.toMins() <= t.toMins()) {
      return true;
    }
    return false;
  }
  
  public int elapsedSince(Time t) {
    int timeElapsed = this.toMins() - t.toMins();
    if(timeElapsed < 0) {
      return Math.abs(timeElapsed) + ((24*60) - (t.toMins() - (this.toMins() + timeElapsed)));
    }
    return timeElapsed;
  }
  
  public String toString() {
    return hours+":"+mins;
  }
}
