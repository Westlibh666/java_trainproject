package character;

public class ADHero extends Hero implements AD,Mortal{

	@Override
	public void physicAttack() {
		System.out.println("发动了一次物理攻击！");// TODO 自动生成的方法存根
		
	}

	@Override
	public void physicAttack(Hero... heros) {
		for(var i = 0;i <= heros.length;i++) {
			System.out.println(name+"对"+heros[i].name+"发起了攻击！");// TODO 自动生成的方法存根
		
	}
	}

	@Override
	public void physicAttack(Hero her, int Hp) {
		System.out.println(name+"攻击了"+her.name+"造成"+Hp+"生命");// TODO 自动生成的方法存根
		
	}

	@Override
	public void die() {
		System.out.println(name+"阵亡于物理攻击！");// TODO 自动生成的方法存根
		
	}
	
}
