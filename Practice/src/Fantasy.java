
public class Fantasy {

	public static void main(String[] args) {

		Warrior wa = new Warrior();
		wa.setStrength("엄청난방어력!!");
		System.out.println(wa.getStrength());
		
		Warrior wa2 = new Warrior("대검","판금갑옷",4000,1900,"터질듯한근육질");
			System.out.println(wa2.getWeapon()+","+wa2.getArmor()+","+"Hp"+wa2.getHp()+","+"Mp"+wa2.getMp()+"을 가진 "+wa2.getStrength()+"의 전사가 나타났다.");
	}

}

class Game {
	private String weapon;
	private String armor;
	private int hp;
	private int mp;
	
	public Game() {System.out.println("Game");}
	public Game(String weapon,String armor,int hp,int mp) {
		System.out.println("Game()");
		this.weapon = weapon;
		this.armor = armor;
		this.hp = hp;
		this.mp = mp;
	}
	
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	public String getArmor() {
		return armor;
	}
	public void setArmor(String armor) {
		this.armor = armor;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	void ActiveSkill() {}
	
	void PassiveSkill() {}
}

class Warrior extends Game {
	private String strength;
	
	public Warrior() {System.out.println("warrior");}
	public Warrior(String weapon,String armor,int hp,int mp,String strength) {
		super(weapon,armor,hp,mp);
		this.strength = strength;
		System.out.println("Warrior()");
	}
	
	
	
	
	
	
	public String getStrength() {
		return strength;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

	
	void provoke() {}
}

class Magician extends Game {
	public String getDistancelong() {
		return distancelong;
	}

	public void setDistancelong(String distancelong) {
		this.distancelong = distancelong;
	}

	private String distancelong;
	
	void element() {}
}

class Healer extends Game {
	private String support;
	
	void buff() {}

	public String getSupport() {
		return support;
	}

	public void setSupport(String support) {
		this.support = support;
	}
}