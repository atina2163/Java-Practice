package Jpractice;
import java.util.Scanner;
public class J1113_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//題目:輸入整數,計算1~n的整數總和
		Scanner scn=new Scanner(System.in);
		int sum=0;//總和起始設為0
		int n;//要輸入的整數
		System.out.println("請輸入一個整數");
		n=scn.nextInt();
		for(int i=1;i<=n;i++){	
			sum=sum+i;
		}
			System.out.println("1加到"+n+"的總合為"+sum);
			scn.close();
	}

}
		//這裡發現由於輸入1時符合int i=1;i<=n的條件,所以會成立條件,結果印出來會是sum(0)+1=1 