package train_project;
//首先创建一个长度是5的数组,并填充随机数。 (向数组填充随机数的办法，参考这里)
//使用for循环或者while循环，对这个数组实现反转效果

public class array_reverse {
	public static void main(String[] args) {
	int[] a = new int[5];

	//5个随机整数
	for(var i = 0;i <= a.length-1;i++) {
		a[i]=(int)(Math.random()*100);
		//Math.random()生成0-1之间的浮点数
		System.out.println(a[i]);
	}
	
	for(var j = 0;j <= a.length-1;j++) {
		if(j == 2)
			break;
		var temp = a[j];
		a[j] = a[a.length-j-1];
		a[a.length-j-1] = temp;
	}
	
	for(var k = 0;k <= a.length-1;k++) {
		System.out.println(a[k]);
	}
	
	}
}
