package character;

public class MagicPotion extends Item2{
	public void effect(){
        System.out.println("蓝瓶使用后，可以回魔法");
    }
 
    @Override
    public boolean disposable() {
        // TODO Auto-generated method stub
        return true;
    }
}
