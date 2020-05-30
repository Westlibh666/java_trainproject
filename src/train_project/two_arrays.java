package train_project;
//定义一个5X5的二维数组。 然后使用随机数填充该二维数组。
//找出这个二维数组里，最大的那个值，并打印出其二维坐标

public class two_arrays {
	public static void main(String[] args) {
		int max = -1;
		int hen = -1;
		int zon = -1;
		//定义二维数组
		int[][] a = new int[5][5];
		
		//赋值
		for(var i = 0;i < 5;i++) {
			for(var j = 0;j < 5;j++) {
				a[i][j] = (int) (Math.random() * 100);
			}
		}
		
		//打印数组
		for(int[] each : a) {
			for(var eac : each) {
				System.out.println(eac+" ");
			}
			System.out.println();
		}
		
		//寻找最大值及坐标
		for(var i = 0;i < 5;i++) {
			for(var j= 0;j < 5;j++) {
				if(a[i][j] > max) {
					max = a[i][j];
					hen = i;
					zon = j;
				}
			}
		}
		System.out.println("找出来最大的是:" + max);
        System.out.println("其坐标是[" + hen + "][" + zon + "]");

		}
	}

