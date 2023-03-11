package lesson16;

public class Lesson16 {

	public static void main(String[] args) {
		// Q1：「A」という文字列を変数に代入してコンソールに出力してください。

		// Q2：「Hello Java」という文字列を変数に代入してコンソールに出力してください。
			
		// Q3：富士山の標高を整数で変数に代入してコンソールに出力してください。

		// Q4：円周率を小数点第二位まで変数に代入してコンソールに出力してください。
				
		// Q5：変数numsに「10, 100, 1000」が格納された配列を代入して、コンソールにメモリの番地が1のデータを出力してください。

		// Q6：Q5で作成した変数numsを変数bに代入し、その後変数bのメモリの番地が1のデータを「8」に上書きさせて
		//     コンソールに変数numsと変数bのメモリの番地が1のデータを出力させて、変数nums値が変わることを確認してください。

		 
		String a ="A";
		System.out.println(a);
		
		String greet ="Hello Java";
		System.out.println(greet);
		
		double c = 3776.12;
		System.out.println(c +"m");
		
		double d = 3.14;
		System.out.println(d);
		
		int[] nums = {10,100,1000};
		System.out.println(nums[1]);
		
		int [] b = new int[nums.length];
        for(int i=0; i<3; i++) {
        b[i] = nums[i];
        if(nums[i]==100) {
        b[i]=8;
        System.out.println(nums[i] +" "+ b[i]);
         }
        }
        }
	}

