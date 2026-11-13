package Jpractice;
import java.util.Scanner;
//加入掃描套件
public class J1113_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		//建立新掃描物件

		System.out.println("請輸入販買機按鈕數字");

		switch(scn.nextInt()){
		//建立按鈕掃描器
		//將掃描器放進switch
		case 1:
			System.out.println("波蜜果菜汁");
			break;
			case 2:
			System.out.println("立頓奶茶");
			break;
			case 3:
			System.out.println("大豆營養棒");
			break;
			case 4:
			System.out.println("伯朗咖啡");
			break;
			default:
			System.out.println("請重新輸入");
			break;
			
		}
		scn.close();
	}
	
}
