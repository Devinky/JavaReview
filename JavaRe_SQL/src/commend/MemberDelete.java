package commend;

import java.util.Scanner;

import dao.MemberDao;

public class MemberDelete implements ExecuteCommend {

	@Override
	public void executeQueryCommend() {
		System.out.println("회원탈퇴");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("탈퇴할 아이디 : ");
		String userId = input.next();
		
		MemberDao dao = new MemberDao();
		int result = dao.DeleteDo(userId);
		
		System.out.println("결과 : " + result);
		
		if(result!=0) {
			System.out.println("탈퇴 성공. 다음에 다시 만나요~");
		}else {
			System.out.println("탈퇴 실패. 영원히 우리 회원입니다^^");
		}
	}

}
