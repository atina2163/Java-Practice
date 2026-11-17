package Jpractice.loop;

import java.util.Scanner;

public class J1117_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,score1=0,score2=0,total=0;
		Scanner scn=new Scanner(System.in);
		
		while(true) {
			System.out.println("請輸入座號,或輸入-1離開");
			num=scn.nextInt();
		
		if(num==-1){
			break;
		}else{
			
			System.out.println("請輸入"+num+"計概分數");
			score1=scn.nextInt();
			System.out.println("請輸入"+num+"程式分數");
			score2=scn.nextInt();
			total=score1+score2;
			System.out.println("座號\t"+"計概\t"+"程式\t"+"總分\n"+num+"\t"+score1+"\t"+score2+"\t"+total);
			
			}
		}scn.close();
	}	
}	