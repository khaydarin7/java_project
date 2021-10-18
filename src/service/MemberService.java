package service;

import java.util.ArrayList;
import dao.MemberDAO;
import dto.MemberVO;

public class MemberService {
	
	//dao¸¦ Æ÷ÇÔ
	private MemberDAO dao;
	public MemberService() {
		dao=new MemberDAO();
	}
	public ArrayList<MemberVO> getAllMembers(){
		return dao.getAllMembers();
	}
	public ArrayList<MemberVO> setMembers() {
		return dao.setMembers(0, null, 0, 0);
		
	}
}
