package character;

public class APHero extends Hero implements AP,Mortal{

	@Override
	public void magicAttack() {
		System.out.println("发动了一次魔法攻击！");// TODO 自动生成的方法存根
		
	}

	@Override
	public void die() {
		System.out.println(name+"阵亡于魔法攻击！");// TODO 自动生成的方法存根
		
	}

}
