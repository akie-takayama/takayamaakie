package lesson23.lesson23logic;

 public class Animal_logic {
	//フィールド
	private String name;
	private double bodyLength;
	private int speed;
	
	
	//コンストラクタを定義し、インスタンスフィールドに値をセット
	public Animal_logic(String name, double bodyLength, int speed){
		this.name =name;
		this.bodyLength =bodyLength;
		this.speed =speed;		
	}
	
	
	//nameのゲッターを定義
	public String getName() {
		return this.name;
	}
	
	//nameセッターを定義
	public void setName(String name) {
		this.name =name;
	}
	
	
	//bodyLengthのゲッターを定義
	public double getBodyLength() {
		return this.bodyLength;
	}
	
	//nameセッターを定義
	public void setBodyLength(double bodyLength) {
		this.bodyLength =bodyLength;
	}
	
	//speedのゲッターを定義
	public int getSpeed() {
		return this.speed;
	}
	
	//speedセッターを定義
	public void setSpeed(int speed) {
		this.speed =speed;
	}
	
	
	//出力する
	public void printData() {
        System.out.println("動物名："+this.name);
		System.out.println("体長："+this.bodyLength + "m");
		System.out.println("速度:"+ this.speed+"km/h");
	}
	
	


}
