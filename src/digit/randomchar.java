package digit;

//创建一个长度是5的随机字符串，随机字符有可能是数字，大写字母或者小写字母
//给点提示: 数字和字符之间可以通过互相转换
//char c = 'A';
//short s = (short) c;
//通过这个手段就能够知道字符 a-z A-Z 0-9 所对应的数字的区间了
//需要用到ASCII码对照表

public class randomchar {
public static void main(String[] args) {
	
	//方法1
	char[] c = new char[5];
	int[]  a = new int[5];
	int num = 0;
	
	input:
	for(var i = 1; i <= 1000;i++) {
		int j = (int)(Math.random()*200);

		if(num > 4) {
			for(var k = 0;k<5;k++) {
				System.out.println(a[k]);
			}			
			break input;
		}		
		else if((j >= 48 && j <= 57) || (j >= 65 && j <= 90)
				||(j >= 97 && j <= 122)) {
			a[num++] = j;
		}
	}
	 for (var i = 0; i < a.length; i++) {
		c[i] = (char)a[i];
		System.out.println(c[i]);
	}
//	
//	  //方法2
//     char cs[] = new char[5];
//     short start = '0';
//     short end = 'z'+1;
//     for (int i = 0; i < cs.length; i++) {
//         while (true) {
//             char c = (char) ((Math.random() * (end - start)) + start);
//             if (Character.isLetter(c) || Character.isDigit(c)) {
//                 cs[i] = c;
//                 break;
//             }
//         }
//     }
//     String result = new String(cs);
//     System.out.println(result);
//       
//     //方法3
//	   //新建一个数据池，从数据池内随机取值来计算
//     String pool = "";
//     for (short i = '0'; i <= '9'; i++) {
//         pool+=(char)i;
//     }
//     for (short i = 'a'; i <= 'z'; i++) {
//         pool+=(char)i;
//     }
//     for (short i = 'A'; i <= 'Z'; i++) {
//         pool+=(char)i;
//     }
//     char cs2[] = new char[5];
//     for (int i = 0; i < cs2.length; i++) {
//         int index = (int) (Math.random()*pool.length());
//         cs2[i] =  pool.charAt( index );
//     }
//     String result2 = new String(cs2);
//     System.out.println(result2);
//	 
//	 
}
}
