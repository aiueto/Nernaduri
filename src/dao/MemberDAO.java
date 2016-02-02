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
			//getInstance �޼ҵ尡 ó�� ȣ��ȰŸ�
			memberDAO = new MemberDAO();
		}
		return memberDAO;
		
	}
	public void setConnection(Connection con){
		this.con = con;
	}
}
