package character;

public class Support extends Hero implements Healer{

	@Override
	public void heal(Hero...heros) {
		for(var i = 0;i <= heros.length;i++) {
			System.out.println(name+"对"+heros[i].name+"进行了治疗！");// TODO 自动生成的方法存根
		}
		
	}

	@Override
	public void heal() {
		System.out.println(name+"使用了自愈技能！");// TODO 自动生成的方法存根
		
	}

	@Override
	public void heal(Hero her, int Hp) {
		System.out.println(name+"为"+her.name+"使用了治疗技能，恢复了"+Hp+"生命");// TODO 自动生成的方法存根
		
	}

}
