class practice
{
static void printPattern(char[] s, int n)
{
    
    System.out.println(s);
 
  
    int i = 0, j = n - 1;
    while (i < j)
    {
        char c = s[i];
        s[i] = s[j];
        s[j] = c;
        i++;
        j--;
    }
 
    i = 0;
    j = n - 1;
    while (j - i > 1)
    {
        s[i] = s[j] = '*';
        System.out.println(s);
        i++;
        j--;
    }
}
 
public static void main(String []args)
{
    char[] s = "geeks".toCharArray();
    int n = s.length;
 
    printPattern(s, n);
}
}
