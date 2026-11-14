package Jpractice.loop;
import java.util.Scanner;
public class J1114_04water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		題目:設計水費查詢程式
//		計算方式如下:
//
//		度數	  每度金額
//		1~10	   7.35元
//		11~30	   9.45元
//		31~50	   11.55元
//		50度以上   12.075元
//			
//		輸入用水度數,顯示水費金額
		
		int water;
		double price=0,total;
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入用水度數");
		water=scn.nextInt();

		if(water<=0){
		System.out.println("請重新輸入");
		}else{
			if(water<=10){
			price=7.35;
			total=water*price;
			}else if(water<=30){
			price=9.45;
			total=water*price;
			}else if(water<=50){
			price=11.55;
			total=water*price;
			}else{
			price=12.075;
			total=water*price;
			}
		System.out.printf("用水度數為=%d,單價為=%.3f,總額為=%.3f元",water,price,total); 
							//整數格式為%d 小數點為%f
		scn.close();
		}	
	}

}
