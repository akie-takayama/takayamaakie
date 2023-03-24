package lesson23.lesson23main;


/*
	
	下記がコンソールに出力されるように作成してください
	※thisとsetterとgetterとフィールドを使ってください
	
	動物名：ライオン
    体長：2.1m
    速度：80km/h
	
*/
import lesson23.lesson23logic.Animal_logic;
public class Animal_main {
	public static void main(String[] args) {
	Animal_logic animal1 = new Animal_logic("ライオン",2.1,80);
	animal1.printData();
	}
}
