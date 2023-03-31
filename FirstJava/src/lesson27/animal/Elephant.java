package lesson27.animal;

public class Elephant extends Animal { //ぞうクラス（子クラス）
	
	public Elephant(String name) {
		super(name);
		setName("ゾウ");
		setLength(3.2);
		setSpeed(40);
		setScientificName("ロキソドンタ・サイクロティス");
	}

}
