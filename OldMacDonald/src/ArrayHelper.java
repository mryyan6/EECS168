
public class ArrayHelper {
	public void print2DArray(int[][] array)
	{
		System.out.println("Here is your array");
		System.out.print("[");
		for(int i=0; i< array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				System.out.println(array[i][j]);
			}
		}
	}

}
