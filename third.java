public class Main
{
  public static void main (String[]args)
  {

  int[] inputArray = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

  for (int i = 0; i < inputArray.length; i++)
    {
    int element = inputArray[i];
    if (element % 2 == 0)
      {
      System.out.println (element);
      }
    }


  }
}
