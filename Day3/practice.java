package Day3;

import java.util.Scanner;

import java.util.Random;

public class practice 
{

	public static void main(String[] args) 
	{
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("국어점수를 입력해주세요 : ");
//		int korscore = sc.nextInt();
//
//		System.out.print("영어점수를 입력해주세요 : ");
//		int engscore = sc.nextInt();
//
//		System.out.print("수학점수를 입력해주세요 : ");
//		int mathscore = sc.nextInt();
//		if (korscore > 100 || engscore > 100 || mathscore > 100)
//		{
//			if (engscore > 100)
//			{
//				System.out.println("영어점수가 잘못 입력됐습니다.");
//			}
//			if (mathscore > 100)
//			{
//				System.out.println("수학점수가 잘못 입력됐습니다.");
//			}
//			if (korscore > 100)
//			{
//				System.out.println("국어점수가 잘못 입력됐습니다.");
//			}
//		}
//		else
//		{
//			float avgscore = (float)(((float)korscore + (float)engscore + (float)mathscore)/3);
//			if (avgscore >= 95)
//			{
//				System.out.printf("점수는 %.1f점, 학점은 A+입니다.\n", avgscore);
//			}
//			else if (avgscore >= 90)
//			{
//				System.out.printf("점수는 %.1f점, 학점은 A입니다.\n", avgscore);
//			}
//			else if (avgscore >= 85)
//			{
//				System.out.printf("점수는 %.1f점, 학점은 B+입니다.\n", avgscore);
//			}
//			else if (avgscore >= 80)
//			{
//				System.out.printf("점수는 %.1f점, 학점은 B입니다.\n", avgscore);
//			}
//			else if (avgscore >= 75)
//			{
//				System.out.printf("점수는 %.1f점, 학점은 C+입니다.\n", avgscore);
//			}
//			else if (avgscore >= 70)
//			{
//				System.out.printf("점수는 %.1f점, 학점은 C입니다.\n", avgscore);
//			}
//			else if (avgscore >= 60)
//			{
//				System.out.printf("점수는 %.1f점, 학점은 D입니다.\n", avgscore);
//			}
//			else if (avgscore < 60)
//			{
//				System.out.printf("점수는 %.1f점, 학점은 F입니다.\n", avgscore);
//			}
//			else
//			{
//				System.out.println("Unknown Error");
//			}
//		}
//		int sum=0;
//		
//		for(int i=1;i<=10;i++)
//		{
//			sum += i;
//			System.out.print(i);
//			if(i<=9)
//			{
//				System.out.print("+");
//			}
//			else
//			{
//				System.out.print("=");
//				System.out.print(sum);
//			}
//		}
//		int count = 0;
//		int sum = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
//		
//		int n = sc.nextInt();
//		while(n != -1)
//			sum += n;
//		{
//			count++;
//			n = sc.nextInt();
//		}
//		if(count == 0)
//		{
//			System.out.println("입력된 수가 없습니다.");
//		}
//		else
//		{
//			System.out.print("정수의 개수는" + count + "개이며, ");
//			System.out.println("평균은 " + (double)sum/count + "입니다.");
//		}
//		char c = 'a';
//		
//		do
//		{
//			System.out.print(c);
//			c = (char)(c + 1);
//		} while (c <= 'z');
//		for(int i=2; i < 10; i++)
//		{
//			for(int j=1; j < 10; j++)
//			{
//				System.out.print(i + "X" + j + "=" + i*j);
//				System.out.print('\t');
//			}
//			System.out.println();
//		}
//		Q4.
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수를 5개 입력하세요");
//		int sum = 0;
//		for(int i=0; i<5; i++)
//		{
//			int n = sc.nextInt();
//			if(n <= 0)
//			{
//				continue;
//			}
//			else
//			{
//				sum += n;
//			}
//		}
//		System.out.println("양수의 합은 " + sum);
//		sc.close();
//		Scanner sc = new Scanner(System.in);
//		Random r = new Random();
//		String randomStr = String.valueOf((char) ((int) (r.nextInt(26)) + 65));
//		System.out.println(randomStr);
		
//		Random rd = new Random();
//		int rdNum = rd.nextInt(26);
//		System.out.println((char)(rdNum+65));
//		Q4-1.
		Random rd = new Random();
		String str = "";
		for(int i=0; i<10 ; i++)
		{
			String rdStr = (char)(rd.nextInt(26)+65) + "";
			str += rdStr;
		}
		System.out.println(str);
//		for(int j=0; j<3; j++)
//		{
//			int rndNum = rd.nextInt(10);
//			String pickedIndex = str.charAt(rndNum) + "";
//			System.out.print((rndNum + 1) + " ");
//			System.out.println(pickedIndex);
//		}
//		int oneindex = rd.nextInt(10);
//		int twoindex = rd.nextInt(10);
//		int threeindex = rd.nextInt(10);
//		
//		while(oneindex == twoindex)
//		{
//			twoindex = rd.nextInt(10);
//		}
//		while(oneindex == twoindex || twoindex == threeindex)
//		{
//			threeindex = rd.nextInt(10);
//		}
//		System.out.print(oneindex + 1 + " ");
//		System.out.print(twoindex + 1 + " ");
//		System.out.println(threeindex + 1);
//		System.out.println(str.charAt(oneindex)+"" +str.charAt(twoindex)+""+str.charAt(threeindex)+"");
		
	}
}
