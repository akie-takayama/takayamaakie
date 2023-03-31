package lesson27.animal;

public class Monkey extends Animal{ //チンパンジークラス（子クラス）
	
	public Monkey(String name) {
		super(name);
		setName("チンパンジー");
		setLength(0.94);
		setSpeed(25);
		setScientificName("パン・トゥログロディテス");
	}

}
