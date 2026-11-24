package Jpractice.Array;
import java.util.Scanner;
public class J1121_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//練習多維陣列寫法(二維)
		Scanner scn=new Scanner(System.in);
		double[][]salary=new double[2][3];//這裡表示1試用期的3個月薪水,2正式的3個月薪水							
		double sum=0;
		for(int i=0;i<salary.length;i++){	//i區分試用期、正式期
			if(i==0) {
				System.out.println("請輸入試用期的薪水");
			}
			else {
				System.out.println("請輸入正式的薪水");
			}	
			for(int j=0;j<salary[0].length;j++){	//j區分第幾個月
			System.out.println("請輸入第"+(j+1)+"個月薪水");
			salary[i][j]=scn.nextDouble();	
			sum+=salary[i][j];
			}
			System.out.println();
		}
		System.out.println("薪水加總為"+sum+"萬");
			
	}

}
