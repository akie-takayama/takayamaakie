package lesson14;

public class Lesson14 {
	/*
	string型の配列を作成し、アルファベットa～jまでを格納してください。
	brake文を使用し、a～dまで表示してください。
	
	 出力結果：a
	           b
	           c
	           d
	          
	cotinue文を使用し、i以外を表示してください。
	
	 出力結果：a
	           b
	           c
	           d
	           e
	           f
	           g
	           h
	           j
*/
	public static void main(String[] args) {
      String[] names ={"a","b","c","d","e","f","g","h","i","j"};
      for(int i=0; i<10; i++) {
    	  if (i > 3) {
    		  break;
    	  }
    		  System.out.println(names[i]);
      }
      for(int i=0; i<10; i++) {
        	  if(i ==8) {
    		  continue;
        	  }
    		  System.out.println(names[i]);
    	  }
    	  
      }
	}

	