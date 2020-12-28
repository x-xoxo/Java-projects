package Day2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

//		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
//		Scanner sc = new Scanner(System.in);
//
//		String name = sc.next(); // 문자열 읽기
//		System.out.print("이름은 " + name + ", ");
//
//		String city = sc.next(); // 문자열 읽기
//		System.out.print("도시는 " + city + ", ");
//
//		int age = sc.nextInt(); // 정수 읽기
//		System.out.print("나이는 " + age + "살, ");
//
//		double weight = sc.nextDouble(); // 실수 읽기
//		System.out.print("체중은 " + weight + "kg, ");
//
//		boolean isSingle = sc.nextBoolean(); // 논리값 읽기
//		System.out.print("독신 여부는 " + isSingle + "입니다. ");
//		sc.close(); // sc 객체 닫기
//
//		Scanner sc = new Scanner(System.in);

//		System.out.print("정수를 입력하세요: ");
//		int time = sc.nextInt();
//		int second = time % 60;
//		int minute = (time / 60) % 60;
//		int hour = (time / 60) / 60;
//
//		System.out.print(time + "초는 ");
//		System.out.print(hour + "시간, ");
//		System.out.print(minute + "분, ");
//		System.out.println(second + "초입니다.");
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
//		System.out.print("점수를 입력하시오: "); int score = sc.nextInt(); if (score >= 80) {
//		System.out.print("축하합니다! 합격입니다."); } 
//		sc.close();
//		 

//		Scanner sc = new Scanner(System.in);

//		char grade;
//		System.out.print("점수를 입력하세요(0~100): ");
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
//		System.out.println("학점은 " + grade + "입니다.");
//
//		sc.close();

//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수를 입력하세요(0~100): ");
//		int score = sc.nextInt();
//		System.out.print("학년을 입력하세요(1~4): ");
//		int year = sc.nextInt();
//		
//		if(score >= 60) {
//			if(year != 4) {
//				System.out.println("합격!");
//			}
//			else if(score >= 70) {
//				System.out.println("합격!");
//			}
//			else
//				System.out.println("불합격!");
//		}
//		else {
//			System.out.println("불합격!");
//		}
//		sc.close();

//		Q1.
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("월을 입력해주세요(1~12): ");
//		int month = sc.nextInt();
//		System.out.print("온도를 입력해주세요(-15~37): ");
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
//					System.out.println("계절은 봄입니다. 온도는 " + temp + "도 입니다.");
//				}
//				else
//				{
//					System.out.println("계절과 온도가 맞지 않습니다.");
//				}
//			}
//			else if(month >= 6  && month <= 8)
//			{
//				if(temp >= 18 && temp <= 37)
//				{
//					System.out.println("계절은 여름입니다. 온도는 " + temp + "도 입니다.");
//				}
//				else
//				{
//					System.out.println("계절과 온도가 맞지 않습니다.");
//				}
//			}
//			else if(month >= 9  && month <= 11)
//			{
//				if(temp >= 3 && temp <= 15)
//				{
//					System.out.println("계절은 가을입니다. 온도는 " + temp + "도 입니다.");
//				}
//				else {
//					System.out.println("계절과 온도가 맞지 않습니다.");
//				}
//			}
//			else
//			{
//				if(temp >= -15 && temp <= 2)
//				{
//					System.out.println("계절은 겨울입니다. 온도는 " + temp + "도 입니다.");
//				}
//				else
//				{
//					System.out.println("계절과 온도가 맞지 않습니다.");
//				}
//			}
//		}
//		else
//		{
//			System.out.println("잘못된 입력입니다.");
//		}
//		sc.close();
//		Q2.
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수를 입력해주세요: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수를 입력해주세요: ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력해주세요: ");
		String operator = sc.next();
//		switch (operator)
//		{
//		case "+":
//			System.out.println("결과값: " + (num1+num2) + " 입니다.");
//			break;
//		case "-":
//			System.out.println("결과값: " + (num1-num2) + " 입니다.");
//			break;
//		case "*":
//			System.out.println("결과값: " + (num1*num2) + " 입니다.");
//			break;
//		case "/":
//			System.out.printf("결과값: %.2f 입니다.\n", (float)((float)num1/(float)num2));
//			break;
//
//		default:
//			System.out.println("잘못된 연산자 입니다.");
//			break;
//		}
		if (operator.equals("+"))
		{
			System.out.println("결과값: " + (num1+num2) + " 입니다.");
		}
		else if (operator.equals("-"))
		{
			System.out.println("결과값: " + (num1-num2) + " 입니다.");
		}
		else if (operator.equals("*"))
		{
			System.out.println("결과값: " + (num1*num2) + " 입니다.");
		}
		else if (operator.equals("/"))
		{
			System.out.println("결과값: " + (float)((float)num1/(float)num2) + " 입니다.");
		}
		sc.close();
	}
}