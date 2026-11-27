package Jpractice;
import java.util.Scanner;
public class J1123_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//使用非對稱多維陣列印出3位客人點的飲料
		Scanner scn=new Scanner(System.in);
		String data[][]=new String[3][];	//陣列表示3位客人

		for(int x=0;x<data.length;x++){	//從第1位客人開始詢問品項
			System.out.print("第"+(x+1)+"位客人點了幾樣品項");
			data[x]=new String[scn.nextInt()];	//根據1~3位客人輸入的品項數量，建立一個新的字串陣列
			for(int y=0;y<data[x].length;y++){	//從第1~3位客人開始詢問點的第1~3樣品項是什麼
				System.out.print("第"+(y+1)+"樣品項是: ");
				data[x][y]=scn.next();	//輸入第1~3位客人的第1~3樣品項
			}
			
		}	scn.close();
		for(int x=0;x<data.length;x++) {	//輸出第1~3位客人的餐點
			System.out.println("第"+(x+1)+"位客人點的品項為");
			for(int y=0;y<data[x].length;y++) {
				System.out.println(data[x][y]);
			}
		}
	}

}
