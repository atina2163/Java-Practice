package Jpractice;
import java.util.Scanner;
public class J1113_03switchBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//應用在簡單的ATM功能
		
		int balance=2000;//目前餘額
		int withdraw,save;

		Scanner scn=new Scanner(System.in);
		System.out.println("請選擇您要的功能 1:提款 2:存款 3:查詢餘額");
		switch(scn.nextInt()){
			case 1: //提款
				System.out.println("請輸入要提款的金額");
				withdraw=scn.nextInt();
				if(withdraw<=0){
					System.out.println("提款金額需大於0")	;
				}else if(balance<withdraw){
					System.out.println("餘額不足!請重新輸入");
				}else{
					balance-=withdraw;
					System.out.println("提款成功!帳戶的餘額為"+balance+"元");
				}
				break;
			case 2://存款
				System.out.println("請輸入要存款的金額");
				save=scn.nextInt();
				if(save<=0) {
					System.out.print("請重新輸入正確的金額");
				}else {
					System.out.println("您存入的金額為:"+save+"元");
					balance+=save;
					System.out.println("帳戶的餘額為:"+balance+"元");
				}	
				break;
			case 3://查詢餘額
				System.out.println("您帳戶的餘額為:"+balance);
				break;
			default:
				System.out.println("無效的選項,請重新輸入!");
				break;
				}
				
	}
}