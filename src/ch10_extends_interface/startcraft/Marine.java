package ch10_extends_interface.startcraft;

public class Marine extends StarUnit{

	public Marine() {
		this("마린", 6, 50, 0);
		
	}

	public Marine(String name, int damage, int hp, int armor) {
		super(name, damage, hp, armor);
	}
	public void stimpack() {
		System.out.println("두두두두두~숴리야!!!!");
		super.setHp(super.getHp() - 10);
		super.setDamage(super.getDamage());
		super.setDamage(super.getDamage() / 2);
	}
	
}
