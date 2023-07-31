package ch09_class.homepage;

public class Member {
	private String Id;			
	private String passwor;
	private String name;
	
	public Member(String id, String passwor, String name) {
		Id = id;				//아이디
		this.passwor = passwor; //비밀번호
		this.name = name;		//이름
	}

	@Override
	public String toString() {
		return "Member [Id=" + Id + ", passwor=" + passwor + ", name=" + name + "]";
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getPasswor() {
		return passwor;
	}

	public void setPasswor(String passwor) {
		this.passwor = passwor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
