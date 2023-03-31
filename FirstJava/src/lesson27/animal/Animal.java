package lesson27.animal;

public class Animal {               //アニマルクラス（親クラス）
	
	private String name;            //名前
	private double length;          //体長
	private int speed;              //速度
	private String scientificName;  //学名
	
	public void dispStatus() {      //コンソールに出力する各ステータス
		System.out.println("動物名："+name);
		System.out.println("体長："+length+"m");
		System.out.println("速度："+speed+"km/h");
		System.out.println("学名："+scientificName);
	}
	
	public Animal (String name) {
		this.name=name;
	}
	
	public String getName() {           //nameのゲッターを定義
		return name;
	}
	
	public void setName(String name) {  //nameのセッターを定義
		this.name =name;	
	}
	
	public double getLength() {           //lengthのゲッターを定義
		return length;
	}
	
	public void setLength(double length) {  //lengthのセッターを定義
		this.length =length;	
	}
	
	public int getSpeed() {                //speedのゲッターを定義
		return speed;
	}
	
	public void setSpeed(int speed) {     //speedのセッターを定義
		this.speed =speed;
	}
	
	public String getScientificName() {   //scientificNameのゲッターを定義
		return scientificName;
	}
	
	public void setScientificName(String scientificName) {    //speedのセッターを定義
		this.scientificName =scientificName;
	}
	
	
	

}
