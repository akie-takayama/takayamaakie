package lesson25.chara;

import java.util.Random;

public class Fighter extends Human {        //戦士クラス（サブクラス）

	private int randNum = 1000;

	public Fighter(String name) {
		super(name);                        //親クラスの呼び出し（人間クラス）
		Random r = new Random();            //乱数を生成し、各ステータスにセット
		setHp( r.nextInt(randNum) );
		setMp( r.nextInt(randNum) );
		setAtk( r.nextInt(randNum) );
		setDef( r.nextInt(randNum) );
		setSpd( r.nextInt(randNum) );

	}

	public int getRandNum() {               //乱数のゲッター定義
		return randNum;
	}

	public void setRandNum(int randNum) {   //乱数のセッター定義
		this.randNum = randNum;
	}


}
