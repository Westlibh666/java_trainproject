package digit;
//把 lengendary 改成间隔大写小写模式，即 LeNgEnDaRy
public class UDletter {
public static void main(String[] args) {
	String s = "lengendary";
	String a = "";
	
	for(var i = 0;i < s.length();i++) {
		if(i % 2 ==0) {
			char temp = s.charAt(i);
			temp = Character.toUpperCase(temp);
			a += temp;
		}
		else 
			a += s.charAt(i);
	}
	
	System.out.println(a);
}
}
