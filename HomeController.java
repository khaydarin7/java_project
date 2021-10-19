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
		int choice2 = 0;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			menu();
			choice=sc.nextInt();
			if(choice==1) {
				dtos=service.getAllMusic();
				for(int i=0; i<dtos.size(); i++) {
					System.out.printf("����:%s",dtos.get(i).getNO());
					System.out.printf("����:%s",dtos.get(i).getTitle());
					System.out.printf("����:%s",dtos.get(i).getSinger());
					System.out.printf("�ۻ簡:%s",dtos.get(i).getLyticist());
					System.out.printf("�۰:%s",dtos.get(i).getSongWriter());
					System.out.printf("�߸���:%s",dtos.get(i).getRelease_Date());
					System.out.printf("�帣:%s\n",dtos.get(i).getGenre());
				}
			}else if(choice==2) {
				conditionMenu();
				switch(choice2) {
				
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
				default : System.out.println("�߸��Է��ϼ̽��ϴ�.");
					break;
				}
			
					
				
				
			}else if(choice==3) {
				
			}else if(choice==4) {
				dtos=service.getMusics();
				for(int i=0; i<dtos.size(); i++) {
				System.out.printf("����:%s/n",dtos.get(i).getNO());
				System.out.printf("����:%s\n",dtos.get(i).getTitle());
				System.out.printf("����:%s\n",dtos.get(i).getSinger());
				System.out.printf("�ۻ簡:%s\n",dtos.get(i).getLyticist());
				System.out.printf("�۰:%s\n",dtos.get(i).getSongWriter());
				System.out.printf("�߸���:%s\n",dtos.get(i).getRelease_Date());
				System.out.printf("�帣:%s\n",dtos.get(i).getGenre());
				
			}else if(choice==5) {
				
			}else if(choice==6) {
				break;
			}
		}
		sc.close();
	}
	public static void menu() {
		System.out.println("1.���������ȸ");
		System.out.println("2.�׸� ���� ��ȸ");
		System.out.println("3.���� ������ ����");
		System.out.println("4.�����߰�");
		System.out.println("5.��������");
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