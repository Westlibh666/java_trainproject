package train_project;

import java.util.Scanner;
//判断某一年是否为闰年
//通过Scanner 输入一个年份，然后判断该年是否是闰年
//闰年判断标准(满足任何一个)
//1. 如果能够被4整除，但是不能被100整除
//2. 能够被400整除

public class lunaryear_judge {
	 static int year;
		
		Scanner s = new Scanner(System.in);
		
		int getyear() {
			year = s.nextInt();
			return year;
		}
		
		void deduce(int year) {
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.println(year+"是闰年");
			}
			else
				System.out.println(year+"不是闰年");
		}
		
		public static void main(String[] args) {
			
			System.out.println("请输入年份：\n");
			lunaryear_judge ly =new lunaryear_judge();
			year = ly.getyear();
			ly.deduce(year);
		}
}
