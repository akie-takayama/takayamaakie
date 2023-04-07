package lesson27.nature;

import lesson27.animal.Elephant;
import lesson27.animal.Lion;     //ライオンクラスをimportする
import lesson27.animal.Monkey;
import lesson27.animal.Panda;
import lesson27.animal.Parrot;
import lesson27.animal.Zebra;


public class Nature {
	public void exist() {                       //exitメゾットで出力したい内容をまとめる
		Lion l1 = new Lion(null);  
		System.out.println("—————");
		l1.dispStatus();

	}
	
	public void exist2() {
		Elephant e1 = new Elephant(null);  
		System.out.println("—————");
		e1.dispStatus();
		
	}
	
	public void exist3() {
		Panda p1 = new Panda(null);  
		System.out.println("—————");
		p1.dispStatus();
	}
	
	public void exist4() {
		Monkey m1 = new Monkey(null);  
		System.out.println("—————");
		m1.dispStatus();
	}
	
	public void exist5() {
		Zebra z1 = new Zebra(null);  
		System.out.println("—————");
		z1.dispStatus();
	}
	
	public void exist6() {
		Parrot p2 = new Parrot(null); 
		System.out.println("—————");
		p2.dispStatus();
	}
	
}
