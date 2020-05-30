package digit;
import java.util.Scanner;

//通过Scanner从控制台读取字符串，然后把字符串转换为字符数组
//参考的转换方式:
 //String str = "abc123";
//char[] cs = str.toCharArray(); 
//转换为字符数组后，筛选出控制台读取到的字符串中的大写字母和数字，并打印出来
public class transdigit {
	public static void main(String[] args) {
		String input;
		Scanner s = new Scanner(System.in);
		
		System.out.println("input an array of digit or letter:");
		
		input = s.nextLine();
		char[] cs = input.toCharArray();
		for(char each : cs) {
			if(Character.isUpperCase(each)) {
				System.out.println(each+"\n");
			}
			else if(Character.isDigit(each)) {
				System.out.println(each+"\n");
			}
			else continue;//判断是否为数字)
		}
		s.close();
	}
}
