package moshemalka.com;
import java.util.Scanner;

public class q4 {
	private final int MAX_SIZE;			//size of stack array
	private char[] stackArray;
	private int top;					//top of stack
	//constructor
	public q4(int s) 
	{
		MAX_SIZE = s;                        //set array size
		stackArray = new char[MAX_SIZE];   // create array
		top = -1;							//no items yet
	}
	//put item on top of stack
	public void push(char j)    
	{
		stackArray[++top] = j;
	}
	//take item from top of stack
	public char pop()                   
	{
		char temp = stackArray[top];
		top--;
		return temp;
	}
	//peek at top of stack
	public char peek()                   
	{
		return stackArray[top];
	}
	//true if stack is empty
	public boolean isEmpty()                 
	{
		return (top==-1);
	}
	//true if stack is full
	public boolean isFull()                  
	{
		return (top==-1);
	}
	
	
	public static void main (String args[])
	{
		System.out.println("please enter a word:");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		in.close();
		q4 myStack = new q4(input.length());
		
//		char[] reverse = new char[theStack.MAX_SIZE];
		
		for (int i = 0; i < input.length(); i++) 
		{
			myStack.push(input.charAt(i));
		}
		
		for (int i = 0; i < input.length(); i++) 
		{
			System.out.print(myStack.pop());
		}
	}
}
