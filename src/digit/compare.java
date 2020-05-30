package digit;

import java.util.ArrayList;
import java.util.Arrays;
//创建一个长度是100的字符串数组
//使用长度是2的随机字符填充该字符串数组
//统计这个字符串数组里重复的字符串有多少种
public class compare {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
	    String pool = " ";
	    String chart = " ";

		for (var i = '0'; i <= '9'; i++) {
			pool += (char)i;
		}
		for (var i = 'a'; i <= 'z'; i++) {
			pool += (char)i;
		}
		for (var i = 'A'; i <= 'Z'; i++) {
			pool += (char)i;
		}
		
		
		String[] s = new String[100];
		
		for(var j = 0;j < s.length;j++) {
			for(var k = 0;k < 2;k++) {
				int index = (int)(Math.random()*pool.length());
				chart += pool.charAt(index);
			}
			s[j] = chart + " ";
			chart = " ";
		}
		
		for(var k = 0;k < s.length;k++) {		
			System.out.println(s[k] + " ");
			if(k % 20 == 19) {
				System.out.println();
			}
		}

		int count = 0;
		ArrayList<String> reply = new ArrayList<String>();
		
		for(var l = 0;l < s.length;l++) {
			for(var m = l + 1;m < s.length ;m++) {
				if(Arrays.asList(reply).contains(s[m])) {
					continue;
				}
				else if(s[l].equals(s[m])) {
					count++;
					reply.add(s[m]);
				}
				
			}
		}
		
		System.out.println(count);
		System.out.println(reply);
		
		
	}
}
