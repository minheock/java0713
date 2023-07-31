package ch09_class.homepage;

import java.util.Scanner;

public class HomepageMain {
	public static void main(String[] args) {
		// 회원가입, 로그인
		MemberDB memDB = MemberDB.getInstance();
		// 게시판, 조회, 작성, 삭제, 
		BoardDB boardDB = BoardDB.getInstance();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 회원가입|2.로그인|3.회원목록|4.종료");
			System.out.print(">>> ");
			int command = Integer.parseInt(scan.nextLine());
			if(command ==1) {
				System.out.println("아이디를 입력해주세요");
				System.out.print(">>> ");
				String id = scan.nextLine();
				
				System.out.println("비번을 입력해주세요");
				System.out.print(">>> ");
				String pw = scan.nextLine();
				
				System.out.println("이름를 입력해주세요");
				System.out.print(">>> ");
				String name = scan.nextLine();
				Member mem = new Member(id, pw, name);
				memDB.registMember(mem);
			}else if(command == 2) {
				System.out.println("아이디를 입력해주세요");
				System.out.println(">>> ");
				String id = scan.nextLine();
				System.out.println("패스워드를 입력해주세요");
				System.out.println(">>> ");
				String pw = scan.nextLine();
				Member login = memDB.login(id, pw);
				if(login != null) {
					System.out.println("로그인 성공");
					System.out.println(login.getName() + "님 환영 합니다.");
					// 게시판
					// 글쓰기
					// 글조회
					// 로그아웃
					while(true) {
						System.out.println("행동을 선택해주세요 ^^");
						System.out.println("1.글쓰기|2.글조회|3.글삭제|4.로그아웃");
						System.out.print(">>> ");
						int select = Integer.parseInt(scan.nextLine());
						if(select == 1) {
							System.out.println("글 제목을 입력하세요");
							System.out.print(">>> ");
							String title = scan.nextLine();
							System.out.println("글 내용을 입력하세요");
							System.out.print(">>> ");
							String content = scan.nextLine();
							Board board = new Board(0, title, content, login.getId());
							// number 1씩 올라감.
							boardDB.addBoard(board);
						}else if(select == 2) {
							System.out.println("글 번호를 입력해주세요");
							System.out.print(">>> ");
							int no = Integer.parseInt(scan.nextLine());
							boardDB.selectBoard(no);
						}else if(select == 3) {
							// 삭제 내일
						}else if(select == 4) {
							// 로그아웃
							break;
						}
					}
					
					
					
				}else {
					System.out.println("아이디 혹은 비밀번호가 다릅니다.");
				}
			}else if(command == 3) {
				// 목록조회
				memDB.showMemberList();
			}else if(command == 4) {
				break;
			}
			
		}
		// 게시판 목록
		// 글쓰기
		// 글 조회
		// 로그아웃
	}
}
