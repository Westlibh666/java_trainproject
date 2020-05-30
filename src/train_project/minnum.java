package train_project;
//首先创建一个长度是5的数组
//然后给数组的每一位赋予随机整数
//通过for循环，遍历数组，找出最小的一个值出来
public class minnum {
	public static void main(String[] args) {
		//定义数组
		int[] a = new int[5];
		
		//5个随机整数
		for(var i = 0;i <= 4;i++) {
			a[i]=(int)(Math.random()*100);
			//Math.random()生成0-1之间的浮点数
			System.out.println(a[i]);
		}
		
		//错误输出，这种输出为数组的首地址
		//System.out.println(a);
		
		int min = a[0];
		
		for(var j = 0;j <= 4 ;j++) {
			if(a[j] <= min) {
				min = a[j];
			}
		}
		System.out.println(min);
	}
}
