package controller;

import java.util.ArrayList;
import java.util.Scanner;

import dto.MemberVO;
import service.MemberService;

public class HomeController {

	public static void main(String[] args) {
		ArrayList<MemberVO> dtos;
		MemberService service = new MemberService();
		int choice = 0;
		int select = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			menu();
			choice=sc.nextInt();
			if(choice==1) {
				dtos=service.getAllMembers();
				for(int i=0; i<dtos.size();i++) {
					System.out.printf("%d순위 ", dtos.get(i).getNO());
					System.out.printf("이름: %s\n", dtos.get(i).getNAME());
					System.out.printf("가격: %s\n", dtos.get(i).getPRICE());
					System.out.printf("제작: %s\n", dtos.get(i).getsetPRODUCTION_COMPANY());
					System.out.printf("배급: %s\n", dtos.get(i).getDISTRIBUTOR());
					System.out.printf("장르: %s\n", dtos.get(i).getGENRE());
					System.out.printf("출시일자: %s\n", dtos.get(i).getRELEASE_DATE());
					System.out.printf("플랫폼: %s\n", dtos.get(i).getPLATFORME());
				}
			}else if(choice==2) {
				
				conditionMenu();
				switch(select) {
				
				case 1:
					
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					
					break;
				case 6:
					
					break;
				case 7:
					
					break;
				default : System.out.println("잘못입력하셨습니다.");
					break;
					
				}
				
			}else if(choice==3) {
				
				
				
			}else if(choice==4) {
				
				dtos=service.getGame();
				for(int i=0; i<dtos.size(); i++) {
				System.out.printf("순위:%s/n",dtos.get(i).getNO());
				System.out.printf("게임 이름:%s\n",dtos.get(i).getNAME());
				System.out.printf("가격: %s\n", dtos.get(i).getPRICE());
				System.out.printf("제작: %s\n", dtos.get(i).getsetPRODUCTION_COMPANY());
				System.out.printf("배급: %s\n", dtos.get(i).getDISTRIBUTOR());
				System.out.printf("장르: %s\n", dtos.get(i).getGENRE());
				System.out.printf("출시일자: %s\n", dtos.get(i).getRELEASE_DATE());
				System.out.printf("플랫폼: %s\n", dtos.get(i).getPLATFORME());
				
			}else if(choice==5) {
				
			}else if(choice==6) {
				
			}else if(choice==7) {
				
			}
			
		}

	}
	
	public static void menu() {
		System.out.println("1.순위권 PC게임 모두 조회");
		System.out.println("2.조건 조회");
		System.out.println("3.게임정보수정");
		System.out.println("4.게임데이터추가");
		System.out.println("5.게임데이터삭제");
		System.out.println("6.실시간 차트 조회");
		System.out.println("7.종료");
		
	}

	public static void conditionMenu() {
		System.out.println("1.이름으로 조회");
		System.out.println("2.가격으로 조회");
		System.out.println("3.제작사로 조회");
		System.out.println("4.배급사로 조회");
		System.out.println("5.장르로 조회");
		System.out.println("6.출시일자로 조회");
		System.out.println("7.플랫폼으로 조회");
		
		
	}
}
