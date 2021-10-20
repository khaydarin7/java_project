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
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			menu();
			choice=sc.nextInt();
			if(choice==1) {
				dtos=service.getAllMembers();
				for(int i=0; i<dtos.size(); i++) {
					System.out.printf("순위 : %s ",dtos.get(i).getNO());
					System.out.printf("제목 : %s ",dtos.get(i).getTitle());
					System.out.printf("가수 : %s ",dtos.get(i).getSinger());
					System.out.printf("작사가 : %s ",dtos.get(i).getLyticist());
					System.out.printf("작곡가 : %s ",dtos.get(i).getSongWriter());
					System.out.printf("발매일 : %s ",dtos.get(i).getRelease_Date());
					System.out.printf("장르 : %s\n",dtos.get(i).getGenre());
				}
			}else if(choice==2) {
				int no = sc.nextInt();
				String title = sc.next();
				String singer = sc.next();
				String lyricist = sc.next();
				String songwriter = sc.next();
				String release_date = sc.next();
				String genre = sc.next();
				dtos=service.setMembers(no, title,singer,lyricist,songwriter,release_date, genre);
			}else if(choice==3) {
				
			}else if(choice==4) {
				
			}else if(choice==5) {
				
			}else if(choice==6) {
				RealtimeChart.ViewRealtimeChart();
			}else if(choice==7) {
				break;
			}
			
		}
		sc.close();
	}
	public static void menu() {
		System.out.println("1.음원모두조회");
		System.out.println("2.제목조회");
		System.out.println("3.가수조회");
		System.out.println("4.음원추가");
		System.out.println("5.음원삭제");
		System.out.println("6.실시간 차트 확인");
		System.out.println("7.종료");
	}
}
