package Day2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

//		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
//		Scanner sc = new Scanner(System.in);
//
//		String name = sc.next(); // ���ڿ� �б�
//		System.out.print("�̸��� " + name + ", ");
//
//		String city = sc.next(); // ���ڿ� �б�
//		System.out.print("���ô� " + city + ", ");
//
//		int age = sc.nextInt(); // ���� �б�
//		System.out.print("���̴� " + age + "��, ");
//
//		double weight = sc.nextDouble(); // �Ǽ� �б�
//		System.out.print("ü���� " + weight + "kg, ");
//
//		boolean isSingle = sc.nextBoolean(); // ���� �б�
//		System.out.print("���� ���δ� " + isSingle + "�Դϴ�. ");
//		sc.close(); // sc ��ü �ݱ�
//
//		Scanner sc = new Scanner(System.in);

//		System.out.print("������ �Է��ϼ���: ");
//		int time = sc.nextInt();
//		int second = time % 60;
//		int minute = (time / 60) % 60;
//		int hour = (time / 60) / 60;
//
//		System.out.print(time + "�ʴ� ");
//		System.out.print(hour + "�ð�, ");
//		System.out.print(minute + "��, ");
//		System.out.println(second + "���Դϴ�.");
//		sc.close();
//
//		System.out.println('a' > 'b');
//		System.out.println(3 >= 2);
//		System.out.println(-1 < 0);
//		System.out.println(3.45 <= 2);
//		System.out.println(3 == 2);
//		System.out.println(3 != 2);
//		System.out.println(!(3 != 2));
//
//		System.out.println((3 > 2) && (3 > 4));
//		System.out.println((3 != 2) || (-1 > 0));
//		System.out.println((3 != 2) ^ (-1 > 0));
//
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("������ �Է��Ͻÿ�: "); int score = sc.nextInt(); if (score >= 80) {
//		System.out.print("�����մϴ�! �հ��Դϴ�."); } 
//		sc.close();
//		 

//		Scanner sc = new Scanner(System.in);

//		char grade;
//		System.out.print("������ �Է��ϼ���(0~100): ");
//		int score = sc.nextInt();
//		switch (score / 10) {
//		case 10:
//		case 9:
//			grade = 'A';
//			break;
//		case 8:
//			grade = 'B';
//			break;
//		case 7:
//			grade = 'C';
//			break;
//		case 6:
//			grade = 'D';
//			break;
//		default:
//			grade = 'F';
//		}
//		System.out.println("������ " + grade + "�Դϴ�.");
//
//		sc.close();

//		Scanner sc = new Scanner(System.in);
//		System.out.print("������ �Է��ϼ���(0~100): ");
//		int score = sc.nextInt();
//		System.out.print("�г��� �Է��ϼ���(1~4): ");
//		int year = sc.nextInt();
//		
//		if(score >= 60) {
//			if(year != 4) {
//				System.out.println("�հ�!");
//			}
//			else if(score >= 70) {
//				System.out.println("�հ�!");
//			}
//			else
//				System.out.println("���հ�!");
//		}
//		else {
//			System.out.println("���հ�!");
//		}
//		sc.close();

//		Q1.
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("���� �Է����ּ���(1~12): ");
//		int month = sc.nextInt();
//		System.out.print("�µ��� �Է����ּ���(-15~37): ");
//		int temp = sc.nextInt();
//		boolean validate1;
//		boolean validate2;
//		if (month >= 1 && month <= 12)
//		{
//			validate1 = true;
//		}
//		else
//		{
//			validate1 = false;
//		}
//		if (temp >= -15 && temp <= 37)
//		{
//			validate2 = true;
//		}
//		else
//		{
//			validate2 = false;
//		}
//		if(validate1 && validate2)
//		{
//			if(month >= 3  && month <= 5)
//			{
//				if(temp >= 3 && temp <= 15)
//				{
//					System.out.println("������ ���Դϴ�. �µ��� " + temp + "�� �Դϴ�.");
//				}
//				else
//				{
//					System.out.println("������ �µ��� ���� �ʽ��ϴ�.");
//				}
//			}
//			else if(month >= 6  && month <= 8)
//			{
//				if(temp >= 18 && temp <= 37)
//				{
//					System.out.println("������ �����Դϴ�. �µ��� " + temp + "�� �Դϴ�.");
//				}
//				else
//				{
//					System.out.println("������ �µ��� ���� �ʽ��ϴ�.");
//				}
//			}
//			else if(month >= 9  && month <= 11)
//			{
//				if(temp >= 3 && temp <= 15)
//				{
//					System.out.println("������ �����Դϴ�. �µ��� " + temp + "�� �Դϴ�.");
//				}
//				else {
//					System.out.println("������ �µ��� ���� �ʽ��ϴ�.");
//				}
//			}
//			else
//			{
//				if(temp >= -15 && temp <= 2)
//				{
//					System.out.println("������ �ܿ��Դϴ�. �µ��� " + temp + "�� �Դϴ�.");
//				}
//				else
//				{
//					System.out.println("������ �µ��� ���� �ʽ��ϴ�.");
//				}
//			}
//		}
//		else
//		{
//			System.out.println("�߸��� �Է��Դϴ�.");
//		}
//		sc.close();
//		Q2.
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է����ּ���: ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է����ּ���: ");
		int num2 = sc.nextInt();
		System.out.print("�����ڸ� �Է����ּ���: ");
		String operator = sc.next();
//		switch (operator)
//		{
//		case "+":
//			System.out.println("�����: " + (num1+num2) + " �Դϴ�.");
//			break;
//		case "-":
//			System.out.println("�����: " + (num1-num2) + " �Դϴ�.");
//			break;
//		case "*":
//			System.out.println("�����: " + (num1*num2) + " �Դϴ�.");
//			break;
//		case "/":
//			System.out.printf("�����: %.2f �Դϴ�.\n", (float)((float)num1/(float)num2));
//			break;
//
//		default:
//			System.out.println("�߸��� ������ �Դϴ�.");
//			break;
//		}
		if (operator.equals("+"))
		{
			System.out.println("�����: " + (num1+num2) + " �Դϴ�.");
		}
		else if (operator.equals("-"))
		{
			System.out.println("�����: " + (num1-num2) + " �Դϴ�.");
		}
		else if (operator.equals("*"))
		{
			System.out.println("�����: " + (num1*num2) + " �Դϴ�.");
		}
		else if (operator.equals("/"))
		{
			System.out.println("�����: " + (float)((float)num1/(float)num2) + " �Դϴ�.");
		}
		sc.close();
	}
}