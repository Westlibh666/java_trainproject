package train_project;

//首先准备两个数组，他俩的长度是5-10之间的随机数，并使用随机数初始化这两个数组
//然后准备第三个数组，第三个数组的长度是前两个的和
//通过System.arraycopy 把前两个数组合并到第三个数组中

public class Merge_arrays {
	public static void main(String[] args) {
		int a[] = new int[(int) (Math.random() * 5)+5];
		for (int i = 0; i < a.length; i++)
            a[i] = (int) (Math.random() * 100);
        int b[] = new int[(int) (Math.random() * 5)+5];
        for (int i = 0; i < b.length; i++)
            b[i] = (int) (Math.random() * 100);
        
        System.out.println("数组a的内容:");
        for (var each : a) {
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println("数组b的内容:");
        for (int i : b) {
            System.out.print(i+" ");
        }
        System.out.println();
        
        int c[] = new int[a.length+b.length];

        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        System.out.println("数组c的内容:");
        for (int i : c) {
            System.out.print(i+" ");
        }
		
		
	//	System.out.println("数组A的内容：");
		
	}
}
