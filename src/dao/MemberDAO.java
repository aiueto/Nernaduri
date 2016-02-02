package dao;
import java.sql.Connection;

import dao.MemberDAO;

public class MemberDAO {
	Connection con;
	private static MemberDAO memberDAO;
	private MemberDAO() {
		// TODO Auto-generated constructor stub
	}

	public static MemberDAO getInstance(){
		if (memberDAO == null) {
			//getInstance 메소드가 처음 호출된거면
			memberDAO = new MemberDAO();
		}
		return memberDAO;
		
	}
	public void setConnection(Connection con){
		this.con = con;
	}
}
