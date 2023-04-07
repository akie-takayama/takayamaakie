package lesson27.main;



import java.util.Scanner;

import lesson27.nature.Nature;


public class Main {

	public static void main(String[] args) {
		Nature ntr = new Nature();                   //NewしてNatureクラスのexitメゾットを出力する
		System.out.println("コンソールに文字を入力してください");
		Scanner sc = new Scanner(System.in);
		String inputName = sc.next();
		if(inputName.equals("ライオン:2.1:80,")) {
			ntr.exist();
		   }

		if(inputName.equals("ゾウ:3.2:40,")) {
			ntr.exist2();
		   }

				
		if(inputName.equals("パンダ:1.9:30,")) {
				ntr.exist3();
		   }
			
		if(inputName.equals("チンパンジー:0.94:25,")) {
				ntr.exist4();
			}
			
		if(inputName.equals("シマウマ:2.4:65,")) {
				ntr.exist5();
			}
			
		if(inputName.equals("インコ:0.1:50")) {
				ntr.exist6();
			}
		
		if(inputName.equals("ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50")) {
			ntr.exist();
			ntr.exist2();
			ntr.exist3();
			ntr.exist4();
			ntr.exist5();
			ntr.exist6();
			
		   }
			sc.close();
}
	
}

/*

	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
	
	コンソール出力結果
	
	コンソールに文字を入力してください
	動物名：ライオン
    体長：2.1m
    速度：80km/h
    学名：パンテラ レオ

    動物名：ゾウ
    体長：3.2m
    速度：40km/h
    学名：ロキソドンタ・サイクロティス

    動物名：パンダ
    体長：1.9m
    速度：30km/h
    学名：アイルロポダ・メラノレウカ

    動物名：チンパンジー
    体長：0.94m
    速度：25km/h
    学名：パン・トゥログロディテス

    動物名：シマウマ
    体長：2.4m
    速度：65km/h
    学名：チャップマンシマウマ

    動物名：インコ
    体長：0.1m
    速度：50km/h 
    学名：不明


*/