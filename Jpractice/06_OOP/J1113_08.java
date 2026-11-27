package Jpractice;
import java.util.Scanner;
public class J1113_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//使用while迴圈輸入單價,直到輸入-1則結束
		//結束後計算所有輸入的單價總和
		Scanner scn=new Scanner(System.in);
		int price,sum=0;

		while(true){
			System.out.println("請輸入單價(輸入-1則結束)");
			price=scn.nextInt();
			if(price==-1){	
			//if裡面只能放"比較運算子"	
			//如果寫成price=-1會報錯誤,=是指定運算子
			//>=、==、> 這類比較運算子，計算出來的結果本身就是一個布林值（true 或 false）。
				
			break;
			}else if(price<=0){
			System.out.println("請輸入正整數");
			}else{
			sum+=price;
			System.out.println("您輸入的單價為:"+price+","+"總額為:"+sum);
			break;
			}
		}
	}
}
