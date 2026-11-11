package Jpractice;

public class J1111_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//使用%取餘數做偶數奇數判別
		//這次使用if判斷式但省略else的寫法
		
		int num=3; //整數變數
		String x="奇數";
		if(num%2==0){	//%取餘數
			x="偶數";
		}
		System.out.print(num+"為"+x);
	}

}
