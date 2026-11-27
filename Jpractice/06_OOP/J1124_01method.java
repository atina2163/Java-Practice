package Jpractice.OOP;

public class J1124_01method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main方法:輸入值
		
		float total;

		total=calculate(3.8f,12,4);
		
		System.out.println("小明的一整年的薪水"+total);
		System.out.printf("小明的一整年的薪水%.2f",total);
	}
	//自訂方法:輸入公式

	public static float calculate(float salary,int month,int bonus){

	return ((salary*month)+(bonus*2));
	}
}