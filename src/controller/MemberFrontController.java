package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import net.member.action.MemberLoginAction;
import vo.ActionForward;

/**
 * Servlet implementation class MemberFrontController
 */
@WebServlet("*.nd")
public class MemberFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String requestURI = request.getRequestURI();
	
		String contextPath = request.getContextPath();
		
		String command = requestURI.substring(contextPath.length());

		Action action = null;
	
		ActionForward forward = null;
		
		 // 잘라낸 command 문자열의 내용 비교(주소 매핑)
		
		if(command.equals("/MemberLogin.user")){
			action = new MemberLoginAction();//Or Command
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		doProcess(request, response);
	}

}
