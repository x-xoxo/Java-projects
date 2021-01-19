package Day13;

import java.util.Scanner;

public class Q30 
{
	static void run()
	{
		Scanner sc = new Scanner(System.in);
		Consumer con[] = new Consumer[3];
		for(int i=0;i<con.length;i++)
		{
			con[i] = new Consumer();
		}
		Computer pc [] = new Computer[10];
		for(int i=0;i<pc.length;i++)
		{
			pc[i] = new Computer();
		}
		Airconditioner ac[] = new Airconditioner[10];
		for(int i=0;i<ac.length;i++)
		{
			ac[i] = new Airconditioner();
		}
		Freezer fr[] = new Freezer[10];
		for(int i=0;i<fr.length;i++)
		{
			fr[i] = new Freezer();
		}
		Airrefresher ar[] = new Airrefresher[10];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]= new Airrefresher();
		}
		for(int i=0;i<pc.length/2;i++)
		{
			pc[i].setMaker("삼성");
			pc[i].setModelName("CPU i7");
			pc[i].setPrice(200);
		}
		for(int i=pc.length/2;i<pc.length;i++)
		{
			pc[i].setMaker("LG");
			pc[i].setModelName("CPU i5");
			pc[i].setPrice(150);
		}
		for(int i=0;i<ac.length/2;i++)
		{
			ac[i].setMaker("삼성");
			ac[i].setModelType("벽걸이");
			ac[i].setPrice(100);
		}
		for(int i=ac.length/2;i<ac.length;i++)
		{
			ac[i].setMaker("LG");
			ac[i].setModelType("스탠드");
			ac[i].setPrice(250);
		}
		for(int i=0;i<fr.length/2;i++)
		{
			fr[i].setMaker("삼성");
			fr[i].setModelType("양문");
			fr[i].setSize(600);
			fr[i].setPrice(200);
		}
		for(int i=fr.length/2;i<fr.length;i++)
		{
			fr[i].setMaker("LG");
			fr[i].setModelType("4도어");
			fr[i].setSize(800);
			fr[i].setPrice(350);
		}
		for(int i=0;i<ar.length/2;i++)
		{
			ar[i].setMaker("LG");
			ar[i].setPrice(80);
		}
		for(int i=ar.length/2;i<ar.length;i++)
		{
			ar[i].setMaker("다이슨");
			ar[i].setPrice(60);
		}
		while(true)
		{
			System.out.println("----------마트게임----------");
			System.out.print("1번 소비자의 소지금 입력 : ");
			con[0].setMoney(sc.nextInt());
			System.out.print("2번 소비자의 소지금 입력 : ");
			con[1].setMoney(sc.nextInt());
			System.out.print("3번 소비자의 소지금 입력 : ");
			con[2].setMoney(sc.nextInt());
			if(con[0].getMoney()<0||con[1].getMoney()<0||con[2].getMoney()<0)
			{
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			while(true)
			{
				final int COMPUTER = 1, AIRCON = 2, FREEZER = 3, AIRREF = 4;
				if(con[0].getMoney()< 60 && con[1].getMoney()<60 && con[2].getMoney()<60)
				{
					break;
				}
				for(int j=0;j<con.length;j++)
				{
					if(con[j].getMoney()>=60)
					{
						if(con[j].getMoney()<60)
						{
							continue;
						}
						System.out.printf("%d번 소비자 / 상품을 선택해주세요.\n",j+1);
						System.out.print("1.컴퓨터 2.에어컨 3.냉장고 4.공기청정기 > ");
						int conInput = sc.nextInt();
						if(conInput<1||conInput>4)
						{
							System.out.println("잘못된 입력입니다.");
						}
						else if(conInput==COMPUTER)
						{
							System.out.println("제조사 및 사양을 선택해주세요.");
							System.out.print("1.삼성(i7) 2.LG(i5) > ");
							int select = sc.nextInt();
							if(select == 1)
							{
								if(con[j].getMoney()<200)
								{
									System.out.println("돈이 부족합니다.");
								}
								else 
								{
									for(int i=0;i<pc.length/2;i++)
									{
										if(pc[i]!=null)
										{
											con[j].pc[i] = pc[i];
											pc[i] = null;
											con[j].setMoney(con[j].getMoney()-200);
											System.out.println("구입완료. 남은 소지금 : "+con[j].getMoney());
											break;
										}
										if(i==pc.length/2-1 && pc[i]==null)
										{
											System.out.println("남은 수량이 없습니다.");
											break;
										}
									}
								}
							}
							else if(select == 2)
							{
								if(con[j].getMoney()<150)
								{
									System.out.println("돈이 부족합니다.");
								}
								else 
								{
									for(int i=pc.length/2;i<pc.length;i++)
									{
										if(pc[i]!=null)
										{
											con[j].pc[i] = pc[i];
											pc[i] = null;
											con[j].setMoney(con[j].getMoney()-150);
											System.out.println("구입완료. 남은 소지금 : "+con[j].getMoney());
											break;
										}
										if(i==pc.length-1 && pc[i]==null)
										{
											System.out.println("남은 수량이 없습니다.");
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
						else if(conInput==AIRCON)
						{
							System.out.println("제조사 및 종류을 선택해주세요.");
							System.out.print("1.삼성(벽걸이) 2.LG(스탠드) > ");
							int select = sc.nextInt();
							if(select == 1)
							{
								if(con[j].getMoney()<100)
								{
									System.out.println("돈이 부족합니다.");
								}
								else 
								{
									for(int i=0;i<ac.length/2;i++)
									{
										if(ac[i]!=null)
										{
											con[j].ac[i] = ac[i];
											ac[i] = null;
											con[j].setMoney(con[j].getMoney()-100);
											System.out.println("구입완료. 남은 소지금 : "+con[j].getMoney());
											break;
										}
										if(i==ac.length/2-1 && ac[i]==null)
										{
											System.out.println("남은 수량이 없습니다.");
											break;
										}
									}
								}
							}
							else if(select == 2)
							{
								if(con[j].getMoney()<250)
								{
									System.out.println("돈이 부족합니다.");
								}
								else 
								{
									for(int i=ac.length/2;i<ac.length;i++)
									{
										if(ac[i]!=null)
										{
											con[j].ac[i] = ac[i];
											ac[i] = null;
											con[j].setMoney(con[j].getMoney()-250);
											System.out.println("구입완료. 남은 소지금 : "+con[j].getMoney());
											break;
										}
										if(i==ac.length-1 && ac[i]==null)
										{
											System.out.println("남은 수량이 없습니다.");
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
						else if(conInput==FREEZER)
						{
							System.out.println("제조사 및 종류을 선택해주세요.");
							System.out.print("1.삼성(양문)600L 2.LG(4도어)800L > ");
							int select = sc.nextInt();
							if(select == 1)
							{
								if(con[j].getMoney()<200)
								{
									System.out.println("돈이 부족합니다.");
								}
								else 
								{
									for(int i=0;i<fr.length/2;i++)
									{
										if(fr[i]!=null)
										{
											con[j].fr[i] = fr[i];
											fr[i] = null;
											con[j].setMoney(con[j].getMoney()-200);
											System.out.println("구입완료. 남은 소지금 : "+con[j].getMoney());
											break;
										}
										if(i==fr.length/2-1 && fr[i]==null)
										{
											System.out.println("남은 수량이 없습니다.");
											break;
										}
									}
								}
							}
							else if(select == 2)
							{
								if(con[j].getMoney()<350)
								{
									System.out.println("돈이 부족합니다.");
								}
								else 
								{
									for(int i=fr.length/2;i<fr.length;i++)
									{
										if(fr[i]!=null)
										{
											con[j].fr[i] = fr[i];
											fr[i] = null;
											con[j].setMoney(con[j].getMoney()-350);
											System.out.println("구입완료. 남은 소지금 : "+con[j].getMoney());
											break;
										}
										if(i==fr.length-1 && fr[i]==null)
										{
											System.out.println("남은 수량이 없습니다.");
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
						else if(conInput==AIRREF)
						{
							System.out.println("제조사를 선택해주세요.");
							System.out.print("1.LG 2.다이슨 > ");
							int select = sc.nextInt();
							if(select == 1)
							{
								if(con[j].getMoney()<80)
								{
									System.out.println("돈이 부족합니다.");
								}
								else 
								{
									for(int i=0;i<ar.length/2;i++)
									{
										if(ar[i]!=null)
										{
											con[j].ar[i] = ar[i];
											ar[i] = null;
											con[j].setMoney(con[j].getMoney()-80);
											System.out.println("구입완료. 남은 소지금 : "+con[j].getMoney());
											break;
										}
										if(i==ar.length/2-1 && ar[i]==null)
										{
											System.out.println("남은 수량이 없습니다.");
											break;
										}
									}
								}
							}
							else if(select == 2)
							{
								if(con[j].getMoney()<60)
								{
									System.out.println("돈이 부족합니다.");
								}
								else 
								{
									for(int i=ar.length/2;i<ar.length;i++)
									{
										if(ar[i]!=null)
										{
											con[j].ar[i] = ar[i];
											ar[i] = null;
											con[j].setMoney(con[j].getMoney()-60);
											System.out.println("구입완료. 남은 소지금 : "+con[j].getMoney());
											break;
										}
										if(i==ar.length-1 && ar[i]==null)
										{
											System.out.println("남은 수량이 없습니다.");
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
						else
						{
							System.out.println("Unknown Error");
						}
					}
				}
			}
			break;
		}
		for(int i=0;i<con.length;i++)
		{
			for(int j=0;j<con[i].pc.length;j++)
			{
				if(con[i].pc[j]!=null)
				{
					System.out.print(i+1+"번 소비자, ");
					con[i].pc[j].Use();
				}
			}
		}
		for(int i=0;i<con.length;i++)
		{
			for(int j=0;j<con[i].ac.length;j++)
			{
				if(con[i].ac[j]!=null)
				{
					System.out.print(i+1+"번 소비자, ");
					con[i].ac[j].Use();
				}
			}
		}
		for(int i=0;i<con.length;i++)
		{
			for(int j=0;j<con[i].fr.length;j++)
			{
				if(con[i].fr[j]!=null)
				{
					System.out.print(i+1+"번 소비자, ");
					con[i].fr[j].Use();
				}
			}
		}
		for(int i=0;i<con.length;i++)
		{
			for(int j=0;j<con[i].ar.length;j++)
			{
				if(con[i].ar[j]!=null)
				{
					System.out.print(i+1+"번 소비자, ");
					con[i].ar[j].Use();
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		run();
	}

}

class Consumer
{
	private int money = 0;
	public int getMoney() 
	{
		return this.money;
	}
	public void setMoney(int money) 
	{
		this.money = money;
	}
	Computer pc[] = new Computer[10];
	Airconditioner ac[] = new Airconditioner[10];
	Freezer fr[] = new Freezer[10];
	Airrefresher ar[] = new Airrefresher[10];
}

class Computer
{
	private String maker = "";
	private String modelName = "";
	private int price = 0;

	void setMaker(String name)
	{
		this.maker = name;
	}
	String getMaker()
	{
		return this.maker;
	}
	void setModelName(String name)
	{
		this.modelName = name;
	}
	String getModelName()
	{
		return this.modelName;
	}
	void setPrice(int num)
	{
		this.price = num;
	}
	int getPrice()
	{
		return this.price;
	}
	void Use()
	{
		System.out.println("제조사가 "+this.getMaker()+"인 "+this.getModelName()+"컴퓨터를 사용한다");
	}
}

class Airconditioner
{
	private String maker = "";
	private String modelType = "";
	private int price = 0;

	void setMaker(String name)
	{
		this.maker = name;
	}
	String getMaker()
	{
		return this.maker;
	}
	void setModelType(String name)
	{
		this.modelType = name;
	}
	String getModelType()
	{
		return this.modelType;
	}
	void setPrice(int num)
	{
		this.price = num;
	}
	int getPrice()
	{
		return this.price;
	}
	void Use()
	{
		System.out.println("제조사가 "+this.getMaker()+"인 "+this.getModelType()+"에어컨을 사용한다");
	}
}

class Freezer
{
	private String maker = "";
	private String modelType = "";
	private int size = 0;
	private int price = 0;

	void setMaker(String name)
	{
		this.maker = name;
	}
	String getMaker()
	{
		return this.maker;
	}
	void setModelType(String name)
	{
		this.modelType = name;
	}
	String getModelType()
	{
		return this.modelType;
	}
	void setPrice(int num)
	{
		this.price = num;
	}
	int getPrice()
	{
		return this.price;
	}
	void setSize(int num)
	{
		this.size = num;
	}
	int getSize()
	{
		return this.size;
	}
	void Use()
	{
		System.out.println("제조사가 "+this.getMaker()+"인 "+this.getModelType()+"형 "+this.getSize()+"L 냉장고가 식품을 관리한다");
	}
}

class Airrefresher
{
	private String maker = "";
	private int price = 0;
	public String getMaker() {
		return this.maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	void Use()
	{
		System.out.println("제조사가 "+this.getMaker()+"인 공기 청정기가 공기를 깨끗하게 한다");
	}
}