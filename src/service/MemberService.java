package service;

import java.util.ArrayList;
import dao.MemberDAO;
import dto.MemberVO;

public class MemberService {
	
	//dao�� ����
	private MemberDAO dao;
	public MemberService() {
		dao=new MemberDAO();
	}
	public ArrayList<MemberVO> getAllMembers(){
		return dao.getAllMembers();
	}
	public ArrayList<MemberVO> setMembers() {
		return dao.setMembers(0, null, null,null,null,null,null,);
		
	}
}
