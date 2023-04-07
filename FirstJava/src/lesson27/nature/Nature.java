package lesson27.nature;

import lesson27.animal.Elephant;
import lesson27.animal.Lion;     //ライオンクラスをimportする
import lesson27.animal.Monkey;
import lesson27.animal.Panda;
import lesson27.animal.Parrot;
import lesson27.animal.Zebra;


public class Nature {
	public void exist() {                       //exitメゾットで出力したい内容をまとめる（ライオン）
		Lion l1 = new Lion(null);  
		System.out.println("—————");
		l1.dispStatus();

	}
	
	public void exist2() {
		Elephant e1 = new Elephant(null);      //exitメゾットで出力したい内容をまとめる（ゾウ）
		System.out.println("—————");
		e1.dispStatus();
		
	}
	
	public void exist3() {
		Panda p1 = new Panda(null);           //exitメゾットで出力したい内容をまとめる（パンダ）
		System.out.println("—————");
		p1.dispStatus();
	}
	
	public void exist4() {
		Monkey m1 = new Monkey(null);            //exitメゾットで出力したい内容をまとめる（チンパンジー）
		System.out.println("—————");
		m1.dispStatus();
	}
	
	public void exist5() {
		Zebra z1 = new Zebra(null);            //exitメゾットで出力したい内容をまとめる（シマウマ）
		System.out.println("—————");
		z1.dispStatus();
	}
	
	public void exist6() {
		Parrot p2 = new Parrot(null);          //exitメゾットで出力したい内容をまとめる（インコ） 
		System.out.println("—————");
		p2.dispStatus();
	}
	
}
