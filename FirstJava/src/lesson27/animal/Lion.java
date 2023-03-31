package lesson27.animal;

public class Lion extends Animal{   //ライオンクラス（子クラス）
	
	public Lion(String name) {
		super(name);
		setName("ライオン");
		setLength(2.1);
		setSpeed(80);
		setScientificName("パンテラ レオ");
	}

}
