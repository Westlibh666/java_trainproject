package train_project;

import java.util.Scanner;

//假设你月收入是3000，除开平时花销，每个月留下1000块钱进行投资。
//然后你认真的钻研了 《股票和基金 21天从入门到精通》，达到了每年20%的投资回报率。
//那么问题来了，以每个月投资1000块钱的节奏，持续投资多少年，总收入达到100万
//（复利计算按照每年12000投入计算，不按照每月计息）
public class millionaire {
	public static void main(String[] args) {
		int money;
		float Final_money = 0;
		float rate;
		int principal;
		int year;
		Scanner s = new Scanner(System.in);
		
		System.out.println("请输入本金：");
		principal = s.nextInt();
		
		System.out.println("请输入年利率：");
		rate = s.nextFloat();
		
		System.out.println("请输入想达到的收入：");		
		money = s.nextInt();
		
		stip:
		for(year = 1 ; year <= money ; year++ ) {
			Final_money += (float) (principal * (Math.pow((1+rate), year)));
			
			//超过预期年份则跳出大循环
			if(year == 20) {
				System.out.println("超过预期的20年！");
				break stip;
				}
			
			else if (Final_money >= money) {
				System.out.println("需要"+year+"年");
				s.close();
				break;
				}
		}
	}
}
