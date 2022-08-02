// Java program to find the
// sum in given range L to R
import java.util.*;
 
class SumInRange{
     
// Function to find the sum
// within the given range
public static int findSum(int L, int R)
{
    ArrayList<Integer> arr = new ArrayList<>();
 
    // Generating array from given sequence
    int i = 0;
    int n = 5;
    while (i <= R)
    {
        arr.add(i + n);
 
        if (i + 1 <= R)
            arr.add(i + 1 + n);
 
        n *= -1;
 
        i += 2;
    }
 
    // Calculate the desired sum
    int sum = 0;
 
    for(i = L; i <= R; ++i)
       sum += arr.get(i);
 
    // return the sum
    return sum;
}
 
// Driver code
public static void main(String[] args)
{
     
    // Initialize the range
    int L = 0, R = 10;
 
    System.out.println(findSum(L, R));
}
}