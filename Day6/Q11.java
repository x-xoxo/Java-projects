package Day6;

import java.util.Random;

public class Q11 
{

	public static void main(String[] args) 
	{
		Random rand = new Random();
		int intArray[] = new int[10];
		int max = 0;
		int indexArray[] = new int[10];
		for(int i=0; i<intArray.length; i++)
		{
			intArray[i] = rand.nextInt(11);
			if(intArray[i]>max)
			{
				max = intArray[i];
			}
		}
		for(int i=0; i<intArray.length; i++)
		{
			if(max == intArray[i])
			{
				indexArray[i] = i;
			}
		}
		for(int k : intArray)
		{
			System.out.print(k+" ");
		}
		System.out.println();
		System.out.print("가장 큰 값은 "+max+"이며, ");
		for(int k : indexArray)
		{
			if(k != 0)
			{
				System.out.print(k+1+" ");
			}
		}
		System.out.print("번째 Index입니다.");
	}

}
