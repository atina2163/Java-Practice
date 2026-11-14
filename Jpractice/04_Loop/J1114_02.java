package Jpractice.loop;
import java.util.Scanner;
public class J1114_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int i=1,sum=0,n;
		System.out.println("請輸入累加的最大值");
		n=scn.nextInt();
		do{
			sum+=i;
			i++;
		}while(i<=n);
			System.out.println("1+...+"+n+"="+sum);
		scn.close();
	}

}
