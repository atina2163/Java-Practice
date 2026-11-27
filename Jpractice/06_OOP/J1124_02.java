package Jpractice.OOP;

public class J1124_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main方法:輸入值


		int total;

		total=calculate(1,100);
		System.out.println("1+...+100+的總和是"+total);
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