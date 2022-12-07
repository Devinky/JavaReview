package review.project.commend;

import java.util.List;

import review.project.dao.MemberDao;
import review.project.dto.MemberDto;

public class MemberSelect implements ExecuteQueryCommend {

	@Override
	public void ExecuteCommend() {
		System.out.println("\n회원목록조회");
		
		MemberDao dao = new MemberDao();
		List<MemberDto> userlist = dao.SelectDo();
		
		if(userlist!=null) {
			System.out.println("=====================================회원목록======================================");
			for(MemberDto list: userlist) {
				System.out.println("아이디 : " + list.getUserId() + " | "  
									+ "비밀번호 : " + list.getUserPw() + " | "
									+ "이름(닉네임) : " + list.getUserName() + " | " 
									+ "이메일 : " + list.getEmail());
			}
		}else {
			System.out.println("조회할 회원이 없습니다.");
		}
	}

}
