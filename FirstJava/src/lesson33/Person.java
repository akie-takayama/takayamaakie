package lesson33;

class Person{      //Personクラス
public static int count = 0;     //インスタンス生成時のカウント部分（クラスフィールド）
public String firstName;         //インスタンス生成時の名前部分 (フィールド）
public String lastName;          //インスタンス生成時の苗字部分 (フィールド）
public int age;                  //インスタンス生成時の年齢部分 (フィールド） 
public double height, weight;   //インスタンス生成時の身長・体重部分 (フィールド） 


//コンストラクタを定義しインスタンスフィールドに値をセットする
Person(String firstName,String lastName,int age, double height, double weight){   //「lastNameのコンストラクタ追加」※順番はfirstNameの次
Person.count++;             //生成された人数を取得
this.firstName = firstName;  //Personクラス内の名前を取得
this.lastName = lastName;   //Personクラス内の苗字を取得       //「Person.count++; this.lastName;」を追加しlastNameフィールドの値をセット
this.age = age;              //インスタンス生成時の年齢部分
this.height = height;        //インスタンス生成時の身長部分
this.weight = weight;        //インスタンス生成時の体重部分
}

//フルネームメゾット
public String fullName(){
return this.firstName + this.lastName;  //名前＋苗字にしフルネームを作成
}

//プリントメゾット
public void print(){
System.out.println("名前は" + this.fullName() + "です");//フルネームメゾットを利用し「名前は○○です」と出力
System.out.println("年は" + this.age + "です"); //「年は○○歳です」と出力
}

//BMIメゾット
public double bmi(){
return this.weight / this.height / this.height; //体重kg ÷ (身長m)2でBMIを出力
}

//カウントメゾット
public static void printCount(){
System.out.println("合計" + Person.count + "人です"); //「合計○○人です」を出力
}
}