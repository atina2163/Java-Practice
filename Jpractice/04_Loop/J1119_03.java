package Jpractice.loop;

public class J1119_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//練習寫出三角形
		
		for(int i=0;i<3;i++){ //假設三角形高度為3
			for(int j=0;j<i+1;j++){ //每次回到j都會從0開始
			System.out.print("*");
			}
			System.out.println();//回到第一個for迴圈時要到下一行
		}	
	}

}
