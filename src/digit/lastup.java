package digit;
//把最后一个two单词首字母大写

//charAt	获取字符	
//toCharArray	获取对应的字符数组	
//subString	截取子字符串	
//split	分隔	
//trim	去掉首尾空格	
//toLowerCase  toUpperCase	大小写
//indexOf  lastIndexOf  contains定位
//replaceAll replaceFirst	替换	
	
public class lastup {
public static void main(String[] args) {
	String s = "Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
	String a = "";
	
	int num = s.lastIndexOf("two");
	System.out.println(num);
	
	for(var i = 0;i < s.length();i++) {
		if(i == 35) {
			char temp = Character.toUpperCase(s.charAt(i));
			a += temp;
		}
		else 
			a += s.charAt(i);
	}
	
	System.out.println(a);
}
}
