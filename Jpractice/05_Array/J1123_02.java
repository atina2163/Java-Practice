package Jpractice.Array;

public class J1123_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//非對稱陣列
				int [][]n=new int[3][];
				n[0]=new int[]{1};
				n[1]=new int[]{3,5};
				n[2]=new int[]{7,9,11};
				for(int i=0;i<n.length;i++){
					for(int j=0;j<n[i].length;j++){
					System.out.print(n[i][j]+" ");
					}
				System.out.println();	
				}	
	}

}
