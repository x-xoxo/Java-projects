package Day1;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		/*
		 * System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���"); Scanner sc =
		 * new Scanner(System.in);
		 * 
		 * String name = sc.next(); // ���ڿ� �б� System.out.print("�̸��� " + name + ", ");
		 * 
		 * String city = sc.next(); // ���ڿ� �б� System.out.print("���ô� " + city + ", ");
		 * 
		 * int age = sc.nextInt(); // ���� �б� System.out.print("���̴� " + age + "��, ");
		 * 
		 * double weight = sc.nextDouble(); // �Ǽ� �б� System.out.print("ü���� " + weight +
		 * "kg, ");
		 * 
		 * boolean isSingle = sc.nextBoolean(); // ���� �б� System.out.print("���� ���δ� " +
		 * isSingle + "�Դϴ�. "); sc.close(); // sc ��ü �ݱ�
		 */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.print("������ �Է��ϼ���: "); int time = sc.nextInt(); int second = time %
		 * 60; int minute = (time / 60) % 60; int hour = (time / 60) / 60;
		 * 
		 * System.out.print(time + "�ʴ� "); System.out.print(hour + "�ð�, ");
		 * System.out.print(minute + "��, "); System.out.println(second + "���Դϴ�.");
		 * sc.close();
		 */

		/*
		 * System.out.println('a' > 'b'); System.out.println(3 >= 2);
		 * System.out.println(-1 < 0); System.out.println(3.45 <= 2);
		 * System.out.println(3 == 2); System.out.println(3 != 2);
		 * System.out.println(!(3 != 2));
		 * 
		 * System.out.println((3 > 2) && (3 > 4)); System.out.println((3 != 2) || (-1 >
		 * 0)); System.out.println((3 != 2) ^ (-1 > 0));
		 */
		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("������ �Է��Ͻÿ�: "); int
		 * score = sc.nextInt(); if (score >= 80) { System.out.print("�����մϴ�! �հ��Դϴ�."); }
		 * sc.close();
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է��Ͻÿ�: ");
		int number = sc.nextInt();
		if (number % 3 == 0) {
			System.out.println("3�� ����Դϴ�.");
		} else {
			System.out.println("3�� ����� �ƴմϴ�.");
		}
		sc.close();
	}
}