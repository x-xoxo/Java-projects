package Day16;

import java.util.Random;

class Animals {
	private String name, colors;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}
	
}
class Dogs extends Animals {
	Dogs(String name, String colors)
	{
		this.setName(name);
		this.setColors(colors);
	}
	void makeSound() 
	{
		System.out.println(this.getColors()+"의 "+this.getName()+"은(는) 짖는다.");
	}
}
class Cats extends Animals {
	Cats(String name, String colors)
	{
		this.setName(name);
		this.setColors(colors);
	}
	void makeSound()
	{
		System.out.println(this.getColors()+"의 "+this.getName()+"은(는) 야옹한다.");
	}
}
class Birds extends Animals {
	Birds(String name, String colors)
	{
		this.setName(name);
		this.setColors(colors);
	}
	void fly() {
		System.out.println(this.getColors()+"의 "+this.getName()+"은(는) 날아다닌다.");
	}
}
class Zoo {
	Dogs dog[] = new Dogs[3];
	Cats cat[] = new Cats[2];
	Birds bird;
}
class AnimalControl {
	void run()
	{
		Zoo z = new Zoo();
		Random r = new Random();
		String colors[] = {"갈색","검은색","흰색","노란색","점박이"};
		String nameDogs[] = {"말티즈","요크셔테리어","포메라니안","시바","웰시코기"};
		String nameCats[] = {"먼치킨","스핑크스","뱅갈","샴","폴드"};
		String nameBirds[] = {"앵무새","참새","닭","까마귀","비둘기"};
		for(int i=0;i<z.dog.length;i++)
		{
			z.dog[i] = new Dogs(nameDogs[r.nextInt(5)],colors[r.nextInt(5)]);
			z.dog[i].makeSound();
		}
		for(int i=0;i<z.cat.length;i++)
		{
			z.cat[i] = new Cats(nameCats[r.nextInt(5)],colors[r.nextInt(5)]);
			z.cat[i].makeSound();
		}
		z.bird = new Birds(nameBirds[r.nextInt(5)],colors[r.nextInt(5)]);
		z.bird.fly();
	}
}

public class Q35 {

	public static void main(String[] args) {
		new AnimalControl().run();
	}

}
