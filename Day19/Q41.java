package Day19;

import java.util.*;



class PersonInfo {
	private String name,number,adress,gender;
	PersonInfo(String name, String number, String adress, String gender)
	{
		setName(name);
		setNumber(number);
		setAdress(adress);
		setGender(gender);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}

public class Q41 {

	public static void main(String[] args) {
		ArrayList<PersonInfo> numberBook = new ArrayList<PersonInfo>();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			boolean isSameName=false;
			System.out.println("=====================전화번호부=====================");
			System.out.print("1.추가 2.삭제 3.전화번호 찾기 4.전체 출력 5.종료 ");
			int input1 = sc.nextInt();
			if(input1 == 1)
			{
				System.out.print("> 이름 : ");
				String pName = sc.next();
				for(int i=0;i<numberBook.size();i++)
				{
					if(pName.equals(numberBook.get(i).getName())||pName.equals(""))
					{
						isSameName = true;
						break;
					}
				}
				if(isSameName)
				{
					System.out.println("동명이인이 있거나 잘못된 입력입니다.");
				}
				else
				{
					System.out.print("> 전화번호 : ");
					String pNumber = sc.next();
					System.out.print("> 주소 : ");
					String pAdress = sc.next();
					System.out.print("> 성별 : ");
					String pGender = sc.next();
					numberBook.add(new PersonInfo(pName, pNumber, pAdress, pGender));
					System.out.println("전화번호부에 등록이 완료되었습니다.");
				}
			}
			else if(input1 == 2)
			{
				
				System.out.print("> 이름 : ");
				String pName = sc.next();
			}
			else if(input1 == 3)
			{
				
			}
			else if(input1 == 4)
			{
				
			}
			else if(input1 == 5)
			{
				System.out.println("종료합니다.");
				break;
			}
			else
			{
				System.out.println("잘못된 입력입니다.");
			}
		}

	}

}
