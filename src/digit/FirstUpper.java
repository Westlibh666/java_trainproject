package digit;
//每个单词的首字母都转换为大写
//给出一句英文句子： "let there be light"
//得到一个新的字符串，每个单词的首字母都转换为大写

public class FirstUpper {
public static void main(String[] args) {
	String s = "let there be light";
	String a = "";
	
	//split 
	//根据分隔符进行分隔
	System.out.println(s);
	String subs[] = s.split(" ");
//	 for (String sub : subs) {
//         System.out.println(sub);
//     }
      
	 for(var i = 0; i < subs.length;i++ ) {
		 String temp = "";
		 char b = subs[i].charAt(0);
		 char m = Character.toUpperCase(subs[i].charAt(0));		 
		 temp = subs[i].replace(b, m);
		 a += temp + " ";
		 //System.out.println(temp);		 
     }
	 
	 System.out.println(a);

	 }


}

