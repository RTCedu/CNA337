/*
  Shows stepping into vs stepping over
  CNA337
  Zachary Rubin zrubin@rtc.edu
*/

import java.util.*;

public class StepIntoStepOver
{
  public static void main(String[] args)
  {
    int n = 10;
    countdown(n);
    countdown2(n);
  }

  public static int countdown(int num)
  {
    while(num >= 0)
    {
      System.out.println(num);
      num--;
    }
    return 0;
  }

  public static int countdown2(int number)
  {
    for(int i = number; i <= number; i--)
    {
      System.out.println(number);
      number--;
    }
    return 0;
  }
}
