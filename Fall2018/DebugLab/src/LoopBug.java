/*
  The loop should print Count every iteration, but only prints at the end..
  CNA337
  Zachary Rubin zrubin@rtc.edu
*/
public class LoopBug
{
  public static void main(String[] args)
  {
    // Declare the variable.
    int Count;
    // Create the loop.
    for (Count=1; Count<10; Count++) ;
    {
      // Output the result.
      System.out.println("Count is " + Count);
    }
  }
}