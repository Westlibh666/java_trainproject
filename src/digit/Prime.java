package digit;
//统计找出一千万以内，一共有多少质数

//质数概念: 只能被1和自己整除的数
//举例:
//5只能被 1和5整除，所以是质数
//8可以被2整除，所以不是质数
public class Prime {
	public static void main(String[] args) {
		int max = 10000*1000;
		int count = 0;
		for(int i = 1;i <= max;i++) {
			if(deducePrime(i)) {
				count++;
			}
		}
		System.out.println("一千万以内的质数一共有 : " + count);
	}
	
	private static boolean deducePrime(int i) {
		for(int j = 2;j <= Math.sqrt(i);j++) {
			if(i%j == 0) {
				return false;
			}		
		}
		return true;
	}
}
