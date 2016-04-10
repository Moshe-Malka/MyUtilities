package moshemalka.com;

public class q1 
{
	public static void main(String args[])
	{
		int[] array1 = {1,2,3,4,5,6,7,8,9};
		int[] array2 = {10,11,12,13,14,15};
		 
		q1 q = new q1();
		System.out.println(q.rule(array1, array2));
	}
	public boolean rule(int[] arr1, int[] arr2 )
	{
		boolean temp = true;
		for (int i = 0; i < arr1.length; i++)
		{
			System.out.print(arr1[i] + " > " + arr2[i] + " ? ");
			System.out.println();
			if (arr1[i] < arr2[i])
			{
				return false;
			}
		}
		return temp;
	}

}