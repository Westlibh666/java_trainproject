package Classes_objects;

public class Hero2 {
	 String name;
	 double life;
	 double armor;
	 double movespeed;
	 ///////////////////////////////////
	 //构造方法
	 //方法名和类名一样（包括大小写）
	 //没有返回类型
	 //实例化一个对象的时候，必然调用构造方法
	 public Hero2(String heroName) {
		 heroName = name;
	 }
	 
	 public Hero2(String heroName,double heroHp) {
		 heroName = name;
		 heroHp = life;
		 
	 }
	 
	 public Hero2(String heroName,double heroHp,
			 double heroArmor,double heroMoveSpeed) {
		 heroName = name;
		 heroHp = life;
		 heroArmor = armor;
		 heroMoveSpeed = movespeed;
	}
	 public static void main(String[] args) {
//	        Hero2 garen =  new Hero2("盖伦"); 
//	        Hero2 teemo =  new Hero2("提莫",383);
//	        Hero2 db =  new Hero2("死哥",400,27,360);
	 
	 
}
}
