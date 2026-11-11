package Jpractice;

public class J1111_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//練習條件式兩種寫法
		//寫法(一)
//		double temp1=36.5,temp2=38;
//		if(temp1>temp2) {
//			System.out.println("可能發燒的溫度為:"+temp1);
//		}else {
//			System.out.println("可能發燒的溫度為:"+temp2);
//		}
		
		
		
//		寫法(二) 取溫度高的值
//		double max,temp1=36.5,temp2=38;
//		max=(temp1>temp2)?temp1:temp2;
//		System.out.printf("%.1f,%.1f可能發燒的溫度為%.1f%n",temp1,temp2,max);
		
//		取數字小的贏
		int min,num1=3,num2=11;
		min=(num1<num2)?num1:num2;
		System.out.printf("%d,%d比數字小的贏,贏的是:%d",num1,num2,min);
	}

}
