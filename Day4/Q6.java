package Day4;

public class Q6 {

	public static void main(String[] args) 
	{
//		Q.6-1
//		for (int i=0; i<5; i++)
//		{
//			for(int o=0; o<5; o++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		Q.6-2
//		for (int i=1; i<=5; i++)
//		{
//			for(int o=1; o<=i; o++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		Q.6-3
//		for (int i=0; i<5; i++)
//			{
//				for(int o=4; o>=0; o--)
//				{
//					if(i<o)
//					{
//						System.out.print(" ");
//					}
//					else
//					{
//						System.out.print("*");
//					}
//				}
//				System.out.println();
//			}
//		Q.6-4
//		for (int i=0; i<5; i++)  // 5줄까지 반복
//		{
//			for (int x=0; x<4-i; x++) // 1번째 줄엔 공백 4칸 2번째 줄엔 공백 3칸
//			{
//				System.out.print(" ");
//			}
//			for (int y=0; y<2*i+1; y++) // 줄에맞는 '*' 출력 ex) 1번째 줄 * 두번째 줄 ***
//			{
//				System.out.print("*");
//			}
//			System.out.println(); // 한줄의 끝, 개행
//		}
//		Q.6-5
		for (int i=0; i<5; i++)
		{
			if (i<3)
			{
				for (int y=0; y<2-i;y++)
				{
					System.out.print(" ");
				}
				for (int z=0; z<2*i+1; z++)
				{
					System.out.print("*");
				}
				System.out.println();
				}
			else
			{
				for (int z=0; z<i-2;z++)
				{
					System.out.print(" ");
				}
				for (int y=6; y>i*2-3; y--)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
