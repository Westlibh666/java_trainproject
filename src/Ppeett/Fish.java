package Ppeett;

public class Fish extends Animal implements Pet{
	private String name;
	
	protected Fish() {
		super(0);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void eat() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public String getName() {
		// TODO 自动生成的方法存根
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name =name;// TODO 自动生成的方法存根
		
	}

	@Override
	public void play() {
		// TODO 自动生成的方法存根
		
	}
	
	public void walk() {
		System.out.println("鱼因为没有腿不能走路");
	}
	
	public static void main(String[] args) {
		Fish fi = new Fish();
		fi.setName("鲤鱼");
		fi.walk();
	}

}
