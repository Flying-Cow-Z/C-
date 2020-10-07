import java.util.Scanner;

 public class Test  {

//求 N 的阶乘 

// public static void main(String[] args) {
	
// }

public static void fun(int []arr) {
	int i = 0;
	for (i = 0;i < arr.length ;i++ ) {
		arr[i] *= 2;
	}
	for (i = 0; i < arr.length;i++ ) {
		System.out.println(arr[i]);
	}
}

public static void main(String[] args) {
	int arr[] = {1,2,3};
	fun(arr);  
} 

 //有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字
// public static int found(int [] arr) {
// 	int res = 0;
// 	for (int i = 0;i < arr.length ;i++ ) {
// 		 res = res^arr[i];
// 	}
// 	return res;
// }
// public static void main(String[] args) {
// 	int arr[] = {1,2,3,5,1,2,3};
// 	System.out.println(found(arr));
// }


// public static int fun(int n) {
// 	if(n == 0) {
// 		return 0;
// 	}

// 		return n%10 + fun(n/10);
// }

//  	public static void main(String[] args) {
//  		int n = 1729;
 		
//  		System.out.println(fun(n));
//  	}

// public static int fun(int n) {
// 	if (n == 1) {
// 		return 1;
// 	}
// 	return n + fun(n-1);
// }

// public static void main(String[] args) {
// 	int n = 10;
// 	System.out.println(fun(n));
// }


 	// public static void  fac(int n) {
 		
 	// 	if(n < 0) {
 	// 		System.out.print("-");
  //           n = -n;
 	// 	}

	
		//  	if (n>9) {
		//  		fac(n/10);
		//  	}
		//  	System.out.print(n%10 + " ");
		//  }

 	// public static void main(String[] args) {
 	// 		int n  = -1234;
 	// 		fac(n);
 	// 	}
 } 		
