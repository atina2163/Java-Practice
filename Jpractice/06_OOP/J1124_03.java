package Jpractice.OOP;
import java.util.Scanner;
public class J1124_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main方法:輸入值
		Scanner scn=new Scanner(System.in);

				int total;
				int e;
				System.out.print("請輸入要累加的值");
				e=Integer.parseInt(scn.next());
				total=calculate(1,e);
				System.out.println("1+...+"+e+"的總和是"+total);
				scn.close();
			}
			//自訂方法:輸入公式
			//1+...+100的方法

			public static int calculate(int start,int end){
			int sum=0;
			for(int i=start;i<=end;i++){
				sum+=i;
			}
			return sum;
		}
	}


