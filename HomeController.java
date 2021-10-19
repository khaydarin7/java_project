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
					System.out.printf("%d���� ", dtos.get(i).getNO());
					System.out.printf("�̸�: %s\n", dtos.get(i).getNAME());
					System.out.printf("����: %s\n", dtos.get(i).getPRICE());
					System.out.printf("����: %s\n", dtos.get(i).getsetPRODUCTION_COMPANY());
					System.out.printf("���: %s\n", dtos.get(i).getDISTRIBUTOR());
					System.out.printf("�帣: %s\n", dtos.get(i).getGENRE());
					System.out.printf("�������: %s\n", dtos.get(i).getRELEASE_DATE());
					System.out.printf("�÷���: %s\n", dtos.get(i).getPLATFORME());
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
				default : System.out.println("�߸��Է��ϼ̽��ϴ�.");
					break;
					
				}
				
			}else if(choice==3) {
				
				
				
			}else if(choice==4) {
				
				dtos=service.getGame();
				for(int i=0; i<dtos.size(); i++) {
				System.out.printf("����:%s/n",dtos.get(i).getNO());
				System.out.printf("���� �̸�:%s\n",dtos.get(i).getNAME());
				System.out.printf("����: %s\n", dtos.get(i).getPRICE());
				System.out.printf("����: %s\n", dtos.get(i).getsetPRODUCTION_COMPANY());
				System.out.printf("���: %s\n", dtos.get(i).getDISTRIBUTOR());
				System.out.printf("�帣: %s\n", dtos.get(i).getGENRE());
				System.out.printf("�������: %s\n", dtos.get(i).getRELEASE_DATE());
				System.out.printf("�÷���: %s\n", dtos.get(i).getPLATFORME());
				
			}else if(choice==5) {
				
			}else if(choice==6) {
				
			}else if(choice==7) {
				
			}
			
		}

	}
	
	public static void menu() {
		System.out.println("1.������ PC���� ��� ��ȸ");
		System.out.println("2.���� ��ȸ");
		System.out.println("3.������������");
		System.out.println("4.���ӵ������߰�");
		System.out.println("5.���ӵ����ͻ���");
		System.out.println("6.�ǽð� ��Ʈ ��ȸ");
		System.out.println("7.����");
		
	}

	public static void conditionMenu() {
		System.out.println("1.�̸����� ��ȸ");
		System.out.println("2.�������� ��ȸ");
		System.out.println("3.���ۻ�� ��ȸ");
		System.out.println("4.��޻�� ��ȸ");
		System.out.println("5.�帣�� ��ȸ");
		System.out.println("6.������ڷ� ��ȸ");
		System.out.println("7.�÷������� ��ȸ");
		
		
	}
}
