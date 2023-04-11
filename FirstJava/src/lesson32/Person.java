package lesson32;

class Person{                 //Personクラス
public static int count =0;  //インスタンス生成時のカウント部分（クラスフィールド）
public String name;          //インスタンス生成時の名前部分 (フィールド）
public int age;              //インスタンス生成時の年齢部分 (フィールド）
public double height;        //インスタンス生成時の身長部分 (フィールド） 
public double weight;        //インスタンス生成時の体重部分 (フィールド） 


//コンストラクタを定義しインスタンスフィールドに値をセットする
Person(String name, int age, double height, double weight){  
Person.count++;            //生成された人数を取得
this.name = name;           //Personクラス内の名前を取得
this.age = age;             //Personクラス内の年齢を取得
this.height = height;       //Personクラス内の身長を取得
this.weight = weight;       //Personクラス内の体重を取得
}

//BMIメゾット
public double bmi(){
return this.weight / this.height / this.height;  //体重kg ÷ (身長m)2でBMIを作成
}

//プリント(出力用)メゾット
public void print(){
System.out.println("名前は" + this.name + "です"); //「名前は○○です」と出力
System.out.println("年は" + this.age + "です");   //「年は○○歳です」と出力
}

//生成した合計人数を表すカウントメゾット
public static void printCount() {
System.out.println("合計"+Person.count+"人です");  //「合計は○○人です」と出力


}
}
