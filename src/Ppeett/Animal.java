package Ppeett;

//创建Animal类，它是所有动物的抽象父类。
public abstract class Animal {
	protected int legs;
	
	//一个受保护的构造器，用来初始化legs属性。
	protected Animal(int legs) {
		this.legs = legs;
	}
	
	public abstract void eat();
	
	public void walk(int legs) {
		switch(legs) {
		case 0 :
			System.out.println(legs+"条腿，行走方式为水中游。");
			break;
		case 4:
			System.out.println(legs+"条腿,可以跑可以跳。");
			break;
		case 8:
			System.out.println(legs+"条腿,一般为爬行。");
			break;
		default:
			System.out.println("另外的物种。");
		}
	}
	
	public static void main(String[] args) {
		
	}

	}

