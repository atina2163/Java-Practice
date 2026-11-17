package Jpractice.loop;
import java.util.Scanner;
public class J1117_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		製作階層
//		EX:3!=3*2*1=6


		Scanner scn=new Scanner(System.in);

		int num,n,sum;

		do{
		System.out.println("請輸入1~10的數字");
		num=scn.nextInt();
		}while(num<1 || num>10); //當符合裡面的條件 會執行do迴圈
								//若不符合 會跳出do迴圈
		n=num;
		sum=1;

		do{
			
			
			sum = sum * n;
			n--;
		}while(n>0);

		System.out.println(num+"!"+"="+sum);
	}

}
