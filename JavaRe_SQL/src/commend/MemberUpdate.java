package commend;

import java.util.Scanner;

import dao.MemberDao;

public class MemberUpdate implements ExecuteCommend {

	@Override
	public void executeQueryCommend() {
		System.out.println("회원정보 수정");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("아이디를 입력하세요 : ");
		String userId = input.next();
		
		System.out.print("변경할 비밀번호 : ");
		String userPw = input.next();
		
		System.out.print("변경할 이메일 주소 : ");
		String email = input.next();
		
		MemberDao dao = new MemberDao();
		int result = dao.UpdateDo(userId, userPw, email);
		
		System.out.println("결과 : " + result);
		
		if(result!=0){
			System.out.println("수정 성공.");
		}else {
			System.out.println("수정 실패. 다시 시도해주세요.");
		}
		
	}

}
