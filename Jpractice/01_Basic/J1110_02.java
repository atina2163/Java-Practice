package Jpractice;
import java.util.Scanner;
public class J1110_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		String str1;//測試str1先做宣告,做兩次書寫;str2則是採用一次性書寫
		
		System.out.println("請輸入第一個字串");
		str1=kb.next();
		kb.nextLine(); //解決錯誤的方法, 消耗掉 next() 留下的換行符號
		System.out.println("請輸入第二個字串");
		String str2=kb.nextLine();//一次性書寫
		//如果next()跟nextLine()混用會造成編譯錯誤
		
		System.out.print(str1);
		System.out.println(str2); 
		kb.close();
	}

}
