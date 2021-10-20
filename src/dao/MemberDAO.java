package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dto.MemberVO;

public class MemberDAO {
	private ArrayList<MemberVO> dtos;
	private Connection con;
	private Statement st;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public MemberDAO() {
		dtos = new ArrayList<MemberVO>();
		try {
			String user="system";
			String pw="1234";
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,user,pw);
			st=con.createStatement();
		}catch(Exception e) {
			System.out.println("데이터베이스 연결 오류:"+e.getMessage());
		}	
	}

	public ArrayList<MemberVO> getAllMembers() {
		String SQL="SELECT * FROM music_chart";
		try {
			rs=st.executeQuery(SQL);
			while(rs.next()) {	
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String singer = rs.getString("singer");
				String lyricist = rs.getString("lyricist");
				String songwriter = rs.getString("songwriter");
				String release_date = rs.getString("release_date");
				String genre = rs.getString("genre");
				MemberVO VO=new MemberVO(no,title,singer,lyricist,songwriter,release_date,genre);
				dtos.add(VO);
				//ArrayList에 회원정보 추가
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return dtos;
	}
	public ArrayList<MemberVO> SearchByRank(String input_name) {
		String SQL = "SELECT * FROM music_chart where no like "+input_name;
		try {
			rs=st.executeQuery(SQL);
			while(rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String singer = rs.getString("singer");
				String lyricist = rs.getString("lyricist");
				String songwriter = rs.getString("songwriter");
				String release_date = rs.getString("release_date");
				String genre = rs.getString("genre");
				MemberVO VO=new MemberVO(no,title,singer,lyricist,songwriter,release_date,genre);
				dtos.add(VO);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return dtos;
	}
	public ArrayList<MemberVO> Search(String condition,String input_name) {
		String SQL = "SELECT * FROM music_chart where "+condition+" like '%"+input_name+"%'";
		try {
			rs=st.executeQuery(SQL);
			while(rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String singer = rs.getString("singer");
				String lyricist = rs.getString("lyricist");
				String songwriter = rs.getString("songwriter");
				String release_date = rs.getString("release_date");
				String genre = rs.getString("genre");
				MemberVO VO=new MemberVO(no,title,singer,lyricist,songwriter,release_date,genre);
				dtos.add(VO);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return dtos;
	}
	public ArrayList<MemberVO> setMembers(int no, String title, String singer,String lyricist,String songwriter,String release_date,String genre) {
			String SQL = "Insert INTO music_chart(no,title,singer,lyricist,songwriter,release_date,genre) VALUES(?,?,?,?,?,?,?)";
			try {
				pstmt=con.prepareStatement(SQL);
				pstmt.setInt(1, no);
				pstmt.setString(2, title);
				pstmt.setString(3, singer);
				pstmt.setString(4, lyricist);
				pstmt.setString(5, songwriter);
				pstmt.setString(6, release_date);
				pstmt.setString(7, genre);
				pstmt.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return dtos;
		}
	public ArrayList<MemberVO> deleteMembers(String input_title) {
		String SQL = "delete from music_chart where title='"+input_title+"'";
		try {
			rs=st.executeQuery(SQL);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return dtos;
	}
}

