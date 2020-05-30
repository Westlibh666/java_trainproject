package character;

public class LifePotion extends Item2{
	String name;
	double life;
	
	 public void effect(){
	        System.out.println("血瓶使用后，可以回血");
	    }
	
	@Override
	public boolean disposable() {
		// TODO 自动生成的方法存根
		return true;
	}
	
}
