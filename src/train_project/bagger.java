package train_project;

import java.util.Scanner;
//天朝有一个乞丐姓洪，去天桥要钱
//第一天要了1块钱
//第二天要了2块钱
//第三天要了4块钱
//第四天要了8块钱
//问题： 洪乞丐干10天，收入是多少？
public class bagger {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int sum = 0;
		System.out.println("Please input a day : \n");
		int day = s.nextInt();
		for (int i = 0 ;i < day ; i++ ) {
			sum += Math.pow(2,i);
		}
		System.out.println("Total salary is : "+ sum);
		s.close();
	}
}
