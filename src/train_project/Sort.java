package train_project;

//首先创建一个长度是5的数组,并填充随机数。
//首先用选择法正排序，然后再对其使用冒泡法倒排序

public class Sort {
	public static void main(String[] args) {
		int[] a = new int[5];
		int temp = 0;
		for(var i = 0;i < a.length;i++) {
			a[i] = (int)(Math.random()*100);
		}
		
		System.out.println("产生的随机数是：");
		for(var i = 0;i < a.length;i++) {
			System.out.println(a[i]);
		}
		
		for(var j = 0;j < a.length;j++) {
			for(var k = 0 ;k < a.length;k++) {
				if(j > k)
					continue;
				if(a[j] >= a[k]) {
					temp = a[j];
					a[j] = a[k];
					a[k] = temp;
				}
			}
		}
		
		System.out.println("选择法正排序结果：");
		for(var i = 0;i < a.length;i++) {
			System.out.println(a[i]);
		}
		
		for(var i = 0;i < a.length;i++) {
			a[i] = (int)(Math.random()*100);
		}
		
		System.out.println("产生的随机数是：");
		for(var i = 0;i < a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("冒泡法倒排序");
		for(var i = 0;i < a.length;i++) {
			for(var j = 0;j < a.length;j++) {
				if(j+1 >= 5)
					break;
				if(a[j] <= a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		System.out.println("法正排序结果："+" ");
		for(var i = 0;i < a.length;i++) {
			System.out.println(a[i]);
		}
	}	
}
