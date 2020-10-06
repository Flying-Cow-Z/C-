import java.util.Scanner;
import java.util.Random;
public class Test {

// public static void main(String[] args) {
// 	Scanner scan  = new Scanner(System.in);
// 	Random rand = new Random();
// 	int random = rand.nextInt(100)+1;
// 	while (true) {
// 	 	int num = scan.nextInt();
// 	 	if (num > random) {
// 	 		System.out.println("猜大了");
// 	 	}else if(num < random) {
// 	 		System.out.println("猜小了");
// 	 	}else{
// 	 		System.out.println("猜对了");
// 	 		break;
// 	 	}

// 	 } 
// }



	// public static void main(String[] args) {
	// 	 //根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
	// 	 Scanner scan = new Scanner(System.in);
	// 	 int age = scan.nextInt();
		
	// 	if (age <= 18) {
	// 		System.out.println("少年");
	// 	}else if (age > 19 && age <= 28){
	// 		System.out.println("青年");
	// 	}else if (age > 29 && age <= 55 ) {
	// 		System.out.println("中年");
	// 	}else {
	// 		System.out.println("老年");
	// 	}
	// }

    //判断素数
// 	public static void main8(String[] args) {
// 		Scanner scan = new Scanner(System.in);
// 	    int a = scan.nextInt();
//         boolean flag = true;
//         int b = 2;
//         while (b < a){
//         	if (a%b == 0) {
// 	    	flag = false;
// 	    	break;
// 	       }
// 	       b++;
//         }
//         if (flag) {
//         	System.out.println(a+"是素数！");
//         }else {
//         	System.out.println(a+"不是素数！");
//         }
	    
// 	}

// //打印 1 - 100 之间所有的素数
 
//  public static void main7(String[] args) {


//    for (int a = 1;a <= 100 ;a++ ) {
//    	boolean flag = true;
//    	for (int b = 2; b < a; b++) {
//    		if (a%b == 0) {
//    			flag = false;
//    			break;
//    		}
   		
//    	}
//    	if(flag && a != 1){
//    			System.out.println(a + " ");
//    		}
//    }

//     for(int i=1;i<=100;i++){
// 			int count=0;
// 			for(int j=1;j<=i;j++){
// 				if(i%j==0){
// 					count++;
// 				}
// 			}
// 			if(count==2){

// 				System.out.println(i);
// 			}
// 		}

//  }
// //编写程序数一下 1到 100 的所有整数中出现多少个数字9

public static void main(String[] args) {
			int count = 0;
				for (int i = 1;i <= 100;i++ ) {
					if (i % 10 == 9) {
						System.out.println(i);
						count++;
					}
					if (i / 10 == 9){
						System.out.println(i);
						count++;
					}
				}
				

System.out.println(count);
}

// //输出 1000 - 2000 之间所有的闰年

// public static void main5(String[] args) {
// 	int year = 1000;
// 	while(year <= 2000){
// 	if((year % 4 == 0 && year % 100 != 0 )||(year % 400 == 0)){
//            System.out.println("1000~2000之间的闰年有：" + year);
// 	     }
// 	year++;
// 	}
// }


// public static void main4(String[] args) {
// 	int num = 1;
   
//     int sum = 0;
// 	while(num <= 5)
// 	{

// 		int i =1;
//  		int ret = 1;
// 		while(num >= i){
//         ret *= i; 
//         i++;
//       }
//       sum += ret;
//       num++;
// 	}
	
// 	System.out.println(sum);
// }



// 	public static void main3(String[] args) {
// 		int a = 1;
// 		int sum = 0;
// 		while(a <= 100){
// 			sum += a;
// 			a = a + 2;	
// 		}
// 		System.out.println(sum);
// 		int b = 2;
// 		int sum1 = 0;
// 		while(b <= 100){
// 			sum1 += b;
// 			b = b + 2;	
// 		}
// 		System.out.println(sum1);
// 		int c = 1;
// 		int sum3 = 0;
// 		while(c <= 100 ){
// 			sum3 += c;
// 			c = c + 1;	
// 		}
// 		System.out.println(sum3);
// 	}

// 	public static void main2(String[] args) {
// 		int x = 10;

// 		if (x == 10) 
// 		if (y == 10)
// 		System.out.prinint y = 10;tln("aaa");
// 		else
// 		System.out.println("bbb");
// 	}

// 	public static void main1(String[] args) {
// 		Scanner scan = new Scanner(System.in);
// 		int a = scan.nextInt();
		

//         if (a > 0) {
//         	System.out.println(a+"正");
//         }else if（a < 0）{
//         	System.out.println(b+"负");
//         }else {
//         	System.out.println("零");
//         }
// 	}
}