package Day4;

import java.util.Scanner;

import java.util.Random;

public class test 
{

	public static void main(String[] args) 
	{
//		Q5.
		Scanner sc = new Scanner(System.in);
		boolean inputExit = false;
		while (inputExit == false)
		{
			System.out.println("1.���ϴ� ������ ���");
			System.out.println("2.��ü ������ ���");
			System.out.println("3.����");
			int inputNum = sc.nextInt();
			switch (inputNum)
			{
			case 1:
				System.out.print("����� ���ϴ� ���� �Է��ϼ��� : ");
				int mulTableNum = sc.nextInt();
				if(mulTableNum < 2 || mulTableNum > 9)
				{
					System.out.println("�߸��� �Է��Դϴ�.");
				}
				else
				{
					for(int i=1; i<10 ; i++)
					{
						System.out.println(mulTableNum+"X"+i+"="+(mulTableNum*i));
					}
				}
				break;
			case 2:
				for(int i=1; i<10; i++)
				{
					for(int k=2; k<6; k++)
					{
						System.out.print(k+"X"+i+"="+(k*i)+"\t");
					}
					System.out.println();
				}
				for(int i=1; i<10; i++)
				{
					for(int k=6; k<10; k++)
					{
						System.out.print(k+"X"+i+"="+(k*i)+"\t");
					}
					System.out.println();
				}
				break;
			case 3:
				System.out.println("�����մϴ�.");
				inputExit = true;
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}
		}
	}
}
