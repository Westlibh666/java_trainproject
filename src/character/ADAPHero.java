package character;

public class ADAPHero extends Hero implements AD,AP,Mortal{

	@Override
	public void magicAttack() {
		System.out.println("发动了一次魔法攻击！");// TODO 自动生成的方法存根
		
	}

	@Override
	public void physicAttack() {
		System.out.println("发动了一次物理攻击！");// TODO 自动生成的方法存根
		
	}

	@Override
	public void physicAttack(Hero... heros) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void physicAttack(Hero her, int Hp) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void die() {
		System.out.println(name+"阵亡于混合攻击！");// TODO 自动生成的方法存根
		
	}

}
