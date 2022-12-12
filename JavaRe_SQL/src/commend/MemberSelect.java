package commend;

import java.util.List;

import dao.MemberDao;
import dto.MemberList;

public class MemberSelect implements ExecuteCommend {

	@Override
	public void executeQueryCommend() {
		System.out.println("회원목록 조회");
		
		MemberDao dao = new MemberDao();
		List<MemberList> mList = dao.SelectDo();
		
		if(mList!=null) {
			System.out.println("========================회원목록=========================");
			for(MemberList member: mList) {
				System.out.print("아이디 : " + member.getUserId() + " | ");
				System.out.print("비밀번호 : " + member.getUserPw() + " | ");
				System.out.println("이메일 : " + member.getEmail());
			}
			System.out.println("=========================================================");
		}else {
			System.out.println("조회할 회원이 없습니다.");
		}
		
	}
	
}
