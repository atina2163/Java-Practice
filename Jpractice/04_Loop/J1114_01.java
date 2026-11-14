package Jpractice.loop;

public class J1114_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int i=1;
		//do 不管條件先執行
		do{
			sum+=i;
			i++;
			}while(i<=3);
		System.out.println("1+...+3="+sum);
				
//		流程
//		0+1=1 sum
//		1+1=2 i
//
//		1+2=3 sum
//		2+1=3 i
//
//		3+3=6 sum 這裡因為i已經不符合<=3,所以不會再進迴圈,印出sum=6
//		3+1=4 i
	}

}
