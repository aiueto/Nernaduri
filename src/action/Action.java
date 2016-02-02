package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;

//각 요청(글쓰기, 목록보기, 글삭제 등)을 제어(처리)하는 Action 클래스들의 규격정의
//액션 클래스들은 요청을 처리한 후 포워딩에 필요한 정보를 ActionForward 객체에 담아서 리턴함.

public interface Action {
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
