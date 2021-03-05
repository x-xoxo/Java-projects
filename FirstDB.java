package DB;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FirstDB {
	private static Connection conn;//데이터베이스 연견을 위해
	private static PreparedStatement pstmt;//사전 준비 후에 쿼리문을 보낼때
	private static ResultSet rs = null;//select시 결과을 받을 때
	private static Statement stmt;//직방으로 보낼때
	Scanner sc = new Scanner(System.in);

	public void addTel(Connection conn) throws SQLException
	{
		System.out.print("> 이름 : ");
		String pName = sc.next();
		System.out.print("> 전화번호 : ");
		String pNumber = sc.next();
		System.out.print("> 주소 : ");
		String pAdress = sc.next();
		System.out.print("> 성별 : ");
		String pGender = sc.next();
		pstmt = conn.prepareStatement("insert into telTBL values(?, ?, ?, ?, date(now()))");
		pstmt.setString(1, pName);
		pstmt.setString(2, pNumber);
		pstmt.setString(3, pAdress);
		pstmt.setString(4, pGender);
		pstmt.executeUpdate();
		System.out.println("전화번호부에 등록이 완료되었습니다.");
	}
	public void searchTel(Connection conn) throws SQLException
	{
		int rowCnt=0;
		System.out.print("> 이름 : ");
		String pName = sc.next();
		pstmt = conn.prepareStatement("select * from telTBL where userName = ?");
		pstmt.setString(1, pName);
		rs = pstmt.executeQuery();
		if (rs != null)
		{
			while (rs.next())
			{
				String userName = rs.getString("userName");
				String userTel = rs.getString("userTel");
				String userAddr = rs.getString("userAddr");
				String userGender = rs.getString("userGender");
				Date sDate = rs.getDate("sDate");
				System.out.println(userName+"\t"+userTel
						+"\t"+userAddr+"\t"+userGender+"\t"+sDate);
				rowCnt++;
			}
		}
		if(rowCnt==0)
		{
			System.out.println("찾는 사람이 없습니다.");
		}
	}
	
	public void showAll(Connection conn) throws SQLException
	{
		int rowCnt=0;
		stmt = conn.createStatement();
		String all = "select * from telTBL order by sDate";
		rs = stmt.executeQuery(all);
		if (rs != null)
		{
			while (rs.next())
			{
				String userName = rs.getString("userName");
				String userTel = rs.getString("userTel");
				String userAddr = rs.getString("userAddr");
				String userGender = rs.getString("userGender");
				Date sDate = rs.getDate("sDate");
				System.out.println(userName+"\t"+userTel
						+"\t"+userAddr+"\t"+userGender+"\t"+sDate);
				rowCnt++;
			}
		}
		if(rowCnt == 0)
		{
			System.out.println("데이터가 없습니다.");
		}
	}
	
	public void delTel(Connection conn) throws SQLException
	{
		int rowCnt=0;
		System.out.print("> 이름 : ");
		String pName = sc.next();
		pstmt = conn.prepareStatement("select * from telTBL where userName = ? group by userName");
		pstmt.setString(1, pName);
		rs = pstmt.executeQuery();
		if (rs != null)
		{
			while(rs.next())
			{
				rowCnt++;
			}
			if(rowCnt != 0)
			{
				pstmt = conn.prepareStatement("delete from telTBL where userName = ?");
				pstmt.setString(1, pName);
				pstmt.executeUpdate();
				System.out.println("전화번호가 삭제되었습니다.");
			}
			else
			{
				System.out.println("찾는 사람이 없습니다.");
			}
		}
	}
	
	public void start() throws SQLException
	{
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cookdb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","1234");		
		while(true)
		{
			System.out.println("=====================전화번호부=====================");
			System.out.print("1.추가 2.찾기 3.전체 출력 4.삭제 5.종료 > ");
			int input1 = sc.nextInt();
			if(input1 == 1)
			{
				addTel(conn);
			}
			else if(input1 == 2)
			{
				searchTel(conn);
			}
			else if(input1 == 3)
			{
				showAll(conn);
			}
			else if(input1 == 4)
			{
				delTel(conn);
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
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		new FirstDB().start();
	}

}
