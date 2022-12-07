package review.project.commend;

import java.util.Scanner;

import review.project.dao.MemberDao;

public class MemberInsert implements ExecuteQueryCommend {

	@Override
	public void ExecuteCommend() {
		System.out.println("\n회원가입");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String userId = input.next();
		
		System.out.print("비밀번호 : ");
		String userPw = input.next();
		
		System.out.print("이름(닉네임) : ");
		String userName = input.next();
		
		System.out.print("이메일 : ");
		String email = input.next();
		
		MemberDao dao = new MemberDao();
		int result = dao.InsertDo(userId, userPw, userName, email);
		
		if(result!=1) {
			System.out.println("회원가입 실패. 다시 시도해주세요.");
		}else {
			System.out.println("회원가입 성공. 환영합니다^^");
		}
	}

}
