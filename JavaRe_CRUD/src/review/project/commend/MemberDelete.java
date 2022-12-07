package review.project.commend;

import java.util.Scanner;

import review.project.dao.MemberDao;

public class MemberDelete implements ExecuteQueryCommend {

	@Override
	public void ExecuteCommend() {
		System.out.println("회원탈퇴");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("탈퇴하시겠습니까?(yes or no) : ");
		String ans = input.next();
		
		if(ans.equals("yes")) {
			
			System.out.print("탈퇴할 회원 아이디 : ");
			String userId = input.next();
			MemberDao dao = new MemberDao();
			int result = dao.DeleteDo(userId);

			if(result!=1) {
				System.out.println("탈퇴 실패. 영원히 우리 회원입니다^^");
			}else {
				System.out.println("탈퇴되었습니다. 다음에 또 만나요^^");
			}
		}else if(ans.equals("no")) {
			System.out.println("탁월한 선택이십니다^^");
		}else {
			System.out.println("입력 오류. 그냥 탈퇴하지 마세요.");
		}
	}

}
