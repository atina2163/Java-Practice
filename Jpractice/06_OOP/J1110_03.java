package Jpractice;
import java.util.Scanner;
public class J1110_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		題目(一)
//
//		門票入場券金額為200
//		輸出要購買的張數，計算應支付的金額
//		購買10張(含)以上打九折，並顯示購買十張打九折
//		未滿10張顯示恕不打折
		
		
		Scanner scn=new Scanner(System.in);
		System.out.print("門票入場券金額為200元,購買10張(含)以上打九折,未滿10張顯示恕不打折");
		System.out.println("請輸入您要購買的張數:");
		final double price=200;//使用final設定價格常數
		int tick;//票數(可變動)
		tick=scn.nextInt();
		if(tick>=10) {
			System.out.println("您購買的張數為:"+tick+"張,總金額為"+((price*tick)*0.9)+"元");
		}else
			System.out.println("您購買的張數為:"+tick+"張,總金額為"+(price*tick)+"元");
		scn.close();
		

	}

}
