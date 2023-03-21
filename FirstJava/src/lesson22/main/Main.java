package lesson22.main;
import java.util.Calendar;
/*

下記がコンソールに出力されるように作成してください

	こんにちは！ここは日本です！
	この寿司はうまい
	寿司は和食です
	今の現在日時は2023/03/09 10:23:39です

【条件】
	✓・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
	✓・適切なファイルにフィールドで変数を必要な数作ってください。
	✓・thisを使って作成してください。
	✓・日時は今日の日付を取得してください。
	
*/

import lesson22.logic.Logic;
public class Main {
    //★実行用のパッケージ★
	
	public static void main(String[] args) {
	//メインメゾット
		
		//こんにちは！ここは日本(this.country)です！
		Logic logic =new Logic();
		logic.country ="日本";
		logic.hello();
		
		//この寿司はうまい
		logic.food ="寿司";
		logic.foods();
		
		//「寿司(this.food)は和食です」出力
		logic.categorys();
		
		
		//日付（年）
		Calendar calendar =Calendar.getInstance();
		logic.numTotal1 = (calendar.get(Calendar.YEAR));
		logic.year();
		
		//日付（月）
		logic.numTotal2 = (calendar.get(Calendar.MONTH)+1);
		logic.month();
		
		
		//日付（日）
		logic.numTotal3 = (calendar.get(Calendar.DATE));
		logic.day();
		
		//日付（時）
		logic.numTotal4 = (calendar.get(Calendar.HOUR));
		logic.hour();
		
		
		//日付（分）
		logic.numTotal5 = (calendar.get(Calendar.MINUTE));
		logic.minute();
		
		//日付（分）
		logic.numTotal6 = (calendar.get(Calendar.SECOND));
		logic.second();

	}
}