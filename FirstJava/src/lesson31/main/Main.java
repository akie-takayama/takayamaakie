package lesson31.main;

class Main {                                                    //Mainクラス
	  public static void main(String[] args) {
	    Person person1 = new Person("鈴木","太郎", 20, 1.7,60); //Person1の値を設置
	    person1.print();
	    
	    Person person2 = new Person("山田","花子",22,1.5,40);   //Person2の値を設置
	    person2.print();
	    
	    Person.printCount();                //生成した合計人数
	    
	    Car car =new Car();                  //NewしてCarクラスのownerの設定
	    Bicycle bicycle =new Bicycle();      //NewしてBicycleクラスのownerの設定
	    
	    car.setOwner(person1.fullName());      //carクラスの所有者(Person1)をインスタンス生成
	    bicycle.setOwner(person2.fullName());  //bicycleクラスの所有者(Person2)をインスタンス生成
	    System.out.println("—————");
	    System.out.println(car.getOwner());     //carクラスの所有者(Person1)を出力
	    System.out.println(bicycle.getOwner());  //carクラスの所有者(Person2)を出力
	    
	    System.out.println("—————");
	    person1.buy(car);       //person1がcarを購入
	    person2.buy(bicycle);   //person2がbicycleを購入
	    
	    
	    
	  }
	}