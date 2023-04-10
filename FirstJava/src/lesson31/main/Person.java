package lesson31.main;


class Person{
	// インスタンスフィールドを定義
	public static int count =0;
	public String firstName;
	public String lastName;
	public int age;
	public double height;
	public double weight;
	

	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String firstName,String lastName,int age, double height, double weight){
		Person.count++;
		this.firstName =firstName;
		this.lastName = lastName;
		this.age =age;
		this.height =height;
		this.weight =weight;
		}
	
	//フルネームメゾット
	public String fullName() {
		return this.firstName + " " + this.lastName;
	}
	
	//BMIメゾット
	public double bmi() {
		return this.weight/this.height/this.height;
	}
	
	//プリントメゾット
	public void print() {
		System.out.println("名前は"+this.fullName()+"です");
		System.out.println("年は"+this.age+"歳です");
		System.out.println("BMIは"+Math.round(this.bmi())+"です");
	}
	
	//生成した合計人数を表すカウントメゾット
	 public static void printCount() {
	 System.out.println("合計"+Person.count+"人です");
	 }
	 
	 //buyメゾット（car）
	 public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.println(car.getOwner()+"が購入しました");
	 }
	 
	 //buyメゾット（bicycle）
	 public void buy(Bicycle bicycle) {
		 bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner()+"が購入しました");
	 }

}