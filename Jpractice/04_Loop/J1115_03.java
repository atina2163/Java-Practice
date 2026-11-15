package Jpractice.loop;

public class J1115_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//練習使用for+while迴圈寫99乘法表

//		for(int i=1;i<=9;i++){
//			int j=1;
//			while(j<=9){
//			System.out.print(i+"*"+j+"="+i*j+"\t");
//			j++;
//			}
//			System.out.println();
//		}
		
		//練習使用while+while迴圈寫99乘法表
		int i=1;
		while(i<=9){
			int j=1;
			while(j<=9){
			System.out.print(i+"*"+j+"="+i*j+"\t");
			j++;
			}
			System.out.println();
			i++;
		}	
	}

}
