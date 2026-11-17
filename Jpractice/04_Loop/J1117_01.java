package Jpractice.loop;
import java.util.Scanner;
public class J1117_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		練習題:
//		請輸入座號:001
//		請輸入001號計概分數:90
//		請輸入001號程設分數:80
//		請輸入座號:002
//				.
//				.
//				.
//		請輸入座號:-1
//
//		座號	計概	程設	總分
//		001		90		80		170		
//		002		80		65		145
		int num,score1=0,score2=0,total=0;
		Scanner scn=new Scanner(System.in);

		System.out.println("請輸入座號,或輸入-1離開");
		num=scn.nextInt();
		
		if(num==-1){
			System.out.println();
		}else{
			while(num>0){
			System.out.println("請輸入"+num+"計概分數");
			score1=scn.nextInt();
			System.out.println("請輸入"+num+"程式分數");
			score2=scn.nextInt();
			total=score1+score2;
			System.out.println("座號\t"+"計概\t"+"程式\t"+"總分\n"+num+"\t"+score1+"\t"+score2+"\t"+total);
			
			System.out.println("請輸入座號，或輸入-1離開");
			num = scn.nextInt();
			}
		
		}scn.close();
	}
}