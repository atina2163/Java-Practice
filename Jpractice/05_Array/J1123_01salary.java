package Jpractice.Array;

public class J1123_01salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//試算小明一年上班的薪水
				double[][]n={{3.8,3.8,3.8},{4,4,4},{4,4,4},{4,4,4}};
				double sum=0;
				for(double[]row:n){ //從n陣列中取出元素給row陣列
					for(double i:row){ //再從row陣列取出元素給i變數
					sum+=i;
					}
				}	System.out.println("小明的年薪為:"+sum);
	}

}
