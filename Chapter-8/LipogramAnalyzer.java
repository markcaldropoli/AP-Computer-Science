public class LipogramAnalyzer
{
  private StringBuffer text;
  
  public LipogramAnalyzer(String input) {
    text = new StringBuffer (input.toLowerCase() );
  }
  
  public String mark(char letter) {
    String markedText = text.toString();
    return markedText.replace(letter, '#');
  }
  
  public String allWordsWith (char letter) {
    StringBuffer words = new StringBuffer("");
    String s = " " + text + " ";
    
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == letter) {
        String word = s.substring(s.lastIndexOf(" ", i) + 1, s.indexOf(" ", i));
        if (words.indexOf(word) == -1) {
          words.append(word + '\n');
        }
      }
    }
    
  return words.toString();
  
  }
  
}
