package Day20;

import java.io.*;
import java.util.*;

import Day19.PersonInfo;

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
	public String toString()
	{
		return getName()+", "+getNumber()+", "+getAdress()+", "+getGender();
	}
}

public class Q42 {

	public static void main(String[] args) {
		ArrayList<PersonInfo> numberBook = new ArrayList<PersonInfo>();
		File telBook = new File("c:/Temp/telBook");
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
					FileWriter fwriter = new FileWriter(telBook,true);
					fwriter.write(numberBook.get(0), , );
					System.out.println("전화번호부에 등록이 완료되었습니다.");
				}
			}
			else if(input1 == 2)
			{
				int pSameNameIndex=-1;
				System.out.print("> 이름 : ");
				String pName = sc.next();
				for(int i=0;i<numberBook.size();i++)
				{
					if(numberBook.get(i).getName().equals(pName))
					{
						pSameNameIndex = i;
						break;
					}
				}
				if(pSameNameIndex == -1)
				{
					System.out.println("찾는 사람이 없습니다.");
				}
				else
				{
					numberBook.remove(pSameNameIndex);
					System.out.println("전화번호가 삭제되었습니다.");
				}
			}
			else if(input1 == 3)
			{
				int pSameNameIndex = -1;
				System.out.print("> 이름 : ");
				String pName = sc.next();
				for(int i=0;i<numberBook.size();i++)
				{
					if(numberBook.get(i).getName().equals(pName))
					{
						pSameNameIndex = i;
						break;
					}
				}
				if(pSameNameIndex==-1)
				{
					System.out.println("찾는 사람이 없습니다.");
				}
				else
				{
					System.out.println(numberBook.get(pSameNameIndex));
				}
			}
			else if(input1 == 4)
			{
				for(int i=0;i<numberBook.size();i++)
					System.out.println(numberBook.get(i));
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
		sc.close();
	}

}
