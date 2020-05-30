package Classes_objects;
// extends 继承
public class Armor extends Item{
	int ac; //护甲等级
	
	public static void main(String[] args) {
		Armor cloth = new Armor();
		cloth.name = "布甲";
		cloth.price = 300;
		cloth.ac = 15;
		
		Armor chain =new Armor();
		chain.name = "锁子甲";
		chain.price = 500;
		chain.ac = 40;
	}
}
