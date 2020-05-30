package digit;

import java.util.ArrayList;
import java.util.Collections;

//创建一个长度是8的字符串数组
//使用8个长度是5的随机字符串初始化这个数组
//对这个数组进行排序，按照每个字符串的首字母排序(无视大小写)
public class sortchar {
	public static void main(String[] args) {
		String pool = "";
		String temp = "";
		ArrayList<String> list = new ArrayList<String>();
		
		//设置数据池
		for(var i = '0';i <= '9';i++) {
			pool += (char)i;
		}
		
		for(var i = 'A';i <= 'Z';i++) {
			pool += (char)i;
		}
		
		for(var i = 'a';i <= 'z';i++) {
			pool += (char)i;
		}		
		System.out.println(pool);
		
		//从数据池中取数据构造字符串列表
		//每个数据长5，共8个
		for(var i = 0 ;i < 8; i++) {
            for(var j = 0;j < 5;j++) {
            	var index = (int)(Math.random()*pool.length());
            	temp += pool.charAt(index);
            	//返回指定索引处的字符
            }
            list.add(temp);
            temp = "";
            }	
		System.out.println(list);	
		
		//按照首字母大小，从小到大排序
		//不区分大小写
		for(var i = 0;i < 8;i++) {
			for (var j = 0; j < 7; j++) {
				char one = list.get(j).charAt(0);
				char two = list.get(j+1).charAt(0);
				one = Character.toLowerCase(one);
				two = Character.toLowerCase(two);
				if(one >= two) {
					Collections.swap(list, j, j+1);	
				}
			}
		}
		System.out.println(list);
	}	
}
