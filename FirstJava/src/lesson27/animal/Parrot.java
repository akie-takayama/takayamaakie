package lesson27.animal;

public class Parrot extends Animal {  //インコクラス（子クラス）
	
	public Parrot(String name) {
		super(name);
		setName("インコ");
		setLength(0.1);
		setSpeed(50);
		setScientificName("不明");
	}

}
