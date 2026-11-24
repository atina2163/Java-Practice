package Jpractice.Array;

public class J1121_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//練習多維陣列寫法(二維)
		double[][]salary={{3.8,3.8,3.8},{4,4,4}};
		double sum=0;
		for(int i=0;i<salary.length;i++){
			for(int j=0;j<salary[0].length;j++){
			System.out.print("salary["+i+"]"+"["+j+"]="+salary[i][j]+"\t");
			sum+=salary[i][j];
			}
			System.out.println();
		}
		System.out.println("試用期三個月+正式三個月的薪水加總為"+sum+"萬");	
	}

}
