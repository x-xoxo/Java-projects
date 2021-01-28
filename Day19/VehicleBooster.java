package Day1;

import java.util.Random;

//비여있음
interface Buster
{

}
//탈것클래스
class Vehicle
{
	private int mileage;//주행거리
	private int gauge;//게이지

	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage += mileage;//걍 누적시킴
	}
	public int getGauge() {
		return gauge;
	}
	public void setGauge(int gauge) {
		this.gauge = gauge;
	}
	//이동함수 오버라이딩
	public void length() 
	{
		System.out.println("이동한다!");
	}
}

class Car extends Vehicle implements Buster
{
	//이동함수 오버라이딩(0~20M)
	public void length() 
	{
		System.out.println("차 이동거리는"+getMileage()+"M 입니다.");
	}

}

class Bycle extends Vehicle implements Buster
{	
	//이동함수 오버라이딩(0~10)
	public void length()
	{
		System.out.println("자전거 이동거리는"+getMileage()+"M 입니다.");
	}
}

class Auto extends Vehicle implements Buster
{	
	//이동함수 오버라이딩(0~15)
	public void length()
	{
		System.out.println("오토바이 이동거리는"+getMileage()+"M 입니다.");
	}


}

class Mulbuster 
{
	public void buster(Buster k, int flag) 
	{
		if(k instanceof Car)//자동차라면
		{
			Car c = (Car)k; // 재선언해야 클래스 함수 쓸수잇음...
			if(flag%4==0)//4턴마다 +2
			{
				System.out.println("자동차 부스터! +2M");
				c.setMileage(2);
			}
		}

		else if(k instanceof Bycle)//자전거라면
		{
			Bycle b = (Bycle)k;
			if(flag%2==0)//2턴마다 +5
			{
				System.out.println("자전거 부스터! +5M");
				b.setMileage(5);
			}
		}
		else if(k instanceof Auto)//오토바이라면
		{
			Auto a = (Auto)k;
			if(flag%3==0)//3턴마다 +3
			{
				System.out.println("오토바이 부스터! +3M");
				a.setMileage(3);
			}
		}
		else
		{
			System.out.println("에러");
		}
	}
}



public class chu4 {
	static void prints(Vehicle k)
	{
		k.length();//오버라이딩 출력함수
	}

	public static void main(String[] args) {
		Random r = new Random();
		int flag = 0;

		Vehicle c = new Car();
		Vehicle b = new Bycle();
		Vehicle a = new Auto();

		Mulbuster mb = new Mulbuster();


		while(true) 
		{
			int index = 0;
			index = r.nextInt(3)+1;//1~3랜덤수

			switch(index)
			{
			case 1://자동차 멈춤
				a.setMileage(r.nextInt(16));//오토바이는 0~15
				b.setMileage(r.nextInt(11));//자전거는 0~10
				break;
			case 2://자전거 멈춤
				a.setMileage(r.nextInt(16));//오토바이는 0~15
				c.setMileage(r.nextInt(21));//자동차는 0~20
				break;
			case 3://오토바이 멈춤
				b.setMileage(r.nextInt(11));//자전거는 0~10
				c.setMileage(r.nextInt(21));//자동차는 0~20
				break;
			}

			
			mb.buster((Auto)a, flag);
			mb.buster((Bycle)b, flag);
			mb.buster((Car)c, flag);
			
			prints(a);//오버라이딩으로 이동거리 계속 불러옴(오토바이)
			prints(b);//오버라이딩으로 이동거리 계속 불러옴(자전거)
			prints(c);//오버라이딩으로 이동거리 계속 불러옴(자동차)

			//부스터 함수(2턴마다 자전거), (3턴마다 오토바이), (4턴마다 자동차)
			//자동차, 오토바이, 자전거는 이미 인터페이스 상속받아져 있음. 인터페이스명 : Buster
			


			if(a.getMileage()>=500)
			{
				System.out.println("오토바이 우승");
				break;
			}

			else if(b.getMileage()>=500)
			{
				System.out.println("자전거 우승");
				break;
			}

			else if(c.getMileage()>=500)
			{
				System.out.println("자동차 우승");
				break;
			}

			flag++;
			System.out.println("현재 "+flag+"턴 입니다.");
		}

	}

}
