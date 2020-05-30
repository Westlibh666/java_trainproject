package digit;
//穷举法破解密码
//1. 生成一个长度是3的随机字符串，把这个字符串作为当做密码
//2. 使用穷举法生成长度是3个字符串，匹配上述生成的密码
//要求： 分别使用多层for循环 和 递归解决上述问题

public class mima {
	public static void main(String[] args) {
		String pool = "";
		String code = "";
		
		for (var i = '0'; i <= '9'; i++) {
			pool += (char)i;
		}
		for (var i = 'a'; i <= 'z'; i++) {
			pool += (char)i;
		}
		for (var i = 'A'; i <= 'Z'; i++) {
			pool += (char)i;
		}
		
		
		for (var i = 0; i < 3; i++) {
			int index = (int)(Math.random()*pool.length());
			code += pool.charAt(index);
		}
		
		System.out.println(code);
		
		char[] cod = code.toCharArray();
		String guess = "";
		int num = 0;
		
		deduce :
		for(var i = 0;i < pool.length();i++) {
			for (var j = 0;  j < pool.length(); j++) {
				for(var k = 0;k < pool.length();k++) {
					if(guess.equals(code)) {
						System.out.println(guess);
						break deduce;
					}
					else if(pool.charAt(k) == cod[num]) {
						guess += pool.charAt(k);
						num++;}
					}
				}
				
			}
			
			
		}
	}
