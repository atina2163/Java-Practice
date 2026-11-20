package Jpractice.loop;
import java.util.Scanner;
public class J1119_02bankMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//結合巢狀迴圈、條件判斷製作實際應用的選單
		
		Scanner scn=new Scanner(System.in);
		String a;
		int money=0;
		//第一層do while迴圈製作選單
		do{
		System.out.println("-----------理財選單-----------");
		System.out.println("\tA. 定期定額");
		System.out.println("\tB. 單筆定存");
		System.out.println("\tC. 離開選單");
		System.out.println("--------------------------------");
			//第二層do while判斷輸入是否正確
			do{
			System.out.println("請選擇您要的功能:");
			a=scn.next().toUpperCase();//使用toUpperCase來轉換字串大寫
			}while("ABC".indexOf(a) == -1);
			//字串.indexOf(變數):在字串中尋找指定內容的位置，"ABC"索引為012，-1表示沒有在選項裡，輸入A.B.C則離開迴圈
			//輸入-1會回到迴圈,繼續詢問功能
			//如果不是-1則跳出迴圈
			
			if(!(a.equals("C"))){
				System.out.print("請輸入單次金額");
				money=scn.nextInt();
			}
			switch(a){
			case "A":
				System.out.println("定期定額總金額將為"+money*6+"元");
				break;
			case "B":
				System.out.println("單筆定存為"+money*1+"元");
				break;
			case "C":
				System.out.print("謝謝再度光臨,祝您順心");
			}

		}while(!(a.equals("C")));//不等於C就回進入迴圈
								//若等於C程式則會繼續往下走
		scn.close();
	}

}
