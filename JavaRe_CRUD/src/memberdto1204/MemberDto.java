package memberdto1204;

public class MemberDto {
	
	private String userId;
	private String userPw;
	private String email;
	private String userName;
	
	public MemberDto(String userId, String userPw, String email, String userName) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.email = email;
		this.userName = userName;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
