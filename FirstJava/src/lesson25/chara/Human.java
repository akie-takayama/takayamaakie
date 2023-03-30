package lesson25.chara;

public class Human {        //人間クラス（スパークラス）

	private String name;	//名前
	private int hp;			//体力
	private int mp;			//マジックポイント
	private int atk;		//攻撃力
	private int spd;		//素早さ
	private int def;		//防御力

	public void dispStatus() {              //コンソールに出力
		System.out.println("ステータス");
		System.out.println("HP:" + hp);
		System.out.println("MP:" + mp);
		System.out.println("攻撃力:" + atk);
		System.out.println("素早さ:" + spd);
		System.out.println("防御力:" + def);
	}

	public Human(String name) {     
		this.name = name;
	} 

	public String getName() {           //名前のゲッター定義
		return name;
	}

	public void setName(String name) {	//名前のセッター定義
		this.name = name;
	}

	public int getHp() {                //体力のゲッター定義
		return hp;
	}

	public void setHp(int hp) {	        //体力のセッター定義
		this.hp = hp;
	}
     
	public int getMp() {                //マジックポイントのゲッター定義
		return mp;
	}

	public void setMp(int mp) {         //マジックポイントのセッター定義
		this.mp = mp;
	}

	public int getAtk() {               //攻撃力のゲッター定義
		return atk;
	}

	public void setAtk(int atk) {       //攻撃力のセッター定義
		this.atk = atk;
	}

	public int getSpd() {               //素早さのゲッター定義
		return spd;
	}

	public void setSpd(int spd) {      //素早さのセッター定義
		this.spd = spd;
	}

	public int getDef() {              //防御力のゲッター定義
		return def;
	}

	public void setDef(int def) {      //防御力のセッター定義
		this.def = def;
	}


}
