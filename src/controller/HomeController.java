package controller;

import java.util.ArrayList;
import java.util.Scanner;

import dto.MemberVO;
import service.MemberService;

public class HomeController {
	
	public static void main(String[] args)
	{
		ArrayList<MemberVO> dtos;
		MemberService service = new MemberService();
		int choice=0;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			menu();
			choice=sc.nextInt();
			if(choice==1) {
				dtos=service.setMembers();
				for(int i=0; i<dtos.size(); i++) {
					String id = sc.next();
					dtos.get(i).setId(id);
					String pw = sc.next();
					dtos.get(i).setId(pw);
				}
				
			}else if(choice==2) {
				dtos=service.getAllMembers();
				for(int i=0; i<dtos.size(); i++) {
					System.out.printf("아이디:%s\n",dtos.get(i).getId());
					System.out.printf("비밀번호:%s\n",dtos.get(i).getPw());
				}
			}else if(choice==3) {
				//service.signUpMembers();
			}
			else if(choice==6) {
				break;
			}
		}
		sc.close();
	}
	
	public static void menu() {
		System.out.println("1.로그인");
		System.out.println("2.회원정보 모두조회");
		System.out.println("3.회원가입");
		System.out.println("4.회원정보 수정");
		System.out.println("5.회원정보 삭제");
		System.out.println("6.종료");
	}
	
	
}
