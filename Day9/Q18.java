package Day9;

import java.util.Scanner;

public class Q18 
{
	public static int korInput()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("국어점수를 입력해주세요 : ");
		int korscore = sc.nextInt();
		return korscore;
	}
	
	public static int engInput()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("영어점수를 입력해주세요 : ");
		int engscore = sc.nextInt();
		return engscore;
	}
	
	public static int mathInput()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("수학점수를 입력해주세요 : ");
		int mathscore = sc.nextInt();
		return mathscore;
	}
	
	public static void err() 
	{
		System.out.println("점수를 잘못입력했습니다.");
	}
	
	public static double calAvg(int kor, int eng, int math)
	{
		double result = (kor+eng+math)/3.0;
		return result;
	}
	
	public static String avgGrade(double avg)
	{
		double avgscore = avg;
		if (avgscore >= 95)
		{
			return "A+";
		}
		else if (avgscore >= 90)
		{
			return "A";
		}
		else if (avgscore >= 85)
		{
			return "B+";
		}
		else if (avgscore >= 80)
		{
			return "B";
		}
		else if (avgscore >= 75)
		{
			return "C+";
		}
		else if (avgscore >= 70)
		{
			return "C";
		}
		else if (avgscore >= 60)
		{
			return "D";
		}
		else if (avgscore < 60)
		{
			return "F";
		}
		else
		{
			return "NULL";
		}
	}
	
	public static void printGrade(String grade)
	{
		System.out.print("학점은 "+ grade +" 입니다.");
	}
	
	public static void validateCheck(int kor, int eng, int math)
	{
		if(kor>100||eng>100||math>100||kor<0||eng<0||math<0)
		{
			err();			
		}
		else
		{
			printGrade(avgGrade(calAvg(kor, eng, math)));
		}
	}

	public static void main(String[] args) 
	{
		int kor = korInput();
		int eng = engInput();
		int math = mathInput();
		validateCheck(kor, eng, math);
	}

}
