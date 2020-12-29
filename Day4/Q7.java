package Day4;

import java.util.Scanner;

public class Q7 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = 1;
		while (num != 0)
		{
			System.out.print("정수를 입력하세요: ");
			num = sc.nextInt();
			if (!(num > 0))
			{
				System.out.println("Error: 잘못된 입력입니다.");
			}
			else if (num == 0)
			{
				System.out.println("프로그램을 종료합니다.");
			}
			else
			{
				System.out.print(num + "의 약수는");
				for(int x=1; x<=num; x++)
				{
					if (num%x == 0)
					{
						System.out.print(x+" ");
					}
				}
				System.out.println();
			}
		}
		sc.close();
	}
}
