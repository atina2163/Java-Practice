package Jpractice;
import java.util.Scanner;
public class J1113_01ifswich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		//類別 宣告 物件=打造 類別
		
		//使用if加switch的練習
		int money;
		System.out.println("請輸入要儲值的遊戲金額");
		money=scn.nextInt();

		if(money<100){ 
		System.out.println("金額一次不能小於100元");
		}else{
			switch(money/100){
			case 10:
			System.out.println("謝謝老闆!");
			break;
			case 9:
			System.out.println("謝謝舅舅!");
			break;
			case 8:
			System.out.println("謝謝爸爸!");
			break;
			case 7:
			System.out.println("謝謝姊姊!");
			break;
			case 6:
			System.out.println("非常感謝!");
			break;
			default: //500元(含)以下金額
			System.out.println("歡迎再度光臨!");
			break;
		}
		
	}
		scn.close();
	}
}
