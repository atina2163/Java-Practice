package Jpractice.Array;
import java.util.Scanner;
public class J1120_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int sum=0;
		float ave=0;

		int season[]=new int[4];//陣列宣告
		for(int i=0;i<season.length;i++){
			System.out.print("第"+(i+1)+"季的營業額:");
			//season[i]=scn.nextInt();
			season[i]=Integer.parseInt(scn.nextLine());
			sum+=season[i];
			
		}
		ave=(float)sum/season.length; //強制轉換型別、總數直接除上陣列長度
		System.out.println("--------------------");
		System.out.println("年度營業額:" + sum);
		System.out.println("平均各月營業額:" + ave); 
		scn.close();
	}

}
