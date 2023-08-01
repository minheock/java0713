package ch10_extends_interface.startcraft;

public class HighTemplar extends StarUnit{
	private int shield;
	private int mp;
	
	public HighTemplar() {
		this("하이템플러", 0, 60, 0, 50, 150);
	}
	public HighTemplar(String name, int damage, int hp, int armor , int shield, int mp) {
		super(name, damage, hp, armor);
		this.shield = shield;
		this.mp = mp;
	}
	
	public void Storm() {
		mp -= 75;
		System.out.println("지지지직직 쿵!!");
	}
	
	
	public int getShield() {
		return shield;
	}
	public void setShield(int shield) {
		this.shield = shield;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	@Override
	public String toString() {
		return "HighTemplar [shield=" + shield + ", mp=" + mp + ", getName()=" + getName() + ", getDamage()="
				+ getDamage() + ", getHp()=" + getHp() + ", getArmor()=" + getArmor() + "]";
	}
}
