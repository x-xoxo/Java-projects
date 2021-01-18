package Day12;

import java.util.Scanner;

public class Q28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Animal monkey = new Animal();
		Animal dog = new Animal();
		Animal chicken = new Animal();
		Animal pig = new Animal();
		String tmp = "";
		monkey.SetName("원숭이");
		monkey.SetFood("바나나");
		dog.SetName("개");
		dog.SetFood("뼈다귀");
		chicken.SetName("닭");
		chicken.SetFood("모이");
		pig.SetName("돼지");
		pig.SetFood("여물");
		
		monkey.Display();
		dog.Display();
		chicken.Display();
		pig.Display();
		
		tmp = pig.GetFood();
		pig.SetFood(chicken.GetFood());
		chicken.SetFood(dog.GetFood());
		dog.SetFood(monkey.GetFood());
		monkey.SetFood(tmp);
		
		System.out.println("After change");
		
		monkey.Display();
		dog.Display();
		chicken.Display();
		pig.Display();
	}

}

class Animal {
	private String name = "";
	private String food = "";
	
	void Display()
	{
		System.out.println("이름 : "+GetName()+ " / 가지고있는 음식 : "+GetFood());
	}
	
	void SetName(String str)
	{
		this.name = str;
	}
	
	String GetName()
	{
		return this.name;
	}
	
	void SetFood(String str)
	{
		this.food = str;
	}
	
	String GetFood()
	{
		return this.food;
	}
}