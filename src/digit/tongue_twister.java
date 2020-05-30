package digit;
//英文绕口令
//peter piper picked a peck of pickled peppers
//统计这段绕口令有多少个以p开头的单词
public class tongue_twister {
public static void main(String[] args) {
	String s = "peter piper picked a peck of pickled peppers";
	String[] a = s.split(" ");
	int count = 0;
	for(String sub : a) {
		System.out.println(sub);
	}
	
	for(var i = 0;i < a.length;i++) {
		if(a[i].charAt(0) == 'p') {
			count ++;
		}
	}
	System.out.println(count);
}
}
