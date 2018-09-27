/*
  This code will produce a NumberFormatException error. However if you run it in the debugger and use Set Value on invalid...
  CNA337
  Zachary Rubin zrubin@rtc.edu
*/

public class SetValue {
  public static void main(String[] args) {

    String invalid = "turnip";
    // This causes a NumberFormatException.
    int result = Integer.parseInt(invalid);
    System.out.println("The number is: " + result);
  }
}
