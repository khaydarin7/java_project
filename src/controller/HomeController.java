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
				dtos=service.getAllChart();
				for(int i=0; i<dtos.size(); i++) {
					System.out.printf("%s�� ",dtos.get(i).getRank());
					System.out.printf("%s - ",dtos.get(i).getSongTitle());
					System.out.printf("%s",dtos.get(i).getSingerName());
					System.out.printf(" / %s\n",dtos.get(i).getAlbumTitle());
				}
				dtos.removeAll(dtos);
			}else if(choice==2) {
				conditionMenu();
				int conditionchoice = sc.nextInt();
				switch(conditionchoice) {
				
				case 1:
					System.out.print("��ȸ�Ͻ� ������ �Է����ּ���: ");
					int input_Rank = sc.nextInt();
					dtos=service.SearchByRank(input_Rank);
					break;
				case 2:
					System.out.print("��ȸ�Ͻ� ������ �Է����ּ���: ");
					String input_name = sc.next();
					dtos=service.Search("songtitle", input_name);
					break;
				case 3:
					System.out.print("��ȸ�Ͻ� ������ �Է����ּ���: ");
					input_name = sc.next();
					dtos=service.Search("singername", input_name);
					break;
				case 4:
					System.out.print("��ȸ�Ͻ� �ٹ��� �Է����ּ���: ");
					input_name = sc.next();
					dtos=service.Search("albumtitle", input_name);
					break;
				default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					break;
				}
				for(int i=0; i<dtos.size(); i++) {
					System.out.printf("%s�� ",dtos.get(i).getRank());
					System.out.printf("%s - ",dtos.get(i).getSongTitle());
					System.out.printf("%s",dtos.get(i).getSingerName());
					System.out.printf(" / %s\n",dtos.get(i).getAlbumTitle());
					}
				dtos.removeAll(dtos);

			}else if(choice==3) {
				dtos=service.truncatechart();
				RealtimeChart.UpdateRealtimeChart();
				System.out.println("������Ʈ �Ϸ�!\n");
				
			}else if(choice==4) {//���� ����
				System.out.print("�����Ͻ� �뷡������ �Է��ϼ���.");
				String input_title = sc.next();
				dtos=service.deleteMembers(input_title);
				System.out.print("�Է��Ͻ� �뷡������ �����Ǿ����ϴ�.");
			}else if(choice==5) {
				System.out.print("���α׷��� �����մϴ�.");
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
		System.out.println("3.���� ������ ������Ʈ");
		System.out.println("4.��������");
		System.out.println("5.����");
	}
	public static void conditionMenu() {
		System.out.println("1.���� ��ȸ");
		System.out.println("2.���� ��ȸ");
		System.out.println("3.���� ��ȸ");
		System.out.println("4.�ٹ� ��ȸ");
	}
}
