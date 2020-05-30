package character;

public abstract class Item2 {
	String name;
	int price;
	public abstract boolean disposable();
	
	public static void main(String[] args) {
		Item2 it = new Item2() {
			
			@Override
			public boolean disposable() {
				// TODO 自动生成的方法存根
				return false;
			}
		};
		System.out.println(it.disposable());
	}
}
