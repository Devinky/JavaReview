package review.project.commend;

import java.util.Scanner;

import review.project.dao.MemberDao;

public class MemberUpdate implements ExecuteQueryCommend {

	@Override
	public void ExecuteCommend() {
		System.out.println("\n회원정보수정");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String userId = input.next();
		
		System.out.print("변경할 비밀번호 : ");
		String userPw = input.next();
		
		System.out.print("변경할 이름(닉네임) : ");
		String userName = input.next();
		
		System.out.print("변경할 이메일 주소 : ");
		String email = input.next();
		
		MemberDao dao = new MemberDao();
		int result = dao.UpdateDo(userId, userPw, userName, email);
		
		System.out.println("\n아이디 : " + userId + " | " + "비밀번호 : " + userPw + " | " 
							+"이름(닉네임) : " + userName + " | " + "이메일 : " + email);
		System.out.print("해당 정보로 수정하시겠습니까?(yes or no) : ");
		String ans = input.next();
		
		if(ans.equals("yes")) {
			if(result!=1) {
				System.out.println("회원정보 수정 실패. 다시 시도해주세요.");
			}else {
				System.out.println("회원정보 수정 성공");
			}
		}else if(ans.equals("no")) {
			System.out.println("회원정보 수정을 취소합니다.");
		}else {
			System.out.println("입력 오류. 다시 시도해주세요.");
		}
		
	}
	
}
