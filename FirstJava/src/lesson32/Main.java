package lesson32;


class Main{    //Mainクラス
public static void main(String[] argos){
Person person1 = new Person("鈴木太郎", 20, 1.7, 60); //Person1の値を設置
person1.print();                                      //Person1を出力

Person person2 = new Person("山田花子", 22, 1.5, 40); //Person2の値を設置
person2.print();                                      //Person2を出力

System.out.println("—————");
Person.printCount();                //生成した合計人数
}
}    