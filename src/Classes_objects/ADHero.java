package Classes_objects;

public class ADHero extends Hero{
	public void attack() {
		System.out.println(name + "进行了攻击，但不确定打中了谁！");
	}
	public void attack(Hero...heros) {
		for(var i = 0; i < heros.length;i++) {
			System.out.println(name+"攻击了"+heros[i].name);
		}
	}
	
	public static void main(String[] args) {
		ADHero h1 = new ADHero();
		h1.name = "赏金猎人";
		
		ADHero h2 = new ADHero();
		h2.name = "盖伦";
		
		ADHero h3 = new ADHero();
		h3.name = "提莫";
		
		h1.attack();
		h1.attack(h2);
		h1.attack(h2,h3);
	}
}
