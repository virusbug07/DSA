import java.util.*; 
public class main {  
    public static int firstRepeatingElement(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return i;
                }
            }
        }
        return -1;
    }
