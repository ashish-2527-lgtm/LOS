package matrix;

public class MatrixExtent {

	public static void main(String[]args)
	{
		for(int i=1; i<=7; i++)
		{
			for(int o=1; o<=7; o++)
			{
				if(i==5 && o==5)
				{
					System.out.print(" ^ ");
				}
				else
				{
					System.out.print(" * ");
				}
			}
			System.out.println(); 
		}
	}
}
