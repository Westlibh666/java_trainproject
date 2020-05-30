package digit;

//这个图是自然对数的计算方式。
//借助Math的方法，把自然对数计算出来，看看经过自己计算的自然对数和Math.E的区别有多大
public class jiaxain {
		public static void main(String[] args) {
			System.out.println(Math.E);
			int n = Integer.MAX_VALUE;
			System.out.println(Math.pow(1+1d/n, n));
		}
}
