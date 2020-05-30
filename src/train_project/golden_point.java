package train_project;

//寻找某两个数相除，其结果 离黄金分割点 0.618最近
//分母和分子不能同时为偶数
//分母和分子 取值范围在[1-20]

public class golden_point {
	public static void main(String[] args) {
		float decimal;
		int savetop = 0;
		int savebottom = 0;
		float distance;
		float savedecimal = 0;
		float internum = 10;
		
		
		for (int top = 1 ; top <= 20 ; top++) {
			for (int bottom = 1 ; bottom <= 20 ; bottom++) {
				if (top % 2 == 0 & bottom % 2 ==0) {
					continue;
				}
				//这里记得转换类型！！！！
				decimal = (float)top / bottom;
				//不转换的话会一直取顶部数1.0！！！
				distance = decimal - 0.618f;
				distance = Math.abs(distance);
				if (distance < internum) {
					savetop = top;
					savebottom = bottom;
					internum = distance;
					savedecimal = decimal;
				}
			}
		}
		System.out.println("离黄金分割点（0.618）最近的两个数相除是："+savetop+"/"+savebottom+"="+savedecimal);
	}
}
