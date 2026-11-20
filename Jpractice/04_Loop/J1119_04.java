package Jpractice.loop;

public class J1119_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//練習陣列
		
		int[]n=new int[]{10,13,12,30};
		int sum=0;
		for(int i=0;i<4;i++){
			System.out.println("n["+i+"]="+n[i]);
			sum=sum+n[i];
		}
		
		System.out.println("陣列元素加總為:"+sum);
	}
}