package lesson18;

import java.util.Random;

public class Lesson18 {

	public static void main(String[] args) {
	
        //Q1
		hello();   
        //Q2
		person(20);
        //Q3
		int total = price(5,100);
		System.out.println(total);
        //Q4
		double times = price(3.2,4.5);
		System.out.println(times);
        //Q5
		int[] list = numAverage(5);
		for(int num:list) {
			System.out.println(num);
		}
	    //Q6
		double avg =average(list);
	    System.out.println(avg);
		}
	
	    // Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を呼び出してください。
	    public static void hello(){
			System.out.println("Hello Java");
		}
		// Q2：引数として整数を渡すと+1してメソッド（関数）関数を呼び出してコンソールに出力してください。
         public static void person (int age) {
        	 System.out.println(age +1);
         }
				
		// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を呼び出してコンソールに出力してください。
		 public static int price(int a, int b) {
		   return a*b; 
		 }
		// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を呼び出してコンソールに出力してください。
		 public static double price(double c,double d) {
			return c*d;	
			}
		 
		// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）を作成してください。
		 public static int[] numAverage(int num){
			 int numList[] = new int[num];
			 Random rand = new Random();
			 for(int i=0; i< num; i++) {
				 numList[i]=rand.nextInt(100)+1;
			 }
			 return numList;
		 }
				
		// Q6：Q5で作成した関数を用いて、このメソッド（関数）の引数をQ5のメソッド（関数）の引数に渡して
		//     配列の要素の平均値を返すメソッド（関数）を作成してください。
 
	    public static double average(int[] nums) {
	    	int sum =0;
	    	
	    	for(int i = 0; i<nums.length; i++) {
	    	sum += nums[i];	
	    	}
	    	double avg = (double)sum/nums.length;
	    	return avg;
	    }  
	    
           
	}
	
	
