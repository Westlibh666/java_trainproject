package train_project;
import java.util.Arrays;

//首先定义一个5X8的二维数组，然后使用随机数填充满。
//借助Arrays的方法对二维数组进行排序。
//参考思路：
//先把二维数组使用System.arraycopy进行数组复制到一个一维数组
//然后使用sort进行排序
//最后再复制回到二维数组。

public class sort_square {
//	public static void main(String[] args) {
//		int[][] a = new int[5][8];
//		
//		
//		//赋值
//		for(var i = 0;i < 5;i++) {
//			for(var j = 0;j < 8;j++) {
//				a[i][j] = (int) (Math.random() * 100);
//			}
//		}
//		
//		//打印矩阵
//		for(int[] each : a) {
//			for(int eac : each) {
//				System.out.println(eac+" ");
//			}
//			System.out.println();
//		}
//		
//		//排序
//		//取行
//		int[] one = a[0];
//		int[] two = a[1];
//		int[] three = a[2];
//		int[] four = a[3];
//		int[] five = a[4];
//		
//		Arrays.sort(one);
//		Arrays.sort(two);
//		Arrays.sort(three);
//		Arrays.sort(four);
//		Arrays.sort(five);
//		
//		int[][] n = {one,two,three,four,five};
//		
//		//打印矩阵
//				for(int[] each : a) {
//					for(int eac : each) {
//						System.out.println(eac+" ");
//					}
//					System.out.println();
//				}
//	}
	
	 public static void main(String args[]){
	        int[][] a = new int[5][8];
	        int[] b = new int[40];
	         
	        //填充数字到二维数组a
	        for (int i = 0; i < a.length; i ++){
	            for (int j = 0; j < a[i].length; j ++){
	                a[i][j] = (int)(Math.random() * 100);
	                System.out.println("第" + i + "个数组的第"+ j +"位是:"  + a[i][j]);
	        }
	        }
	        //将a中的数组复制到一维数组并排序
	        for (int k = 0; k < a.length; k ++){
	            System.arraycopy(a[k],0,b,k * a[k].length,a[k].length);        
	        }
	        Arrays.sort(b);
	        System.out.println(Arrays.toString(b));
	         
	        //将排序后的数组重新复制回数组a
	        for (int l = 0; l < a.length; l ++){
	            a[l] = Arrays.copyOfRange(b,l * a[l].length, (l + 1) * a[l].length);
	        }
	         
	        //打印
	        for (int m = 0; m < a.length; m ++){
	            System.out.print(Arrays.toString(a[m]));
	        }
	         
	    }
}
