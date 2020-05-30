package character;

public class Item extends Object{
	String name;
	int price;
	
	//toString()的意思是返回当前对象的字符串表达
	public String toString() {
		return name + "的价格是" + price;
	}
	
	//当一个对象没有任何引用指向的时候，它就满足垃圾回收的条件
	//finalize()
	public void finalize() {
		System.out.println("超出内存，正在回收！");
	}
	
	//equals() 用于判断两个对象的内容是否相同
	public boolean equals(Object o) {
		//instanceof 严格来说是Java中的一个双目运算符
		//用来测试一个对象是否为一个类的实例
		if (o instanceof Item) {
			Item p = (Item) o;
			return p.price == this.price;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Item i1 = new Item();
		i1.name = "草鞋";
		i1.price = 130;
		
		Item i2 = new Item();
		i2.name = "布鞋";
		i2.price = 130;
		
		Item i3 = new Item();
		i3.name = "童鞋";
		i3.price = 131;
		
		System.out.println(i1.toString());
		System.out.println(i1.equals(i2));
		System.out.println(i2.equals(i3));
		
	}
	
}
