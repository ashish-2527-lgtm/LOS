package matrix;

public class MatrixPractice {

	public static void main(String[]args)
	{
		for(int i=1; i<=3; i++)
		{
			for(int l=1; l<=3; l++)
			{
				if(i==l || i+l==4 ) //if you acquire all row and column then use || and if you acquire specific object then use &&
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
