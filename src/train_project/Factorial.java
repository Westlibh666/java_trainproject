package train_project;

import java.util.Scanner;

//通过Scanner 获取一个整数，然后使用while计算这个整数的阶乘
//N的阶乘等于 N* (N-1) * (N-2) * ... * 1

public class Factorial {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Please input an interge : \n");
		int num = s.nextInt();
		int i =1;
		int result = 1;
		while (i++ < num) {
			result *= i ;
		}
		System.out.println(result);
		s.close();
	}
}
