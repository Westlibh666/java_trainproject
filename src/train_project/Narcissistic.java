package train_project;

//水仙花数定义：
//1. 一定是3位数
//2. 每一位的立方，加起来恰好是这个数本身，比如153=1*1*1+5*5*5+3*3*3
//寻找所有的水仙花数

public class Narcissistic {
//自己写的复杂
//	public static void main(String[] args) {
//		
//		for(var hundredth = 1; hundredth <= 9;hundredth++) {
//			for(var tenth = 0;tenth <= 9;tenth++) {
//				for(var oneth = 0;oneth <= 9;oneth++) {
//					var num = hundredth * 100 + tenth * 10 + oneth;
//					var lh = Math.pow(hundredth, 3);
//					var lt = Math.pow(tenth, 3);
//					var lo = Math.pow(oneth, 3);
//					var sum = lh + lt + lo;
//					if (num == sum) {
//						System.out.println(num);
//					}
//				}
//			}
//		}
//	}

	
	//比较简洁的写法，时间复杂度较低！！	
public static void main(String[] args) {
		 
        for (int i = 100; i < 1000; i++) {
 
            int baiwei = i / 100;
            int shiwei = i / 10 % 10;
            int gewei = i % 10;
            int cube = baiwei * baiwei * baiwei + shiwei * shiwei * shiwei + gewei * gewei * gewei;
            if (cube == i) {
                System.out.println("找到水仙花数:" + i);
            }
 
        }
 
    }
}
