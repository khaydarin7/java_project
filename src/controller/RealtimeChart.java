package controller;

import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class RealtimeChart {
	public static void ViewRealtimeChart() {
		String url="https://www.genie.co.kr/chart/top200";
	    Document doc = null;
	    try {
	        doc=Jsoup.connect(url).get();
	        Elements element = doc.select("table.list-wrap");
	        Iterator<Element> songName = element.select("a.title.ellipsis").iterator();
	        Iterator<Element> artist = element.select("a.artist.ellipsis").iterator();
	        Iterator<Element> albumtitle = element.select("a.albumtitle.ellipsis").iterator();
	        int rank = 0;
	        while(rank < 50) {
	            rank++;
	            System.out.println(rank + "À§ " + artist.next().text() + " - " + songName.next().text() + " / " + albumtitle.next().text());
	        }
	        }catch(IOException e) {
	            e.printStackTrace();
	        }
	    url="https://www.genie.co.kr/chart/top200?ditc=D&ymd=20210702&hh=10&rtm=Y&pg=2";
	    doc = null;
	    try {
	        doc=Jsoup.connect(url).get();
	        Elements element = doc.select("table.list-wrap");
	        Iterator<Element> songName = element.select("a.title.ellipsis").iterator();
	        Iterator<Element> artist = element.select("a.artist.ellipsis").iterator();
	        Iterator<Element> albumtitle = element.select("a.albumtitle.ellipsis").iterator();
	        int rank = 50;
	        while(rank < 100) {
	            rank++;
	            System.out.println(rank + "À§ " + artist.next().text() + " - " + songName.next().text() + " / " + albumtitle.next().text());
	        }
	        }catch(IOException e) {
	            e.printStackTrace();
	        }
	}

}
