package Day7;

import java.util.Random;

public class Q13 
{

	public static void main(String[] args) 
	{
		Random rand = new Random();
		int a[] = new int[5]; // 정수형배열 a 5개 생성
		for(int i=0; i<a.length; i++) // a 배열크기보다 작으면 반복
		{
			a[i] = rand.nextInt(9)+1; // a의 i번째 배열에 랜덤값 대입
			for(int j=0; j<i; j++)
			{
				if(a[i]==a[j]) // j < i인데 a[j]==a[i] 면 
				{
					i--;       // i--; -> 한번 더 랜덤 수 대입
				}
			}
		}
		for(int k=0; k<a.length; k++)
		{
			System.out.print("a["+k+"] = "+ a[k]+"\n"); // 초기 배열 값 출력
		}
		System.out.println("--------");
		int temp = 0; // 임시 변수 선언
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				if(a[i]<a[j]) // 오름차순 (작은수 부터 정렬) 부등호 반대일 경우 내림차순
				{
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for(int k=0; k<a.length; k++)
		{
			System.out.print("a["+k+"] = "+ a[k]+"\n");
		}
		
	}

}
