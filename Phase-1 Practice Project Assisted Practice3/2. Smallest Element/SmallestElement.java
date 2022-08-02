package Element;

import java.util.*;
 
class SmallestElement {
//Java simple approach to print smallest
//and second smallest element.
 
// Driver Code
public static void main(String args[])
{
    int arr[]={2,4,7,3,1,9};
    int n = arr.length;
   
    // sorting the array using
    // in-built sort function
    Arrays.sort(arr);
   
    // printing the desired element
    System.out.println("Forth smallest element is "+arr[3]);
}
}