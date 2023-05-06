import java.util.*;
import java.lang.*;
import java.io.*;
 
class Array_Rotation
{
 
static void RightRotate(int a[],
                        int n, int k)
{
     
  
    k=k%n;
 
    for(int i = 0; i < n; i++)
    {
        if(i<k)
        {
           
            System.out.print(a[n + i - k]
                             + " ");
        }
        else
        {
         
            System.out.print(a[i - k]
                             + " ");
        }
    }
    System.out.println();
}
