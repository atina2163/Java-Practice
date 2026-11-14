package Jpractice;
import java.util.Scanner;
public class J1109_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("最近開了新的早餐店,買100元折10元");
System.out.println("請輸入你的金額");
int price =scn.nextInt();
if (price>=100) {
	System.out.println("你要付的金額為"+(price-10)+"元");
}else {
		System.out.println("你要付的金額為"+price+"元");
	}
}
	}


