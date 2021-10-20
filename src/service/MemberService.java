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
	public ArrayList<MemberVO> setMembers(int no, String title, String singer,String lyricist,String songwriter,String release_date,String genre) {
		return dao.setMembers(no,title, singer,lyricist,songwriter,release_date,genre);
	}
	public ArrayList<MemberVO> Search(String condition,String input_name) {
		return dao.Search(condition,input_name);
	}
	public ArrayList<MemberVO> SearchByRank(String input_name) {
		return dao.SearchByRank(input_name);
	}
	public ArrayList<MemberVO> deleteMembers(String input_title) {
		return dao.deleteMembers(input_title);
	}
}
