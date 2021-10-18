package dto;

public class MemberVO {

	private int no;
	private String title;
	private String singer;
	private String lyricist;
	private String songwriter;
	private String release_date;
	private String genre;
	
	public MemberVO(int no, String title, String singer, String lyricist,
			String songwriter, String release_date, String genre) {
		
		this.no=no;
		this.title=title;
		this.singer=singer;
		this.lyricist=lyricist;
		this.songwriter=songwriter;
		this.release_date=release_date;
		this.genre=genre;
	}
	
	public void setNO(int no) {
		this.no=no;
	}
	public int getNO() {
		return no;
	}
	
	
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	
	
	public void setSinger(String singer) {
		this.singer=singer;
	}
	public String getSinger() {
		return singer;
	}
	
	
	public void setLyricist(String lyricist) {
		this.lyricist=lyricist;
	}
	public String getLyticist() {
		return lyricist;
	}
	
	
	public void setSongWriter(String songwriter) {
		this.songwriter=songwriter;
	}
	public String getSongWriter() {
		return songwriter;
	}
	
	public void setRelease_Date(String release_date) {
		this.release_date=release_date;
	}
	public String getRelease_Date() {
		return release_date;
	}
	
	
	public void setGenre(String genre) {
		this.genre=genre;
	}
	public String getGenre() {
		return genre;
	}
}
