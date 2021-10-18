package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

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
					System.out.printf("���� : %s ",dtos.get(i).getNO());
					System.out.printf("���� : %s ",dtos.get(i).getTitle());
					System.out.printf("���� : %s ",dtos.get(i).getSinger());
					System.out.printf("�ۻ簡 : %s ",dtos.get(i).getLyticist());
					System.out.printf("�۰ : %s ",dtos.get(i).getSongWriter());
					System.out.printf("�߸��� : %s ",dtos.get(i).getRelease_Date());
					System.out.printf("�帣 : %s\n",dtos.get(i).getGenre());
				}
			}else if(choice==2) {
				
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
		System.out.println("1.���������ȸ");
		System.out.println("2.������ȸ");
		System.out.println("3.������ȸ");
		System.out.println("4.�����߰�");
		System.out.println("5.��������");
		System.out.println("6.�ǽð� ��Ʈ Ȯ��");
		System.out.println("7.����");
	}
	
	
}
