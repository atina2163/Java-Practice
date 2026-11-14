package Jpractice;
import java.util.Scanner;
public class J1111_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
//			題目:使用if/else if設計評比分數等級,輸入分數
//			100分:完美
//			90~99:優等
//			80~89:甲等
//			70~79:乙等
//			60~69:丙等
//			59以下:丁等
//			100以上,0分以下:
//			您輸入了不合法的分數
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入你的分數");
		int score=scn.nextInt();
		if(score==100){
		System.out.print("完美");
		}else if(score>=90 && score<=99){
		System.out.print("優等");
		}else if(score>=80 && score<=89){
		System.out.print("甲等");
		}else if(score>=70 && score<=79){
		System.out.print("乙等");
		}else if(score>=60 && score<=69){
		System.out.print("丙等");
		}else if(score<=59 && score>=0){
		System.out.print("丁等");
		}else{
		System.out.print("你輸入了不合法的分數");
		}
		scn.close();
	}

}
