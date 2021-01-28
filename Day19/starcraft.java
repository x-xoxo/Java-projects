package Thirteen;

import java.util.Scanner;

class Unit
{
	int num;
	int price;
	int hp;
	int attack;
	int defense;
	String target;
	double speed;
	String characteristic;
}

class Juggling extends Unit
{
	Juggling(int num) // 생성자
	{
		super.num = num;
		super.price = 50;
		super.hp = 35;
		super.attack = 5;
		super.defense = 0;
		super.target = "지상";
		super.speed = 2.612;
		super.characteristic = "지상, 소형, 생체";
	}
	
	void print()
	{
		System.out.println("저글링의 생산비용은 미네랄 " + super.price + ", 체력 " + super.hp + ", 공격력 " + super.attack + " 방어력 " + super.defense + ", 공격대상 " + super.target + ", 이동속도 " + super.speed + ", 유닛 특성" + super.characteristic + "입니다.");
	}
}

class Hydra extends Unit
{
	Hydra(int num)
	{
		super.num = num;
		super.price = 100;
		super.hp = 80;
		super.attack = 10;
		super.defense = 0;
		super.target = "지상, 공중";
		super.speed = 1.741;
		super.characteristic = "지상, 중형, 생체";
	}
	
	void print()
	{
		System.out.println("히드라의 생산비용은 미네랄 " + super.price + ", 체력 " + super.hp + ", 공격력 " + super.attack + " 방어력 " + super.defense + ", 공격대상 " + super.target + ", 이동속도 " + super.speed + ", 유닛 특성" + super.characteristic + "입니다.");
	}
}

class Lurker extends Unit
{
	Lurker(int num)
	{
		super.num = num;
		super.price = 250;
		super.hp = 125;
		super.attack = 20;
		super.defense = 1;
		super.target = "지상";
		super.speed = 2.813;
		super.characteristic = "지상, 중형, 생체";
	}
	
	void print()
	{
		System.out.println("럴커의 생산비용은 미네랄 " + super.price + ", 체력 " + super.hp + ", 공격력 " + super.attack + " 방어력 " + super.defense + ", 공격대상 " + super.target + ", 이동속도 " + super.speed + ", 유닛 특성" + super.characteristic + "입니다.");
	}
}

class Marine extends Unit
{
	Marine(int num)
	{
		super.num = num;
		super.price = 50;
		super.hp = 50;
		super.attack = 6;
		super.defense = 0;
		super.target = "지상, 공중";
		super.speed = 1.875;
		super.characteristic = "지상, 소형, 생체";
	}
	
	void print()
	{
		System.out.println("마린의 생산비용은 미네랄 " + super.price + ", 체력 " + super.hp + ", 공격력 " + super.attack + " 방어력 " + super.defense + ", 공격대상 " + super.target + ", 이동속도 " + super.speed + ", 유닛 특성" + super.characteristic + "입니다.");
	}
}

class Firebat extends Unit
{
	Firebat(int num)
	{
		super.num = num;
		super.price = 75;
		super.hp = 50;
		super.attack = 16;
		super.defense = 1;
		super.target = "지상";
		super.speed = 1.875;
		super.characteristic = "지상, 소형, 생체";
	}
	
	void print()
	{
		System.out.println("파이어벳의 생산비용은 미네랄 " + super.price + ", 체력 " + super.hp + ", 공격력 " + super.attack + " 방어력 " + super.defense + ", 공격대상 " + super.target + ", 이동속도 " + super.speed + ", 유닛 특성" + super.characteristic + "입니다.");
	}
}

class User
{
	Juggling[] j = new Juggling[10];
	Hydra[] h = new Hydra[10];
	Lurker[] l = new Lurker[10];
	Marine[] m = new Marine[10];
	Firebat[] f = new Firebat[10];
}

public class starcraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		User u = new User();
		
		int count = 1;
		int select;
		
		System.out.println("유저 돈을 입력하세요: ");
		int money = sc.nextInt();
		
		while(true)
		{
			if(money >=50)
			{
				while(true)
				{
					System.out.println("구입 1. 저글링 2.히드라 3.럴커 4.마린 5.파이어벳: ");
					select = sc.nextInt();
				
					if(select==1)
					{
						Juggling j = new Juggling(count ++);
						money = money - j.price;
						
						if(money <0)
						{
							System.out.println("구입이 불가합니다.");
							money = money + j.price;
							j=null;
							count--;
						}
						else
						{
							for(int i=0; i<10; i++)
							{
								if(u.j[i]==null)
								{
									u.j[i]=j;
									break;
								}
							}
						}
					}
	
					else if(select==2)
					{
						Hydra h = new Hydra(count ++);
						money = money - h.price;
						
						if(money <0)
						{
							System.out.println("구입이 불가합니다.");
							money = money + h.price;
							h=null;
							count--;
						}
						else
						{
							for(int i=0; i<10; i++)
							{
								if(u.h[i]==null)
								{
									u.h[i]=h;
									break;
								}
							}
						}
					}
					
					else if(select==3)
					{
						Lurker l = new Lurker(count ++);
						money = money - l.price;
						
						if(money <0)
						{
							System.out.println("구입이 불가합니다.");
							money = money + l.price;
							l=null;
							count--;
						}
						else
						{
							for(int i=0; i<10; i++)
							{
								if(u.l[i]==null)
								{
									u.l[i]=l;
									break;
								}
							}
						}
					}
					
					else if(select==4)
					{
						Marine m = new Marine(count ++);
						money = money - m.price;
						
						if(money <0)
						{
							System.out.println("구입이 불가합니다.");
							money = money + m.price;
							m=null;
							count--;
						}
						else
						{
							for(int i=0; i<10; i++)
							{
								if(u.m[i]==null)
								{
									u.m[i]=m;
									break;
								}
							}
						}	
					}
					
					else if(select==5)
					{
						Firebat f = new Firebat(count ++);
						money = money - f.price;
						
						if(money <0)
						{
							System.out.println("구입이 불가합니다.");
							money = money + f.price;
							f=null;
							count--;
						}
						else
						{
							for(int i=0; i<10; i++)
							{
								if(u.f[i]==null)
								{
									u.f[i]=f;
									break;
								}
							}
						}	
					}
			else
			{
				System.out.println("잘못된 입력입니다.");
			}
		}
	}

		for(int i=1; i<count; i++)
		{
			for(int j=0; j<10; j++)
			{
				if(u.j[j] != null)
				{
					if(u.j[j].num == i)
					{
						System.out.println(i + "번째 : ");
						u.j[j].print();
						break;
					}
				}
			}
			for(int k = 0;k<10;k++)
			{
				if(u.h[k] != null)
				{
					if(u.h[k].num == i)
					{
						System.out.print(i+"번째 : ");
						u.h[k].print();
						break;
					}
				}
			}
			for(int x = 0;x<10;x++)
			{
				if(u.l[x] != null)
				{
					if(u.l[x].num == i)
					{
						System.out.print(i+"번째 : ");
						u.l[x].print();
						break;
					}
				}
			}
			for(int y = 0;y<10;y++)
			{
				if(u.m[y] != null)
				{
					if(u.m[y].num == i)
					{
						System.out.print(i+"번째 : ");
						u.m[y].print();
						break;
					}
				}
			}
			for(int z = 0;z<10;z++)
			{
				if(u.f[z] != null)
				{
					if(u.f[z].num == i)
					{
						System.out.print(i+"번째 : ");
						u.f[z].print();
						break;
					}
				}
			}
		}
		
	}
}
}
