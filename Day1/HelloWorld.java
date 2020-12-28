package Day1;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		/*
		 * System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요"); Scanner sc =
		 * new Scanner(System.in);
		 * 
		 * String name = sc.next(); // 문자열 읽기 System.out.print("이름은 " + name + ", ");
		 * 
		 * String city = sc.next(); // 문자열 읽기 System.out.print("도시는 " + city + ", ");
		 * 
		 * int age = sc.nextInt(); // 정수 읽기 System.out.print("나이는 " + age + "살, ");
		 * 
		 * double weight = sc.nextDouble(); // 실수 읽기 System.out.print("체중은 " + weight +
		 * "kg, ");
		 * 
		 * boolean isSingle = sc.nextBoolean(); // 논리값 읽기 System.out.print("독신 여부는 " +
		 * isSingle + "입니다. "); sc.close(); // sc 객체 닫기
		 */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.print("정수를 입력하세요: "); int time = sc.nextInt(); int second = time %
		 * 60; int minute = (time / 60) % 60; int hour = (time / 60) / 60;
		 * 
		 * System.out.print(time + "초는 "); System.out.print(hour + "시간, ");
		 * System.out.print(minute + "분, "); System.out.println(second + "초입니다.");
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
		 * Scanner sc = new Scanner(System.in); System.out.print("점수를 입력하시오: "); int
		 * score = sc.nextInt(); if (score >= 80) { System.out.print("축하합니다! 합격입니다."); }
		 * sc.close();
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("수를 입력하시오: ");
		int number = sc.nextInt();
		if (number % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
		sc.close();
	}
}