package lesson30.main;

class Person{
	// インスタンスフィールドを定義
	public static int count =0;
	public String name;
	public int age;
	public double height;
	public double weight;
	

	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name,int age, double height, double weight){
		Person.count++;
		this.name =name;
		this.age =age;
		this.height =height;
		this.weight =weight;
		}
	
	public double bmi() {
		return this.weight/this.height/this.height;
	}
	
	public void print() {
		System.out.println("名前は"+this.name+"です");
		System.out.println("年は"+this.age+"歳です");
		System.out.println("BMIは"+Math.round(this.bmi())+"です");
		System.out.println("合計"+Person.count+"人です");
	}
}
