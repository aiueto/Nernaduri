package vo;
//회원 하나의 정보
public class MemberBean {
	
	private String member_ID;
	private String passwd;
	private String passwd2;
	private String name;
	private String email;
	private String birthday;
	private String gender;
	private String area;
	private String question1;
	private String question2;
	private String musicGenre;
	private String movieGenre;
	
	public String getMember_ID() {
		return member_ID;
	}
	public String getPasswd() {
		return passwd;
	}
	public String getPasswd2() {
		return passwd2;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getBirthday() {
		return birthday;
	}
	public String getGender() {
		return gender;
	}
	public String getArea() {
		return area;
	}
	public String getQuestion1() {
		return question1;
	}
	public String getQuestion2() {
		return question2;
	}
	public String getMusicGenre() {
		return musicGenre;
	}
	public String getMovieGenre() {
		return movieGenre;
	}
	public void setMember_ID(String member_ID) {
		this.member_ID = member_ID;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public void setPasswd2(String passwd2) {
		this.passwd2 = passwd2;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public void setQuestion1(String question1) {
		this.question1 = question1;
	}
	public void setQuestion2(String question2) {
		this.question2 = question2;
	}
	public void setMusicGenre(String musicGenre) {
		this.musicGenre = musicGenre;
	}
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	
}
