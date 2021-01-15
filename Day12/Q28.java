package Day12;

import java.util.Scanner;

public class Q28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Animal monkey = new Animal();
		Animal dog = new Animal();
		Animal chicken = new Animal();
		Animal pig = new Animal();
		monkey.whoAmI(sc);
		monkey.whatIHave(sc);
		dog.whoAmI(sc);
		dog.whatIHave(sc);
		chicken.whoAmI(sc);
		chicken.whatIHave(sc);
		pig.whoAmI(sc);
		pig.whatIHave(sc);
		dog.print(monkey,dog,chicken,pig);
		monkey.changefood(dog);
		monkey.changefood(chicken);
		monkey.changefood(pig);
		System.out.println("After change");
		monkey.print(monkey, dog, chicken, pig);
	}

}

class Animal {
	String name = "";
	String food = "";
	public void whoAmI(Scanner sc)
	{
		System.out.print("이름을 입력하시오: ");
		name = sc.next();
	}
	public void whatIHave(Scanner sc)
	{
		System.out.print("어떤 음식을 들고있는지 입력하세요: ");
		food = sc.next();
	}
	public void changefood(Animal names)
	{
		String str = "";
		str = names.food;
		names.food = food;
		food = str;
	}
	public void print(Animal name1,Animal name2,Animal name3,Animal name4)
	{
		System.out.println("이름: "+name1.name+" / 들고있는 음식: "+name1.food);
		System.out.println("이름: "+name2.name+" / 들고있는 음식: "+name2.food);
		System.out.println("이름: "+name3.name+" / 들고있는 음식: "+name3.food);
		System.out.println("이름: "+name4.name+" / 들고있는 음식: "+name4.food);
	}
}