package train_project;

import java.util.Scanner;
//忽略3和5的倍数
public class Ignore_multiple {
	static int num;
	Scanner s = new Scanner(System.in);
	
	int getnum() {
		num = s.nextInt();
		return num;
	}
	
	void printnum(int num) {
		for(int i =1;i <= num;i++) {
			if (i % 3 == 0 || i % 5 == 0 )
				continue;
			System.out.println(i);
	}
	}
	
	public static void main(String[] args) {
		Ignore_multiple tf =new Ignore_multiple();
		System.out.println("请输入数量上限：\n");
		num = tf.getnum();
		tf.printnum(num);		
	}
}
