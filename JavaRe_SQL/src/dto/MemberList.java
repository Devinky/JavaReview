package dto;

public class MemberList {
	
	private String userId;
	private String userPw;
	private String email;
	
	//로그인 용도의 생성자(아이디, 비밀번호로 로그인 로직 생성)
	public MemberList(String userId, String userPw) {
		this.userId = userId;
		this.userPw = userPw;
	}
	
	public MemberList(String userId, String userPw, String email) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.email = email;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
