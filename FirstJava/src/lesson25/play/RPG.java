package lesson25.play;

import java.util.Scanner;      //scannerをimportする

import lesson25.chara.Fighter;

public class RPG {

	public void play() {
		Scanner sc = new Scanner(System.in);
		String inputName = sc.next();

		Fighter f1 = new Fighter( inputName );
		System.out.println("—————");
		System.out.println("こんにちは「" +  inputName + "」さん");
		f1.dispStatus();
		System.out.println("さあ冒険に出かけよう！");
		System.out.println("———————");
		sc.close();
	}
}
