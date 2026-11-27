package Jpractice.OOP;

public class J1124_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		power(2,3);
		power(4,4);
	}
	static void power(int x,int n){

		int sum=1;
		for(int i=0;i<n;i++) {
		sum*=x;
		
		}System.out.println(x+"的"+n+"次方為"+sum);

	}
}