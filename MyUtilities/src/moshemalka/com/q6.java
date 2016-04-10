package moshemalka.com;
import java.util.LinkedList;

public class q6 
{
	public static void main (String args[])
	{
		LinkedList<Character> list1 = new LinkedList<Character>();
		list1.add('a');
		list1.add('t');
		list1.add('4');
		list1.add('w');
		list1.add('8');
		list1.add('9');
		list1.add('q');
		System.out.println("Unsorted : " + list1);
		sortLinkedList(list1);
		System.out.println("Sorted : " + list1);
	}
	public static void sortLinkedList (LinkedList<Character> l1)
	{
		LinkedList<Character> digits = new LinkedList<Character>();
		LinkedList<Character> letters = new LinkedList<Character>();
		while (!l1.isEmpty())
		{
			if (Character.isDigit(l1.peekFirst()))
			{
				digits.addFirst(l1.getFirst());
				l1.removeFirst();
			}
			else
			{
				letters.addFirst(l1.getFirst());
				l1.removeFirst();
			}
			System.out.println("l1 : " + l1);
			System.out.println("digits : " + digits);
			System.out.println("letters : " + letters);
			System.out.println();
		}
		l1.addAll(letters);
		l1.addAll(digits);
	}
}
