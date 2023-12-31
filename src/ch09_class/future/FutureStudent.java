package ch09_class.future;


public class FutureStudent {

	private static int cnt = 1;
	
	private int stuId;
	private String name;
	private String enName;
	private int level;
	private int exp;
	
	public FutureStudent(String name, String enName, int level, int exp) {
		this.stuId = cnt;
		this.name = name;
		this.enName = enName;
		this.level = level;
		this.exp = exp;
		cnt++;
	}
	public FutureStudent(String name, String enName) {
		// 생성자 오버로딩 객체 생성시 매개변수를 2개만 입력한다면
		// level과 exp는 1과 0으로 디폴트값을 넣어 메인 생성자 호출
		this(name, enName, 1, 0);
	}
	@Override
	public String toString() {
		return "미래 융합 학생 [stuId=" + stuId + ", name=" + name + ", enName=" + enName + ", level=" + level + ", exp="
				+ exp + "]";
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEnName() {
		return enName;
	}
	public void setEnName(String enName) {
		this.enName = enName;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public static int getCnt() {
		return cnt;
	}
	// 하루가 지나는 이벤트 메서드
	public void endDay() {
		// 20 ~ 60 사이의 랜덤 숫자
		int rand = (int)((Math.random() * 51) + 20);
		exp += rand;
		System.out.println(this.name + "씨의 현재 경험치 :" + exp);
		if(exp >= 100) {
			System.out.println("레벨업!");
		level++;
		System.out.println(name + "씨의 현재 레벨:" + level);
		exp -= 100;
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
