package Jpractice.loop;

public class J1119_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		練習:使用continue		
//		迴圈執行次數為10次,印出每次的i值
//		但i為3的倍數不印出
//		並印出迴圈結束時的i值
		
		int i;
		for(i=1;i<=10;i++){
			if(i%3==0){ 	//取3的倍數並跳過不印出
			continue;
			}
			System.out.println("i ="+i);
		}	
		System.out.println("最後的i值為"+i);
	}

}
