public class Stack 
{ 
    	static final int MAX = 1000; 
    	int top; 
    	String arr[] = new String[MAX];  
  	boolean isEmpty() 
    	{ 
        		return (top < 0); 
    	} 
    	Stack() 
    	{ 
        		top = -1; 
    	} 
  	boolean push(String x) 
    	{ 
  		if (top >= (MAX-1)) 
		{ 
    			System.out.println("Stack Overflow"); 
    			return false; 
		} 
		else
		{ 
    			arr[++top] = x; 
    			System.out.println(x + " pushed into stack"); 
    			return true; 
		} 
} 
String pop() 
{ 
		if (top < 0) 
		{ 
    			System.out.println("Stack Underflow"); 
    			return "Nothing is"; 
		} 
		else
		{ 
    			String x = arr[top--]; 
    			return x; 
		} 
} 

public static void main(String args[])
{
		Stack s = new Stack(); 
		s.push("Horse"); 
		s.push("Cat"); 
		s.push("Dog"); 
		System.out.println(s.pop() + " Popped from stack"); 
}
    	}
  		
    	