package lesson17;

import java.util.Calendar;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		String animalName = Dog.animal("動物の名前");
		System.out.println(animalName);
		
		Dog animal1 = new Dog();
		animal1.name = "犬";
		System.out.println(animal1.name);

		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		
		String animalNums = Dog.nums("動物の数");
        System.out.println(animalNums);		
        
        Dog animalTotal1 = new Dog();
        animalTotal1.numTotal = 2;
        System.out.println(animalTotal1.numTotal + "匹");
        

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
        
        Calendar calendar =Calendar.getInstance();
		System.out.println("現在時刻：" + calendar.get(Calendar.YEAR) +"-" +(calendar.get(Calendar.MONTH)+1)+ "-" +calendar.get(Calendar.DATE)+" "+ calendar.get(Calendar.HOUR)+":"+calendar.get(Calendar.MINUTE)+":"+ calendar.get(Calendar.SECOND));
	}
}
