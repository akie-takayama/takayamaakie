package lesson22.logic;



public class Logic {
	//☆処理用のパッケージ☆
	
	public String country;
	public void hello() {
		System.out.println("こんにちは！ここは"+this.country+"です！");
	}
	
	public String food;
	public void foods(){
		System.out.println("この"+this.food+"はうまい");
	}
	
	public String category;
	public void categorys(){
		System.out.println(this.food+"は和食です");
	}
	
	//日付（年）
	public int numTotal1;
	public void year() {
		
	}
	
	//日付（月）
	public int numTotal2;
	public void month() {
	}
	
	//日付（日）
	public int numTotal3;
	public void day() {
	}
	
	//日付（時）
	public int numTotal4;
	public void hour() {
	}
	
	//日付（分）
	public int numTotal5;	
	public void minute() {
	}
		
	//日付（秒）
	public int numTotal6;	
	public void second() {
	System.out.println("今の現在時刻は" +this.numTotal1+"/"+this.numTotal2 +"/"+this.numTotal3+" "+this.numTotal4+":"+this.numTotal5+":"+this.numTotal6);	
	}
	
}