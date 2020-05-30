package train_project;

import java.util.Scanner;

//使用Scanner收集你的身高体重，并计算出你的BMI值是多少
//BMI的计算公式是 体重(kg) / (身高*身高)
//比如邱阳波的体重是72kg, 身高是1.69，那么这位同学的BMI就是
//72 / (1.69*1.69) = ?

public class BMI_judge {
	double height;
	double weight;
	double BMI;
	
	Scanner s = new Scanner(System.in);
	
	double getheight() {
		height = s.nextDouble();
//		System.out.println("当前height是"+height);
		return height;
	}
	
	double getweight() {
		weight = s.nextDouble();
//		System.out.println("当前weight是"+weight);
		return weight;
	}
	
	void calcBMI(double height,double weight) {
		BMI = weight/(height*height);
		System.out.println("当前BMI是"+BMI);
		if(BMI < 18.5) {
			System.out.println("体重过轻");
		}
		else if (18.5 <= BMI && BMI < 24) {
			System.out.println("正常范围");
		}
		else if (24 <= BMI && BMI < 27) {
			System.out.println("体重过重");
		}
		else if (27 <= BMI && BMI < 30) {
			System.out.println("轻度肥胖");
		}
		else if (30 <= BMI && BMI < 35) {
			System.out.println("重度肥胖");
		}
		else {
			System.out.println("重度肥胖");
		}
	}
	
	public static void main(String[] args) {
		double h;
		double w;
		BMI_judge ob =new BMI_judge();
		System.out.println("请输入身高（m）");
		h = ob.getheight();
		System.out.println("请输入体重（kg）");
		w = ob.getweight();
		System.out.println("计算BMI");
		ob.calcBMI(h,w);
	}
}
