package lesson33;

public class Main { //Mainクラス
	
	public static void main(String[] args){
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);  //Person1の値を設置
		person1.print();                                           //Person1を出力

		Person person2 = new Person("山田", "花子", 22, 1.5, 40);  //Person2の値を設置
		person2.print();                                           //Person2を出力
        
	    System.out.println("—————");
		Person.printCount();                                      //生成した合計人数出力
		}

}
