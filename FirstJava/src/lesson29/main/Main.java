package lesson29.main;


import java.util.Arrays;
//import java.util.ArrayList;
import java.util.Scanner;

import lesson29.prefec.PrintData;
public class Main {
	
	public static void main(String[] args) {
		PrintData prt = new PrintData();  
		
		  // Scannerクラスのインスタンスを生成する
			Scanner sc = new Scanner(System.in);
			int inputNum = sc.nextInt();
			int inputNum2 = sc.nextInt();
			int inputNum3 = sc.nextInt();
			int[] num01 = {inputNum,inputNum2,inputNum3};
			Arrays.sort(num01);

			
			
			
		 // 無限ループとなり永遠とキーボード入力を受け付ける
	  
		if(inputNum==0 ||inputNum2==0 ||inputNum3==0){
			prt.exist(); 
			
		   }
		
		if(inputNum==1 ||inputNum2==1||inputNum3==1){
			prt.exist2();

		   }
			
		
		if(inputNum==2 ||inputNum2==2||inputNum3==2){
			prt.exist3();
		   }
		
		if(inputNum==3 ||inputNum2==3||inputNum3==3){
			prt.exist4();
		   }
		
		if(inputNum==4||inputNum2==4||inputNum3==4){
			prt.exist5();
		   }
		
		if(inputNum==5||inputNum2==5||inputNum3==5){
			prt.exist6();
		   }
		
		if(inputNum==6||inputNum2==6||inputNum3==6){
			prt.exist7();
		   }
		
		if(inputNum==7||inputNum2==7||inputNum3==7){
			prt.exist8();
		   }
		
		if(inputNum==8||inputNum2==8||inputNum3==8){
			prt.exist9();
		   }
		
		if(inputNum==9||inputNum2==9||inputNum3==9){
			prt.exist10();
		   }
		
		if(inputNum==10||inputNum2==10||inputNum3==10){
			prt.exist11();
		}

	    sc.close();
	    }
	
}
	


/*
	
0, "北海道:札幌市:83424"
1, "青森県:青森市:9646"
2, "岩手県:盛岡市:15275"
3, "宮城県:仙台市:7282"
4, "秋田県:秋田市:11638"
5, "山形県:山形市:9323"
6, "福島県:福島市:13784"
7, "茨城県:水戸市:6097"
8, "栃木県:宇都宮市:6408"
9, "群馬県:前橋市:6362"
10, "埼玉県:さいたま市:3798"
	
	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
	都道府県がソートされてコンソールに出力されるように作ってください
	※Packageを2つ作ってください
	※複数選択できるようにしてください
	
	例:
	8
	5
	9
	と入力された場合（昇順）
	
	都道府県名：山形県
県庁所在地：山形市
面積：9323.0km2
	
	都道府県名：栃木県
県庁所在地：宇都宮市
面積：6408.0km2

	都道府県名：群馬県
県庁所在地：前橋市
面積：6362.0km2

*/




//int[]numList = {0,1,2,3,4,5,6,7,8,9,10};
//Arrays.sort(numList);
//
//for(int i : numList) {
//	Scanner sc = new Scanner(System.in);
//	int inputNum = sc.next();
//	i = inputNum;
//	if(i == 0) {
//		System.out.println(i);



//int inputNum =2;
//int[] num = new int[inputNum];
//
//String strInput =sc.nextLine();
//String[] strSplit =strInput.split(" ");
//
//for(int i=0; i<inputNum; i++) {
//	num[i] =Integer.parseInt(strSplit[i]);
//}