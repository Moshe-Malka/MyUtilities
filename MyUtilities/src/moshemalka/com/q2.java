package moshemalka.com;

public class q2 
{
	public static void main (String args[])
	{
		int[] arr1 = {1,2,3,4,5,6,70,8,9};
		int[] arr2 = {10,11,1,13,14,55};
		
		q2 q = new q2();
		System.out.println(q.diff(arr1));
		System.out.println(q.diff(arr2));
	}
	public int diff(int[] arr)
	{
		int temp = -1;
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length; j++) {
				if (Math.abs(arr[i]-arr[j])>temp)
				{
					temp = Math.abs(arr[i]-arr[j]);
				}
			}
		}
		return temp;
	}
}
