package ch09_class.homepage;

import java.util.ArrayList;

public class BoardDB {
	private ArrayList<Board> boardlist = new ArrayList<Board>();
	// 싱글톤 적용
	private  BoardDB() {
		boardlist.add(new Board(1, "공지사항 필독","욕설금지","admin"));
		
	}
	private static BoardDB instance = new BoardDB();
	public static BoardDB getInstance() {
	return instance;
		}
	
	// 게시글 목록 출력
	public void showBoardList() {
		for(int i = 0; i < boardlist.size(); i++) {
			System.out.println(boardlist.get(i));
		}
	}
	// 게시글 추가
	public void addBoard(Board board) {
		board.setNo(boardlist.size() +1);
		boardlist.add(board);
	}
	// 게시글 조회
	public void selectBoard(int no) {
		for(int i = 0 ; i < boardlist.size(); i++) {
			Board board = boardlist.get(i);
			if(board.getNo() == no) {
				System.out.println("제목:" + board.getTitle());
				System.out.println("작성자: " + board.getAuthor());
				System.out.println("내용: " + board.getContent());
				System.out.println(board.getContent());
				return;
			}
		}
		System.out.println("존재하지 않는 글 번호입니다.");
	}
	
	// 게시글 삭제
	public void deleteBoard(int no, String id) {
		for(int i = 0 ; i < boardlist.size(); i++) {
			Board board = boardlist.get(i);
			if(board.getNo() == no) {
				if(board.getAuthor().equals(id)) {
					System.out.println("삭제 게시글");
					System.out.println("제목:" + board.getTitle());
					System.out.println("작성자: " + board.getAuthor());
					System.out.println("내용: " + board.getContent());
					boardlist.remove(i);
					return;
				}else {
					System.out.println("작성자가 아닙니다.");
					return;
				}
				
			}
		}
		System.out.println("존재하지 않는 글 번호입니다.");
	}
	
	}

