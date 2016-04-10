package moshemalka.com;
import java.util.LinkedList;


/**
 * @author משה
 *
 */
public class q5 
{
	public static void main(String[] args)
	{	

		int[] array1 = {5,1,9};
		int[] array2 = {1,7,3,9,11};
		System.out.println(uniun(array1,array2));

	}

	public static LinkedList<Integer> uniun(int[] Arr1, int[] Arr2)
	{
		LinkedList<Integer> stack1 = new LinkedList<Integer>();	// stack from Arr1
		LinkedList<Integer> stack2 = new LinkedList<Integer>();	// stack from Arr2
		LinkedList<Integer> stack3 = new LinkedList<Integer>(); // result stack

		for (int i = 0; i < Arr1.length; i++)
		{
			stack1.addLast(Arr1[i]);
		}
		for (int i = 0; i < Arr2.length; i++)
		{
			stack2.addLast(Arr2[i]);
		}
		
		if (stack1.size()>stack2.size())			//working on stack 2
			while(stack2.size()!=0)
			{
				if (stack1.contains(stack2.peek()))
				{
					stack3.addLast(stack2.getFirst());
				}
				stack2.removeFirst();
			}
		else										////working on stack 1
		{
			while(stack1.size()!=0)
			{
				if (stack2.contains(stack1.peek()))
				{
					stack3.addLast(stack1.getFirst());
				}
				stack1.removeFirst();
			}
		}
		return stack3;
	}
}