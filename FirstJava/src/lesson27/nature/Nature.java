package lesson27.nature;

import java.util.Scanner;        //scannerをimportする

import lesson27.animal.Elephant; //ぞうクラスをimportする
import lesson27.animal.Lion;     //ライオンクラスをimportする
import lesson27.animal.Monkey;    //チンパンジークラスをimportする
import lesson27.animal.Panda;    //パンダクラスをimportする
import lesson27.animal.Parrot;    //シマウマクラスをimportする
import lesson27.animal.Zebra;    //シマウマクラスをimportする


public class Nature {
	public void exist() {                       //playメゾットで出力したい内容をまとめる
		Scanner sc = new Scanner(System.in);
		String inputName = sc.next();

		Lion l1 = new Lion( inputName );  
		System.out.println("—————");
		l1.dispStatus();
		
		Elephant e1 = new Elephant( inputName );  
		System.out.println("—————");
		e1.dispStatus();
		
		Panda p1 = new Panda( inputName );  
		System.out.println("—————");
		p1.dispStatus();
		
		Monkey m1 = new Monkey( inputName );  
		System.out.println("—————");
		m1.dispStatus();
		
		Zebra z1 = new Zebra( inputName );  
		System.out.println("—————");
		z1.dispStatus();
		
		Parrot p2 = new Parrot( inputName );  
		System.out.println("—————");
		p2.dispStatus();
		
		sc.close();
	}
}
