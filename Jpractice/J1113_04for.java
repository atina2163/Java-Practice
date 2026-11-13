package Jpractice;

public class J1113_04for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//練習題目:使用for迴圈計算出1~100的總和
		
		int sum=0;//總和從0開始
		for(int i=1;i<=100;i++){
			sum=sum+i;
		}	
		System.out.println("1+..+100的總和為:"+sum);
	}

}
