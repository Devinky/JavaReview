package commend1204;

import java.util.Scanner;
import dao1204.MemberDao;

public class UpdateDo implements ExcuteQueryCommend {

	@Override
	public void excuetQueryCommend() {
		
		System.out.println("회원수정");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("ID : ");
		String userId = input.next();

		System.out.print("Password : ");
		String userPw = input.next();

		System.out.print("E-Mail : ");
		String email = input.next();

		System.out.print("name : ");
		String userName = input.next();
		
		MemberDao dao = new MemberDao();
		int result = dao.UpdateDo(userId, userPw, email, userName);
		
		if(result!=1) {
			System.out.println("회원수정 실패. 다시 시도해주세요.");
		}else {
			System.out.println("회원정보 수정 성공");
		}
	}

}
