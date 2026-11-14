package Jpractice.loop;

public class J1114_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//題目(一):計算 2 + 5 + 9 + 12 + 16 + 19 + ... + 65 + 68 = ?
//		2>5 3
//		5>9 4
//		9>12 3
//		12>16 4
//		間隔一組為7
//		int sum=0;
//		for(int i=2;i<=65;i+=7){
//		sum=sum+i;
//		}
//		for(int j=5;j<=68;j+=7){
//		sum=sum+j;
//		}
//		System.out.println("加總為"+sum);
		
//		題目(二):1 + 10 + 11 + 20 + 21 + 30 + ... + 81 + 90 = ?
//
//		1>10 9
//		10>11 1
//		11>20 9
//		20>21 1
//
//		一組為10
		int sum=0;
		for(int i=1;i<=81;i+=10){	//先算第一組1+11+21+...
		sum+=i;
		}
		for(int j=10;j<=90;j+=10){	//第二組10+20+30+..
		sum+=j;
		}
		System.out.println("加總為:"+sum);// 最後加總
	}

}
