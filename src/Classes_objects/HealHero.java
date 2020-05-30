package Classes_objects;

public class HealHero extends Hero{
	public void heal() {
		System.out.println(name+"使用了治疗技能");
	}
	public void heal(Hero...heros) {
		for(var i = 1;i < heros.length;i++) {
			System.out.println(name+"对"+heros[i].name+"使用了治疗技能");
		}
	}
	public void heal(Hero her,int Hp) {
		System.out.println(name+"为"+her.name+"加了"+Hp+"的血");
	}
	
	public static void main(String[] args) {

		HealHero hh1 =new HealHero();
		hh1.name = "蔡文姬";
		
		Hero h1 = new Hero();
		h1.name = "后裔";
		
		Hero h2 = new Hero();
		h2.name = "虞姬";
		
		Hero h3 = new Hero();
		h3.name = "鲁班七号";
		
		hh1.heal();
		hh1.heal(h1,h2,h3);
		hh1.heal(h3,10000);
	}
}
