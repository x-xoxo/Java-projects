package Day4;

import java.util.Scanner;

public class test 
{

	public static void main(String[] args) 
	{
		// Q5.
		Scanner sc = new Scanner(System.in);
		boolean inputExit = false; // ���� Ʈ���� ����
		while (inputExit == false) // ���� Ʈ���� �߻����� �ݺ�
		{
			System.out.println("----------------");
			System.out.println("1.���ϴ� ������ ���");
			System.out.println("2.��ü ������ ���");
			System.out.println("3.����");
			int inputNum = sc.nextInt(); // ���� �Է¹ޱ�
			switch (inputNum) // �Է¹��� ������ ���� �б�
			{
				case 1:
					System.out.print("����ϱ� ���ϴ� ���� �Է��ϼ��� : ");
					int mulTableNum = sc.nextInt(); // ���� �Է� �޾� mulTableNum �� ����
					if (mulTableNum < 2 || mulTableNum > 9) // �Է��� ���� 2~9 �� �ƴҰ�� ���� �޽���
					{
						System.out.println("Error: �߸� �Է��Ͽ����ϴ�.");
					} 
					else // �Է��� ���� 2~9�� ��� �Է��� �� ���
					{
						System.out.println("----------------------------------");
						for (int i = 1; i < 10; i++) 
						{
							System.out.println(mulTableNum + "X" + i + "=" + (mulTableNum * i));
						}
					}
					break;
				case 2:
					System.out.println("----------------------------------");
					for (int i = 1; i < 10; i++) // 2��~5�� �������η� ���
					{
						for (int k = 2; k < 6; k++) 
						{
							System.out.print(k + "X" + i + "=" + (k * i) + "\t");
						}
						System.out.println(); 
					}
					System.out.println("----------------------------------");
					for (int i = 1; i < 10; i++) // 6��~9�ܱ��� ���η� ���
					{
						for (int k = 6; k < 10; k++) 
						{
							System.out.print(k + "X" + i + "=" + (k * i) + "\t");
						}
						System.out.println();
					}
					break;
				case 3:
					System.out.println("----------------------------------");
					System.out.println("�����մϴ�.");
					inputExit = true; // ���� Ʈ���� �߻�
					break;
				default:
					System.out.println("----------------------------------");
					System.out.println("Error: �߸� �Է��Ͽ����ϴ�.");
					break;
			}
		}
		sc.close();
	}
}
