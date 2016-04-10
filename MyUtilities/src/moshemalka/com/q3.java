package moshemalka.com;
public class q3 
{
	public static void main (String args[])
	{
		int[][] matrixTest = {{1,2,3} , {4,5,6} , {7,8,9}};
		System.out.println(snake(matrixTest));
	}

	public static boolean snake(int[][]matrix)
	{
		boolean temp = true;
		for (int i = 0; i < matrix.length-1; i++) 
		{
			for (int j = 0; j < matrix.length; j++) 
			{	

				if (i%2==0)
				{
					if (matrix[i][j] > matrix[i][j+1] && matrix[i][matrix.length-1]>matrix[i+1][matrix.length-1])
					{
						temp = false;
					}
				}
				else 
					if(matrix[i][j] < matrix[i][j+1] && matrix[i][0]> matrix[i+1][0]) 
					{
						temp = false;
					}

				}
			}
		
		return temp;
	}
}