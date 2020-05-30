package Ppeett;

public class Cat extends Animal implements Pet{

	private String name;
	
	public Cat(String name) {
		super(4);
		this.name = name;
		// TODO 自动生成的构造函数存根
	}
	
	public Cat() {
		this(" ");
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;// TODO 自动生成的方法存根
		
	}

	@Override
	public void play() {
		System.out.println(this.name+"is playing");// TODO 自动生成的方法存根
		
	}

	@Override
	public void eat() {
		System.out.println(this.name+"eating");// TODO 自动生成的方法存根
		
	}
	
	public static void main(String[] args) {
		
		Cat ca = new Cat();
		ca.setName("加菲");
		ca.eat();
		ca.play();
		
		ca.walk(4);;
		
	}

}
