package Day7;

public class Practice 
{

	public static void main(String[] args) 
	{
		//example 3-10
//		double score[][] = {{3.3, 3.4},{3.5, 3.6},{3.7, 4.0},{4.1, 4.2}};
//		double sum = 0;
//		for(int year=0; year<score.length; year++)
//		{
//			for(int term=0; term<score[year].length; term++)
//			{
//				sum += score[year][term];
//			}
//		}
//		int n = score.length;
//		int m = score[0].length;
//		System.out.println("4년 전체 평점 평균은 "+sum/(n*m));
		int intArray[][] = new int[4][];
		intArray[0] = new int[3];
		intArray[1] = new int[2];
		intArray[2] = new int[3];
		intArray[3] = new int[2];
		
		for(int i=0; i<intArray.length; i++)
		{
			for(int j=0; j<intArray[i].length; j++)
			{
				intArray[i][j] = (i+1)*10+j;
			}
		}
		for(int i=0; i<intArray.length; i++)
		{
			for(int j=0; j<intArray[i].length; j++)
			{
				System.out.print(intArray[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
