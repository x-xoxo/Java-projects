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
			System.out.print("������ �Է��ϼ���: ");
			num = sc.nextInt();
			if (!(num > 0))
			{
				System.out.println("Error: �߸��� �Է��Դϴ�.");
			}
			else if (num == 0)
			{
				System.out.println("���α׷��� �����մϴ�.");
			}
			else
			{
				System.out.print(num + "�� �����");
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
