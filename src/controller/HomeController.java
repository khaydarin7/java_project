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
					System.out.printf("���� : %s ",dtos.get(i).getNO());
					System.out.printf("���� : %s ",dtos.get(i).getTitle());
					System.out.printf("���� : %s ",dtos.get(i).getSinger());
					System.out.printf("�ۻ簡 : %s ",dtos.get(i).getLyticist());
					System.out.printf("�۰ : %s ",dtos.get(i).getSongWriter());
					System.out.printf("�߸��� : %s ",dtos.get(i).getRelease_Date());
					System.out.printf("�帣 : %s\n",dtos.get(i).getGenre());
				}
				dtos.removeAll(dtos);
			}else if(choice==2) {
				conditionMenu();
				int choice2 = sc.nextInt();
				switch(choice2) {
				
				case 1:
					System.out.print("��ȸ�Ͻ� ������ �Է����ּ���");
					String input_name2 = sc.next();
					dtos=service.SearchByRank(input_name2);
					break;
				case 2:
					System.out.print("��ȸ�Ͻ� ������ �Է��ϼ���");
					String input_name1 = sc.next();
					dtos=service.Search("title", input_name1);
					break;
				case 3:
					System.out.print("��ȸ�Ͻ� ������ �Է��ϼ���");
					String input_name3 = sc.next();
					dtos=service.Search("singer", input_name3);
					break;
				case 4:
					System.out.print("��ȸ�Ͻ� �ۻ簡�� �Է��ϼ���");
					String input_name4 = sc.next();
					dtos=service.Search("lyricist", input_name4);
					break;
				case 5:
					System.out.print("��ȸ�Ͻ� �۰�� �Է��ϼ���");
					String input_name5 = sc.next();
					dtos=service.Search("songwriter", input_name5);
					break;
				case 6:
					System.out.print("��ȸ�Ͻ� �߸����� �Է��ϼ���");
					String input_name6 = sc.next();
					dtos=service.Search("release_daate", input_name6);
					break;
				case 7:
					System.out.print("��ȸ�Ͻ� �帣�� �Է��ϼ���");
					String input_name7 = sc.next();
					dtos=service.Search("genre", input_name7);
					break;
				default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					break;
				}
				for(int i=0; i<dtos.size(); i++) {
					System.out.printf("���� : %s ",dtos.get(i).getNO());
					System.out.printf("���� : %s ",dtos.get(i).getTitle());
					System.out.printf("���� : %s ",dtos.get(i).getSinger());
					System.out.printf("�ۻ簡 : %s ",dtos.get(i).getLyticist());
					System.out.printf("�۰ : %s ",dtos.get(i).getSongWriter());
					System.out.printf("�߸��� : %s ",dtos.get(i).getRelease_Date());
					System.out.printf("�帣 : %s\n",dtos.get(i).getGenre());
					}
				dtos.removeAll(dtos);

			}else if(choice==3) {
				System.out.printf("1.����\n");
				System.out.printf("2.�߰�\n");
				int choice3 = sc.nextInt();
				
				switch(choice3) {
				case 1:
					System.out.print("�����Ͻ� ���������� �Է��ϼ���.\n");
					int no = sc.nextInt();
					System.out.print("���������� �Է��ϼ���.\n");
					System.out.print("����:");
					String title = sc.next();
					System.out.print("����:");
					String singer = sc.next();
					System.out.print("�ۻ簡:");
					String lyricist = sc.next();
					System.out.print("�۰:");
					String songwriter = sc.next();
					System.out.print("�߸���:ex)2020-00-00");
					String release_date = sc.next();
					System.out.print("�帣:");
					String genre = sc.next();
					dtos=service.updateMembers(no,title, singer,lyricist,songwriter,release_date,genre);
					break;
				case 2:
					System.out.print("�߰��Ͻ� �뷡 ������ �Է��ϼ���.\n");
					System.out.print("����:");
					no = sc.nextInt();
					System.out.print("����:");
					title = sc.next();
					System.out.print("����:");
					singer = sc.next();
					System.out.print("�ۻ簡:");
					lyricist = sc.next();
					System.out.print("�۰:");
					songwriter = sc.next();
					System.out.print("�߸���:ex)2020-00-00");
					release_date = sc.next();
					System.out.print("�帣:");
					genre = sc.next();
					dtos=service.setMembers(no, title,singer,lyricist,songwriter,release_date, genre);
					break;
				default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					break;
				}
			}else if(choice==4) {//���� ����
				System.out.print("�����Ͻ� �뷡������ �Է��ϼ���.");
				String input_title = sc.next();
				dtos=service.deleteMembers(input_title);
				System.out.print("�Է��Ͻ� �뷡������ �����Ǿ����ϴ�.");
			}else if(choice==5) {
				RealtimeChart.ViewRealtimeChart();
			}else if(choice==6) {
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			
		}
		sc.close();
	}
	public static void menu() {
		System.out.println("1.���� ��� ��ȸ");
		System.out.println("2.�׸� ���� ��ȸ");
		System.out.println("3.���� ������ ����, �߰�");
		System.out.println("4.��������");
		System.out.println("5.�ǽð� ��Ʈ ��ȸ");
		System.out.println("6.����");
	}
	public static void conditionMenu() {
		System.out.println("1.������ ��ȸ");
		System.out.println("2.�������� ��ȸ");
		System.out.println("3.������ ��ȸ");
		System.out.println("4.�ۻ簡�� ��ȸ");
		System.out.println("5.�۰�� ��ȸ");
		System.out.println("6.�߸��Ϸ� ��ȸ");
		System.out.println("7.�帣�� ��ȸ");
	}
}
