package lesson29.prefec;   //親クラス
//import java.util.HashMap;
//import java.util.Map;

public class Prefec {
		private int numPf;              //番号
		private String pref;            //県庁所在地
		private String city;           //県庁所在地
		private int area;              //面積
		
		
		public void dispStatus() {      //コンソールに出力する各ステータス
			System.out.println("都道府県名："+pref);
			System.out.println("県庁所在地："+city);
			System.out.println("面積："+area+".0km2");

		}
	
		public int getNumPf() {           //番号のゲッターを定義
			return numPf;
		}
		
		public  void setNumPf(int numPf) {  //番号のセッターを定義
			this.numPf =numPf;	
		}
		
		public String getPref() {           //県名のゲッターを定義
			return pref;
		}
		
		public  void setPref(String pref) {  //県名のセッターを定義
			this.pref =pref;	
		}
		
		public String getCity() {           //県庁所在地のゲッターを定義
			return city;
		}
		
		public  void setCity(String city ) {  //県庁所在地のセッターを定義
			this.city =city;	
		}
		
		public int getArea() {           //都市のゲッターを定義
			return area;
		}
		
		public  void setArea(int area) {  //都市のセッターを定義
			this.area =area;	
		}
		
		

//	    Map<String,Integer> prefs =new HashMap<String,Integer>();
//		prefs.put("北海道",83424);
//		prefs.put("青森県",9646);
//		prefs.put("岩手県",15275);
//		prefs.put("宮城県",7282);
//		prefs.put("秋田県",11638);
//		prefs.put("山形県",9323);
//		prefs.put("福島県",13784);
//		prefs.put("茨城県",6097);
//		prefs.put("栃木県",6408);
//		prefs.put("群馬県",6362);
//		prefs.put("埼玉県",3798);
//		for(String key:prefs.keySet()) {
//			int value =prefs.get(key);
//			System.out.println("都道府県名："+key);
//			System.out.println("面積："+value+".0km2");
//			System.out.println();
//		}
		

}
