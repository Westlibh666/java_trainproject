package character;

public class Hero {
	String name;
	int health;
	int movespeed;
    double armor;
	
	public void kill(Mortal m) {
		System.out.println(name+"释放了大招！");
		m.die();		
	}
	
	public static void main(String[] args) {
		Hero kai = new Hero();
		kai.name = "凯";
		
		ADHero luban = new ADHero();
		luban.name = "鲁班七号";
		
		APHero xiaoqiao = new APHero();
		xiaoqiao.name = "小乔";
		
		ADAPHero yao = new ADAPHero();
		yao.name = "曜";
		
		
		kai.kill(luban);
		kai.kill(xiaoqiao);
		kai.kill(yao);
	}
}
