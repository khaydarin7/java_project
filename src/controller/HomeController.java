package controller;

import java.util.ArrayList;
import java.util.Scanner;

import dto.MemberVO;
import service.MemberService;

public class HomeController {
	
	public static void main(String[] args)
	{
		ArrayList<MemberVO> dtos = null;
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
				dtos.removeAll(dtos);
			}else if(choice==2) {
				conditionMenu();
				int choice2 = sc.nextInt();
				switch(choice2) {
				
				case 1:
					System.out.print("조회하실 순위를 입력해주세요");
					String input_name2 = sc.next();
					dtos=service.Search("no",input_name2);
					
					break;
				case 2:
					System.out.print("조회하실 제목을 입력하세요");
					String input_name1 = sc.next();
					dtos=service.Search("title", input_name1);
					
					break;
				case 3:
					System.out.print("조회하실 가수를 입력하세요");
					String input_name3 = sc.next();
					dtos=service.Search("singer", input_name3);
					break;
				case 4:
					System.out.print("조회하실 작사가를 입력하세요");
					String input_name4 = sc.next();
					dtos=service.Search("lyricist", input_name4);
					break;
				case 5:
					System.out.print("조회하실 작곡가를 입력하세요");
					String input_name5 = sc.next();
					dtos=service.Search("songwriter", input_name5);
					break;
				case 6:
					System.out.print("조회하실 발매일을 입력하세요");
					String input_name6 = sc.next();
					dtos=service.Search("release_daate", input_name6);
					break;
				case 7:
					System.out.print("조회하실 장르를 입력하세요");
					String input_name7 = sc.next();
					dtos=service.Search("genre", input_name7);
					break;
				default : System.out.println("잘못 입력하셨습니다.");
					break;
				}
				for(int i=0; i<dtos.size(); i++) {
					System.out.printf("순위 : %s ",dtos.get(i).getNO());
					System.out.printf("제목 : %s ",dtos.get(i).getTitle());
					System.out.printf("가수 : %s ",dtos.get(i).getSinger());
					System.out.printf("작사가 : %s ",dtos.get(i).getLyticist());
					System.out.printf("작곡가 : %s ",dtos.get(i).getSongWriter());
					System.out.printf("발매일 : %s ",dtos.get(i).getRelease_Date());
					System.out.printf("장르 : %s\n",dtos.get(i).getGenre());
					}
				dtos.removeAll(dtos);

			}else if(choice==3) {
				System.out.printf("1.수정\n");
				System.out.printf("2.추가\n");
				int choice3 = sc.nextInt();
				
				switch(choice3) {
				case 1:
					
					break;
				case 2:
					int no = sc.nextInt();
					String title = sc.next();
					String singer = sc.next();
					String lyricist = sc.next();
					String songwriter = sc.next();
					String release_date = sc.next();
					String genre = sc.next();
					dtos=service.setMembers(no, title,singer,lyricist,songwriter,release_date, genre);
					break;
				default : System.out.println("잘못 입력하셨습니다.");
					break;
				}
			}else if(choice==4) {//음원 삭제
				
			}else if(choice==5) {
				RealtimeChart.ViewRealtimeChart();
			}else if(choice==6) {
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}
		sc.close();
	}
	public static void menu() {
		System.out.println("1.음원 모두 조회");
		System.out.println("2.항목별 조건 조회");
		System.out.println("3.음원 데이터 수정, 추가");
		System.out.println("4.음원삭제");
		System.out.println("5.실시간 차트 조회");
		System.out.println("6.종료");
	}
	public static void conditionMenu() {
		System.out.println("1.순위로 조회");
		System.out.println("2.제목으로 조회");
		System.out.println("3.가수로 조회");
		System.out.println("4.작사가로 조회");
		System.out.println("5.작곡가로 조회");
		System.out.println("6.발매일로 조회");
		System.out.println("7.장르로 조회");
	}
}
