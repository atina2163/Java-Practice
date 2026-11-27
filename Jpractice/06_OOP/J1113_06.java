package Jpractice;
import java.util.Scanner;
public class J1113_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//自行填入初始值及要累加的值
		Scanner scn=new Scanner(System.in);
		int sum=0,n,m; //宣告總額、初始值及最終值
		System.out.println("請輸入初始值");
		n=scn.nextInt();
		System.out.println("請輸入要加總的值");
		m=scn.nextInt();
		for(int i=n;i<=m;i++){
			sum=sum+i;
		}
		System.out.printf("n=%d,m=%d\n",n,m); //練習格式寫法
		System.out.println(n+"累加到"+m+"="+sum);
		
		scn.close();
	}

}
