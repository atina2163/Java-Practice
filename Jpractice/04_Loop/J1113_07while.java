package Jpractice;

public class J1113_07while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//練習使用while迴圈
		//算出1加到100的總額

		int i=1,sum=0;
		while(i<=100){
			sum=sum+i;
			i++;
		}
			System.out.printf("i=%d,sum=%d\n",i,sum);
			System.out.println("1+...+100="+sum);
		
	}

}
