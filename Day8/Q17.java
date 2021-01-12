package Day8;

import java.util.Scanner;

public class Q17 
{
	public static int add(int a, int b)
	{
		return a+b;
	}
	
	public static void mul(int a, int b)
	{
		result(a*b);
	}
	
	public static int sub()
	{
		int num1 = input1();
		int num2 = input2();
		return num1-num2;
	}
	
	public static void div()
	{
		int num1 = input1();
		int num2 = input2();
		divResult((double)num1/(double)num2);
	}
	
	public static void opError()
	{
		System.out.println("Error: 잘못된 연산자입니다.");
	}
	
	public static void result(int res)
	{
		System.out.printf("결과값: %d 입니다.", res);
	}
	
	public static void divResult(double res)
	{
		System.out.printf("결과값: %.1f 입니다.", res);
	}
	
	public static int input1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요: ");
		int num1 = sc.nextInt();
		return num1;
	}
	
	public static int input2()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("두번째 숫자를 입력하세요: ");
		int num2 = sc.nextInt();
		return num2;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자 입력: ");
		String operator = sc.next();
		if (operator.equals("+"))
		{
			int num1=input1();
			int num2=input2();
			result(add(num1,num2));
		}
		else if (operator.equals("-"))
		{
			result(sub());
		}
		else if (operator.equals("*"))
		{
			int num1 = input1();
			int num2 = input2();
			mul(num1,num2);
		}
		else if (operator.equals("/"))
		{
			div();
		}
		else
		{
			opError();
		}
	}

}
