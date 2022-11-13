package org.review.classEX;

//클래스 연습
//클래스에 필드 선언하기
//퍼블릭 클래스(다른 클래스에서도 사용 가능)
public class ClassEX {
	
	String userID;
	int userPW;
	String userName;
	
	
	public ClassEX() {	//기본생성자(원래 자동생성)
	}
	
	//그럼 이건 대체 뭐에 쓰는 거냐?
	public ClassEX(String userID) {
		this.userID = "devinky";
	}

}
