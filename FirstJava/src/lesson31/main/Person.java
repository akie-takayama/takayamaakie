package lesson31.main;


class Person{                      //Personクラス
	// インスタンスフィールドを定義
	public static int count =0;  //インスタンス生成時のカウント部分
	public String firstName;     //インスタンス生成時の名前部分
	public String lastName;      //インスタンス生成時の苗字部分
	public int age;              //インスタンス生成時の年齢部分
	public double height;        //インスタンス生成時の身長部分
	public double weight;        //インスタンス生成時の体重部分
	

	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String firstName,String lastName,int age, double height, double weight){
		Person.count++;
		this.firstName =firstName;  //Personクラス内の名前を取得
		this.lastName = lastName;   //Personクラス内の苗字を取得
		this.age =age;              //Personクラス内の年齢を取得
		this.height =height;        //Personクラス内の身長を取得
		this.weight =weight;        //Personクラス内の体重を取得
		}
	
	//フルネームメゾット
	public String fullName() {
		return this.firstName + " " + this.lastName;  //名前＋苗字にしフルネームを作成
	}
	
	//BMIメゾット
	public double bmi() {
		return this.weight/this.height/this.height;  //体重kg ÷ (身長m)2でBMIを作成
	}
	
	//プリントメゾット
	public void print() {
		System.out.println("名前は"+this.fullName()+"です"); //フルネームメゾットを利用し「名前は○○です」と出力
		System.out.println("年は"+this.age+"歳です");        //「年は○○歳です」と出力
		System.out.println("BMIは"+Math.round(this.bmi())+"です");   //BMIメゾットを利用し「BMIは○○です」と出力（小数点繰り上げ）
	}
	
	//生成した合計人数を表すカウントメゾット
	 public static void printCount() {
	 System.out.println("合計"+Person.count+"人です");  //「合計は○○人です」と出力
	 }
	 
	 //buyメゾット（car）
	 public void buy(Car car) {
		car.setOwner(this.fullName());     //catクラスに所有者をセットしフルネームメゾットを利用し名前を充てる
		System.out.println(car.getOwner()+"が購入しました");  //carクラスの「〇〇が購入しました」と出力
	 }
	 
	 //buyメゾット（bicycle）
	 public void buy(Bicycle bicycle) {
		 bicycle.setOwner(this.fullName());  //bicycleクラスに所有者をセットしフルネームメゾットを利用し名前を充てる
		System.out.println(bicycle.getOwner()+"が購入しました"); //bicycleクラスの「〇〇が購入しました」と出力
	 }

}