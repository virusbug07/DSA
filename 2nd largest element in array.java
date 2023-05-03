import java.util.*;
class problem{
 
static void print2largest(int arr[],
                          int arr_size)
{
  int i, first, second;
 

  if (arr_size < 2)
  {
    System.out.printf(" Invalid Input ");
    return;
  }
 
  Arrays.sort(arr);
 
 
  for (i = arr_size - 2; i >= 0; i--)
  {
    
    if (arr[i] != arr[arr_size - 1])
    {
      System.out.printf("The second largest " +
                        "element is %d\n", arr[i]);
      return;
    }
  }
 
  System.out.printf("There is no second " +
                    "largest element\n");
}
