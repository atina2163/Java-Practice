package Jpractice.Array;

public class J1120_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//練習理解氣泡排序法
		int x[]={25,10,39,40,33,12};
		int temp,i=0,k=x.length;
		while(k!=0) {
			for(i=0;i<x.length-1;i++){
				if(x[i]>x[i+1]){ //如果當下的索引數字大於下一個索引數字
					temp=x[i]; //先找一個變數名稱取代(複製)x[i]
					x[i]=x[i+1];//則取代下一個索引的位置
					x[i+1]=temp; //再將取代完的值帶入temp
					
			}
		}
			k--;
	}for(int num:x){
		System.out.print(num+"\t");	
}
}
}