package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.ActionForward;

//�� ��û(�۾���, ��Ϻ���, �ۻ��� ��)�� ����(ó��)�ϴ� Action Ŭ�������� �԰�����
//�׼� Ŭ�������� ��û�� ó���� �� �������� �ʿ��� ������ ActionForward ��ü�� ��Ƽ� ������.

public interface Action {
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
