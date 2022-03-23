package guide;

import java.util.ArrayList;

public class MemberManagement extends AppBase
{

	@Override
	protected void isRun() {
		while(true) {
			System.out.println("프로그램 시작!");
			System.out.println("=====================================================");
			System.out.println("1.회원가입|2.로그인|3.회원정보|4.회원정보수정|5.회원탈퇴|6.종료");
			System.out.println("=====================================================");
			System.out.println("메뉴 선택 > ");
			
			int Num = sc.nextInt();
			
			switch(Num) {
			case 1 :
				join();
				break;
			case 2 :
				login();
				break;
			case 3 :
				select();
				break;
			case 4 :
				update();
				break;
			case 5 :
				delete();
				break;
			case 6 :
				terminate();
				break;
			}
		}
	}

	@Override
	protected void terminate() {
		return;
	}

	@Override
	protected void join() {
		System.out.println("== 회원가입 ==");
		System.out.println("아이디를 입력해주세요");
		String id = sc.next();
		System.out.println("비밀번호를 입력해주세요");
		String pw = sc.next();
		System.out.println("비밀번호를 한번 더 입력해주세요");
		String rePw = sc.next();
		System.out.println("이름을 입력해주세요");
		String name = sc.next();
		
		ArrayList<Member> list = new ArrayList<>();
//		Member m = new Member(list.size(), name, id, pw, getLeg());
	}

	@Override
	protected void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void select() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void deleteMember() {
		// TODO Auto-generated method stub
		
	}

}
