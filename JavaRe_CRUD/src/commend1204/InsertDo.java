package commend1204;

import java.util.Scanner;
import dao1204.MemberDao;

public class InsertDo implements ExcuteQueryCommend {

	@Override
	public void excuetQueryCommend() {
		
		System.out.println("회원가입");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("ID : ");
		String userId = input.next();
		
		System.out.print("Password : ");
		String userPw = input.next();
		
		System.out.print("E-Mail : ");
		String email = input.next();
		
		System.out.print("Name : ");
		String userName = input.next();
		
		MemberDao dao = new MemberDao();
		int result = dao.InsertDo(userId, userPw, email, userName);
		
		if(result!=1) {
			System.out.println("회원가입 실패. 다시 시도해주세요.");
		}else {
			System.out.println("회원가입이 완료되었습니다");
		}
		
	}

}
